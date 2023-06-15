package com.example.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u0015H&J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/domain/repository/UserGitRepository;", "", "createUserFavoriteListItem", "", "param", "Lcom/example/domain/entityModel/UserRepositoryItemModel;", "(Lcom/example/domain/entityModel/UserRepositoryItemModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserFavoriteListItem", "getUserProfileInfo", "Lcom/example/domain/entityModel/userProfileInfo/GetUserProfileInfoResultModel;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRepositories", "", "Lcom/example/domain/entityModel/GetUserRepositoriesResultModel;", "username", "pageSize", "", "pageNumber", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readUserFavoriteList", "Lkotlinx/coroutines/flow/Flow;", "updateUserFavoriteListItem", "domain_debug"})
public abstract interface UserGitRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String username, int pageSize, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.example.domain.entityModel.GetUserRepositoriesResultModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserProfileInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.domain.entityModel.UserRepositoryItemModel>> readUserFavoriteList();
}