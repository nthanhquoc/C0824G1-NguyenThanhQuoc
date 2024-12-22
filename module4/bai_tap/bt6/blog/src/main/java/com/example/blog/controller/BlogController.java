package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ModelAndView viewAllBlog() {
        return new ModelAndView("list", "blogs", blogService.getAll());
    }

    @GetMapping("/create")
    public String viewAddBlog(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String createBlog(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Blog created successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/edit")
    public String viewUpdate(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String updateBlog(Blog blog, RedirectAttributes redirectAttributes) {
        if (blogService.findById(blog.getId()) == null) {
            redirectAttributes.addFlashAttribute("error", "Blog not found!");
            return "redirect:/blogs";
        }
        blogService.update(blog.getId(), blog);
        redirectAttributes.addFlashAttribute("message", "Blog updated successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/delete")
    public String viewDelete(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteBlog(Blog blog, RedirectAttributes redirectAttributes) {
        if (blogService.findById(blog.getId()) == null) {
            redirectAttributes.addFlashAttribute("error", "Blog not found!");
            return "redirect:/blogs";
        }
        blogService.remove(blog.getId());
        redirectAttributes.addFlashAttribute("message", "Blog deleted successfully!");
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/view")
    public String viewBlog(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "view";
    }
}
