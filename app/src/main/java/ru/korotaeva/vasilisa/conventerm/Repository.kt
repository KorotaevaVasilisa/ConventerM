package ru.korotaeva.vasilisa.conventerm

import retrofit2.Response

class Repository {
    suspend fun getAllInfo(): Response<CurrencyList> {
        return RetrofitInstance.api.getInfo()
    }
}