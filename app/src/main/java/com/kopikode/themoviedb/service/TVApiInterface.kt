package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=3ccd7d566d4fdc3fdf0226719a0efc68")
    fun getTVList(): Call<TVResponse>
}