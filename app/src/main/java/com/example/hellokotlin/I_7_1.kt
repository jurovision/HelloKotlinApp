
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
class I_7_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><strong>Klassen</strong> fassen <strong>Variablen</strong> und <strong>Funktionen</strong> zusammen. Sie sind <strong>abstrakte Vorlagen</strong> f&uuml;r Objekte, die wir aus ihnen bilden k&ouml;nnen. Aus Tier k&ouml;nnen wir z.B. Hund, Katze und Huhn bilden, welche die Attribute je <strong>anders</strong> erf&uuml;llen.</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> Tier{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> name: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> ruf: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">fun</span> schlafen(){<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Das Tier schl&auml;ft.\"</span>)<br />&nbsp;&nbsp;&nbsp; }<br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_7_1_to_t_7_2)
        }
    }
}