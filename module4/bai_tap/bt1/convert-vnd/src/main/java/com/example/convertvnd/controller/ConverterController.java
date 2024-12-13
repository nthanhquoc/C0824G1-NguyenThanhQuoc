package com.example.convertvnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class ConverterController {
    @GetMapping
    public String showForm(){
        return "index";
    }

    @RequestMapping("/convert")
    public String convertCurrency(@RequestParam("usd") double usd,
                                  Model model) {
        double rate = 25.3;
        double vnd = rate* usd;
        model.addAttribute("vnd", vnd);
        return "result";
    }

}
