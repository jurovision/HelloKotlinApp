
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
import kotlinx.android.synthetic.main.fragment_instruction.progress

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_T_4_15_right : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #008000;\">Genau.</span> Arrays legen wir mit <em><strong>arrayOf(</strong></em>...<em><strong>)</strong></em> an.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> serien = arrayOf(<span style=\"color: #008000;\">\"Simpsons\"</span>, <span style=\"color: #008000;\">\"Family Guy\"</span>, <span style=\"color: #008000;\">\"American Dad\"</span>, <span style=\"color: #008000;\">\"Futurama\"</span>)</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "15 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_4_15_right2_to_finish_4_16)
        }
    }
}

