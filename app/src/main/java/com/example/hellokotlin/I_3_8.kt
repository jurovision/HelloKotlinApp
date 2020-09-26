

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
class I_3_8 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Mit den Boolschen Operatoren <em><strong>and</strong> </em>und <em><strong>or</strong> </em>kannst du Variablen von mehreren Wahrheitswerten abh&auml;ngig machen. <em><strong>and</strong> </em>gibt bei zwei Werten \"true\" zur&uuml;ck, wenn <strong>beide Werte wahr</strong> sind. <em><strong>or</strong> </em>gibt \"true\" zur&uuml;ck, wenn <strong>einer oder beide</strong> der Werte wahr sind. Beide Beispiele geben \"true\" zur&uuml;ck.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var </span>x = wahr and wahr2<br /><span style=\"color: #0000ff;\">var </span>y = wahr or falsch</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "8 / 13"

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_3_8_to_MC_3_9)
        }
    }
}