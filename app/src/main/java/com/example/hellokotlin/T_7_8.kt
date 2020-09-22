
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
class T_7_8 : Fragment() {

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
            "<p>Kannst du das Erscheinungsjahr des Buches festlegen? Es erschien 1979.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">class</span> Buch{<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> jahr: Int = <span style=\"color: #3366ff;\">0</span><br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">var</span> autor: String =<span style=\"color: #008000;\"> \"\"</span><br />}</p>\n" +
                    "<p><span style=\"color: #0000ff;\">val</span> per_anhalter_durch_die_galaxis = Buch()<br />per_anhalter_durch_die_galaxis.autor = <span style=\"color: #008000;\">\"Douglas Adams\"</span><br />per_anhalter_durch_die_galaxis____________</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "8 / 16"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == ".jahr=1979")
                findNavController().navigate(R.id.action_t_7_8_to_f_T_7_9_right)
            else {
                findNavController().navigate(R.id.action_t_7_8_to_f_T_7_9_wrong)
            }
        }
    }
}