package com.example.data.repositoryimpl.test

import com.example.data.datasource.test.TestDataSource
import com.example.data.mapper.test.TestMapper
import com.example.domain.model.test.TestData
import com.example.domain.repository.test.TestRepository

class TestRepositoryImpl (private val dataSource: TestDataSource) : TestRepository {
    override suspend fun getTest(): TestData {
        return TestMapper.mapperToTest(dataSource.getTestData())
    }
}