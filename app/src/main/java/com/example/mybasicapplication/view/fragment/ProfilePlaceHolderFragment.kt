package com.example.mybasicapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.mybasicapplication.R
import com.example.mybasicapplication.viewModel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfilePlaceHolderFragment : Fragment() {


    private val userViewModel: UserViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userViewModel.callGetUserProfileInfoUseCase()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile_placeholder, container, false);

       val nameTextView = view.findViewById<TextView>(R.id.text_name)
       val bioTextView = view.findViewById<TextView>(R.id.text_bio)
       val ownerTextView = view.findViewById<TextView>(R.id.text_owner)
       val locationTextView = view.findViewById<TextView>(R.id.text_location)
       val companyTextView = view.findViewById<TextView>(R.id.text_company)
        userViewModel.profileInfoLiveData.observe(viewLifecycleOwner, Observer {
            nameTextView.text = it.name
            bioTextView.text = it.bio
            ownerTextView.text = it.login
            locationTextView.text = it.location
            companyTextView.text = it.company
        })


        return view
    }


    companion object {

        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): ProfilePlaceHolderFragment {
            return ProfilePlaceHolderFragment().apply {
                val arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }


}