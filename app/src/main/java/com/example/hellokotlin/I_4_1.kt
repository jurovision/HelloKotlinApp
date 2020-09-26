
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
class I_4_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Im letzten Kapitel haben wir uns Boolsche Variablen angesehen. Wir benutzen sie unter anderem dazu, den <strong>Kontrollfluss</strong> unseres Codes zu <strong>steuern</strong>. Der einger&uuml;ckte Code nach <em><strong>if</strong> </em>wird nur ausgef&uuml;hrt, wenn die Variable \"true\" ist. Wird die Bedingung nicht erfüllt, wird der Code nach <em><strong>else</strong></em> ausgeführt.</p>\n" +
                "<p><br /><span style=\"color: #0000ff;\">var</span> warmes_wetter = <span style=\"color: #0000ff;\">true</span><br /><span style=\"color: #0000ff;\">if</span> (warmes_wetter)<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"rausgehen\"</span>)<br /><span style=\"color: #0000ff;\">else</span><br /><em><span style=\"color: #003300;\">&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"zuhause Kotlin lernen\"</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_4_1_to_i_4_2)
        }
    }
}