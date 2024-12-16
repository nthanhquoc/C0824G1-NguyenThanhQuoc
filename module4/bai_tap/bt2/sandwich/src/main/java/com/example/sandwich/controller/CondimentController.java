package com.example.sandwich.Controller;

import com.example.sandwich.Service.ICondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {
    @Autowired
    private ICondimentService condimentService;

    @GetMapping("/")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiment,
                       @RequestParam(value = "action", required = false) String action,
                       Model model) {
        if ("save".equals(action) && !condimentService.validateCondiments(condiment)) {
            model.addAttribute("error", "No Condiment selected");
        } else if (condiment != null) {
            model.addAttribute("condiment", condiment);
        }
        return "save";
    }
}