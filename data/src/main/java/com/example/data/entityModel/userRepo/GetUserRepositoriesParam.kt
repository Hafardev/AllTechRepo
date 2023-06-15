package com.example.data.entityModel.userRepo

import com.example.domain.entityModel.GetUserRepositoriesParamModel

data class GetUserRepositoriesParam(
    val userName : String,
    val pageSize : Int = 2,
    val pageNumber : Int = 1,
    val subjectType : String  ? =null,
     val subjectId : Int  ? =null) :
    GetUserRepositoriesParamModel
