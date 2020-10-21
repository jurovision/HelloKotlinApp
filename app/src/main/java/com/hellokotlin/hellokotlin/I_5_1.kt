

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
class I_5_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Zeit f&uuml;r Schleifen! <strong>Schleifen f&uuml;hren</strong> die zwischen den geschweiften Klammern stehenden <strong>Anweisungen</strong> (meistens) <strong>mehrmals</strong> <strong>aus</strong>. Diese Anweisung gibt 3 mal den enthaltenen Text aus.</p>\n" +
                "<p><span style=\"color: #003300;\"><em>repeat</em></span>(<span style=\"color: #3366ff;\">3</span>){<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"Aller guten Dinge sind drei.\"</span>)<br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_5_1_to_t_5_2)
        }
    }
}