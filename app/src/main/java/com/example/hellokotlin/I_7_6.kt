
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
class I_7_6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Als <strong>Vorlagen</strong> f&uuml;r verschiedene, aber &auml;hnliche Objekte beinhalten Klassen <strong>typische Eigenschaften</strong>. Die Eigenschaften sind in der Klasse meist ohne Wert angelegt. F&uuml;r Fahrzeuge k&ouml;nnte das so aussehen:</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> Fahrzeug{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> r&auml;der: Int = <span style=\"color: #3366ff;\">0</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> marke: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> modell: String = <span style=\"color: #008000;\">\"\"</span><br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "6 / 16"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_i_7_6_to_i_7_7)
        }
    }
}