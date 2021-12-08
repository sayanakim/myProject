package com.sayana.myproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.sayana.myproject.R.*
import java.util.*

private const val LAST_IMAGE = "image"

class SecondFragment : Fragment() {

    lateinit var imageView: ImageView
    lateinit var buttonRandom: Button

    // список картинок
    private val imageList: List<Int> = listOf(
        drawable.one,
        drawable.two,
        drawable.three,
        drawable.four,
        drawable.five,
        drawable.six,
        drawable.seven,
        drawable.eight,
    )

    var lastImageRes = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(layout.fragment_second, container, false)

        imageView = view.findViewById(R.id.image_view)
        buttonRandom = view.findViewById(R.id.button_random)

        // сохранение рандомной картинки при повороте
        if (savedInstanceState != null)
            imageView.setImageResource(savedInstanceState.getInt(LAST_IMAGE))

        // рандомная картинка из списка
        buttonRandom.setOnClickListener {
            lastImageRes = imageList.random()
            imageView.setImageResource(lastImageRes)
        }

        return view

    }

    // сохранение состояния
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_IMAGE, lastImageRes)
    }

}