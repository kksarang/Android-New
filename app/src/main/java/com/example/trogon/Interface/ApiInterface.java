package com.example.trogon.Interface;

import com.example.trogon.Model.CategoryModel;
import com.example.trogon.Model.ModelClass;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET ("top_courses")
    Call<ArrayList<ModelClass>> getModelCall();

    @GET("categories")
    Call<ArrayList<CategoryModel>> getCategoryCall();

    @GET("course_details_by_id")
    Call<ArrayList<CategoryModel>> getCategoryCall(@Query("course_id") String course_id,
                                                   @Query("auth_token") String auth_token);




}
