package com.example.data.api

import com.example.data.model.response.test.ResponseTestData
import retrofit2.http.GET

interface TestService {
    @GET("publicData/dustSensor")
    suspend fun getTestData() : ResponseTestData
}