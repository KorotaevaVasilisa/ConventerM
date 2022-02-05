package ru.korotaeva.vasilisa.conventerm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.awaitResponse
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.lang.Exception

class MainActivity : AppCompatActivity() {

   // private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
getCurrentData()
//        val repository=Repository()
//        val viewModelFactory=MainViewModelFactory(repository)
//        viewModel=ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
//        viewModel.getResInfo()


    }
private  fun getCurrentData() {

    val api= Retrofit.Builder()
        .baseUrl("http://www.cbr.ru/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(ApiService::class.java)



    GlobalScope.launch (Dispatchers.IO){
       // try {
            val response = api.getInfo().awaitResponse()
            if (response.isSuccessful) {
                val data = response.body()!!
                Log.d("MyLog", "data.name2")
            }
//        }catch (e:Exception){
//            withContext(Dispatchers.Main){
//                Toast.makeText(applicationContext,"Error",Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}
}
