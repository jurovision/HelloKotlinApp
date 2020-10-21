
package com.hellokotlin.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_chapter_finish.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Finish_6_15 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_finish_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chapter = "6 - Funktionen"
        val text = "<p>Gut gemacht, du hast <span style=\"color: #339966;\"><strong>Kapitel</strong> <strong>$chapter</strong> </span>abgeschlossen! Du kannst direkt den Kotlin Editor &ouml;ffnen und Arrays und Bedingungen ausprobieren. Leg zum Beispiel eine Funktion an, die einem &uuml;bergebenen String einen Teilsatz hinzuf&uuml;gt oder eine Funktion, die anhand eines &uuml;bergebenen Datums z.B. Weihnachts- oder Geburtstagsgr&uuml;&szlig;e ausgibt. </p>"
        instruction.text = Html.fromHtml(text)

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_finish_6_15_to_FirstFragment)
        }
    }
}