

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
class T_6_2 : Fragment() {

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
            "<div style=\"-en-clipboard: true;\">Kannst du die Funktion aufrufen?</div>\n" +
                    "<div>&nbsp;</div>\n" +
                    "<div><span style=\"color: #0000ff;\">fun</span> gruss(){</div>\n" +
                    "<div>&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hej v&auml;rlden\"</span>)</div>\n" +
                    "<div>}</div>\n" +
                    "<div>______</div>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 15"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "gruss()")
                findNavController().navigate(R.id.action_t_5_8_to_f_T_5_9_right)
            else {
                findNavController().navigate(R.id.action_t_5_8_to_f_T_5_9_wrong)
            }
        }
    }
}