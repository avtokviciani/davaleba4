package com.example.davaleba4.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.example.davaleba4.R

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)

        textView.text = DashboardFragmentArgs.fromBundle(requireArguments()).argument.toString()

    }


}