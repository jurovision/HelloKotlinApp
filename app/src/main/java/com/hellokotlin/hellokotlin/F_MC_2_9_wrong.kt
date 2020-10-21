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
class F_MC_2_9_wrong : Fragment() {


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
            "<p><span style=\"color: #ff0000;\">Leider nicht richtig.</span> Wenn wir den Wert hinter dem = entsprechend anpassen, sind zwar alle Antworten korrekt, aber in diesem Beispiel ist nur ein <strong>String</strong> richtig.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> hero<span style=\"color: #808080;\">: String</span> = <span style=\"color: #008000;\">\"Superman\"</span></p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "9 / 16"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = ": Int"
        option2.text = ": String"
        option3.text = ": Char"
        option4.text = ": Double"
        button_forward.text = "Weiter"


        // 2te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(Color.BLACK)
        option2.textSize = 20F
        option3.setTextColor(-7829368)
        option3.textSize = 16F
        option4.setTextColor(-7829368)
        option4.textSize = 16F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_2_9_wrong_to_MC_2_10)
        }


    }




}




