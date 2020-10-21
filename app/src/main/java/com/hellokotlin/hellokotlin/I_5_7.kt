

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
class I_5_7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Auch bei Schleifen ist Kotlin wirklich <strong>nutzerfreundlich</strong>. In welchen anderen Sprachen k&ouml;nnten wir schon wie hier gezeigt ein <strong>Array durchlaufen</strong>? Wie du die Variable zum Iterieren benennst, ist &uuml;brigens egal.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> namen = arrayOf(<span style=\"color: #008000;\">\"Tick\"</span>, <span style=\"color: #008000;\">\"Trick\"</span>, <span style=\"color: #008000;\">\"Track\"</span>)<br /><span style=\"color: #0000ff;\">for</span> (name <span style=\"color: #0000ff;\">in</span> namen){<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(name + <span style=\"color: #008000;\">\" \"</span>)<br /><span style=\"color: #808080; background-color: #ffffff;\">&nbsp;&nbsp;&nbsp; /* mit <strong>+</strong> Kannst du Strings und Character miteinander verbinden */</span><br />}</p>\n" +
                "<p>Ausgabe: <br /><em>Tick Trick Track</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "7 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_5_7_to_t_5_8)
        }
    }
}