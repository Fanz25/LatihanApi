package com.aplikasi.latihanapi

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {
    @POST("/register")
    fun creatUser(@Body Login:PostRegister): Call<PostRegister>

    @GET("/checklist")
    fun getPost(): Call<PostResponse>
}