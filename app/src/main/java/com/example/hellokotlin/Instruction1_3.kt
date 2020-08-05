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

class Instruction1_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p style=\"text-align: justify;\">Unsere Hello World Funktion sieht so aus. Die <strong>main</strong> Funktion muss in jedem Programm definiert werden und ist der Start des Programms. Wie alle Funktionen in Kotlin beginnt sie mit dem Schl&uuml;sselwort <strong>fun</strong>. Hier liegt auch schon ein erster Kotlin-Vorteil: Wir m&uuml;ssen Anweisungen nicht mit einem Semikolon beenden.</p>\n" +
                "<p style=\"text-align: left;\">&nbsp;<span style=\"color: #0000ff;\">fun</span> main(<span style=\"color: #808080;\">args: Array&lt;String&gt;</span>) {</p>\n" +
                "<p style=\"padding-left: 30px; text-align: left;\">&nbsp;&nbsp; println(<span style=\"color: #008000;\">\"Hello World!\"</span>)</p>\n" +
                "<p style=\"text-align: left;\">}</p>"
        instruction.text = Html.fromHtml(text)
           view.findViewById<Button>(R.id.button_weiter).setOnClickListener {
               findNavController().navigate(R.id.action_instruction1_3_to_ersteFrageTest)
           }
    }
}