package com.example.marcelosiqueira.otempoem10


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CidadeTempoServico {

    val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    val service: CidadeTempoRest

    init{
        val retrofit = Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(CidadeTempoRest::class.java)
    }

    fun getClimaCidade(cityId: String): Cidade?{
        var call = service.getWeatherCity(cityId,
            "f4622060da386d2274c54a14c4f2e342",
            "metric")
        var city = call.execute().body()
        return city
    }

}