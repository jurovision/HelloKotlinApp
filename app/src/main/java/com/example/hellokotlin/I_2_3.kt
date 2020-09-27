package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
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
class I_2_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Wie wir bereits im letzten Kapitel gesehen haben, k&ouml;nnen Variablen ganz verschiedene Datentypen beinhalten. <strong>Strings</strong>, also Zeichenketten, und <strong>Character</strong> (Char), also einzelne Buchstaben, legst du folgenderma&szlig;en an:</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> ein_string = <span style=\"color: #008000;\">\"Tenacious\"</span><br /><span style=\"color: #0000ff;\">val</span> ein_char = <span style=\"color: #008000;\">'D'</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "3 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_2_3_to_i_2_4)
        }
    }
}