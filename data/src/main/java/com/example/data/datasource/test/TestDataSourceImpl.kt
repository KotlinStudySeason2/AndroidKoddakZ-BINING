package com.example.data.datasource.test

import com.example.data.api.TestService
import com.example.data.model.response.test.ResponseTestData

class TestDataSourceImpl(private val service : TestService) : TestDataSource  {
    override suspend fun getTestData(): ResponseTestData {
        return service.getTestData()
    }
}