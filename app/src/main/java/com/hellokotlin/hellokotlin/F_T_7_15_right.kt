
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
class F_T_7_15_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Sehr gut!</span> Wir schreiben den Klassennamen <strong>gro&szlig;</strong> und die Variable <em><strong>var</strong> </em><strong>klein</strong>. Den Standardwert von <em>alter</em> setzen wir auf <strong>0</strong>, damit wir es leicht sehen k&ouml;nnen, falls ein Objekt ohne Konstruktor erstellt wurde. Und nat&uuml;rlich denken wir an die <strong>Klammern</strong> \uD83D\uDE09</p>\n" +
                "<p><span style=\"color: #0000ff;\"> class</span> Person(<span style=\"color: #0000ff;\">var</span> alter: Int = <span style=\"color: #3366ff;\">0</span>){ <br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">fun</span> gruss(){<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Hallo!\"</span>)<br />&nbsp;&nbsp;&nbsp; }<br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "15 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_7_15_right_to_finish_7_16)
        }
    }
}
