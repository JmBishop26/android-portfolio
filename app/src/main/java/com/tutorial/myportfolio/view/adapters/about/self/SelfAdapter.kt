package com.tutorial.myportfolio.view.adapters.about.self

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.AboutSelfInfoBinding
import com.tutorial.myportfolio.models.about.self.Self
import com.tutorial.myportfolio.utils.ImageLoader

class SelfAdapter(private val selfInfo: ArrayList<Self>):
    RecyclerView.Adapter<SelfAdapter.SelfViewHolder>() {


    inner class SelfViewHolder(val binding: AboutSelfInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        private lateinit var imageLoader: ImageLoader

        fun bind(selfInfo : Self) {
            imageLoader = ImageLoader.getInstance(binding.root.context)
            binding.selfInfo = selfInfo
            imageLoader.loader(selfInfo.image, binding.aboutInfoIcon)
            binding.executePendingBindings()

        }

    }

    fun updateSelfInfo(newSelfInfo: ArrayList<Self>) {
        selfInfo.clear()
        selfInfo.addAll(newSelfInfo)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfViewHolder {
        val binding = AboutSelfInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SelfViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return selfInfo.size
    }

    override fun onBindViewHolder(holder: SelfViewHolder, position: Int) {
        val selfInfo = selfInfo[position]
        holder.bind(selfInfo)
    }
}