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
       /// headerMapParams.put("Authorization" ,"Bearer "+"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")//second OAuth Token (classic) with repo scope ticks - Expires on Fri, Mar 31 2023.
        headerMapParams.put("Authorization" ,"Bearer "+"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")//Third OAuth Token (classic) with repo scope ticks - Expires on Fri, sep 03 2023.
        headerMapParams.put("X-GitHub-Api-Version" ,"2022-11-28")
        // headerMapParams.put("Authorization" ,"Bearer "+"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")//first OAuth Token (classic)

        return RetrofitHelper.createRetrofit(baseUrl = "https://api.github.com" ,interceptorMap = interceptorsMap , headerMap = headerMapParams)
    }


    @Provides
    fun provideUserService(retrofit: Retrofit): UserGitApi = retrofit.create(UserGitApi::class.java)


}