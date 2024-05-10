package com.example.springMongo.models;

import java.util.List;

public class BlogModel {
    private String name;
    private List<PostModel> posts;
    private List<UserModel> followers;
    private List<PageModel> pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    public List<UserModel> getFollowers() {
        return followers;
    }

    public void setFollowers(List<UserModel> followers) {
        this.followers = followers;
    }

    public List<PageModel> getPages() {
        return pages;
    }

    public void setPages(List<PageModel> pages) {
        this.pages = pages;
    }
}
