package com.example.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/domain/useCase/CreateUserFavoriteItemUseCase;", "Lcom/example/domain/useCase/BaseUseCase;", "Lcom/example/domain/entityModel/UserRepositoryItemModel;", "", "userGitRepository", "Lcom/example/domain/repository/UserGitRepository;", "(Lcom/example/domain/repository/UserGitRepository;)V", "getUserGitRepository", "()Lcom/example/domain/repository/UserGitRepository;", "onExecute", "param", "(Lcom/example/domain/entityModel/UserRepositoryItemModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class CreateUserFavoriteItemUseCase extends com.example.domain.useCase.BaseUseCase<com.example.domain.entityModel.UserRepositoryItemModel, kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.UserGitRepository userGitRepository = null;
    
    @javax.inject.Inject()
    public CreateUserFavoriteItemUseCase(@org.jetbrains.annotations.NotNull()
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
    com.example.domain.entityModel.UserRepositoryItemModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}