package com.lexmasterteam.retrofitapp1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    // lazy znaczyczy, że zmienna zostanie zanicjowany dopiero gdy będzie się do niej próbowało dostać
    val api: TodoApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/") //główny url
            .addConverterFactory(GsonConverterFactory.create() ) // parsowanie
            .build()
            .create(TodoApi::class.java) // podpinamy interfejs api
    }
}