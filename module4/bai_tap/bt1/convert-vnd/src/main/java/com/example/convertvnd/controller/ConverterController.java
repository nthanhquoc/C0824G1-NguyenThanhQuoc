package com.example.convertvnd.controller;

import com.example.convertvnd.service.ConvertService;
import com.example.convertvnd.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class ConverterController {

    @Autowired
    private IConvertService convertService;

    @GetMapping
    public String showForm(){
        return "index";
    }

    @RequestMapping("/convert")
    public String convertCurrency(@RequestParam("usd") String usdInput, Model model) {
        try {
            double usd = Double.parseDouble(usdInput);
            double vnd = convertService.covertUsdToVnd(usd);
            model.addAttribute("vn", vnd);
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Vui lòng nhập số hợp lệ cho USD.");
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "result";
    }
    }

