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
class MC_3_9 : Fragment(), View.OnClickListener{
    // Richtige Antwort festlegen
    var correctAnswer = 1
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
            "<p>Welche dieser Aussagen &uuml;ber Boolsche Werte stimmt <strong>nicht</strong>?</p>\n" +
                    "<p>&nbsp;</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "9 / 13"




        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "+ und - geben Boolsche Werte zurück."
        option2.text = "< und > geben Boolsche Werte zurück. "
        option3.text =  "Sie haben nur 2 Zustände."


        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {

            if (answer == correctAnswer) {

                findNavController().navigate(R.id.action_MC_3_9_to_f_MC_3_10_right)
            } else {
                findNavController().navigate(R.id.action_MC_3_9_to_f_MC_3_10_wrong)
            }

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.option1 -> {
                option1.setTextColor(Color.BLACK)
                option1.textSize = 17F
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
                option2.textSize = 17F
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
                option3.textSize = 17F
                answer = 3
            }


        }

        // neu

    }
}