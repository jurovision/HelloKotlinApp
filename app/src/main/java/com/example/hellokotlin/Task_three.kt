
package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_info_buttons.*
import kotlinx.android.synthetic.main.fragment_instruction.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Task_three : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p><strong>Herzlichen Gl&uuml;ckwunsch</strong>, du hast es bis zur allerletzten Aufgabe geschafft! Und die geht so: Eine Druckerei pr&uuml;ft in regelm&auml;&szlig;igen Abst&auml;nden die <strong>Druckqualit&auml;t</strong> verschiedener Buchstaben. Da die Buchstaben unterschiedlich schwer sauber zu drucken sind, ist auch der Pr&uuml;faufwand verschieden.</p>\n" +
                "<p>Erstelle eine Funktion, der ein<strong> Array von Strings</strong> &uuml;bergeben wird. Die Funktion soll das erste Element des Arrays einmal drucken und jedes darauffolgende 1 mal mehr (zweites Element 2 mal, drittes 3 mal usw.). Da die Wartungsarbeiten nie ganz gleich ablaufen, soll die Funktion <strong>Arrays verschiedener L&auml;nge</strong> verarbeiten k&ouml;nnen.</p>"
        text_gross.text = Html.fromHtml(text1)
/*        val text2 = "<ul>\n" +
                "<li>Denke daran, dass jedes Programm eine main Funktion enthalten muss, wie in Kapitel 1 gezeigt.</li>\n" +
                "<li>Den Wert einer String Variable kannst du mit \$Variablenname in Text einbinden</li>\n" +
                "<li>Mehrere Argumente für eine Funktion trennen wir mit Kommas</li>\n" +
                "</ul>"
        text_klein.text = Html.fromHtml(text2)*/
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_task_three_to_task_three_tipps)
        }
        view.findViewById<Button>(R.id.button_loesung).setOnClickListener {
            findNavController().navigate(R.id.action_task_three_to_task_three_loesung)
        }
    }
}