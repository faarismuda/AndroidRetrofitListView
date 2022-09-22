package com.faarisid.tugasretrofitlistview;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

interface MyApi {
    @GET("users")
    Call<ArrayList<Model>>callModel();
}
