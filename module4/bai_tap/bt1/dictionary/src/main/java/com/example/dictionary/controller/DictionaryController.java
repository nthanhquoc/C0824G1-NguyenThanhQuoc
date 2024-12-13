package com.example.dictionary.controller;

import com.example.dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping
    public String index() {
        return "index";
    }
    @GetMapping("/translate")
    public String translate(@RequestParam("word") String word, Model model) {
        String meaning =dictionaryService.findMean(word);
        if (meaning != null) {
            model.addAttribute("word", word);
            model.addAttribute("meaning", meaning);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("error", "Không tìm thấy từ này trong từ điển.");
        }
        return "result";
    }
}
