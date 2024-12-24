package com.example.infomusic.controller;

import com.example.infomusic.model.InfoMusic;
import com.example.infomusic.service.InfoMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/infoMusics")
public class InfoMusicController {
    @Autowired
    private InfoMusicService infoMusicService;
    @GetMapping
    public String showInfoMusicList(Model model) {
        model.addAttribute("infoMusics", infoMusicService.getInfoMusic());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("infoMusic", new InfoMusic());
        return "add";
    }
    @PostMapping("/add")
    public String addInfoMusic(@Validated @ModelAttribute("infoMusic") InfoMusic infoMusic,
                               BindingResult bindingResult,
                               Model model) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        infoMusicService.save(infoMusic);
        return "redirect:/infoMusics";
    }
    @GetMapping("/{id}/edit")
    public String viewUpdate(@PathVariable int id, Model model) {
         InfoMusic infoMusic = infoMusicService.findById(id);
        model.addAttribute("infoMusic", infoMusic);
        return "edit";
    }

    @PostMapping("/edit")
    public String updateBlog(@Validated @ModelAttribute("infoMusic") InfoMusic infoMusic,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes,
                             Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("infoMusic", infoMusic);
            return "edit";
        }
        if (infoMusicService.findById(infoMusic.getId()) == null) {
            redirectAttributes.addFlashAttribute("error", "Blog not found!");
            return "redirect:/infoMusics";
        }
        infoMusicService.update(infoMusic.getId(), infoMusic);
        redirectAttributes.addFlashAttribute("message", "Blog updated successfully!");
        return "redirect:/infoMusics";
    }
}
