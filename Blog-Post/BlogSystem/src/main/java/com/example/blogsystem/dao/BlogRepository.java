package com.example.blogsystem.dao;

import com.example.blogsystem.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long>
{

}
