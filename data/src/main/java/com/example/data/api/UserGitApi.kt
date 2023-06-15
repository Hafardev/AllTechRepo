package com.example.data.api

import com.example.data.entityModel.GetOfflineDataMock
import com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface UserGitApi {

  //  @GET("/users/{username}/hovercard")
  // suspend fun getUserRepositories(@Path (value = "username", encoded = true)   username :String , @Query (value = "subject_type", encoded = true)  subjectType: String, @Query (value = "subject_id", encoded = true)  subjectId: Int) : GetUserRepositoriesResult


  @GET("/users/{username}/repos")
    suspend fun getUserRepositories(@Path (value = "username", encoded = true)   username :String  , @Query (value = "per_page", encoded = true)  pageSize: Int, @Query (value = "page", encoded = true)  pageNumber: Int) : List<GetUserRepositoriesResult>

    @GET("/users/{username}")
    suspend fun getUserProfileInfo(@Path (value = "username", encoded = true)   username :String) : GetUserProfileInfoResult

  @Headers("mock:true")
  @GET("/employee/details")
  fun getEmloyeeDetails(): List<GetOfflineDataMock>
}