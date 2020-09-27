

package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_instruction.*

class I_1_0 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><strong>Willkommen</strong> bei HelloKotlin! Wenn du bereits erste Programmierkenntnisse hast und <strong>Grundlagen von Kotlin</strong> lernen m&ouml;chtest, bist du hier goldrichtig. Solltest du an irgendeinem Punkt Schwierigkeiten haben, lies dir die \"Hinweise zur Benutzung\" auf dem Startbildschirm durch. Viel Spa&szlig; und viel Erfolg!</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = ""

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_1_0_to_instruction1_1)
        }
    }
}