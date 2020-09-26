
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
class I_5_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Eine <em><strong>while</strong> </em>Schleife f&uuml;hrt die enthaltenen Befehle so lange aus, wie die <strong>Bedingung</strong> in den runden Klammern <strong>wahr</strong> ist.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> j = <span style=\"color: #3366ff;\">0</span><br /><span style=\"color: #0000ff;\">while</span> (i&lt;<span style=\"color: #3366ff;\">3</span>){<br /><span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Polly will einen Cracker.</span><span style=\"color: #ff6600;\">\\n</span><span style=\"color: #008000;\">\"</span>)<br />}</p>\n" +
                "<p>Ausgabe:<br /><em>Polly will einen Cracker.</em><br /><em>Polly will einen Cracker.</em><br /><em>Polly will einen Cracker.</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "4 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_5_4_to_MC_5_4)
        }
    }
}