package com.example.domain.useCase

import com.example.domain.entityModel.GetUserRepositoriesParamModel
import com.example.domain.entityModel.GetUserRepositoriesResultModel
import com.example.domain.entityModel.UserRepositoryItemModel
import com.example.domain.repository.UserGitRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

//TODO - this useCase is for this api @GET("/users/{username}/hovercard") and then it does cancel
class GetUserRepositoriesUseCase @Inject constructor(val repository: UserGitRepository):
    BaseUseCase<GetUserRepositoriesParamModel, List<GetUserRepositoriesResultModel> >() {

    override suspend fun onExecute(param: GetUserRepositoriesParamModel?): List<GetUserRepositoriesResultModel> ? {
      return repository.getUserRepositories("",0,0)
    }

}