package com.example.domain.usecase.test

import com.example.domain.model.test.TestData
import com.example.domain.repository.test.TestRepository

class GetTestUseCase (private val repository: TestRepository){
    suspend operator fun invoke() : TestData {
        return repository.getTest()
    }
}