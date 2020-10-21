
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
class F_T_5_14_wrong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instruction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<p><span style=\"color: #ff0000;\">Leider nein.</span> Nur mit einer <strong><em>while</em> Schleife</strong> f&uuml;hren wir den Code 10 mal aus.</p>\n" +
                "<p><span style=\"color: #0000ff;\">var</span> countdown= <span style=\"color: #3366ff;\">10</span><br />____ (countdown&gt; <span style=\"color: #3366ff;\">0</span>){<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"</span><span style=\"color: #0000ff;\">\$</span>countdown. <span style=\"color: #008000;\">\"</span>)<br />&nbsp;&nbsp;&nbsp; countdown--<br />}<br /><em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Frohes neues Jahr!\"</span>)</p>\n" +
                "<p>Ausgabe:<br /><em>10. 9. 8. 7. 6. 5. 4. 3. 2. 1. Frohes neues Jahr!</em></p>"
        instruction.text = Html.fromHtml(text)
        progress.text = "14 / 15"
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_f_T_5_14_wrong_to_finish_5_15)
        }
    }
}