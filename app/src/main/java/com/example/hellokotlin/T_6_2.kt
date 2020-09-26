

package com.example.hellokotlin

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
            "<p>Kannst du die Funktion aufrufen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">fun</span> gruss(){<br />&nbsp;&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Hej v&auml;rlden\"</span>)<br />}<br />______</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "gruss()")
                findNavController().navigate(R.id.action_t_6_2_to_f_T_6_3_right)
            else {
                findNavController().navigate(R.id.action_t_6_2_to_f_T_6_3_wrong)
            }
        }
    }
}