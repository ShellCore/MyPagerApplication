package com.shell.android.myapplication.fragments.main.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.shell.android.myapplication.fragments.subfragment.BaseSubFragment
import com.shell.android.myapplication.fragments.subfragment.Sub1Fragment

class ListSectionPagerAdapter(fragmentManager: FragmentManager, private val fragments: List<BaseSubFragment>) :
    FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return (fragments[position] as Sub1Fragment).title
    }
}
