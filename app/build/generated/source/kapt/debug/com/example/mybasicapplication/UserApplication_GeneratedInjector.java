package com.example.mybasicapplication;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = UserApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface UserApplication_GeneratedInjector {
  void injectUserApplication(UserApplication userApplication);
}
