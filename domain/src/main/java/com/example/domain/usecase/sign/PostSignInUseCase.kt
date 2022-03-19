package com.example.domain.usecase.sign

import com.example.domain.model.sign.SignInData
import com.example.domain.model.sign.SignInItem
import com.example.domain.repository.sign.SignRepository

class PostSignInUseCase(private val repository : SignRepository) {
    suspend operator fun invoke(signInItem: SignInItem) : SignInData {
        return repository.postSignIn(signInItem)
    }
}