

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
class I_6_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Mithilfe von <strong>Funktionen</strong> k&ouml;nnen wir <strong>Anweisungen</strong> <strong>b&uuml;ndeln</strong> und sie sp&auml;ter einfach erneut aufrufen. Sie beginnen immer mit dem Schl&uuml;sselwort <em>fun</em>.</p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> halloWelt(){<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hallo \"</span>)<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Welt\"</span>)<br />}<br />halloWelt()</p>\n" +
                "<p>Ausgabe:<br /><em>Hallo Welt</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_6_1_to_t_6_2)
        }
    }
}