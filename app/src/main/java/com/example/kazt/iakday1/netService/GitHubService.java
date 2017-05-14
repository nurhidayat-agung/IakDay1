package com.example.kazt.iakday1.netService;

import com.example.kazt.iakday1.model.ModelApiGitHub;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by kazt on 5/14/17.
 */

public interface GitHubService {
    @GET("/users/nurhidayat-agung")
    Call<ModelApiGitHub> getGitHubProfile();

}
