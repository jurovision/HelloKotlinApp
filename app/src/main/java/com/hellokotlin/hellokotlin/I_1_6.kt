
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
class I_1_6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p>Mit dem Schl&uuml;sselbegriff <em><strong>var</strong></em> hast du gerade bereits eine Variable angelegt. Wenn wir in Kotlin nicht manuell den Datentyp festlegen wollen, m&uuml;ssen wir ihn nicht angeben. Er wird automatisch abgeleitet. Wir k&ouml;nnen alle &uuml;blichen Datentypen einfach mittels <em><strong>var name =</strong></em> anlegen</p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "6 / 15"

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_i_1_6_to_DD_1_7)
        }
    }
}