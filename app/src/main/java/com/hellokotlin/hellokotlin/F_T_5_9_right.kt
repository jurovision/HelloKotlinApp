
package com.hellokotlin.hellokotlin

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
class F_T_5_9_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Das ist richtig. </span>Mit <em><strong>in</strong> </em>und <em><strong>wort</strong> </em>wird das Beispiel vollst&auml;ndig und nat&uuml;rlich d&uuml;rfen wir die <strong>Klammern</strong> nicht vergessen!</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> wort = <span style=\"color: #008000;\">\"Kotlin\"</span><br /><span style=\"color: #0000ff;\">for</span> (buchstabe <span style=\"color: #0000ff;\">in</span> wort){<br /><span style=\"color: #003300;\"><em>&nbsp;&nbsp;&nbsp; println</em></span>(buchstabe)<br />}</p>\n" +
                "<p>Ausgabe: <br /><em>Kotlin</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "9 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_5_9_right_to_i_5_10)
        }
    }
}