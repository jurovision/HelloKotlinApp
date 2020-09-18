
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
class F_MC_5_6_right : Fragment() {


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
            "<p><span style=\"color: #008000;\">Das stimmt.</span><strong><em> i = i +1</em></strong> f&uuml;hrt die Anweisung 3-mal aus. Option 3 gibt nur 2-mal Text aus und Option 1 w&uuml;rde theoretisch unendlich lange laufen.</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "6 / 15"



        //tv_question.text = question.question
        option1.text = "1"
        option2.text = "i + 1"
        option3.text =  "2 * i"


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


            findNavController().navigate(R.id.action_f_MC_4_4_right_to_i_4_5)
        }


    }


    // neu


}


// neu


