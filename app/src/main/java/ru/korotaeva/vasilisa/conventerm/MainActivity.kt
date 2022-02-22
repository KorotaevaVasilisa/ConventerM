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
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.*
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getCurrentDataa()

    }

    private fun getCurrentDataa() {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
        val api = Retrofit.Builder()
            .baseUrl("https://www.cbr.ru/")
            .client(client)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
            .create(ApiService::class.java)
        GlobalScope.launch(Dispatchers.IO) {
//
//            GlobalScope.launch(Dispatchers.IO) {
                try {
                    val response = api.getInfo()

                    println(response)
                    // println(response.toString())

                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                    }

                }

//            val call: Call<ValCurs> = api.getInfo()
//            call.enqueue(object : Callback<ValCurs> {
//                override fun onResponse(call: Call<ValCurs>, response: Response<ValCurs>) {
//                    //    println(response.body()!!.getValutes())
//                    println(response)
//                }
//
//                override fun onFailure(call: Call<ValCurs>, t: Throwable) {
//                    Log.e("MyLog", "Code:"+t.message)
//                    Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
//                }
//
//            })
        }
    }

    fun getCurrentData() {

        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        val api = Retrofit.Builder()
            .baseUrl("https://www.cbr.ru/")
            .client(client)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build()
            .create(ApiService::class.java)




        GlobalScope.launch(Dispatchers.IO) {
            try {
                val response = api.getInfo()

                println(response)
                // println(response.toString())

            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
                }
                Log.e("MyLog", "data.name2", e)
            }

            // })

        }
    }
}
