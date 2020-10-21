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
class I_2_4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Nat&uuml;rlich d&uuml;rfen wir die Zahlen nicht vergessen! Hier siehst du, wie du Ganzzahlen (<strong>Integer</strong>) und Flie&szlig;kommazahlen (<strong>Double</strong>) anlegst:</p>\n" +
                "<p><span style=\"color: #0000ff;\">val</span> integer = <span style=\"color: #3366ff;\">99</span><br /><span style=\"color: #0000ff;\">var</span> double = <span style=\"color: #3366ff;\">3.14</span></p>\n" +
                "<p>&nbsp;</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "4 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_2_4_to_i_2_5)
        }
    }
}