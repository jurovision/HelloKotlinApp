
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
class I_4_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Wollen wir in einer <em>if</em> oder <em>else</em> Bedingung <strong>mehrere Anweisungen</strong> ausf&uuml;hren, schreiben wir sie in<strong> geschwungene Klammern</strong> <em><strong>{</strong></em>...<em><strong>}</strong></em>. F&uuml;r nur eine Anweisung sind keine Klammern n&ouml;tig.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> bedingung = <span style=\"color: #0000ff;\">false</span><br /><span style=\"color: #0000ff;\">if</span> (!bedingung){<br />&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hallo\"</span>)<br />&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Welt\"</span>)<br /><span>}</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_4_2_to_MC_4_3)
        }
    }
}