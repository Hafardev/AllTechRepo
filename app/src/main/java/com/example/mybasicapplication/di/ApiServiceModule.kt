package com.example.mybasicapplication.di

import com.example.data.network.RetrofitHelper
import com.example.data.api.UserGitApi
import com.example.data.network.interceptor.ApiResultParserInterceptor
import com.example.mybasicapplication.di.annotation.Order
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.multibindings.IntoMap
import okhttp3.Interceptor
import retrofit2.Retrofit

@Module
@InstallIn(ViewModelComponent::class)
class ApiServiceModule {

    @IntoMap
    @Order(100)
    @Provides
    fun provideResponseParseInterceptor(): Interceptor = ApiResultParserInterceptor()

    @Provides
    fun provideRetrofit(interceptorsMap: Map<Int, @JvmSuppressWildcards Interceptor>): Retrofit {
        val headerMapParams: MutableMap<String, String> = mutableMapOf()

        headerMapParams.put("accept" ,"application/vnd.github+json")
        headerMapParams.put("Authorization" ,"Bearer "+"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")//fourth OAuth Token (classic) with repo scope ticks - no expire.
        headerMapParams.put("X-GitHub-Api-Version" ,"2022-11-28")

        return RetrofitHelper.createRetrofit(baseUrl = "https://api.github.com" ,interceptorMap = interceptorsMap , headerMap = headerMapParams)
    }


    @Provides
    fun provideUserService(retrofit: Retrofit): UserGitApi = retrofit.create(UserGitApi::class.java)


}