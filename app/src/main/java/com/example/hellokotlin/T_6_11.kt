
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
class T_6_11 : Fragment() {

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
            "<p>Funktionen k&ouml;nnen alle m&ouml;glichen <strong>Datentypen zur&uuml;ckgeben</strong>. Wir legen den R&uuml;ckgabetyp mit einem Doppelpunkt und dem Namen des Datentyps fest, z.B. <em>fun beispiel()<strong>: String</strong>{...}</em>. Die R&uuml;ckgabe erfolgt &uuml;ber <em><strong>return</strong></em>. Kannst du diese Funktion korrekt erg&auml;nzen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">fun</span> gibMirF&uuml;nf()_____{<br />&nbsp;&nbsp;&nbsp; return <span style=\"color: #3366ff;\">5</span><br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "11 / 15"



        view.findViewById<FloatingActionButton>(R.id.button_inputanswer).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == ":Int")
                findNavController().navigate(R.id.action_t_6_11_to_f_T_6_12_right)
            else {
                findNavController().navigate(R.id.action_t_6_11_to_f_T_6_12_wrong)
            }
        }
    }
}