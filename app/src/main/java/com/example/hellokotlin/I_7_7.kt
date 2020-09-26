

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
class I_7_7 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Lass uns eine <strong>Instanz</strong> von Fahrzeug anlegen und die Eigenschaften festlegen.</p>\n" +
                "<p><span style=\"color: #0000ff;\">class</span> Fahrzeug{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> r&auml;der: Int = <span style=\"color: #3366ff;\">0</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> marke: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> farbe: String = <span style=\"color: #008000;\">\"\"</span><br />}</p>\n" +
                "<p><span style=\"color: #0000ff;\">val</span> batmobil = Fahrzeug()<br /><span style=\"color: #808080;\">// <strong>Instanz</strong> / <strong>Objekt</strong> erzeugen</span><br />batmobil.r&auml;der = <span style=\"color: #3366ff;\">4</span><br />batmobile.marke = <span style=\"color: #008000;\">\"unbekannt\"</span><br />batmobil.farbe = <span style=\"color: #008000;\">\"schwarz\"</span><br /><span style=\"color: #808080;\">// Werte festlegen</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "7 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_7_7_to_t_7_8)
        }
    }
}