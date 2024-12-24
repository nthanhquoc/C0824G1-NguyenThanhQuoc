package com.example.bt2.controller;

import com.example.bt2.model.Phone;
import com.example.bt2.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phones")
public class PhoneController {
    @Autowired
    private IPhoneService phoneService;

    @GetMapping("")
    public String viewPhoneForm(Model model) {
        model.addAttribute("phone",new Phone());
        return "index";
    }

    @PostMapping("")
    public String addPhone(@Validated @ModelAttribute("phone") Phone phone, BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()) {
            return "index";
        }
        phoneService.save(phone);
        return "/result";
    }

    @GetMapping("/result")
    public String showResultPage() {
        return "result";
    }
}
