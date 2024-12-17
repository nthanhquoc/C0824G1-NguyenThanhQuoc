package com.example.uploadfile.controller;

import com.example.uploadfile.model.Song;
import com.example.uploadfile.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    private ISongService songService;

    @Autowired
    private ServletContext servletContext;

    // Mảng thể loại nhạc
    private final String[] genres = {"Pop", "Rock", "Jazz", "Classical", "Hip-hop", "EDM", "Blues"};

    // Hiển thị form upload bài hát
    @GetMapping("/upload")
    public String showUploadForm(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("genres", genres);
        return "upload";
    }

    // Xử lý upload bài hát
    @PostMapping("/upload")
    public String uploadSong(@ModelAttribute("song") Song song,
                             @RequestParam("file") MultipartFile file,
                             Model model) {
        if (!file.isEmpty() && isValidFile(file)) {
            try {
                String uploadPath = servletContext.getRealPath("/resources/uploads/");
                File uploadDir = new File(uploadPath);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }
                String filePath = uploadPath + file.getOriginalFilename();
                file.transferTo(new File(filePath));

                song.setFilePath("/resources/uploads/" + file.getOriginalFilename());
                songService.saveSong(song);

                return "redirect:/songs/list";
            } catch (IOException e) {
                e.printStackTrace();
                model.addAttribute("message", "Upload file thất bại. Vui lòng thử lại!");
            }
        } else {
            model.addAttribute("message", "File không hợp lệ! Chỉ chấp nhận định dạng .mp3, .wav, .ogg, .m4p");
        }
        model.addAttribute("genres", genres);
        return "upload";
    }

    @GetMapping("/list")
    public String listSongs(Model model) {
        model.addAttribute("songs", songService.getSongs());
        return "list";
    }

    // Hàm kiểm tra định dạng file hợp lệ
    private boolean isValidFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        return filename != null &&
                (filename.endsWith(".mp3") || filename.endsWith(".wav")
                        || filename.endsWith(".ogg") || filename.endsWith(".m4p"));
    }
}