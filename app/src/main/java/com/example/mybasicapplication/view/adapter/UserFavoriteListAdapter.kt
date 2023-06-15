package com.example.mybasicapplication.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.data.entityModel.userRepo.GetUserRepositoriesResult
import com.example.data.entityModel.userRepo.UserRepositoryItem
import com.example.mybasicapplication.R


class UserFavoriteListAdapter : ListAdapter<UserRepositoryItem, UserFavoriteListAdapter.UserFavoritesHolder>(DiffCallback()) {

    lateinit var mContext: Context

    private lateinit var listener: RecyclerClickListener
    fun setItemListener(listener: RecyclerClickListener) {
        this.listener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserFavoritesHolder {
        mContext = parent.context

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row_favorite_adapter, parent, false)
        val userFavorietHolder = UserFavoritesHolder(v)

        return userFavorietHolder
    }

    override fun onBindViewHolder(holder: UserFavoritesHolder, position: Int) {
        val currentItem = getItem(position)
        currentItem?.let {
            holder.bind(currentItem, holder, position)
        }
    }

    inner class UserFavoritesHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        fun bind(
            item: UserRepositoryItem,
            holder: UserFavoritesHolder,
            position: Int
        ) {
            val textView = holder.itemView.findViewById<TextView>(R.id.txt_repository)
            textView.setText(item.fullName)

            val deleteImageView = holder.itemView.findViewById<ImageView>(R.id.delete_iv)
            deleteImageView.setOnClickListener {
                listener.onItemRemoveClick(position, item)
                Toast.makeText(mContext," از لیست علاقمندیها حذف شد${item.fullName}" , Toast.LENGTH_LONG).show()
            }

        }
    }

    class DiffCallback : DiffUtil.ItemCallback<UserRepositoryItem>() {
        override fun areItemsTheSame(oldItem: UserRepositoryItem, newItem: UserRepositoryItem) =
        oldItem.name == newItem.name

        override fun areContentsTheSame(oldItem: UserRepositoryItem, newItem: UserRepositoryItem) =
            oldItem == newItem
    }

    interface RecyclerClickListener {
        fun onItemRemoveClick(position: Int, item: UserRepositoryItem)
    }
}