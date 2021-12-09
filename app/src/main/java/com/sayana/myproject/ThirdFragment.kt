package com.sayana.myproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.kotlinandroidextensions.Item
import org.w3c.dom.Text


class ThirdFragment : Fragment() {




    lateinit var devRecyclerView: RecyclerView
    lateinit var devButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val developers:List<String> = listOf(
            "Жамцаранова Саяна",
            "Иванов Иван",
            "Петров Петр",
            "Смирнова Наталья",
            "Новопашенный Максим"
        )

        devRecyclerView = view.findViewById(R.id.dev_recycler_view)
        devButton= view.findViewById(R.id.dev_button)

        devRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        devRecyclerView.adapter = DevAdapter(developers)

        devButton.setOnClickListener {
            val link = Uri.parse("https://github.com/sayanakim/myProject")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view

    }

}