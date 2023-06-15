package com.example.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.data.db.convertor.UserOwnerRepositoryItemConvertor
import com.example.data.db.dao.UserDao
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserRepositoryItem

@TypeConverters(UserOwnerRepositoryItemConvertor::class )
@Database(entities = [UserRepositoryItem::class], version = 1)
abstract class ApplicationDataBase : RoomDatabase() {

    abstract fun userDao(): UserDao

  /*  companion object {

        @Volatile
        private var DBINSTANCE: ApplicationDataBase? = null

        fun getDatabase(context: Context): ApplicationDataBase {
            *//*  Implementation Singleton >>> if the INSTANCE is not null, then return it else create the database  *//*
            if (DBINSTANCE == null) {
                synchronized(this) {
                    // Pass the database to the INSTANCE
                    DBINSTANCE = buildDatabase(context)
                }
            }
            // Return database.
            return DBINSTANCE!!
        }

        private fun buildDatabase(context: Context): ApplicationDataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                ApplicationDataBase::class.java,
                "application_database"
            ).build()
        }
    }*/
}