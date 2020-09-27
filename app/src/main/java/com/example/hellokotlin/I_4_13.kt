
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
class I_4_13 : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_instruction, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val text = "<p>Aber wie k&ouml;nnen wir die <strong>L&auml;nge</strong> eines Arrays wissen, das wir nicht kennen? Kotlin hat mit <em><strong>.size</strong></em> eine praktische L&ouml;sung hierf&uuml;r. Zur&uuml;ckgegeben wird dabei die Anzahl der Elemente, also hier 4.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> zahlen = arrayOf(<span style=\"color: #3366ff;\">54</span>, <span style=\"color: #3366ff;\">74</span>, <span style=\"color: #3366ff;\">90</span>, <span style=\"color: #3366ff;\">14</span>)<br /><span style=\"color: #0000ff;\">var</span> elemente = zahlen.size<br /><span style=\"color: #0000ff;\">var</span> index_letztes_element = zahlen.size -<span style=\"color: #3366ff;\">1</span></p>"
            instruction.text = Html.fromHtml(text)
            progress.text = "13 / 16"
            view.findViewById<Button>(R.id.button3).setOnClickListener {
                findNavController().navigate(R.id.action_i_4_13_to_t_4_14)
            }
        }
    }