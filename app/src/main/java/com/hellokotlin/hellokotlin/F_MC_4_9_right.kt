
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
class F_MC_4_9_right : Fragment() {


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
            "<p><span style=\"color: #008000;\">Das ist korrekt.</span> Arrays m&uuml;ssen in Kotlin immer <strong>Daten des selben Typs</strong> enthalten und d&uuml;rfen keine Typen mischen. Deshalb ist Option 3 falsch. </p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "9 / 16"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "[\"fünf\", \"4.0\", \"drei\", \"2\"]"
        option2.text = "[1,2,3,4,5]"
        option3.text = "[1.0, 10, 10.0, 100]"
        option4.text = "[11.1, 22.2, 33.3, 7.0]"
        button_forward.text = "Weiter"


        // 3te Antwort falsch
        option1.setTextColor(Color.BLACK)
        option1.textSize = 20F
        option2.setTextColor(Color.BLACK)
        option2.textSize = 20F
        option3.setTextColor(-7829368)
        option3.textSize = 16F
        option4.setTextColor(Color.BLACK)
        option4.textSize = 20F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_4_9_right_to_i_4_10)
        }


    }




}




