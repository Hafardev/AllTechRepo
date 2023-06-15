package com.example.mybasicapplication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J!\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\t\u0012\u00070\u0004\u00a2\u0006\u0002\b\n0\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mybasicapplication/di/ApiServiceModule;", "", "()V", "provideResponseParseInterceptor", "Lokhttp3/Interceptor;", "provideRetrofit", "Lretrofit2/Retrofit;", "interceptorsMap", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "provideUserService", "Lcom/example/data/api/UserGitApi;", "retrofit", "app_debug"})
@dagger.Module()
public final class ApiServiceModule {
    
    public ApiServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.example.mybasicapplication.di.annotation.Order(value = 100)
    @dagger.multibindings.IntoMap()
    public final okhttp3.Interceptor provideResponseParseInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, okhttp3.Interceptor> interceptorsMap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.data.api.UserGitApi provideUserService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}