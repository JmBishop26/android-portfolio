package com.tutorial.myportfolio.view.adapters.about.education

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.myportfolio.databinding.AboutEducInfoBinding
import com.tutorial.myportfolio.models.about.education.Education

class EducationAdapter(val educInfo :  ArrayList<Education>):
    RecyclerView.Adapter<EducationAdapter.EducationViewHolder>() {

        inner class EducationViewHolder(val binding : AboutEducInfoBinding) : RecyclerView.ViewHolder(binding.root){
            fun bind(educInfo:Education){
                binding.educ = educInfo

                if(educInfo.course.isEmpty()){
                    binding.educCourse.parent?.let { parent ->
                        if (parent is ViewGroup) {
                            parent.removeView(binding.educCourse)
                        }
                    }
                }

                binding.executePendingBindings()
            }
        }

    fun updateEducInfo(newEducInfo : ArrayList<Education>){
        educInfo.clear()
        educInfo.addAll(newEducInfo)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationViewHolder {
        val binding = AboutEducInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EducationViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return educInfo.size
    }

    override fun onBindViewHolder(holder: EducationViewHolder, position: Int) {
        val educInfo = educInfo[position]
        holder.bind(educInfo)
    }

}