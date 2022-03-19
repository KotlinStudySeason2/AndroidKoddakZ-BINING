package com.example.myapplication.di

import com.example.data.datasource.sign.SignDataSource
import com.example.data.datasource.sign.SignDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<SignDataSource>{ SignDataSourceImpl(get()) }
}
