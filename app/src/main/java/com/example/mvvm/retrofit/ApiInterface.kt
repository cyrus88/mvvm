package com.example.mvvm.retrofit

import com.example.mvvm.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("rest")
    fun getServices() : Call<ServicesSetterGetter>

}