package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog>getAll();
    void save(Blog blog);
    void update(int id, Blog blog);
    void remove(int id);
    Blog findById(int id);

}
