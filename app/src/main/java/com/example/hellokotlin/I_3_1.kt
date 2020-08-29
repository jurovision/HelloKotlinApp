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
class I_3_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Nat&uuml;rlich gibt es in Kotlin auch <strong>Boolsche Variablen</strong>, die Wahrheitswerte (\"true\" oder \"false\") ausdr&uuml;cken.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> 2020_ist_anders = <span style=\"color: #0000ff;\">true</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 13"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_i_3_1_to_i_3_2)
        }
    }
}