
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
class F_MC_3_10_right : Fragment() {



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
            "<div style=\"-en-clipboard: true;\"><span style=\"color: #008000;\">Richtig.</span> Addition, Subtraktion und Co. haben nichts mit Boolschen Werten zu tun \uD83D\uDE09</div>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "10 / 13"



        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "+ und - geben Boolsche Werte zurück."
        option2.text = "< und > geben Boolsche Werte zurück. "
        option3.text =  "Sie haben nur 2 Zustände."

        button_forward.text = "Weiter"


// 1te Antwort richtig
        option1.setTextColor(-7829368)
        option1.textSize = 16F
        option2.setTextColor(Color.BLACK)
        option2.textSize = 17F
        option3.setTextColor(Color.BLACK)
        option3.textSize = 17F



        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {


            findNavController().navigate(R.id.action_f_MC_3_10_right_to_DD_3_11)
        }


    }




}




