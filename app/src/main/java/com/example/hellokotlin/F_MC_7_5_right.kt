
package com.example.hellokotlin

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
class F_MC_7_5_right : Fragment() {
    // answer == gewählte Antwort
    var answer = 0

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
            "<p><span style=\"color: #008000;\">Ja.</span> W&auml;hrend die anderen 3 reale Personen aus Fleisch und Blut sind, existiert Buzz Lightyear nur in Filmen usw. \uD83D\uDE09 Er ist keine Instanz einer Person.</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "5 / 16"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "Lionel Messi"
        option2.text = "Taylor Swift"
        option3.text = "Buzz Lightyear"
        option4.text = "Oprah Winfrey"
        button_forward.text = "Weiter"


// 3te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(Color.BLACK)
        option3.textSize = 20F
        option4.setTextColor(-7829368)
        option4.textSize = 16F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_7_5_right_to_i_7_6)
        }


    }


    // neu


}


// neu


