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
class I_1_1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<div>Sch&ouml;n, dass du dich f&uuml;r Kotlin interessierst. Kotlin ist eine relativ neue Programmiersprache, die viele Vorteile bietet. Seit 2017 unterst&uuml;tzt Google sie f&uuml;r Android Apps und seit 2019 ist sie sogar die offiziell bevorzugte Sprache f&uuml;r Android.&nbsp;</div>"
        instruction.text = Html.fromHtml(text)
        progress.text = "1 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_instruction1_1_to_instruction1_2)
        }
    }
}