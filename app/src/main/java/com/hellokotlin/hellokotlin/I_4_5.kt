

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
class I_4_5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>F&uuml;r noch mehr Optionen k&ouml;nnen wir hinter eine <em>if</em> Anweisung auch ein <em><strong>else if</strong> </em>schreiben:</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> km_gejoggt= <span style=\"color: #3366ff;\">4</span><br /><span style=\"color: #0000ff;\">if</span> (km_gejoggt&gt;= <span style=\"color: #3366ff;\">6</span>)<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Gut gemacht.\"</span>)<br /><span style=\"color: #0000ff;\">else</span> <span style=\"color: #0000ff;\">if</span>(km_gejoggt&gt;= <span style=\"color: #3366ff;\">3</span>)<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Halb geschafft!\"</span>)<br /><span style=\"color: #0000ff;\">else</span><br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Viel Erfolg!\"</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "5 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_4_5_to_DD_4_6)
        }
    }
}