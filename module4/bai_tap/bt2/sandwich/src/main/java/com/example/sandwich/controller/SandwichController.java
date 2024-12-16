package com.example.sandwich.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SandwichController {
    @RequestMapping("/")
    public String showForm() {
        return "index";
    }

    @RequestMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiments, Model model) {
        model.addAttribute("condiments", condiments);
        return "result";
    }
}
