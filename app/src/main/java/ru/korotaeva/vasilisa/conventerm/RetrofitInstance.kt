package ru.korotaeva.vasilisa.conventerm

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import retrofit2.create

object RetrofitInstance {
    private  val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl("http://www.cbr.ru/")
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
    }
     val api:ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }
}