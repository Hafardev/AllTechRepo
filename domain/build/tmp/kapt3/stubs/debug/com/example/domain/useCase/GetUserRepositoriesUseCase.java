package com.example.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J#\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/domain/useCase/GetUserRepositoriesUseCase;", "Lcom/example/domain/useCase/BaseUseCase;", "Lcom/example/domain/entityModel/GetUserRepositoriesParamModel;", "", "Lcom/example/domain/entityModel/GetUserRepositoriesResultModel;", "repository", "Lcom/example/domain/repository/UserGitRepository;", "(Lcom/example/domain/repository/UserGitRepository;)V", "getRepository", "()Lcom/example/domain/repository/UserGitRepository;", "onExecute", "param", "(Lcom/example/domain/entityModel/GetUserRepositoriesParamModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetUserRepositoriesUseCase extends com.example.domain.useCase.BaseUseCase<com.example.domain.entityModel.GetUserRepositoriesParamModel, java.util.List<? extends com.example.domain.entityModel.GetUserRepositoriesResultModel>> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.UserGitRepository repository = null;
    
    @javax.inject.Inject()
    public GetUserRepositoriesUseCase(@org.jetbrains.annotations.NotNull()
    com.example.domain.repository.UserGitRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.repository.UserGitRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object onExecute(@org.jetbrains.annotations.Nullable()
    com.example.domain.entityModel.GetUserRepositoriesParamModel param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.example.domain.entityModel.GetUserRepositoriesResultModel>> continuation) {
        return null;
    }
}