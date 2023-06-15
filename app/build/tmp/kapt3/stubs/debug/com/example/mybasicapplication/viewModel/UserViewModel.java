package com.example.mybasicapplication.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J7\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020#2\n\b\u0002\u00107\u001a\u0004\u0018\u00010#2\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u00a2\u0006\u0002\u0010:J+\u0010;\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020#2\n\b\u0002\u00107\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010<J\u0006\u0010=\u001a\u000203J\u0014\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?\u0018\u00010\u0016J\u0006\u0010A\u001a\u000203R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101\u00a8\u0006B"}, d2 = {"Lcom/example/mybasicapplication/viewModel/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "createUserFavoriteItemUseCase", "Lcom/example/domain/useCase/CreateUserFavoriteItemUseCase;", "updateUserFavoriteItemUseCase", "Lcom/example/domain/useCase/UpdateUserFavoriteItemUseCase;", "readUserFavoriteListUseCase", "Lcom/example/domain/useCase/ReadUserFavoriteListUseCase;", "deleteUserFavoriteItemUseCase", "Lcom/example/domain/useCase/DeleteUserFavoriteItemUseCase;", "getUserProfileInfoUseCase", "Lcom/example/domain/useCase/GetUserProfileInfoUseCase;", "getUserRepositoriesUseCase", "Lcom/example/domain/useCase/GetUserRepositoriesUseCase;", "pagingReposDataSourceFactory", "Lcom/example/data/dataSource/PaginationDataSourceFactory;", "(Lcom/example/domain/useCase/CreateUserFavoriteItemUseCase;Lcom/example/domain/useCase/UpdateUserFavoriteItemUseCase;Lcom/example/domain/useCase/ReadUserFavoriteListUseCase;Lcom/example/domain/useCase/DeleteUserFavoriteItemUseCase;Lcom/example/domain/useCase/GetUserProfileInfoUseCase;Lcom/example/domain/useCase/GetUserRepositoriesUseCase;Lcom/example/data/dataSource/PaginationDataSourceFactory;)V", "getCreateUserFavoriteItemUseCase", "()Lcom/example/domain/useCase/CreateUserFavoriteItemUseCase;", "getDeleteUserFavoriteItemUseCase", "()Lcom/example/domain/useCase/DeleteUserFavoriteItemUseCase;", "favoriteListFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "getFavoriteListFlow", "()Lkotlinx/coroutines/flow/Flow;", "setFavoriteListFlow", "(Lkotlinx/coroutines/flow/Flow;)V", "getGetUserProfileInfoUseCase", "()Lcom/example/domain/useCase/GetUserProfileInfoUseCase;", "getGetUserRepositoriesUseCase", "()Lcom/example/domain/useCase/GetUserRepositoriesUseCase;", "messageError", "Landroidx/lifecycle/MutableLiveData;", "", "getMessageError", "()Landroidx/lifecycle/MutableLiveData;", "setMessageError", "(Landroidx/lifecycle/MutableLiveData;)V", "getPagingReposDataSourceFactory", "()Lcom/example/data/dataSource/PaginationDataSourceFactory;", "profileInfoLiveData", "Lcom/example/data/entityModel/userProfileInfo/GetUserProfileInfoResult;", "getProfileInfoLiveData", "setProfileInfoLiveData", "getReadUserFavoriteListUseCase", "()Lcom/example/domain/useCase/ReadUserFavoriteListUseCase;", "getUpdateUserFavoriteItemUseCase", "()Lcom/example/domain/useCase/UpdateUserFavoriteItemUseCase;", "callCreateUserFavoriteItemRequest", "", "id", "", "name", "fullName", "owner", "Lcom/example/data/entityModel/userRepo/UserOwnerRepositoryItem;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/example/data/entityModel/userRepo/UserOwnerRepositoryItem;)V", "callDeleteUserFavoriteItemRequest", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "callGetUserProfileInfoUseCase", "callGetUserRepositoryListRequest", "Landroidx/paging/PagingData;", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "callReadUserFavoriteListRequest", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.CreateUserFavoriteItemUseCase createUserFavoriteItemUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.UpdateUserFavoriteItemUseCase updateUserFavoriteItemUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.ReadUserFavoriteListUseCase readUserFavoriteListUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.DeleteUserFavoriteItemUseCase deleteUserFavoriteItemUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.GetUserProfileInfoUseCase getUserProfileInfoUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.useCase.GetUserRepositoriesUseCase getUserRepositoriesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.dataSource.PaginationDataSourceFactory pagingReposDataSourceFactory = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult> profileInfoLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> messageError;
    public kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem>> favoriteListFlow;
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.CreateUserFavoriteItemUseCase createUserFavoriteItemUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.UpdateUserFavoriteItemUseCase updateUserFavoriteItemUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.ReadUserFavoriteListUseCase readUserFavoriteListUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.DeleteUserFavoriteItemUseCase deleteUserFavoriteItemUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.GetUserProfileInfoUseCase getUserProfileInfoUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.useCase.GetUserRepositoriesUseCase getUserRepositoriesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.data.dataSource.PaginationDataSourceFactory pagingReposDataSourceFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.CreateUserFavoriteItemUseCase getCreateUserFavoriteItemUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.UpdateUserFavoriteItemUseCase getUpdateUserFavoriteItemUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.ReadUserFavoriteListUseCase getReadUserFavoriteListUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.DeleteUserFavoriteItemUseCase getDeleteUserFavoriteItemUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.GetUserProfileInfoUseCase getGetUserProfileInfoUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.useCase.GetUserRepositoriesUseCase getGetUserRepositoriesUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.dataSource.PaginationDataSourceFactory getPagingReposDataSourceFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult> getProfileInfoLiveData() {
        return null;
    }
    
    public final void setProfileInfoLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.data.entityModel.userProfileInfo.GetUserProfileInfoResult> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMessageError() {
        return null;
    }
    
    public final void setMessageError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem>> getFavoriteListFlow() {
        return null;
    }
    
    public final void setFavoriteListFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.data.entityModel.userRepo.GetUserRepositoriesResult>> callGetUserRepositoryListRequest() {
        return null;
    }
    
    public final void callReadUserFavoriteListRequest() {
    }
    
    public final void callDeleteUserFavoriteItemRequest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName) {
    }
    
    public final void callCreateUserFavoriteItemRequest(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    com.example.data.entityModel.userRepo.UserOwnerRepositoryItem owner) {
    }
    
    public final void callGetUserProfileInfoUseCase() {
    }
}