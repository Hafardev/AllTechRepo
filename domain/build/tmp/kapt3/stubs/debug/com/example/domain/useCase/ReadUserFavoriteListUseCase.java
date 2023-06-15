package com.example.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/domain/useCase/ReadUserFavoriteListUseCase;", "Lcom/example/domain/useCase/BaseUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/domain/entityModel/UserRepositoryItemModel;", "userGitRepository", "Lcom/example/domain/repository/UserGitRepository;", "(Lcom/example/domain/repository/UserGitRepository;)V", "getUserGitRepository", "()Lcom/example/domain/repository/UserGitRepository;", "onExecute", "param", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class ReadUserFavoriteListUseCase extends com.example.domain.useCase.BaseUseCase<kotlin.Unit, kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.example.domain.entityModel.UserRepositoryItemModel>>> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.UserGitRepository userGitRepository = null;
    
    @javax.inject.Inject()
    public ReadUserFavoriteListUseCase(@org.jetbrains.annotations.NotNull()
    com.example.domain.repository.UserGitRepository userGitRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.repository.UserGitRepository getUserGitRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object onExecute(@org.jetbrains.annotations.Nullable()
    kotlin.Unit param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.example.domain.entityModel.UserRepositoryItemModel>>> continuation) {
        return null;
    }
}