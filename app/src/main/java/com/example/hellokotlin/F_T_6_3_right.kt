
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
class F_T_6_3_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Gut gemacht.</span> Wir rufen Funktionen mit ihrem <strong>Funktionsnamen</strong> und <strong>runden Klammern</strong>.</p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> gruss(){<br />&nbsp;&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hej v&auml;rlden\"</span>)<br />}<br />gruss()</p>\n" +
                "<p>Ausgabe:<br /><em>Hej v&auml;rlden</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "3 / 15"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_6_3_right_to_t_6_4)
        }
    }
}