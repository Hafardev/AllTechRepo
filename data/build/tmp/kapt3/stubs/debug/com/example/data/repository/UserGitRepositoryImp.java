package com.example.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u001eH\u0016J\u0019\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/data/repository/UserGitRepositoryImp;", "Lcom/example/domain/repository/UserGitRepository;", "userGitApi", "Lcom/example/data/api/UserGitApi;", "userDao", "Lcom/example/data/db/dao/UserDao;", "(Lcom/example/data/api/UserGitApi;Lcom/example/data/db/dao/UserDao;)V", "getUserDao", "()Lcom/example/data/db/dao/UserDao;", "getUserGitApi", "()Lcom/example/data/api/UserGitApi;", "createUserFavoriteListItem", "", "param", "Lcom/example/domain/entityModel/UserRepositoryItemModel;", "(Lcom/example/domain/entityModel/UserRepositoryItemModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserFavoriteListItem", "getUserProfileInfo", "Lcom/example/data/entityModel/userProfileInfo/GetUserProfileInfoResult;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRepositories", "", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "username", "pageSize", "", "pageNumber", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readUserFavoriteList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "updateUserFavoriteListItem", "data_debug"})
public final class UserGitRepositoryImp implements com.example.domain.repository.UserGitRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.api.UserGitApi userGitApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.db.dao.UserDao userDao = null;
    
    @javax.inject.Inject()
    public UserGitRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.example.data.api.UserGitApi userGitApi, @org.jetbrains.annotations.NotNull()
    com.example.data.db.dao.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.api.UserGitApi getUserGitApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.db.dao.UserDao getUserDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserRepositories(@org.jetbrains.annotations.NotNull()
    java.lang.String username, int pageSize, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.data.entityModel.userRepo.GetUserRepositoriesResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserProfileInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteUserFavoriteListItem(@org.jetbrains.annotations.NotNull()
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem>> readUserFavoriteList() {
        return null;
    }
}