
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
class Task_Overview : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aufgaben_uebersicht, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Wenn du alle Lektionen absolviert hast, warten hier noch 3 Aufgaben auf dich. Mit dem Wissen aus den Lektionen kannst du sie problemlos schaffen. Du kannst die Aufgaben entweder hier im Kotlin Editor lösen, oder dir eine Kotlin IDE herunterladen, z.B. IntelliJ IDEA Community.</p>\n" +
                "<p>Viel Erfolg!</p>"
        instruction.text = Html.fromHtml(text)
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            findNavController().navigate(R.id.action_task_Overview_to_task_one)
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.action_task_Overview_to_task_two)
        }
        view.findViewById<Button>(R.id.aufgabe3).setOnClickListener {
            findNavController().navigate(R.id.action_task_Overview_to_task_three)
        }
    }
}