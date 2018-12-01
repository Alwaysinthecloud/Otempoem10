package com.example.marcelosiqueira.otempoem10

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CidadeTempoRest {


    @GET("weather")
    fun getWeatherCity(@Query("id") id: String,
                       @Query("APPID") appid:String,
                       @Query("units") units: String): Call<Cidade>

}