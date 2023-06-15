package com.example.mybasicapplication.di

import android.content.Context
import androidx.room.Room
import com.example.data.db.ApplicationDataBase
import com.example.data.db.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DBModule {

    @Singleton
    @Provides
    fun provideAppDB(@ApplicationContext context: Context): ApplicationDataBase {
        return Room.databaseBuilder(context, ApplicationDataBase::class.java, "application_database")
            .build()
    }



    @Singleton
    @Provides
    fun provideUserDao(applicationDataBase: ApplicationDataBase) : UserDao{
        return applicationDataBase.userDao()
    }
}