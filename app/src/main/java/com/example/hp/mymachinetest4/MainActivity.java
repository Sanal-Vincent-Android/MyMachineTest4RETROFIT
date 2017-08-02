package com.example.hp.mymachinetest4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_retrofit;
    private RecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_retrofit = (RecyclerView) findViewById(R.id.rv_retrofit);
        rv_retrofit.setLayoutManager(new LinearLayoutManager(this));
        IGetNewsEvents apiService =
                MyApplication.getClient().create(IGetNewsEvents.class);

        Call<ArrayList<NewsItem>> call = apiService.getNewsItems();

        call.enqueue(new Callback<ArrayList<NewsItem>>() {
            @Override
            public void onResponse(Call<ArrayList<NewsItem>> call, Response<ArrayList<NewsItem>> response) {
                Log.d("SIZE>>",32+" "+response.body().size());
                adapter = new RecycleAdapter(MainActivity.this, response.body());
                rv_retrofit.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<NewsItem>> call, Throwable t) {

            }
        });


    }

}
