package com.example.myapplication.di

import com.example.data.api.SignService
import com.example.data.api.TestService
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {

    single<SignService>{
        get<Retrofit>().create(SignService::class.java)
    }

    single<TestService>{
        get<Retrofit>().create(TestService::class.java)
    }

}
