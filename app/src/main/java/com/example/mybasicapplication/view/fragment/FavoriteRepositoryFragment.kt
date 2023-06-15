package com.example.mybasicapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.entityModel.userRepo.UserRepositoryItem
import com.example.mybasicapplication.R
import com.example.mybasicapplication.view.adapter.UserFavoriteListAdapter
import com.example.mybasicapplication.viewModel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FavoriteRepositoryFragment : Fragment() {

    private lateinit var favoritesAdapter: UserFavoriteListAdapter

    private val userViewModel: UserViewModel by activityViewModels()
    lateinit var recyclerView: RecyclerView
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userViewModel.callReadUserFavoriteListRequest()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_user_favorites, container, false);

        recyclerView = view.findViewById<RecyclerView>(R.id.rv_favorites)

        textView = view.findViewById<TextView>(R.id.text_view)

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUserFavoritesRecyclerView()
        //readAndShowUserFavoriteItems()
    }


    private fun setupUserFavoritesRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        favoritesAdapter = UserFavoriteListAdapter()


        lifecycleScope.launch {
            userViewModel.favoriteListFlow.collect {
                favoritesAdapter.submitList(it)
                textView.setText("${it} + ${it?.size}")
            }
        }
        favoritesAdapter.setItemListener(object :
            UserFavoriteListAdapter.RecyclerClickListener {

            // Tap the 'X' to delete
            override fun onItemRemoveClick(position: Int, item: UserRepositoryItem) {

                lifecycleScope.launch {
                    userViewModel.callDeleteUserFavoriteItemRequest(
                        id = position + 1,
                        name = item.name!!,
                        fullName = item.fullName
                    )
                }
            }
        })
        recyclerView.adapter = favoritesAdapter
    }


/*
    private fun readAndShowUserFavoriteItems() {
       // userViewModel.callReadUserFavoriteListRequest()
        lifecycleScope.launch {
            userViewModel.favoriteListFlow.collect {
                favoritesAdapter.submitList(it)
                textView.setText("${it} + ${it?.size}")
            }
        }
    }
*/


    companion object {

        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): FavoriteRepositoryFragment {
            return FavoriteRepositoryFragment().apply {
                val arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }


}
