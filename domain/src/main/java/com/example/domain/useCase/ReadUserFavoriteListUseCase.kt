package com.example.domain.useCase

import com.example.domain.entityModel.UserRepositoryItemModel
import com.example.domain.repository.UserGitRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReadUserFavoriteListUseCase @Inject constructor(val userGitRepository: UserGitRepository)
    : BaseUseCase<Unit, Flow<List<UserRepositoryItemModel>>>() {

    override suspend fun onExecute(param: Unit?):Flow<List<UserRepositoryItemModel>> {
        return userGitRepository.readUserFavoriteList()
    }
}