package com.aplikasi.latihanapi

import com.google.gson.annotations.SerializedName

data class PostRegister (
    @SerializedName("username")
    val username: String?,

    @SerializedName("email")
    val email: String?,

    @SerializedName("password")
    val password: String?

    )