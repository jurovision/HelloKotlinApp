

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
class Task_two : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p>Als N&auml;chstes m&ouml;chten wir gerne einen <strong>minimalistischen Taschenrechner</strong> umsetzen. Setze ihn als Funktion um, der drei Werte &uuml;bergeben werden: <strong>zwei Double Zahlen</strong> und <strong>ein Operant</strong> aus den Zeichen \"<strong>+</strong>,<strong> -</strong>, <strong>*</strong>, <strong>/</strong>\".</p>\n" +
                "<p>Der Taschenrechner soll das Ergebnis berechnen und auf dem Bildschirm <strong>ausgeben</strong>. Sorge bitte au&szlig;erdem daf&uuml;r, dass bei einer Division durch Null eine <strong>Fehlermeldung</strong> ausgegeben wird und kein Ergebnis berechnet wird. Du kannst davon ausgehen, dass die Funktion nur mit Double Zahlen und den korrekten Operatoren aufgerufen wird.</p>"
        text_gross.text = Html.fromHtml(text1)
/*        val text2 = "<ul>\n" +
                "<li>Denke daran, dass jedes Programm eine main Funktion enthalten muss, wie in Kapitel 1 gezeigt.</li>\n" +
                "<li>Den Wert einer String Variable kannst du mit \$Variablenname in Text einbinden</li>\n" +
                "<li>Mehrere Argumente für eine Funktion trennen wir mit Kommas</li>\n" +
                "</ul>"
        text_klein.text = Html.fromHtml(text2)*/
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_task_two_to_task_two_tipp)
        }
        view.findViewById<Button>(R.id.button_loesung).setOnClickListener {
            findNavController().navigate(R.id.action_task_two_to_task_two_loesung)
        }
    }
}