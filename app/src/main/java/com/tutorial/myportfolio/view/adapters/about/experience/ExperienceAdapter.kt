package com.tutorial.myportfolio.view.adapters.about.experience

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.AboutExperienceInfoBinding
import com.tutorial.myportfolio.models.about.experience.Experience

class ExperienceAdapter(private val expInfo: ArrayList<Experience>): RecyclerView.Adapter<ExperienceAdapter.ExperienceViewHolder>() {

    inner class ExperienceViewHolder(val binding: AboutExperienceInfoBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(expInfo: Experience){
            binding.exp = expInfo
            binding.executePendingBindings()
        }

    }

    fun updateExpInfo(newExpInfo: ArrayList<Experience>){
        expInfo.clear()
        expInfo.addAll(newExpInfo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewHolder {
        val binding = AboutExperienceInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExperienceViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return expInfo.size
    }

    override fun onBindViewHolder(holder: ExperienceViewHolder, position: Int) {
        val expInfo = expInfo[position]
        holder.bind(expInfo)
    }
}