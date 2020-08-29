package com.example.hellokotlin

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Farben ändern, wenn Kapitel abgeschlossen
        //lesson_1.setBackgroundColor(Color.parseColor("#009C7C"))
        view.findViewById<ImageButton>(R.id.lesson_1).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_instruction1_1)
        }
        view.findViewById<ImageButton>(R.id.lesson2).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_MC_2_1)
        }
        view.findViewById<ImageButton>(R.id.lesson_3).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_3_1)
        }
        view.findViewById<ImageButton>(R.id.kotlinEditor).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_webViewFragment15)
        }
    }
}