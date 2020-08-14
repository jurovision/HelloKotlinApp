
package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_instruction.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class UserInput_Test : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_userinput, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text =
            "<div>Willkommen in der ersten Lektion! Sch&ouml;n, dass du dich f&uuml;r Kotlin interessierst. Kotlin ist eine relativ neue Programmiersprache, die viele Vorteile bietet. Seit 2017 unterst&uuml;tzt Google sie f&uuml;r Android Apps und seit 2019 ist sie sogar die offiziell bevorzugte Sprache f&uuml;r Android.&nbsp;</div>"
        instruction.text = Html.fromHtml(text)
        progressbar_instruction.progress = 1



        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            if (string == "Banane")
                findNavController().navigate(R.id.action_userInput_Test_to_FirstFragment)
                else {
                findNavController().navigate(R.id.action_userInput_Test_to_finish_1_15)
                }
        }
    }
}