package com.example.mybasicapplication.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0017\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter$UserFavoritesHolder;", "()V", "listener", "Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter$RecyclerClickListener;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItemListener", "DiffCallback", "RecyclerClickListener", "UserFavoritesHolder", "app_debug"})
public final class UserFavoriteListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.entityModel.userRepo.UserRepositoryItem, com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.UserFavoritesHolder> {
    public android.content.Context mContext;
    private com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.RecyclerClickListener listener;
    
    public UserFavoriteListAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final void setItemListener(@org.jetbrains.annotations.NotNull()
    com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.RecyclerClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.UserFavoritesHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.UserFavoritesHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0000R\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter$UserFavoritesHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter;Landroid/view/View;)V", "bind", "", "item", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "holder", "Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter;", "position", "", "app_debug"})
    public final class UserFavoritesHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public UserFavoritesHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem item, @org.jetbrains.annotations.NotNull()
        com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter.UserFavoritesHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.entityModel.userRepo.UserRepositoryItem> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/UserFavoriteListAdapter$RecyclerClickListener;", "", "onItemRemoveClick", "", "position", "", "item", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "app_debug"})
    public static abstract interface RecyclerClickListener {
        
        public abstract void onItemRemoveClick(int position, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.UserRepositoryItem item);
    }
}