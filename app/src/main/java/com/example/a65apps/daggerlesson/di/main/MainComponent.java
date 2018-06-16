package com.example.a65apps.daggerlesson.di.main;


import com.example.a65apps.daggerlesson.di.core.AppComponent;
import com.example.a65apps.daggerlesson.presentation.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = {AppComponent.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}