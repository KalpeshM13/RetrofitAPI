package com.example.myapplication.data.api

import com.example.myapplication.data.models.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
