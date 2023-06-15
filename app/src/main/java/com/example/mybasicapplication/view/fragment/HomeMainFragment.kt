package com.example.mybasicapplication.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.viewpager.widget.ViewPager
import com.example.mybasicapplication.R
import com.example.mybasicapplication.databinding.FragmentHomeMainBinding
import com.example.mybasicapplication.view.adapter.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout


class HomeMainFragment : Fragment() {

    private var _binding: FragmentHomeMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeMainBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var fragments = ArrayList<Fragment>()
        fragments.add(RepositoryPlaceholderFragment.newInstance(1))
        fragments.add(ProfilePlaceHolderFragment.newInstance(2))
        val sectionsPagerAdapter =
            SectionsPagerAdapter(fragments, requireContext(), childFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

    }

}
