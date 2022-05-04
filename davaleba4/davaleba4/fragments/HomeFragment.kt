package com.example.davaleba4.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.davaleba4.R
import com.example.davaleba4.R.id.textView3

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var textView3: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editText)
        textView3 = view.findViewById(R.id.textView3)

        button.setOnClickListener{

            val amountText = editText.text.toString()

            if (amountText.isEmpty()){
                return@setOnClickListener
            }

            val amount = amountText.toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

            findNavController().navigate(action)
        }

    }


}




