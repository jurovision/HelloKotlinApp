package com.example.hellokotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_instruction.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Instruction1_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instruction.text = "Willkommen in der ersten Lektion! Schön, dass du dich für Kotlin " +
                "interessierst. Kotlin ist eine relativ neue Programmiersprache, die viele Vorteile " +
                "bietet. Seit 2017 unterstützt Google sie für Android Apps und seit 2019 ist sie " +
                "sogar die offiziell bevorzugte Sprache für Android. "
        view.findViewById<Button>(R.id.button_weiter).setOnClickListener {
            findNavController().navigate(R.id.action_instruction1_1_to_instruction1_2)
        }
    }
}