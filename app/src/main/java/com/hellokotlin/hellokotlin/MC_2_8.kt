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
class MC_2_8 : Fragment(), View.OnClickListener{
    // Richtige Antwort festlegen
    var correctAnswer = 2
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
            "<p>Zwar m&uuml;ssen wir meistens keinen Datentyp <strong>manuell festlegen</strong>, aber wir k&ouml;nnen es durchaus. Wie k&ouml;nnen wir den Typ dieser Variable explizit festlegen?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> hero ____ = <span style=\"color: #008000;\">\"Superman\"</span></p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "8 / 16"




        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = ": Int"
        option2.text = ": String"
        option3.text = ": Char"
        option4.text = ": Double"


        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {

            if (answer == correctAnswer) {

                findNavController().navigate(R.id.action_MC_2_8_to_f_MC_2_9_right)
            } else {
                findNavController().navigate(R.id.action_MC_2_8_to_f_MC_2_9_wrong)
            }

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.option1 -> {
                option1.setTextColor(Color.BLACK)
                option1.textSize = 20F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 1
            }

            R.id.option2 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(Color.BLACK)
                option2.textSize = 20F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 2
            }

            R.id.option3 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(Color.BLACK)
                option3.textSize = 20F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 3
            }

            R.id.option4 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(Color.BLACK)
                option4.textSize = 20F
                answer = 4
            }

        }


    }
}




