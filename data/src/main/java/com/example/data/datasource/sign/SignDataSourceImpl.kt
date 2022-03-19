package com.example.data.datasource.sign

import com.example.data.api.SignService
import com.example.data.model.request.sign.RequestSignIn
import com.example.data.model.response.ResponseSignIn

class SignDataSourceImpl(private val service : SignService) : SignDataSource {
    override suspend fun postSignIn(requestSignIn: RequestSignIn): ResponseSignIn {
        return service.postSignIn(requestSignIn)
    }
}