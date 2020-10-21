package com.hellokotlin.hellokotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

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

        view.findViewById<ImageButton>(R.id.lesson_1).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_1_0)
        }
        view.findViewById<ImageButton>(R.id.lesson2).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_MC_2_1)
        }
        view.findViewById<ImageButton>(R.id.lesson_3).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_3_1)
        }
        view.findViewById<ImageButton>(R.id.lesson_4).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_4_1)
        }
        view.findViewById<ImageButton>(R.id.kotlinEditor).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_webViewFragment15)
        }
        view.findViewById<ImageButton>(R.id.lesson_5).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_5_1)
        }
        view.findViewById<ImageButton>(R.id.lesson_6).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_6_1)
        }
        view.findViewById<ImageButton>(R.id.lesson_7).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_i_7_1)
        }
        view.findViewById<ImageButton>(R.id.button_about).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_info_about)
        }
        view.findViewById<ImageButton>(R.id.button_hinweise).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_info_usage)
        }
        view.findViewById<ImageButton>(R.id.tasks).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_task_Overview)
        }

    }
}