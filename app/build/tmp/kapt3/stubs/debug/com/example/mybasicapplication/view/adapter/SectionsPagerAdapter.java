package com.example.mybasicapplication.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/mybasicapplication/view/adapter/SectionsPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Ljava/util/ArrayList;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "TAB_TITLES", "", "", "[Ljava/lang/Integer;", "getFragments", "()Ljava/util/ArrayList;", "setFragments", "(Ljava/util/ArrayList;)V", "getCount", "getItem", "position", "getPageTitle", "", "app_debug"})
public final class SectionsPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<androidx.fragment.app.Fragment> fragments;
    private final android.content.Context context = null;
    private final java.lang.Integer[] TAB_TITLES = {com.example.mybasicapplication.R.string.user_repository_tab_title, com.example.mybasicapplication.R.string.user_profile_tab_title, com.example.mybasicapplication.R.string.user_favorites_tab_title};
    
    public SectionsPagerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<androidx.fragment.app.Fragment> fragments, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<androidx.fragment.app.Fragment> getFragments() {
        return null;
    }
    
    public final void setFragments(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
}