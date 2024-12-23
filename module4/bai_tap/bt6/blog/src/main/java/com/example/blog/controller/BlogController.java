package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ModelAndView viewAllBlog(Model model,
                                    @RequestParam(defaultValue = "") String title,
                                    @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("title", title); // Truyền giá trị tìm kiếm
        return new ModelAndView("list", "blogs", blogService.findByTitle(title, page));
    }

    @GetMapping("/create")
    public String viewAddBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categories", categoryService.findAll());
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
        model.addAttribute("categories", categoryService.findAll());
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
        model.addAttribute("categories", categoryService.findAll());
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

    @GetMapping("/{id}")
    public String viewBlog(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("blog", blog);
        return "view";
    }
}
