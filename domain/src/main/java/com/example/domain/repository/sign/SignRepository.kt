package com.example.domain.repository.sign

import com.example.domain.model.sign.SignInData
import com.example.domain.model.sign.SignInItem

interface SignRepository {

    //로그인
    suspend fun postSignIn(signInItem: SignInItem): SignInData

}