package com.example.kazt.iakday1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kazt.iakday1.databinding.ActivityLanjutBinding;

public class LanjutActivity extends AppCompatActivity {
    private ActivityLanjutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lanjut);
    }
}
