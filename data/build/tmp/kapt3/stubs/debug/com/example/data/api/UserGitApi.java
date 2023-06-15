package com.example.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u001b\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/data/api/UserGitApi;", "", "getEmloyeeDetails", "", "Lcom/example/data/entityModel/GetOfflineDataMock;", "getUserProfileInfo", "Lcom/example/data/entityModel/userProfileInfo/GetUserProfileInfoResult;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserRepositories", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "pageSize", "", "pageNumber", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface UserGitApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/users/{username}/repos")
    public abstract java.lang.Object getUserRepositories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username", encoded = true)
    java.lang.String username, @retrofit2.http.Query(value = "per_page", encoded = true)
    int pageSize, @retrofit2.http.Query(value = "page", encoded = true)
    int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.data.entityModel.userRepo.GetUserRepositoriesResult>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/users/{username}")
    public abstract java.lang.Object getUserProfileInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username", encoded = true)
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/employee/details")
    @retrofit2.http.Headers(value = {"mock:true"})
    public abstract java.util.List<com.example.data.entityModel.GetOfflineDataMock> getEmloyeeDetails();
}