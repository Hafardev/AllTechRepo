package com.example.data.dataSource

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.data.db.dao.UserDao
import com.example.data.entityModel.userRepo.GetUserRepositoriesParam
import com.example.data.repository.UserGitRepositoryImp
import javax.inject.Inject

class PaginationDataSourceFactory @Inject constructor(
    val dataRepository: UserGitRepositoryImp,
) {
    fun getUserRepositories(paramModel: GetUserRepositoriesParam) = Pager(
        config = PagingConfig(
            pageSize = 2,
            enablePlaceholders = false
        ),
        pagingSourceFactory = { PaginationDataSource(dataRepository, paramModel) },
    ).flow
}