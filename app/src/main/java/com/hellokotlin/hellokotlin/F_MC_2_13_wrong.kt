
package com.hellokotlin.hellokotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_multiple_choice_4.*
import kotlinx.android.synthetic.main.fragment_multiple_choice_4.progress

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_MC_2_13_wrong : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiple_choice_4, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val text =
            "<p><span style=\"color: #ff0000;\">Leider nein.</span> Wir k&ouml;nnen den Wert einer Variable var <strong>unbegrenzt</strong> oft &auml;ndern. Die anderen Aussagen &uuml;ber Variablen sind richtig.</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "13 / 16"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "Typ ist später nicht änderbar"
        option2.text = "Wert ist begrenzt oft änderbar"
        option3.text = "Können ihren Typ selbst erkennen"
        option4.text = "Typ manuell festlegbar"
        button_forward.text = "Weiter"


        //2te Antwort richtig
        option1.setTextColor(Color.BLACK)
        option1.textSize = 17F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(Color.BLACK)
        option3.textSize = 17F
        option4.setTextColor(Color.BLACK)
        option4.textSize = 17F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_2_13_wrong_to_t_2_14)
        }


    }




}




