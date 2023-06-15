package com.example.data.entityModel.userRepo

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.domain.entityModel.UserRepositoryItemModel


@Entity(tableName = "user_fav_item")
data class UserRepositoryItem(
    var id: Int ?= 0,
    @PrimaryKey
    val name: String,
    val fullName: String ? =null,
    val owner : UserOwnerRepositoryItem ? =null) : UserRepositoryItemModel


