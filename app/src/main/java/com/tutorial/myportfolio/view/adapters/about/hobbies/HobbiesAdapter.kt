package com.tutorial.myportfolio.view.adapters.about.hobbies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.CardAboutHobbyBinding
import com.tutorial.myportfolio.models.about.hobby.Hobbies
import com.tutorial.myportfolio.utils.ImageLoader

class HobbiesAdapter(private val hobbyInfo : ArrayList<Hobbies>) :
    RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder>() {

        inner class HobbiesViewHolder(val binding:CardAboutHobbyBinding): RecyclerView.ViewHolder(binding.root){
            private lateinit var imgLoader : ImageLoader

            fun bind(hobbyInfo : Hobbies){
                imgLoader = ImageLoader.getInstance(binding.root.context)
                binding.hobby = hobbyInfo
                imgLoader.loader(hobbyInfo.image, binding.hobbyImage)
                binding.executePendingBindings()
            }
        }

    fun updateHobbyInfo(newHobbyInfo:ArrayList<Hobbies>){
        hobbyInfo.clear()
        hobbyInfo.addAll(newHobbyInfo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {
        val binding = CardAboutHobbyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HobbiesViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return hobbyInfo.size
    }

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        val hobbyInfo = hobbyInfo[position]
        holder.bind(hobbyInfo)
    }
}
