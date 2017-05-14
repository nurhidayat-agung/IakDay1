package com.example.kazt.iakday1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kazt.iakday1.databinding.ActivityLanjutBinding;
import com.example.kazt.iakday1.model.ModelIdentitas;

public class LanjutActivity extends AppCompatActivity {
//    private ActivityLanjutBinding binding;
    private ActivityLanjutBinding binding;
    private String nama;
    private ModelIdentitas identitas = new ModelIdentitas();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lanjut);
        nama = getIntent().getStringExtra("nama");
        identitas = (ModelIdentitas) getIntent().getSerializableExtra("model");
        binding.editNama.setText(nama);
        binding.editEmail.setText(identitas.getEmail());
        binding.editNim.setText(identitas.getNim());
    }
}
