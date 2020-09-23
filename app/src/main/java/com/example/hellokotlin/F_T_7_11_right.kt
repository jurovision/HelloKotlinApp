
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
class F_T_7_11_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Das stimmt.</span> Ziemlich elegant, oder? Achte darauf, dass wir Objekte mit <em><strong>val</strong> </em>anlegen, damit sie sp&auml;ter nicht in Objekte anderer Klassen ver&auml;nderbar sind.</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> person(<span style=\"color: #3366ff;\">var</span> alter: Int = <span style=\"color: #3366ff;\">0</span>){<br /><span style=\"color: #808080;\">&nbsp;&nbsp;&nbsp; // kein weiterer Code n&ouml;tig</span><br />}<br /><span style=\"color: #0000ff;\">val</span> aaron = person(<span style=\"color: #3366ff;\">41</span>)<br /><span style=\"color: #0000ff;\">val</span> bryan = person (<span style=\"color: #3366ff;\">64</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "11 / 16"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_7_11_right_to_DD_7_12)
        }
    }
}