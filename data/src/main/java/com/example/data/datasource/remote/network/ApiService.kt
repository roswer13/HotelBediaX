package com.example.data.datasource.remote.network

import com.example.data.datasource.remote.model.DestinationRemoteDo
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("/")
    suspend fun create(@Body destination: DestinationRemoteDo): Boolean

    @DELETE("/{id}")
    suspend fun deleteById(@Path("id") id: Int): Boolean

    @GET("/")
    suspend fun getAll(): List<DestinationRemoteDo>

    @PATCH("/{id}")
    suspend fun update(@Path("id") id: Int, @Body destination: DestinationRemoteDo): Boolean
}