package com.example.data.datasource.sign

import com.example.data.model.request.sign.RequestSignIn
import com.example.data.model.response.ResponseSignIn

interface SignDataSource {
    //로그인
    suspend fun postSignIn(requestSignIn: RequestSignIn) : ResponseSignIn
}