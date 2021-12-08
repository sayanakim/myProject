package com.sayana.myproject

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ThirdFragment : Fragment() {

    lateinit var aboutRecyclerView: RecyclerView
    lateinit var githubButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        val devAbout: List<String> = listOf()(
            "Меня зовут Саяна Жамцаранова. Мне 38 лет.",

        )

        aboutRecyclerView = view.findViewById(R.id.about_recycler_view)
        githubButton = view.findViewById(R.id.link_github)

        aboutRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        aboutRecyclerView.adapter = DevAdapter(devAbout)

        githubButton.setOnClickListener {
            val link = Uri.parse("https://github.com/sayanakim/myProject")
        }

        return view

    }

}