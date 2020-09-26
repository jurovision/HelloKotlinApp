
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
class F_T_7_3_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Richtig.</span> Weil die Attribute zum Erzeugen eines Objektes <strong>&auml;nderbar</strong> sein sollen, m&uuml;ssen wir <em><strong>var</strong> </em>verwenden. F&uuml;r das Erscheinungsjahr bietet sich nat&uuml;rlich eine <strong>Ganzzahl</strong> an.</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> Film{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> name: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> regie: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> jahr: Int = <span style=\"color: #3366ff;\">0</span><br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "3 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_7_3_right_to_MC_7_4)
        }
    }
}