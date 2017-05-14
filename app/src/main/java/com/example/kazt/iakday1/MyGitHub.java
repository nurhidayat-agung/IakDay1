package com.example.kazt.iakday1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kazt.iakday1.databinding.ActivityMyGitHubBinding;
import com.example.kazt.iakday1.netService.GitHubService;

public class MyGitHub extends AppCompatActivity {
    private GitHubService service;
    private ActivityMyGitHubBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my_git_hub);
    }
}
