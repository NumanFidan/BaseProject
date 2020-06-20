package com.simplertutorials.android.baseproject.components;

import com.simplertutorials.android.baseproject.ui.fragments.SampleFragment;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class, ContextModule.class})
public interface ApplicationComponent {

    void inject(SampleFragment sampleFragment);

}

