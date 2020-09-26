
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
class T_6_13 : Fragment() {

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
            "<p>Wir k&ouml;nnen Funktionen auch direkt entsprechend ihres R&uuml;ckgabetyps <strong>aufrufen</strong>. Kannst du auf die Weise Ketchup zu unseren Pommes hinzuf&uuml;gen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">fun</span> ketchup(): String{<br />&nbsp;&nbsp;&nbsp; return <span style=\"color: #008000;\">\"mit Ketchup\"</span><br />}<br /><em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Pommes \"</span> + _______)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "13 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "ketchup()")
                findNavController().navigate(R.id.action_t_6_13_to_f_T_6_14_right)
            else {
                findNavController().navigate(R.id.action_t_6_13_to_f_T_6_14_wrong)
            }
        }
    }
}