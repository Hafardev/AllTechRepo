package com.example.data.entityModel.userRepo

import com.example.domain.entityModel.UserOwnerRepositoryItemModel

data class UserOwnerRepositoryItem(
    val login : String ? = null,
    val type : String ? = null,
    val node_id : String ? = null
) : UserOwnerRepositoryItemModel
