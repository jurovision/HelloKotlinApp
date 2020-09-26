
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
class F_T_7_9_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Gut gemacht.</span> Wir greifen mit dem <strong>Punkt Operator</strong> auf das Objekt zu und &auml;ndern den Wert wie wir es von Variablen kennen.</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> Buch{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> jahr: Int = <span style=\"color: #3366ff;\">0</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> autor: String =<span style=\"color: #008000;\"> \"\"</span><br />}</p>\n" +
                "<p><span style=\"color: #0000ff;\">val</span> per_anhalter_durch_die_galaxis = Buch()<br />per_anhalter_durch_die_galaxis.autor = <span style=\"color: #008000;\">\"Douglas Adams\"</span><br />per_anhalter_durch_die_galaxis.jahr = 1979</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "9 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_7_9_right_to_t_7_10)
        }
    }
}