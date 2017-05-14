package com.example.kazt.iakday1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.kazt.iakday1.databinding.ActivityMyGitHubBinding;
import com.example.kazt.iakday1.model.ModelApiGitHub;
import com.example.kazt.iakday1.netService.GitHubService;
import com.google.gson.Gson;
import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MyGitHub extends AppCompatActivity {
    private ActivityMyGitHubBinding binding;
    private ModelApiGitHub data = new ModelApiGitHub();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my_git_hub);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubService service = retrofit.create(GitHubService.class);
        Call<ModelApiGitHub> coba = service.getGitHubProfile();
        coba.enqueue(new Callback<ModelApiGitHub>() {
            @Override
            public void onResponse(Call<ModelApiGitHub> call, Response<ModelApiGitHub> response) {
                Toast.makeText(MyGitHub.this, "cek", Toast.LENGTH_SHORT).show();
                data = response.body();
                binding.tvBio.setText(data.getBio());
                binding.tvBlog.setText(data.getBlog());
                binding.tvCompany.setText(data.getCompany());
                binding.tvLocation.setText(data.getLocation());
            }

            @Override
            public void onFailure(Call<ModelApiGitHub> call, Throwable t) {
                Toast.makeText(MyGitHub.this, t.toString(), Toast.LENGTH_SHORT).show();
                Log.d("cek", t.toString());
            }
        });



    }
}
