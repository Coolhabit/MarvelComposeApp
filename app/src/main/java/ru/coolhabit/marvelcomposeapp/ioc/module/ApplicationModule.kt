package ru.coolhabit.marvelcomposeapp.ioc.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.coolhabit.marvelcomposeapp.MarvelComposeApp

@Module
class ApplicationModule {

    @Provides
    fun provideContext(app: MarvelComposeApp): Context = app.applicationContext
}