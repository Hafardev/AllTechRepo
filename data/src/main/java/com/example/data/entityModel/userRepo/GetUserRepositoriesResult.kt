package com.example.data.entityModel.userRepo

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.domain.entityModel.GetUserRepositoriesResultModel

data class GetUserRepositoriesResult(
    val id : Int,
    val name: String ,
    val full_name: String ,
    val owner : UserOwnerRepositoryItem ? =null,
    ) : GetUserRepositoriesResultModel
