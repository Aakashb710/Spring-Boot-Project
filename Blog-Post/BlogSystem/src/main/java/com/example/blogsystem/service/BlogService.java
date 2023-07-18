package com.example.blogsystem.service;

import com.example.blogsystem.dao.BlogRepository;
import com.example.blogsystem.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository bg;

    public List<Blog> getList()
    {
        return (List<Blog>)bg.findAll();
    }

    public Blog addBlog(Blog blog)
    {
        return bg.save(blog);
    }

    public Blog updateBlog(Blog blog)
    {
        return bg.save(blog);
    }

    public Blog getById(Long id)
    {
        return bg.findById(id).get();
    }

    public void deleteById(Long id)
    {
         bg.deleteById(id);
    }

    public void deleteAll()
    {
        bg.deleteAll();
    }
}
