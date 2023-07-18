package com.example.blogsystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BlogSystem")
public class Blog
{
    @Id
    private long id;
    private String authorName;
    private String blogType;
    private String blogTitle;
    private String blogDescription;

    public Blog() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBlogType() {
        return blogType;
    }

    public void setBlogType(String blogType) {
        this.blogType = blogType;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription;
    }


    public Blog(long id, String authorName, String blogType, String blogTitle, String blogDescription) {
        this.id = id;
        this.authorName = authorName;
        this.blogType = blogType;
        this.blogTitle = blogTitle;
        this.blogDescription = blogDescription;
    }


    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", blogType='" + blogType + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogDescription='" + blogDescription + '\'' +
                '}';
    }
}
