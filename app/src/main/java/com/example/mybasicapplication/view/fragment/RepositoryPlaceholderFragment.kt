package com.example.mybasicapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.mybasicapplication.R
import com.example.mybasicapplication.view.adapter.PagingUserRepositoriesAdapter
import com.example.mybasicapplication.viewModel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class RepositoryPlaceholderFragment : Fragment() {


    private val userViewModel: UserViewModel by activityViewModels()
    lateinit var recyclerView: RecyclerView
    lateinit var progressBar: ProgressBar
    private lateinit var pagingReposAdapter: PagingUserRepositoriesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userViewModel.callReadUserFavoriteListRequest()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_repository_placeholder, container, false);

        recyclerView = view.findViewById<RecyclerView>(R.id.rv_repositories)
        progressBar = view.findViewById<ProgressBar>(R.id.progressBar)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pagingReposAdapter = PagingUserRepositoriesAdapter()

        viewLifecycleOwner.lifecycleScope.launch {
            userViewModel.favoriteListFlow.collect {
                pagingReposAdapter.setFavoriteItems(it)
            }
        }

        setupPagingRepositoriesRecyclerView()

        pagingReposAdapter.addLoadStateListener { loadState ->
            // show empty list
            if (loadState.refresh is LoadState.Loading ||
                loadState.append is LoadState.Loading)
                progressBar.isVisible = true
            else {
                progressBar.isVisible = false
                val errorState = when {
                    loadState.append is LoadState.Error -> loadState.append as LoadState.Error
                    loadState.prepend is LoadState.Error ->  loadState.prepend as LoadState.Error
                    loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
                    else -> null
                }
                errorState?.let {
                    Toast.makeText(requireContext(), it.error.toString(), Toast.LENGTH_LONG).show()
                }

            }
        }
    }


    private fun setupPagingRepositoriesRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)

        viewLifecycleOwner.lifecycleScope.launch {

            userViewModel.callGetUserRepositoryListRequest()?.collect {
                pagingReposAdapter.submitData(it)
            }
        }

        pagingReposAdapter.setItemListener(object :
            PagingUserRepositoriesAdapter.RecyclerClickListener {

            // Tap to delete item
            override fun onItemRemoveClick(position: Int, item: GetUserRepositoriesResult) {
                lifecycleScope.launch {
                    userViewModel.callDeleteUserFavoriteItemRequest(
                        id = item.id, name = item.name!!, fullName = item.full_name
                    )
                }
            }

            // Tap to add item
            override fun onItemAddClick(position: Int, item: GetUserRepositoriesResult) {

                lifecycleScope.launch {
                    userViewModel.callCreateUserFavoriteItemRequest(
                        id = item.id, name = item.name!!, fullName = item.full_name , item.owner
                    )

                }
            }
        })
        recyclerView.adapter = pagingReposAdapter
    }



    companion object {

        private const val ARG_SECTION_NUMBER = "section_number"


        @JvmStatic
        fun newInstance(sectionNumber: Int): RepositoryPlaceholderFragment {
            return RepositoryPlaceholderFragment().apply {

            }
        }
    }


}