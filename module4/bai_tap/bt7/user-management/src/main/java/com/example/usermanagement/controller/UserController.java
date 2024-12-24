package com.example.usermanagement.controller;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.IUserService;
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
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String viewUserForm(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("")
    public String addUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "index";
        }
        userService.save(user);
        return "redirect:/users/result";
    }
    @GetMapping("/result")
    public String showResultPage(){
        return "result";
    }
}
