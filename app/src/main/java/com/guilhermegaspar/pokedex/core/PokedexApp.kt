package com.guilhermegaspar.pokedex.core

import android.app.Application
import com.guilhermegaspar.pokedex.di.KoinManager
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PokedexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@PokedexApp)
            modules(KoinManager.loadAllModules())
        }
    }
}