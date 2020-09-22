
package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_instruction.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_T_6_12_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Nicht ganz.</span> Hier stimmt nur eine <strong>Ganzzahl</strong>, weil die Funktion eine solche zur&uuml;ckgibt. Wird der entsprechende Wert zur&uuml;ckgegeben, sind z.B. auch Double, Character, String und Boolean m&ouml;glich.</p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> gibMirF&uuml;nf(): Int{<br />&nbsp;&nbsp;&nbsp; return <span style=\"color: #3366ff;\">5</span><br />}</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "12 / 15"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_6_12_wrong_to_t_6_13)
        }
    }
}