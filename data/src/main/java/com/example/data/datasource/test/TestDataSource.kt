package com.example.data.datasource.test

import com.example.data.model.response.test.ResponseTestData

interface TestDataSource {
    suspend fun getTestData(): ResponseTestData
}