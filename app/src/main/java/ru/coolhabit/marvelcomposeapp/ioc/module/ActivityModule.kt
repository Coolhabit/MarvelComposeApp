package ru.coolhabit.marvelcomposeapp.ioc.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.coolhabit.marvelcomposeapp.MainActivity

@Module()
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun mainActivity(): MainActivity
}