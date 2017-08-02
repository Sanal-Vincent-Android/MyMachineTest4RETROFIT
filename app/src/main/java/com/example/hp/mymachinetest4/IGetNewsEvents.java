package com.example.hp.mymachinetest4;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IGetNewsEvents {

    @GET("api/unit_details/unitdetails_by_id?category_id=6&format=json")
    Call<ArrayList<NewsItem>> getNewsItems();

}