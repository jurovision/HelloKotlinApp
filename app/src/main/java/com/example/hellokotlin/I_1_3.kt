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

class I_1_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = "<div style=\"-en-clipboard: true;\"><span style=\"color: #000000;\">Unsere Hello World Funktion sieht so aus. Die <em><strong>main</strong></em> Funktion muss in jedem Programm definiert werden und ist der Start des Programms. Wie alle Funktionen in Kotlin beginnt sie mit dem Schl&uuml;sselwort <em><strong>fun</strong></em>. Hier liegt auch schon ein erster Kotlin-Vorteil: Wir m&uuml;ssen Anweisungen nicht mit einem Semikolon beenden.</span></div>\n" +
                "<div style=\"-en-clipboard: true;\"><span style=\"color: #0000ff;\">fun</span> main(<span style=\"color: #808080;\">args: Array&lt;String&gt;</span>) {<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Hello World!\"</span>)<br />}</div>"
        instruction.text = Html.fromHtml(text)
        progress.text = "3 / 15"

        view.findViewById<Button>(R.id.button3).setOnClickListener {
               findNavController().navigate(R.id.action_instruction1_3_to_DD1_4)
           }
    }
}