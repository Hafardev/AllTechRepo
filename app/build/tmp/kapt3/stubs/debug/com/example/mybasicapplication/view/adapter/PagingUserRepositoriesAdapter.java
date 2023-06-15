package com.example.mybasicapplication.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001b\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0014\u0010\u0019\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter$PagingRepositoriesViewHolder;", "()V", "favoriteItems", "", "Lcom/example/data/entityModel/userRepo/UserRepositoryItem;", "listener", "Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter$RecyclerClickListener;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFavoriteItems", "setItemListener", "PagingRepositoriesViewHolder", "PagingUserRepositoriesDiffCallback", "RecyclerClickListener", "app_debug"})
public final class PagingUserRepositoriesAdapter extends androidx.paging.PagingDataAdapter<com.example.data.entityModel.userRepo.GetUserRepositoriesResult, com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.PagingRepositoriesViewHolder> {
    public android.content.Context mContext;
    private java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem> favoriteItems;
    private com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.RecyclerClickListener listener;
    
    public PagingUserRepositoriesAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final void setFavoriteItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.data.entityModel.userRepo.UserRepositoryItem> favoriteItems) {
    }
    
    public final void setItemListener(@org.jetbrains.annotations.NotNull()
    com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.RecyclerClickListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.PagingRepositoriesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.PagingRepositoriesViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0000R\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter$PagingRepositoriesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "currentItem", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "holder", "Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter;", "position", "", "favoriteImageView", "Landroid/widget/ImageView;", "app_debug"})
    public final class PagingRepositoriesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        public PagingRepositoriesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult currentItem, @org.jetbrains.annotations.NotNull()
        com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter.PagingRepositoriesViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
        android.widget.ImageView favoriteImageView) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter$PagingUserRepositoriesDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class PagingUserRepositoriesDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.entityModel.userRepo.GetUserRepositoriesResult> {
        
        public PagingUserRepositoriesDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/PagingUserRepositoriesAdapter$RecyclerClickListener;", "", "onItemAddClick", "", "position", "", "item", "Lcom/example/data/entityModel/userRepo/GetUserRepositoriesResult;", "onItemRemoveClick", "app_debug"})
    public static abstract interface RecyclerClickListener {
        
        public abstract void onItemRemoveClick(int position, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult item);
        
        public abstract void onItemAddClick(int position, @org.jetbrains.annotations.NotNull()
        com.example.data.entityModel.userRepo.GetUserRepositoriesResult item);
    }
}