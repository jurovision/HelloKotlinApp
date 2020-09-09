

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
class I_4_10 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Wir legen Arrays mit <em><strong>arrayOf(</strong></em>...<em><strong>)</strong></em> an. Ihr Index beginnt immer bei <strong>0</strong> und auf Elemente zugreifen k&ouml;nnen wir mit dem Arraynamen und eckigen Klammern<em><strong> [</strong></em>...<em><strong>]</strong></em>.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> array = arrayOf(<span style=\"color: #3366ff;\">1</span>,<span style=\"color: #3366ff;\">2</span>,<span style=\"color: #3366ff;\">3</span>,<span style=\"color: #3366ff;\">4</span>,<span style=\"color: #3366ff;\">5</span>)<br /><span style=\"color: #0000ff;\">var</span> zwei = array[<span style=\"color: #3366ff;\">1</span>]</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "10 / 16"
        view.findViewById<Button>(R.id.button_inputanswer).setOnClickListener {
            findNavController().navigate(R.id.action_i_4_10_to_t_4_11)
        }
    }
}