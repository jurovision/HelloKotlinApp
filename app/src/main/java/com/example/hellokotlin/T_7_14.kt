
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
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_instruction.*
import kotlinx.android.synthetic.main.fragment_instruction.progress
import kotlinx.android.synthetic.main.fragment_multiple_choice_4.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class T_7_14 : Fragment() {

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
            "<p>Wie war das nochmal mit dem <strong>Kopf einer Klasse</strong>? Vervollst&auml;ndige den Code f&uuml;r die Klasse \"Person\" und nutze dabei einen Konstruktor f&uuml;r die Variable \"alter\".</p>\n" +
                    "<p>___________<span style=\"color: #000000;\">_______</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">fun</span> gruss(){<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hallo!\"</span>)<br />&nbsp;&nbsp;&nbsp; }<br />}</p>\n" +
                    "<p>&nbsp;</p>\n" +
                    "<p>&nbsp;</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "14 / 16"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "classPerson(varalter=0){")
                findNavController().navigate(R.id.action_t_6_2_to_f_T_6_3_right)
            else {
                findNavController().navigate(R.id.action_t_6_2_to_f_T_6_3_wrong)
            }
        }
    }
}