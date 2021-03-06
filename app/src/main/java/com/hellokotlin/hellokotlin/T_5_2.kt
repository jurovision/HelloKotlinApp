
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
class T_5_2 : Fragment() {

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
            "<p>Kannst du den Text so <strong>wie gerade gezeigt</strong> 4-mal ausgeben?</p>\n" +
                    "<p>________ {<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"Nur noch einen letzten.</span><span style=\"color: #ff6600;\">\\n</span><span style=\"color: #008000;\">\"</span>)<br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "2 / 15"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "repeat(4)")
                findNavController().navigate(R.id.action_t_5_2_to_f_T_5_3_right)
            else {
                findNavController().navigate(R.id.action_t_5_2_to_f_T_5_3_wrong)
            }
        }
    }
}