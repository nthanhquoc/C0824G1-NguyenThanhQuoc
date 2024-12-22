package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ModelAndView viewAllBLog(Model model) {
        return new ModelAndView("list","blogs",blogService.getAll());
    }

    @GetMapping("/create")
    public String viewAddBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }
    @PostMapping("/create")
    public String createBlog(Blog blog) {
        blogService.save(blog);
        return "redirect:/blogs";
    }
}
