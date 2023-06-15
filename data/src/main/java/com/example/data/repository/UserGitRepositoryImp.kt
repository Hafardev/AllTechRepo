package com.example.data.repository

import androidx.paging.PagingSource
import com.example.data.api.UserGitApi
import com.example.data.db.dao.UserDao
import com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult
import com.example.data.entityModel.userRepo.GetUserRepositoriesParam
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserRepositoryItem
import com.example.domain.entityModel.GetUserRepositoriesParamModel
import com.example.domain.entityModel.GetUserRepositoriesResultModel
import com.example.domain.entityModel.UserRepositoryItemModel
import com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel
import com.example.domain.repository.UserGitRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Inject

class UserGitRepositoryImp @Inject constructor(val userGitApi :UserGitApi , val userDao: UserDao) : UserGitRepository {

    override suspend fun getUserRepositories(username :String, pageSize: Int, pageNumber: Int):  List<GetUserRepositoriesResult> {
        return userGitApi.getUserRepositories(username,pageSize,pageNumber)
    }

    override suspend fun getUserProfileInfo(param: String): GetUserProfileInfoResult {
        return userGitApi.getUserProfileInfo(param)
    }


    override suspend fun createUserFavoriteListItem(param: UserRepositoryItemModel) {
        userDao.createUserFavList(param as UserRepositoryItem)
    }

    override suspend fun updateUserFavoriteListItem(param: UserRepositoryItemModel) {
        userDao.updateUserFavList(param as UserRepositoryItem)
    }

    override suspend fun deleteUserFavoriteListItem(param: UserRepositoryItemModel) {
        userDao.deleteUserFavList(param as UserRepositoryItem)

    }

    override fun readUserFavoriteList(): Flow<List<UserRepositoryItem>> {
        return userDao.readUserFavList()
    }
}