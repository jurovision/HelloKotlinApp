

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

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_MC_3_7_wrong : Fragment() {
    // Richtige Antwort festlegen
    var correctAnswer = 4
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
            "<p><span style=\"color: #ff0000;\">Leider nein.</span> Mit <em><strong>!=</strong></em> k&ouml;nnen wir &uuml;berpr&uuml;fen, ob Werte des selben Typs <strong>nicht gleich</strong> sind.</p>\n" +
                    "<p><span style=\"color: #0000ff;\"> var</span> ergebnis = <span style=\"color: #3366ff;\">3.0</span> != <span style=\"color: #3366ff;\">3.1415926535&nbsp;</span> </p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "7 / 13"



        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "isNot"
        option2.text = "!="
        option3.text =  "<"

        button_forward.text = "Weiter"


        // Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(Color.BLACK)
        option2.textSize = 20F
        option3.setTextColor(-7829368)
        option3.textSize = 16F



        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_3_7_wrong_to_i_3_8)
        }


    }


    // neu


}


// neu


