package com.example.mybasicapplication.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserRepositoryItem
import com.example.mybasicapplication.R


class PagingUserRepositoriesAdapter :
    PagingDataAdapter<GetUserRepositoriesResult, PagingUserRepositoriesAdapter.PagingRepositoriesViewHolder>(
        PagingUserRepositoriesDiffCallback()
    ) {
    lateinit var mContext: Context

    private var favoriteItems: List<UserRepositoryItem> = mutableListOf()


    private lateinit var listener: RecyclerClickListener

    fun setFavoriteItems(favoriteItems: List<UserRepositoryItem>) {
        this.favoriteItems = favoriteItems
    }

    fun setItemListener(listener: RecyclerClickListener) {
        this.listener = listener
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PagingRepositoriesViewHolder {

        mContext = parent.context
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_repositories_adapter, parent, false)
        val pagingUserRepositoriesViewHolder = PagingRepositoriesViewHolder(v)
        return pagingUserRepositoriesViewHolder
    }

    override fun onBindViewHolder(
        holder: PagingRepositoriesViewHolder,
        position: Int
    ) {
        val item: GetUserRepositoriesResult? = getItem(position)
        item?.let {
          val  favoriteImageView = holder.itemView.findViewById<ImageView>(R.id.fav_iv)

            for (itemFav in favoriteItems) {
                if (item.id == (itemFav.id ) ){
                    favoriteImageView?.setBackgroundResource(R.drawable.like_heart_round_icon)
                }
            }
            holder.bind(item, holder, position,favoriteImageView)
        }
    }


    inner class PagingRepositoriesViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        fun bind(
            currentItem: GetUserRepositoriesResult,
            holder: PagingRepositoriesViewHolder,
            position: Int,
            favoriteImageView : ImageView
        ) {
            val textView = holder.itemView.findViewById<TextView>(R.id.txt_repository)
            textView.setText(currentItem.full_name)


            val deleteImageView = holder.itemView.findViewById<ImageView>(R.id.delete_iv)
            deleteImageView.setOnClickListener {
                listener.onItemRemoveClick(position, currentItem)
                Toast.makeText(
                    mContext,
                    " از لیست علاقمندیها حذف شد${currentItem.full_name}",
                    Toast.LENGTH_LONG
                ).show()
                favoriteImageView?.setBackgroundResource(R.drawable.like_heart_round_line_icon)
            }

            val addFavoriteItemIV = holder.itemView.findViewById<ImageView>(R.id.add_iv)
            addFavoriteItemIV.setOnClickListener {
                listener.onItemAddClick(position, currentItem)
                Toast.makeText(
                    mContext,
                    " به لیست علاقمندیها اضافه شد${currentItem.full_name}",
                    Toast.LENGTH_LONG
                ).show()
                favoriteImageView?.setBackgroundResource(R.drawable.like_heart_round_icon)

            }
        }
    }

    class PagingUserRepositoriesDiffCallback : DiffUtil.ItemCallback<GetUserRepositoriesResult>() {
        override fun areItemsTheSame(
            oldItem: GetUserRepositoriesResult,
            newItem: GetUserRepositoriesResult
        ) =
            oldItem.name == newItem.name

        override fun areContentsTheSame(
            oldItem: GetUserRepositoriesResult,
            newItem: GetUserRepositoriesResult
        ) = oldItem == newItem

    }

    interface RecyclerClickListener {
        fun onItemRemoveClick(position: Int, item: GetUserRepositoriesResult)
        fun onItemAddClick(position: Int, item: GetUserRepositoriesResult)
    }
}