
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
class T_5_8 : Fragment() {

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
            "<p>Ganz gleich funktioniert es &uuml;brigens mit <strong>Buchstaben</strong> (Char) eines Strings. Kannst du das Beispiel vervollst&auml;ndigen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> wort = <span style=\"color: #008000;\">\"Kotlin\"</span><br /><span style=\"color: #0000ff;\">for</span> (buchstabe _________<br /><span style=\"color: #003300;\"><em>&nbsp;&nbsp;&nbsp; println</em></span>(buchstabe)<br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "8 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "inwort){")
                findNavController().navigate(R.id.action_t_5_8_to_f_T_5_9_right)
            else {
                findNavController().navigate(R.id.action_t_5_8_to_f_T_5_9_wrong)
            }
        }
    }
}