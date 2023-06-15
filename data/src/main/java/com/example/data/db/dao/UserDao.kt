package com.example.data.db.dao

import androidx.paging.PagingSource
import androidx.room.*
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserRepositoryItem
import kotlinx.coroutines.flow.Flow


@Dao
interface UserDao {

   //TODO - which data obj must save , list or obj

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createUserFavList(data: UserRepositoryItem)

    @Query("SELECT * FROM user_fav_item ORDER BY id DESC")
    fun readUserFavList(): Flow<List<UserRepositoryItem>>


    @Update
    suspend fun updateUserFavList(data: UserRepositoryItem)

    @Delete
    suspend fun deleteUserFavList(data: UserRepositoryItem)

}
