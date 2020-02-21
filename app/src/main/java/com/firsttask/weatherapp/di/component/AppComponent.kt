package com.firsttask.weatherapp.di.component

import com.firsttask.weatherapp.Application
import com.firsttask.weatherapp.di.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, NetworkModule::class, UtilsModule::class, ViewModelFactoryModule::class, FragmentModule::class]
)
interface AppComponent : AndroidInjector<Application> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
        fun appModule(appModule: AppModule): AppComponent.Builder
    }
}

