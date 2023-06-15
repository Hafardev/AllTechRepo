package com.example.data.dataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/data/dataSource/PaginationDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "dataRepository", "Lcom/example/data/repository/UserGitRepositoryImp;", "paramModel", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesParam;", "(Lcom/example/data/repository/UserGitRepositoryImp;Lcom/example/data/entityModel/userRepo/GetUserRepositoriesParam;)V", "getDataRepository", "()Lcom/example/data/repository/UserGitRepositoryImp;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_debug"})
public final class PaginationDataSource extends androidx.paging.PagingSource<java.lang.Integer, com.example.data.entityModel.userRepo.GetUserRepositoriesResult> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.repository.UserGitRepositoryImp dataRepository = null;
    private final com.example.data.entityModel.userRepo.GetUserRepositoriesParam paramModel = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.data.dataSource.PaginationDataSource.Companion Companion = null;
    private static final int STARTING_PAGE_INDEX = 1;
    
    @javax.inject.Inject()
    public PaginationDataSource(@org.jetbrains.annotations.NotNull()
    com.example.data.repository.UserGitRepositoryImp dataRepository, @org.jetbrains.annotations.NotNull()
    com.example.data.entityModel.userRepo.GetUserRepositoriesParam paramModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.repository.UserGitRepositoryImp getDataRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.example.data.entityModel.userRepo.GetUserRepositoriesResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getRefreshKey(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, com.example.data.entityModel.userRepo.GetUserRepositoriesResult> state) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/data/dataSource/PaginationDataSource$Companion;", "", "()V", "STARTING_PAGE_INDEX", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}