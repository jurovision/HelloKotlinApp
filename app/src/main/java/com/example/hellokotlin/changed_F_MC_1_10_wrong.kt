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
import com.example.hellokotlin.R
import kotlinx.android.synthetic.main.fragment_multiple_choice_default_one_answer.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class changed_F_MC_1_10_wrong : Fragment() {
    // Richtige Antwort festlegen
    var correctAnswer = 4
    // answer == gewählte Antwort
    var answer = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiple_choice_default_one_answer, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val text =
            "<p><span style=\"color: #ff0000;\">Leider nein. </span>Zahlen, egal welcher Art, " +
                    "legen wir <strong>ohne Anf&uuml;hrungszeichen</strong> an.</p>"
        dd_text.text = Html.fromHtml(text)
        progressBar_mc.progress = 10


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "'11880'"
        option2.text = "\"1349\""
        option3.text = "\"Zwölf\""
        option4.text = "42"

        // 4te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(-7829368)
        option3.textSize = 16F
        option4.setTextColor(Color.BLACK)
        option4.textSize = 20F


        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


           findNavController().navigate(R.id.action_f_MC_1_7_wrong_to_MC_1_8)
        }


    }


    // neu


}


// neu


