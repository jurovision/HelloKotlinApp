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

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class F_MC_2_7_wrong : Fragment() {


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
            "<p><span style=\"color: #ff0000;\">Nein,</span> da wir die Variable schon <strong>als Ganzzahl initialisiert</strong> haben, kann sie nur noch einen entsprechenden Wert annehmen - und keinen Double- oder String-Wert.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> zahl = <span style=\"color: #3366ff;\">27</span></p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "7 / 16"



        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "zahl = \"28\""
        option2.text = "zahl = 14.14"
        option3.text =  "zahl = 13"

        button_forward.text = "Weiter"


        // Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(Color.BLACK)
        option3.textSize = 20F



        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_2_7_wrong_to_MC_2_8)
        }


    }




}




