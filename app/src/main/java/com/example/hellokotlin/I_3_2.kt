

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
class I_3_2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Auch in Kotlin verwenden wir zum <strong>Vergleichen von Werten</strong> die altbekannten Zeichen. F&uuml;r Ausdr&uuml;cke wie diese wird automatisch der Typ \"Boolean\" ermittelt.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> uno = <span style=\"color: #3366ff;\">1</span> &lt; <span style=\"color: #3366ff;\">2</span><br /><span style=\"color: #808080;\">// 1 ist <strong>kleiner</strong> als zwei</span><br /><span style=\"color: #0000ff;\">var</span> dos = <span style=\"color: #3366ff;\">11</span> &gt;= <span style=\"color: #3366ff;\">10</span><br /><span style=\"color: #808080;\">// 11 ist <strong>gr&ouml;&szlig;er</strong> als 10 <strong>oder gleichgro&szlig;</strong></span><br /><span style=\"color: #0000ff;\">var</span> tres = <span style=\"color: #3366ff;\">21</span> == <span style=\"color: #3366ff;\">21</span><br /><span style=\"color: #808080;\">// 21 ist <strong>genau so gro&szlig;</strong> wie 21</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 13"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_i_3_2_to_DD_3_3)
        }
    }
}