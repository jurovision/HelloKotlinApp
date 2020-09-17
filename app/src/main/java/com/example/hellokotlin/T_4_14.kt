
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
class T_4_14 : Fragment() {

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
            "<p>Kannst du das Array anlegen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> serien = ____(<span style=\"color: #008000;\">\"Simpsons\"</span>, <span style=\"color: #008000;\">\"Family Guy\"</span>, <span style=\"color: #008000;\">\"American Dad\"</span>, <span style=\"color: #008000;\">\"Futurama\"</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "14 / 16"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "arrayOf")
                findNavController().navigate(R.id.action_t_4_14_to_f_T_4_15_right2)
            else {
                findNavController().navigate(R.id.action_t_4_14_to_f_T_4_15_wrong)
            }
        }
    }
}