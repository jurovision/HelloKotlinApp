
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
class MC_4_3 : Fragment(), View.OnClickListener{
    // Richtige Antwort festlegen
    var correctAnswer = 3
    // answer == gewählte Antwort
    var answer = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiple_choice_3, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val text =
            "<p>Mittels logischer Operatoren k&ouml;nnen wir <strong>mehrere Bedingungen</strong> auf einmal <strong>pr&uuml;fen</strong>. Wie k&ouml;nnen wir die Anweisung ausf&uuml;hren?</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> x = <span style=\"color: #0000ff;\">false</span><br /><span style=\"color: #0000ff;\">var</span> y = <span style=\"color: #0000ff;\">true</span><br /><span style=\"color: #0000ff;\">if</span>((x==false) ___ (y==true))<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"Ciao mondo\"</span>)</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "3 / 16"




        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "== !"
        option2.text = "!="
        option3.text =  "or"


        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {

            if (answer == correctAnswer) {

                findNavController().navigate(R.id.action_MC_4_3_to_f_MC_4_4_right)
            } else {
                findNavController().navigate(R.id.action_MC_4_3_to_f_MC_4_4_wrong)
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
                answer = 1
            }

            R.id.option2 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(Color.BLACK)
                option2.textSize = 20F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                answer = 2
            }

            R.id.option3 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(Color.BLACK)
                option3.textSize = 20F
                answer = 3
            }


        }


    }
}