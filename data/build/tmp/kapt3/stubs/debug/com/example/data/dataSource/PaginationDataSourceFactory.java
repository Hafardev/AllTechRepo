package com.example.data.dataSource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/data/dataSource/PaginationDataSourceFactory;", "", "dataRepository", "Lcom/example/data/repository/UserGitRepositoryImp;", "(Lcom/example/data/repository/UserGitRepositoryImp;)V", "getDataRepository", "()Lcom/example/data/repository/UserGitRepositoryImp;", "getUserRepositories", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "paramModel", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesParam;", "data_debug"})
public final class PaginationDataSourceFactory {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.repository.UserGitRepositoryImp dataRepository = null;
    
    @javax.inject.Inject()
    public PaginationDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.example.data.repository.UserGitRepositoryImp dataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.repository.UserGitRepositoryImp getDataRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.data.entityModel.userRepo.GetUserRepositoriesResult>> getUserRepositories(@org.jetbrains.annotations.NotNull()
    com.example.data.entityModel.userRepo.GetUserRepositoriesParam paramModel) {
        return null;
    }
}