package com.example.mybasicapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.data.dataSource.PaginationDataSourceFactory
import com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult
import com.example.data.entityModel.userRepo.GetUserRepositoriesParam
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserOwnerRepositoryItem
import com.example.data.entityModel.userRepo.UserRepositoryItem
import com.example.domain.useCase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    val createUserFavoriteItemUseCase: CreateUserFavoriteItemUseCase,
    val updateUserFavoriteItemUseCase: UpdateUserFavoriteItemUseCase,
    val readUserFavoriteListUseCase: ReadUserFavoriteListUseCase,
    val deleteUserFavoriteItemUseCase: DeleteUserFavoriteItemUseCase,
    val getUserProfileInfoUseCase: GetUserProfileInfoUseCase,
    val getUserRepositoriesUseCase: GetUserRepositoriesUseCase,
    val pagingReposDataSourceFactory: PaginationDataSourceFactory
) : ViewModel() {

    public var profileInfoLiveData = MutableLiveData<GetUserProfileInfoResult>()
    var messageError = MutableLiveData<String>()

    lateinit var favoriteListFlow: Flow<List<UserRepositoryItem>>



    fun callGetUserRepositoryListRequest(): Flow<PagingData<GetUserRepositoriesResult>>? {
        var param = GetUserRepositoriesParam("Hafardev", 2, 1)
        try {
            return pagingReposDataSourceFactory.getUserRepositories(param).cachedIn(viewModelScope)

        } catch (e: java.lang.IllegalStateException) {
            println("exceptionnillega ${e.message}")
        } catch (e: IOException) {
            println("exceptionnio ${e.message}")
        } catch (e: Exception) {
            println("exceptionn ${e.message}")
        }
        return null
    }


    fun callReadUserFavoriteListRequest() {
        try {

            val executorDispatcher: CoroutineDispatcher = Dispatchers.IO
            val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
                messageError.value = exception.message
            }

            var context = defaultExceptionHandler + executorDispatcher
            viewModelScope.launch(context) {
                favoriteListFlow =
                    readUserFavoriteListUseCase.onExecute(null) as Flow<List<UserRepositoryItem>>
            }
        } catch (e: java.lang.IllegalStateException) {
            println("exceptionnillega ${e.message}")
        } catch (e: IOException) {
            println("exceptionnio ${e.message}")
        } catch (e: Exception) {
            println("exceptionn ${e.message}")
        }
    }

    fun callDeleteUserFavoriteItemRequest(
        id: Int? = null,
        name: String,
        fullName: String? = null
    ) {
        //val deleteItemParam = GetUserRepositoriesResult()
        val deleteItemParam = UserRepositoryItem(id, name, fullName)
        val executorDispatcher: CoroutineDispatcher = Dispatchers.IO
        val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
            messageError.value = exception.message
        }

        var context = defaultExceptionHandler + executorDispatcher
        viewModelScope.launch(context) {
            deleteUserFavoriteItemUseCase.onExecute(deleteItemParam)
        }
    }


    fun callCreateUserFavoriteItemRequest(
        id: Int? = null,
        name: String,
        fullName: String? = null,
        owner: UserOwnerRepositoryItem? = null
    ) {
        val addedItemParam =
            UserRepositoryItem(id = id, name = name, fullName = fullName, owner = owner)
        val executorDispatcher: CoroutineDispatcher = Dispatchers.IO
        val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
            messageError.value = exception.message
        }

        var context = defaultExceptionHandler + executorDispatcher
        viewModelScope.launch(context) {
            createUserFavoriteItemUseCase.onExecute(addedItemParam)
        }
    }

    fun callGetUserProfileInfoUseCase() {
        val executorDispatcher: CoroutineDispatcher = Dispatchers.IO
        val defaultExceptionHandler = CoroutineExceptionHandler { _, exception ->
            messageError.value = exception.message
        }

        var context = defaultExceptionHandler + executorDispatcher
        viewModelScope.launch(context) {
            try {
                val resulGetUserProfileInfoResult =
                    getUserProfileInfoUseCase.onExecute("Hafardev") as GetUserProfileInfoResult
                // profileListFlow = flowOf(resulGetUserProfileInfoResult)
                launch(Dispatchers.Main) {
                    profileInfoLiveData.value = resulGetUserProfileInfoResult
                }.join()
                println("resultttGetUserProfileInfoResult${resulGetUserProfileInfoResult}")

            } catch (e: IOException) {
                println(e.message)
            } catch (e: IllegalStateException) {
                println(e.message)
            } catch (e: Exception) {
                println(e.message)
            }

        }
    }

}