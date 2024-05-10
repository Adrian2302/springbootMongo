package com.example.springMongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "blogs")
public class BlogEntity {
    @Id
    private String id;
    private String name;
    private List<PostEntity> posts;
    private List<UserEntity> followers;
    private List<PageEntity> pages;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostEntity> getPosts() {
        return posts;
    }

    public void setPosts(List<PostEntity> posts) {
        this.posts = posts;
    }

    public List<UserEntity> getFollowers() {
        return followers;
    }

    public void setFollowers(List<UserEntity> followers) {
        this.followers = followers;
    }

    public List<PageEntity> getPages() {
        return pages;
    }

    public void setPages(List<PageEntity> pages) {
        this.pages = pages;
    }
}
