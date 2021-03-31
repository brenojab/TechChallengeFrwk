package com.framework.techchallengefrwk.service

import com.framework.techchallengefrwk.models.ServicesResult
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


interface IWebService {


//    @GET("/todos")
//    fun getServices(
//    ): Call<ServicesResult>
//
//    @GET("/albums")
//    fun getServices(
//    ): Call<ServicesResult>

    @GET("/posts")
    fun getServices(
    ): Call<ServicesResult>

}

fun createService(): IWebService {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    return retrofit.create(IWebService::class.java)
}