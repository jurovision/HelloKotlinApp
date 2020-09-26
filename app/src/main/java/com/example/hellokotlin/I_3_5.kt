

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
class I_3_5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Mittels des<em><strong> !</strong> </em>Operators k&ouml;nnen wir den Wert eines boolschen Ausdrucks <strong>umkehren</strong>.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> gutes_wetter = <span style=\"color: #0000ff;\">false</span><br />gutes _wetter = !gutes_wetter<br /><em><span style=\"color: #003300;\">println</span></em>(gutes_wetter)</p>\n" +
                "<p>Ausgabe: <em>true</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "5 / 13"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_3_5_to_MC_3_6)
        }
    }
}