
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
class F_MC_6_8_right : Fragment() {


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
            "<p><span style=\"color: #008000;\">Richtige Antwort.</span> Da wir Text nicht <strong>multiplizieren</strong> k&ouml;nnen, ist Int die richtige L&ouml;sung.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">fun</span> malDrei(<span style=\"color: #808080;\">a:</span> <span style=\"color: #808080;\">Int</span>){<br />&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(a * <span style=\"color: #3366ff;\">3</span>)<br />}</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "9 / 15"



        //tv_question.text = question.question
        option1.text = "String"
        option2.text = "Character"
        option3.text =  "Int"


        button_forward.text = "Weiter"


// 3te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(-7829368)
        option2.textSize = 16F
        option3.setTextColor(Color.BLACK)
        option3.textSize = 20F



        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_6_8_right_to_DD_6_9)
        }


    }


    // neu


}


// neu


