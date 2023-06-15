package com.example.domain.repository


import com.example.domain.entityModel.GetUserRepositoriesResultModel
import com.example.domain.entityModel.UserRepositoryItemModel
import com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel
import kotlinx.coroutines.flow.Flow


interface UserGitRepository {

    suspend fun getUserRepositories(username :String, pageSize: Int, pageNumber: Int):  List<GetUserRepositoriesResultModel>

    suspend fun getUserProfileInfo(param: String): GetUserProfileInfoResultModel

    suspend fun createUserFavoriteListItem (param: UserRepositoryItemModel )

    suspend fun updateUserFavoriteListItem (param: UserRepositoryItemModel)

    suspend fun deleteUserFavoriteListItem (param: UserRepositoryItemModel)

     fun readUserFavoriteList (): Flow<List<UserRepositoryItemModel>>

}