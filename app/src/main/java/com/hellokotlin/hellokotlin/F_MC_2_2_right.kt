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
class F_MC_2_2_right : Fragment() {


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
            "<p><span style=\"color: #008000;\">Ganz genau.</span> Werte, die <strong>nicht ver&auml;nderbar</strong> sein sollen, kannst du mit dem Schl&uuml;sselwort <em><strong>val</strong> </em>anlegen. <em><strong>var</strong> </em>Werte sind nicht vor Ver&auml;nderung sicher.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">val</span> Geburtsjahr= <span style=\"color: #3366ff;\">1996</span></p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "2 / 16"



        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "var"
        option2.text = "val"
        option3.text = "private var"

        button_forward.text = "Weiter"


        // 2te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(Color.BLACK)
        option2.textSize = 20F
        option3.setTextColor(-7829368)
        option3.textSize = 16F



        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_2_2_right_to_i_2_3)
        }


    }




}




