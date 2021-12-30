package com.aplikasi.latihanapi

import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName("data")
    val data: ArrayList<PostItem>? = arrayListOf()
)

data class PostItem(
    @SerializedName("judul")
    val judul: String?,

    @SerializedName("jenis_komplain")
    val jenis_komplain: String?
)