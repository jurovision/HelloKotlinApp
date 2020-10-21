
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
class I_5_10 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Auch f&uuml;r <strong>Zahlenbereiche</strong> hat Kotlin eine elegante L&ouml;sung. Platzieren wir den Range Operator <em><strong>..</strong></em> zwischen 2 und 6, f&uuml;hren wir die Anweisung f&uuml;r 2, 6 und f&uuml;r alle Zahlen zwischen ihnen je einmal aus.</p>\n" +
                "<p><span style=\"color: #0000ff;\">for</span>(zahl <span style=\"color: #0000ff;\">in</span> <span style=\"color: #3366ff;\">2</span>..<span style=\"color: #3366ff;\">6</span>){<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(zahl)<br />}</p>\n" +
                "<p>Ausgabe: <br /><em>23456</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "10 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_5_10_to_DD_5_11)
        }
    }
}