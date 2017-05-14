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

    @SerializedName("bio")
    @Expose
    private String location;

    @SerializedName("avatar_url")
    @Expose
    private String avatar_url;


}
