package ru.coolhabit.marvelcomposeapp

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.coolhabit.marvelcomposeapp.ioc.applications.DaggerApplicationComponent

class MarvelComposeApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent
            .factory()
            .create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }
}