package com.sayana.myproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {


    lateinit var button: Button
    lateinit var button2: Button
    lateinit var button3: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        button = view.findViewById(R.id.button)
        button2 = view.findViewById(R.id.button2)
        button3 = view.findViewById(R.id.button3)


        button.setOnClickListener {
            Toast.makeText(context,"Правильно!", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(context, "Неправильно!", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(context, "Неправильно!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}