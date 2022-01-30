package ru.korotaeva.vasilisa.conventerm

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("scripts/XML_daily.asp")
    suspend fun getInfo(): Response<CurrencyList>
}