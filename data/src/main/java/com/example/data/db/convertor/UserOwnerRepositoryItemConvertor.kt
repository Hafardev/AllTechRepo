package com.example.data.db.convertor

import androidx.room.TypeConverter
import com.example.data.entityModel.userRepo.UserOwnerRepositoryItem
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type


class UserOwnerRepositoryItemConvertor {
    @TypeConverter
    fun fromJson(value: String ?): UserOwnerRepositoryItem ? {
        val gson = GsonBuilder().create()
        val type: Type = object : TypeToken<UserOwnerRepositoryItem>() {}.type
        return gson.fromJson<UserOwnerRepositoryItem>(value, type)
    }

    @TypeConverter
    fun toJson(list: UserOwnerRepositoryItem ?): String ? {
        return Gson().toJson(list)
    }
}