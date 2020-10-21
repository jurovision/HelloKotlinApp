
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
class T_5_13 : Fragment() {

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
            "<p>Es ist Sylvester und wir wollen die letzten Sekunden bis null Uhr herunterz&auml;hlen. Wie k&ouml;nnen wir den Code korrekt erg&auml;nzen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> countdown= <span style=\"color: #3366ff;\">10</span><br />____ (countdown&gt; <span style=\"color: #3366ff;\">0</span>){<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"</span><span style=\"color: #0000ff;\">\$</span>countdown. <span style=\"color: #008000;\">\"</span>)<br />&nbsp;&nbsp;<span style=\"color: #808080;\">&nbsp; /* Mit dem <strong>\$</strong> Zeichen k&ouml;nnen wir den Wert einer Variable in Text einsetzen */</span> <br />&nbsp;&nbsp;&nbsp; countdown--<br />}<br /><em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Frohes neues Jahr!\"</span>)</p>\n" +
                    "<p><em>&nbsp;</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "13 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "while")
                findNavController().navigate(R.id.action_t_5_13_to_f_T_5_14_right)
            else {
                findNavController().navigate(R.id.action_t_5_13_to_f_T_5_14_wrong)
            }
        }
    }
}