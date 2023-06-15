package com.example.domain.useCase

import com.example.domain.entityModel.GetUserRepositoriesResultModel
import com.example.domain.entityModel.UserRepositoryItemModel
import com.example.domain.repository.UserGitRepository
import javax.inject.Inject

class DeleteUserFavoriteItemUseCase  @Inject constructor(val userGitRepository: UserGitRepository) :
    BaseUseCase<UserRepositoryItemModel, Unit>() {

    override suspend fun onExecute(param: UserRepositoryItemModel?) {
        param?.let { userGitRepository.deleteUserFavoriteListItem(it) }
    }


}