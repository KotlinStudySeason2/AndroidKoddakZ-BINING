package com.example.myapplication.di

import android.app.Application
import android.content.Context
import com.example.myapplication.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class AndroidKoddakZApplication : Application() {
    init{
        instance = this
    }

    companion object{
        var instance: AndroidKoddakZApplication? = null
        fun context() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@AndroidKoddakZApplication)
            modules(viewModelModule)
            modules(networkModule)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(useCaseModule)
            modules(apiModule)
        }
    }
}