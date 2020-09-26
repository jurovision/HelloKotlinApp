
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
class Task_one : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p>Schreibe ein kleines Programm, das einer Person zum Geburtstag gratuliert, wenn dieser heute ist.</p>\n" +
                "<p>Erstelle das Programm mit einer <strong>Funktion</strong> \"gratulieren\", der du einen <strong>Namen-String</strong> und einen <strong>Boolschen Wert</strong> &uuml;bergibst, der angibt, ob heute der Geburtstag ist. Wenn die Person nicht Geburtstag hat, soll das Programm einen Gru&szlig; ausgeben, z.B. \"Hallo Paul\". Andernfalls soll der Person gratuliert werden und ihr Name soll dabei genannt werden. Als Name soll immer der String verwendet werden, welcher der Funktion &uuml;bergeben wird. </p>"
        text_gross.text = Html.fromHtml(text1)
        val text2 = "<ul>\n" +
                "<li>Denke daran, dass jedes Programm eine main Funktion enthalten muss, wie in Kapitel 1 gezeigt.</li>\n" +
                "<li>Den Wert einer String Variable kannst du mit \$Variablenname in Text einbinden</li>\n" +
                "</ul>"
        text_klein.text = Html.fromHtml(text2)
/*        view.findViewById<Button>(R.id.button_tipps).setOnClickListener {
            findNavController().navigate(R.id.action_instruction1_1_to_instruction1_2)
        }
        view.findViewById<Button>(R.id.button_loesung).setOnClickListener {
            findNavController().navigate(R.id.action_instruction1_1_to_instruction1_2)
        }*/
    }
}