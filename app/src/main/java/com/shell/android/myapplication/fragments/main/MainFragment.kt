package com.shell.android.myapplication.fragments.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.shell.android.myapplication.R
import com.shell.android.myapplication.fragments.main.adapter.ListSectionPagerAdapter
import com.shell.android.myapplication.fragments.subfragment.BaseSubFragment
import com.shell.android.myapplication.fragments.subfragment.Sub1Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    lateinit var mainFragments : List<BaseSubFragment>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupData()
    }

    private fun setupData() {
        mainFragments = getFragments()
        val adapter = ListSectionPagerAdapter(fragmentManager!!, mainFragments)
        main_container.adapter = adapter
        main_tabs.setupWithViewPager(main_container)
    }

    private fun getFragments(): List<BaseSubFragment> {
        val fragment1 = Sub1Fragment()
        fragment1.title = "Fragmento 1"
        val fragment2 = Sub1Fragment()
        fragment2.title = "Fragmento 2"

        return listOf(
            fragment1,
            fragment2
        )
    }

}
