
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
class I_6_6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Beim Anlegen einer Funktion k&ouml;nnen wir <strong>zwischen den runden Klammern</strong> festlegen, welche <strong>Argumente</strong> sie annimmt.</p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> istSuper(<span style=\"color: #808080;\">text: String</span>){<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(text + <span style=\"color: #008000;\">\" ist super.\"</span>)<br />}<br />istSuper(<span style=\"color: #008000;\">\"Kotlin\"</span>)</p>\n" +
                "<p>Ausgabe:<br /><em>Kotlin ist super.</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "6 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_6_6_to_MC_6_7)
        }
    }
}