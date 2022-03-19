package com.example.domain.repository.test

import com.example.domain.model.test.TestData

interface TestRepository {
    suspend fun getTest() : TestData
}