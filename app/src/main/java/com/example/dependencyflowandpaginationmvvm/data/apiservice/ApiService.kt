package com.example.dependencyflowandpaginationmvvm.data.apiservice

import com.example.dependencyflowandpaginationmvvm.data.modal.Movie
import com.example.dependencyflowandpaginationmvvm.data.modal.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService{

    @GET("movie/top_rated")
    suspend fun getAllMovies(@Query("api_key") api_key: String,
                             @Query("language") language: String,
                             @Query("page") page: Int) : Response<MovieResponse>

}
