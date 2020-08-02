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

class Instruction1_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<div style=\"-en-clipboard: true;\">Kotlin ist eine statisch getypte Programmiersprache, die auf der Java Virtual Machine l&auml;uft. Kotlin bietet dir viele Vorteile, z.B.:</div>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<div>Kotlin <strong><span style=\"color: #000000;\">spart Codezeilen</span></strong> und bleibt dabei gut lesbar</div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>Getter und Setter werden in den Compiler verschoben</div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>(Fast) keine NullPointerExceptions mehr n&ouml;tig</div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>Kotlin-Code ist&nbsp;<strong><span style=\"color: #000000;\">hochkompatibel mit Java</span></strong></div>\n" +
                "</li>\n" +
                "</ul>"
        instruction.text = Html.fromHtml(text)
     //   view.findViewById<Button>(R.id.button_weiter).setOnClickListener {
     //       findNavController().navigate(R.id.action_instruction1_1_to_ersteFrageTest)
     //   }
    }
}