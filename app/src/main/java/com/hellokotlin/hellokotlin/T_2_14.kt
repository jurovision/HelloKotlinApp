

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
class T_2_14 : Fragment() {

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
            "<p>Welchen Bezeichner musst du benutzen, damit diese Zahl <strong>unver&auml;nderlich</strong> bleibt?</p>\n" +
                    "<p>____ kotlins_geburtsjahr = <span style=\"color: #3366ff;\">2011</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "14 / 16"



        view.findViewById<FloatingActionButton>(R.id.button3).setOnClickListener {
            var Input = view.findViewById<EditText>(R.id.Input)
            var string = Input.text.toString()
            // Alle Leerzeichen entfernen
            string = string.replace("\\s".toRegex(), "")
            if (string == "val")
                findNavController().navigate(R.id.action_t_2_14_to_f_T_2_15_right)
            else {
                findNavController().navigate(R.id.action_t_2_14_to_f_T_2_15_wrong)
            }
        }
    }
}