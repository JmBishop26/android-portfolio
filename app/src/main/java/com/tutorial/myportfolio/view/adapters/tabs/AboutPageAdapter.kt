package com.tutorial.myportfolio.view.adapters.tabs

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tutorial.myportfolio.view.EducFragment
import com.tutorial.myportfolio.view.ExpFragment
import com.tutorial.myportfolio.view.HobbyFragment
import com.tutorial.myportfolio.view.SelfFragment
import com.tutorial.myportfolio.view.SkillFragment

class AboutPageAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount() = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { SelfFragment()}
            1 -> { SkillFragment()}
            2 -> { ExpFragment()}
            3 -> { EducFragment()}
            4 -> { HobbyFragment()}
            else -> { throw Resources.NotFoundException("Fragment not found: $position")}
        }
    }
}