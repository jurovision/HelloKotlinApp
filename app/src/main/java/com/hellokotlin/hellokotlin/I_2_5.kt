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

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class I_2_5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>&Uuml;brigens kannst du Zahlen durch das Hinzuf&uuml;gen von <strong>Unterstrichen</strong> auch besser <strong>lesbar</strong> machen. Die Unterstriche werden von Kotlin beim Verarbeiten ignoriert.</p>\n" +
                "<p><span style=\"color: #0000ff;\">val</span> KreditkartenNummer = <span style=\"color: #3366ff;\">1234_5678_9012_3456</span></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "5 / 16"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_2_5_to_MC_2_6)
        }
    }
}