package com.example.domain.useCase

import com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel
import com.example.domain.repository.UserGitRepository
import javax.inject.Inject

class GetUserProfileInfoUseCase  @Inject constructor(val repository: UserGitRepository):
    BaseUseCase<String, GetUserProfileInfoResultModel>() {

    override suspend fun onExecute(param: String ?): GetUserProfileInfoResultModel ? {
        return param?.let { repository.getUserProfileInfo(it) }
    }
}