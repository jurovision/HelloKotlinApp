
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
class T_7_2 : Fragment() {

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
            "<p>Kannst du f&uuml;r die Klasse Film ein <strong>passendes Attribut</strong> f&uuml;r das <strong>Erscheinungsjahr</strong> anlegen? Verwende bitte den Namen \"<strong>jahr</strong>\" und setze den Wert vorerst auf <strong>0</strong>.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">class</span> Film{<br /><span style=\"color: #0000ff;\">&nbsp;&nbsp;&nbsp; var</span> name: String = <span style=\"color: #008000;\">\"\"</span><br /><span style=\"color: #0000ff;\">&nbsp;&nbsp;&nbsp; var</span> regie: String = <span style=\"color: #008000;\">\"\"</span><br />&nbsp;&nbsp;&nbsp; __________________<br />}</p>\n" +
                    "<p>&nbsp;</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 16"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "varjahr:Int=0")
                findNavController().navigate(R.id.action_t_7_2_to_f_T_7_3_right)
            else {
                findNavController().navigate(R.id.action_t_7_2_to_f_T_7_3_wrong)
            }
        }
    }
}