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
class F_MC_2_11_right : Fragment() {
    // Richtige Antwort festlegen
    var correctAnswer = 4
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
            "<div style=\"-en-clipboard: true;\"><span style=\"color: #008000;\">Stimmt.</span> tore = -(tore -<span style=\"color: #0000ff;\">1</span>) ergibt wenig Sinn. <strong>Alle anderen Wege funktionieren</strong> und k&ouml;nnen gleicherma&szlig;en zum Verringern um 1 mit - umgesetzt werden. </div>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "11 / 16"


        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "tore += 1"
        option2.text = "tore = tore +1"
        option3.text = "tore++"
        option4.text = "tore = -(tore - 1)"
        button_forward.text = "Weiter"


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


            findNavController().navigate(R.id.action_f_MC_2_11_right_to_MC_2_12)
        }


    }


    // neu


}


// neu


