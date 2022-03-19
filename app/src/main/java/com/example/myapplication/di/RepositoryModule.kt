package com.example.myapplication.di

import com.example.data.repositoryimpl.sign.SignRepositoryImpl
import com.example.domain.repository.sign.SignRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<SignRepository>{ SignRepositoryImpl(get()) }

}
