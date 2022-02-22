package ru.korotaeva.vasilisa.conventerm

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("scripts/XML_daily.asp")
    //suspend fun getInfo(): ResponseBody
    //suspend fun getInfo(): Call<ValCurs>
    suspend fun getInfo(): ValCurs
}