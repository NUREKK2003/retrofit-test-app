package com.lexmasterteam.retrofitapp1

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TodoApi {

    // retrofit get request
    @GET("/todos") // dajemy tu tylko końcówkę linku
    suspend fun getTodos(): Response<List<Todo>>  // w courtine

    // w ten sposób robimy to z apikeyem
    //fun getTodos(@Query("key") key:String): Response<List<Todo>>

    // wysyłanie danych na serwer (post request)
    //@POST("/createTodo")
    //fun createTodo(@Body todo: Todo): Response<CreateToDoResponse()>
}