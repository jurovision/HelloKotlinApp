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

class I_1_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Kotlin ist eine statisch getypte Programmiersprache, die auf der Java Virtual Machine l&auml;uft. Kotlin bietet dir viele Vorteile, z.B.:</p>\n" +
                "<ul>\n" +
                "<li>Kotlin<strong> spart Codezeilen</strong> und bleibt dabei gut lesbar</li>\n" +
                "<li>Getter und Setter werden in den Compiler verschoben </li>\n" +
                "<li>(Fast) keine NullPointerExceptions mehr n&ouml;tig</li>\n" +
                "<li>Kotlin-Code ist<strong> hochkompatibel mit Java</strong></li>\n" +
                "</ul>\n" +
                "<p>&nbsp;</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 15"

        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
               findNavController().navigate(R.id.action_instruction1_2_to_instruction1_3)
           }
    }
}