package com.shell.android.myapplication.fragments.subfragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.shell.android.myapplication.R

class Sub1Fragment : BaseSubFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_sub1, container, false)
        return v
    }
}
