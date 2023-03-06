package com.a7medelnoor.randomuser.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.a7medelnoor.randomuser.data.enitity.Result
import com.a7medelnoor.randomuser.databinding.RandomUserItemBinding
import com.bumptech.glide.Glide

class RandomUserAdapter : androidx.recyclerview.widget.ListAdapter<
        Result,
        RandomUserAdapter.RandomUserViewHolder
        >(RandomUserDiffCallBack()) {


    class RandomUserViewHolder(private val itemBinding: RandomUserItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(result: Result) {
            itemBinding.userNameTitle.text = result.name.title
            itemBinding.userFirstName.text = result.name.first
            itemBinding.userLastName.text = result.name.last
            itemBinding.gender.text = result.gender
            itemBinding.phone.text = result.phone
            itemBinding.email.text = result.email
            Glide.with(itemBinding.root.context).load(result.picture.thumbnail)
                .into(itemBinding.userImageView)

        }
    }

    class RandomUserDiffCallBack :
        DiffUtil.ItemCallback<Result>() {
        override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RandomUserViewHolder {
        val itemBinding =
            RandomUserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RandomUserViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RandomUserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


}