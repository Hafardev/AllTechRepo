package com.example.mybasicapplication.di

import com.example.data.repository.UserGitRepositoryImp
import com.example.domain.repository.UserGitRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(repo : UserGitRepositoryImp) : UserGitRepository

}