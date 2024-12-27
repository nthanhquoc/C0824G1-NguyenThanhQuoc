package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogRestController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> blogs = blogService.getAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/categories/{id}/blogs")
    public ResponseEntity<List<Blog>> getBlogsByCategory(@PathVariable int id) {
        List<Blog> blogs = blogService.getAll().stream()
                .filter(blog -> blog.getCategory() != null && blog.getCategory().getIdCategory() == id)
                .toList();

        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("/blogs/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
