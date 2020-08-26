

package com.example.hellokotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Finish_2_16 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_finish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*        val text = "<div>Willkommen in der ersten Lektion! Sch&ouml;n, dass du dich f&uuml;r Kotlin interessierst. Kotlin ist eine relativ neue Programmiersprache, die viele Vorteile bietet. Seit 2017 unterst&uuml;tzt Google sie f&uuml;r Android Apps und seit 2019 ist sie sogar die offiziell bevorzugte Sprache f&uuml;r Android.&nbsp;</div>"
        instruction.text = Html.fromHtml(text)*/

        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_finish_2_16_to_FirstFragment)
        }
    }
}