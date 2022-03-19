package com.example.data.repositoryimpl.sign

import com.example.data.datasource.sign.SignDataSource
import com.example.data.mapper.sign.SignMapper
import com.example.data.mapper.sign.SignMapper.mapperToSignIn
import com.example.domain.model.sign.SignInData
import com.example.domain.model.sign.SignInItem
import com.example.domain.repository.sign.SignRepository

class SignRepositoryImpl (private val signDataSource : SignDataSource) : SignRepository {

    //로그인
    override suspend fun postSignIn(signInItem: SignInItem): SignInData {
        return SignMapper.mapperToSignInData(signDataSource.postSignIn(
            mapperToSignIn(signInItem)
        ))
    }

}