package com.example.a65apps.daggerlesson.di.app;

import android.content.SharedPreferences;

import com.example.a65apps.daggerlesson.app.AppDatabase;
import com.example.a65apps.daggerlesson.app.AppDelegate;
import com.example.a65apps.daggerlesson.di.contact.ContactComponent;
import com.example.a65apps.daggerlesson.di.main.MainComponent;
import com.example.a65apps.daggerlesson.di.main.MainModule;
import com.example.a65apps.daggerlesson.network.ContactApi;
import com.example.core.di.module.AppModule;
import com.example.core.di.module.NavigationModule;

import javax.inject.Singleton;

import dagger.Component;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;


@Singleton
@Component(modules = {AppModule.class, DataBaseModule.class, NetworkModule.class, NavigationModule.class})
public interface AppComponent {
    // For dependency component
    SharedPreferences provideShared();
    AppDatabase provideAppDatabase();
    ContactApi provideContactApi();
    Router provideRouter();
    NavigatorHolder provideNavigatorHolder();

    // For subcomponent component
    ContactComponent plusContactComponent();
    MainComponent plusMainComponent(MainModule mainModule);

    void inject(AppDelegate appDelegate);
}