package com.example.customermanagement.controller;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.service.CustomerService;
import com.example.customermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;


    @GetMapping("")
    public ModelAndView viewAllCustomer(Model model) {
        System.out.println("hello");
        return new ModelAndView("index", "customers", customerService.getAll());
    }
    @GetMapping("/create")
    public String viewAddStudent(Model model) {
        model.addAttribute("customer", new Customer());
        return "/add";
    }
    @PostMapping("/save")
    public String save(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }
}
