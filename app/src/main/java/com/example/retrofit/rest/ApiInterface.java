package com.example.retrofit.rest;

import com.example.retrofit.model.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {


    @GET("posts")
    Call<List<Data>>getData();


}
