package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog>getAll(){
        return blogRepository.findAll();
    }
    public void save(Blog blog){
        blogRepository.save(blog);
    }
    public void update(int id, Blog blog){
        blogRepository.save(blog);
    }
    public void remove(int id){
        blogRepository.deleteById(id);
    }
    public Blog findById(int id){
        return blogRepository.findById(id).orElse(null);
    }
}
