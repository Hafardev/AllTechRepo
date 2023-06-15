package com.example.data.entityModel.userProfileInfo

import com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel


data class GetUserProfileInfoResult(
    val login: String? = null,
    val id: Int? = null,
    val name: String ? = null,
    val location: String ? = null,
    val email: String? = null,
    val bio : String? = null,
    val company : String? = null,
    val type : String? = null,
    val repos_url : String? = null,
    val public_repos : Int? = 0,

) : GetUserProfileInfoResultModel


