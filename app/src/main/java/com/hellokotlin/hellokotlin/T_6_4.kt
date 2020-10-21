
package com.hellokotlin.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_instruction.*
import kotlinx.android.synthetic.main.fragment_instruction.progress

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class T_6_4 : Fragment() {

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
            "<p>Wir k&ouml;nnen Funktionen aber auch <strong>Parameter</strong> bzw. <strong>Argumente</strong>, also Werte, <strong>&uuml;bergeben</strong>. Kannst du der <em>println()</em> Funktion \"Ol&aacute; mundo\" Als Parameter &uuml;bergeben?</p>\n" +
                    "<p>_____<span style=\"color: #008000;\">\"Ol&aacute; mundo\"</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "4 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "println(")
                findNavController().navigate(R.id.action_t_6_4_to_f_T_6_5_right)
            else {
                findNavController().navigate(R.id.action_t_6_4_to_f_T_6_5_wrong)
            }
        }
    }
}