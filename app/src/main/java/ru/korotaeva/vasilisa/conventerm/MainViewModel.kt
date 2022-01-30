package ru.korotaeva.vasilisa.conventerm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Response<CurrencyList>> = MutableLiveData()

     fun getResInfo() {
         viewModelScope.launch {
             val response = repository.getAllInfo()
             myResponse.value = response
         }
    }
}