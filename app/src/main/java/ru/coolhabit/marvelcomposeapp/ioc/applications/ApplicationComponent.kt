package ru.coolhabit.marvelcomposeapp.ioc.applications

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.coolhabit.marvelcomposeapp.MarvelComposeApp
import ru.coolhabit.marvelcomposeapp.ioc.module.ActivityModule
import ru.coolhabit.marvelcomposeapp.ioc.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class,
    ]
)
interface ApplicationComponent : AndroidInjector<MarvelComposeApp> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: MarvelComposeApp): ApplicationComponent
    }
}