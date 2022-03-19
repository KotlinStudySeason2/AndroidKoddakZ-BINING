package com.example.data.api

import com.example.data.model.request.sign.RequestSignIn
import com.example.data.model.response.ResponseSignIn
import retrofit2.http.Body
import retrofit2.http.POST

interface SignService {
    //로그인
    @POST("auth/login")
    suspend fun postSignIn(
        @Body requestSignIn: RequestSignIn
    ) : ResponseSignIn

}