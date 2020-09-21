

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
class F_T_6_5_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Nein.</span> Wie wir schon oft gesehen haben, &uuml;bergeben wir der <em>println()</em> Funktion unseren Text zwischen runden Klammern und Anf&uuml;hrungszeichen <em><strong>(\"</strong></em>...<em><strong>\")</strong></em>.</p>\n" +
                "<p><em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Ol&aacute; mundo\"</span>) <br /><br />Ausgabe:<br /><em>Ol&aacute; mundo</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "5 / 15"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_6_3_right_to_t_6_4)
        }
    }
}