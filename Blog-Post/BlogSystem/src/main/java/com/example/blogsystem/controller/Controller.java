package com.example.blogsystem.controller;

import com.example.blogsystem.entity.Blog;
import com.example.blogsystem.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BlogService bs;

    @GetMapping("/blogs")
    private List<Blog> getList()
    {
        return bs.getList();
    }

    @PostMapping("/blogs")
    private Blog addBlog(@RequestBody Blog blog)
    {
        return bs.addBlog(blog);
    }

    @PutMapping("/blogs")
    private Blog updateBlog(@RequestBody Blog blog)
    {
        return bs.addBlog(blog);
    }


    @GetMapping("/blogs/{id}")
    private Blog getById(@PathVariable Long id)
    {
        return bs.getById(id);
    }


    @DeleteMapping("/blogs/{id}")
    private Boolean deleteById(@PathVariable Long id)
    {
        bs.deleteById(id);
        return true;
    }

    @DeleteMapping("/blogs")
    private Boolean deleteAll()
    {
        bs.deleteAll();
        return true;
    }
}
