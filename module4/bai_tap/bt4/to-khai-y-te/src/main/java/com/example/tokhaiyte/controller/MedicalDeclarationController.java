package com.example.tokhaiyte.controller;

import com.example.tokhaiyte.service.IMedicalDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicalDeclarationController {
    @Autowired
    private IMedicalDeclarationService medicalDeclarationService;

    @GetMapping("/")
    public String showMedicalDeclaration(Model model) {
        model.addAttribute("medicalDeclaration", medicalDeclarationService.getMedicalDeclaration());
        model.addAttribute("yearBob",new String[]{"1990","1991","1992","1993","1994","1995"});
        model.addAttribute("gender",new String[]{"male","female"});
        model.addAttribute("nationality",new String[]{"English","French","Vietnamese"});
        model.addAttribute("information",new String[]{"Tau Bay","Tau Thuyen"});
        return "medicalDeclaration";
    }
}
