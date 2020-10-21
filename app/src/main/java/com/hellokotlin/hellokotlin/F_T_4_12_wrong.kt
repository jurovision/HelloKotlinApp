
package com.hellokotlin.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_instruction.*
import kotlinx.android.synthetic.main.fragment_instruction.progress

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_T_4_12_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Leider nein.</span> Wir greifen mit den eckigen Klammern und dem Index auf Elemente zu. Versuchen wir, auf ein Element zuzugreifen, das au&szlig;erhalb des Arrays liegt (also hier z.B. <em>namen[3]</em> oder h&ouml;her), bekommen wir eine Fehlermeldung. Wir k&ouml;nnen alternativ auch mit <em><strong>namen.get(2)</strong></em> auf \"Sheldon\" zugreifen.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> namen = arrayOf(<span style=\"color: #008000;\">\"Leonard\"</span>, <span style=\"color: #008000;\">\"Penny\"</span>, <span style=\"color: #008000;\">\"Sheldon\"</span>)<br /><span style=\"color: #0000ff;\">var</span> sheldon = namen[2]</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "12 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_4_12_wrong_to_i_4_13)
        }
    }
}