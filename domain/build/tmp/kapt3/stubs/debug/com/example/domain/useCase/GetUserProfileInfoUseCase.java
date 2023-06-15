package com.example.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/domain/useCase/GetUserProfileInfoUseCase;", "Lcom/example/domain/useCase/BaseUseCase;", "", "Lcom/example/domain/entityModel/userProfileInfo/GetUserProfileInfoResultModel;", "repository", "Lcom/example/domain/repository/UserGitRepository;", "(Lcom/example/domain/repository/UserGitRepository;)V", "getRepository", "()Lcom/example/domain/repository/UserGitRepository;", "onExecute", "param", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetUserProfileInfoUseCase extends com.example.domain.useCase.BaseUseCase<java.lang.String, com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.domain.repository.UserGitRepository repository = null;
    
    @javax.inject.Inject()
    public GetUserProfileInfoUseCase(@org.jetbrains.annotations.NotNull()
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
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.domain.entityModel.userProfileInfo.GetUserProfileInfoResultModel> continuation) {
        return null;
    }
}