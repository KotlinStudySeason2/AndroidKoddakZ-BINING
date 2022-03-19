package com.example.myapplication.di

import com.example.domain.usecase.sign.PostSignInUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostSignInUseCase(get()) }
}
