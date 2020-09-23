
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
class T_7_10 : Fragment() {

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
            "<p>Wir k&ouml;nnen auch direkt in den <strong>runden Klammern</strong> <em><strong>(</strong>...<strong>)</strong></em> Werte f&uuml;r die Klasse anlegen. Dieser Wert wird auch als <strong>Konstruktor</strong> bezeichnet. Kannst du wie hier gezeigt eine weitere Person anlegen, die \"bryan\" hei&szlig;t und 64 ist?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">class</span> person(var alter: Int = <span style=\"color: #3366ff;\">0</span>){<br /><span style=\"color: #808080;\">&nbsp;&nbsp;&nbsp; // kein weiterer Code n&ouml;tig</span><br />}<br /><span style=\"color: #0000ff;\">val</span> aaron = person(<span style=\"color: #3366ff;\">41</span>)<br />_____________________</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "10 / 16"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "valbryan=person(64)")
                findNavController().navigate(R.id.action_t_7_10_to_f_T_7_11_right)
            else {
                findNavController().navigate(R.id.action_t_7_10_to_f_T_7_11_wrong)
            }
        }
    }
}