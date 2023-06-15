package com.example.mybasicapplication.view.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mybasicapplication.R
import com.example.mybasicapplication.view.fragment.ProfilePlaceHolderFragment
import com.example.mybasicapplication.view.fragment.RepositoryPlaceholderFragment


class SectionsPagerAdapter(
    var fragments: ArrayList<Fragment> = ArrayList(),
    private val context: Context,
    fm: FragmentManager
) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return fragments.size
    }

    private val TAB_TITLES = arrayOf(
        R.string.user_repository_tab_title,
        R.string.user_profile_tab_title,
        R.string.user_favorites_tab_title,

        )

}