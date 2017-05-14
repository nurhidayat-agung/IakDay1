package com.example.kazt.iakday1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kazt on 5/14/17.
 */

public class ModelApiGitHub {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("blog")
    @Expose
    private String blog;

    @SerializedName("location")
    @Expose
    private String location;

    @SerializedName("bio")
    @Expose
    private String bio;

    @SerializedName("company")
    @Expose
    private String company;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @SerializedName("avatar_url")
    @Expose
    private String avatar_url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
