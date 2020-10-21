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
class F_MC_1_12_right : Fragment() {


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
            "<p><span style=\"color: #008000;\">So ist es.</span> Mit den Operatoren <strong>+ - " +
                    "/ *</strong> k&ouml;nnen wir Berechnungen mit Variablen anstellen.</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "12 / 15"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "+"
        option2.text = "/"
        option3.text = "plus"
        option4.text = ".add()"
        button_forward.text = "Weiter"


        // 1te Antwort richtig
        option1.setTextColor(Color.BLACK)
        option1.textSize = 20F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(-7829368)
        option3.textSize = 16F
        option4.setTextColor(-7829368)
        option4.textSize = 16F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_1_9_right_to_DD_1_10)
        }


    }




}




