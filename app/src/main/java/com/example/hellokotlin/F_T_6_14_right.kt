
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
class F_T_6_14_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Gut gemacht. </span>Weil <em>ketchup()</em> einen String zur&uuml;ckgibt, k&ouml;nnen wir die Funktion auch wie einen String in <em>println()</em> verwenden.</p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> ketchup(): String{<br />&nbsp;&nbsp;&nbsp; return <span style=\"color: #008000;\">\"mit Ketchup\"</span><br />}<br /><em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Pommes \"</span> + ketchup() )</p>\n" +
                "<p>Ausgabe:<br /> <em>Pommes mit Ketchup</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "14 / 15"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_6_14_right_to_finish_6_15)
        }
    }
}