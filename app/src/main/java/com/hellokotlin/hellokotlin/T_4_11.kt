
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
class T_4_11 : Fragment() {

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
            "<p>Kannst du so wie gerade gezeigt auf das dritte Element des Arrays zugreifen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var </span>namen = arrayOf(<span style=\"color: #008000;\">\"Leonard\"</span>, <span style=\"color: #008000;\">\"Penny\"</span>, <span style=\"color: #008000;\">\"Sheldon\"</span>)<br /><span style=\"color: #0000ff;\">var</span> sheldon = namen____</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "11 / 16"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "[2]")
                findNavController().navigate(R.id.action_t_4_11_to_f_T_4_12_right)
            else {
                findNavController().navigate(R.id.action_t_4_11_to_f_T_4_12_wrong)
            }
        }
    }
}