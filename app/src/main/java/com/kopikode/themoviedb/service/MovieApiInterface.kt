package com.kopikode.themoviedb.service

import com.kopikode.themoviedb.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=3ccd7d566d4fdc3fdf0226719a0efc68")
    fun getMovieList(): Call<MovieResponse>
}