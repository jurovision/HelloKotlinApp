

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
import kotlinx.android.synthetic.main.fragment_instruction.progress

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_T_5_3_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Leider nicht korrekt.</span> Mit <em><strong>repeat(4)</strong></em> k&ouml;nnen wir eine Anweisung 4-mal ausf&uuml;hren. Das <em>\\n</em> sorgt f&uuml;r den Zeilenumbruch.</p>\n" +
                "<p><span style=\"color: #003300;\">repeat</span>(<span style=\"color: #3366ff;\">4</span>){<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"Nur noch einen Letzten.</span><span style=\"color: #ff6600;\">\\n</span><span style=\"color: #008000;\">\"</span>)<br />}</p>\n" +
                "<p>Ausgabe:<br /><em>Nur noch einen Letzten.<br />Nur noch einen Letzten.<br />Nur noch einen Letzten.<br />Nur noch einen Letzten.</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "3 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_5_3_wrong_to_i_5_4)
        }
    }
}

