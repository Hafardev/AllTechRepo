package com.example.data.dataSource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.entityModel.userRepo.GetUserRepositoriesParam
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.repository.UserGitRepositoryImp
import javax.inject.Inject

class PaginationDataSource @Inject constructor(
    val dataRepository: UserGitRepositoryImp,
   private val paramModel: GetUserRepositoriesParam
) : PagingSource<Int, GetUserRepositoriesResult>() {


    companion object {
        private const val STARTING_PAGE_INDEX = 1
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GetUserRepositoriesResult> {


        val position = params.key ?: STARTING_PAGE_INDEX
        return try {
            val result = dataRepository.getUserRepositories(paramModel.userName, paramModel.pageSize, position)

            LoadResult.Page(
                data = result,
                prevKey = if (position == STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (result.isEmpty()) null else position + 1
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, GetUserRepositoriesResult>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}