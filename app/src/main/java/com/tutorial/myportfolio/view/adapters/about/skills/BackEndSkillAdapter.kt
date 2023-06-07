package com.tutorial.myportfolio.view.adapters.about.skills

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.CardAboutSkillsBinding
import com.tutorial.myportfolio.models.about.skills.Skills
import com.tutorial.myportfolio.utils.ImageLoader

class BackEndSkillAdapter(private val skillInfo: ArrayList<Skills>) :
    RecyclerView.Adapter<BackEndSkillAdapter.SkillsViewHolder>() {

    private lateinit var imageLoader: ImageLoader

    inner class SkillsViewHolder(val binding: CardAboutSkillsBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(skillInfo: Skills){
            imageLoader = ImageLoader.getInstance(binding.root.context)
            binding.skill = skillInfo
            imageLoader.loader(skillInfo.icon, binding.aboutSkillIcon)
            binding.executePendingBindings()
        }
    }

    fun updateSkillInfo(newSkillInfo: ArrayList<Skills>){
        skillInfo.clear()
        skillInfo.addAll(newSkillInfo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        val binding = CardAboutSkillsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SkillsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return skillInfo.size
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        val skillInfo = skillInfo[position]
        holder.bind(skillInfo)
    }

}