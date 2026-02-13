package com.example.retrofitapi.data.api

import com.example.retrofitapi.data.models.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
