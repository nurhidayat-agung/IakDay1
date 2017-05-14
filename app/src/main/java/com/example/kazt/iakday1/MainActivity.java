package com.example.kazt.iakday1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kazt.iakday1.databinding.ActivityMainBinding;
import com.example.kazt.iakday1.model.ModelIdentitas;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.btnSubmit.setOnClickListener(v -> {
                Intent goLanjut = new Intent(MainActivity.this, LanjutActivity.class);

                ModelIdentitas identitas = new ModelIdentitas();
                identitas.setNama(binding.edtNama.getText().toString());
                identitas.setNim(binding.edtNim.getText().toString());
                identitas.setEmail(binding.edtEmail.getText().toString());
                goLanjut.putExtra("nama",binding.edtNama.getText().toString());
                goLanjut.putExtra("model",identitas);


                startActivity(goLanjut);
        });
    }
}
