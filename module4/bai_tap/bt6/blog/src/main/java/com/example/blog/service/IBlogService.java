package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IBlogService {
    List<Blog>getAll();
    void save(Blog blog);
    void update(int id, Blog blog);
    void remove(int id);
    Blog findById(int id);
    public Page<Blog> findByTitle(String title, Integer page);

}
