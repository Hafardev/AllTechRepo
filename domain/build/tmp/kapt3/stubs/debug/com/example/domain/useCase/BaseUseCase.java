package com.example.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u000b\u001a\u0004\u0018\u00018\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/domain/useCase/BaseUseCase;", "P", "R", "", "()V", "executorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getExecutorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setExecutorDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "executeHandler", "param", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onExecute", "domain_debug"})
public abstract class BaseUseCase<P extends java.lang.Object, R extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.CoroutineDispatcher executorDispatcher;
    
    public BaseUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getExecutorDispatcher() {
        return null;
    }
    
    public final void setExecutorDispatcher(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object onExecute(@org.jetbrains.annotations.Nullable()
    P param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object executeHandler(@org.jetbrains.annotations.Nullable()
    P param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> continuation) {
        return null;
    }
}