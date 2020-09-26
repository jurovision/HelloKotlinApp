

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
class F_T_2_15_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Nein.</span> Wir benutzen <strong>val</strong> f&uuml;r <strong>unver&auml;nderliche</strong> und var f&uuml;r ver&auml;nderliche Werte. Das l&auml;sst sich &uuml;brigens gut damit merken, das in <strong>var</strong>iabel wie ver&auml;nderlich ein \"var\" steckt \uD83D\uDE09</p>\n" +
                "<p><span style=\"color: #0000ff;\"> val</span> kotlins_geburtsjahr = <span style=\"color: #3366ff;\">2011 </span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "15 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_2_15_wrong_to_finish_2_16)
        }
    }
}