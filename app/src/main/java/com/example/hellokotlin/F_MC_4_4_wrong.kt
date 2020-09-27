

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
class F_MC_4_4_wrong : Fragment() {


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
            "<p><span style=\"color: #ff0000;\">Leider nicht korrekt.</span> Die Operationen in den Klammern geben beide \"true\" zur&uuml;ck, deswegen f&uuml;hrt hier nur <em><strong>or</strong> </em>den Code aus. <em><strong>and</strong> </em>w&uuml;rde auch funktionieren.</p>\n" +
                    "<p><span style=\"color: #0000ff;\">var</span> x = <span style=\"color: #0000ff;\">false</span><br /><span style=\"color: #0000ff;\">var</span> y = <span style=\"color: #0000ff;\">true</span><br /><span style=\"color: #0000ff;\">if</span>((x==false) or (y==true))<br /><em><span style=\"color: #003300;\">&nbsp;&nbsp; println</span></em>(<span style=\"color: #008000;\">\"Ciao mondo\"</span>)</p>"
        dd_text.text = Html.fromHtml(text)
        progress.text = "4 / 16"



        //tv_question.text = question.question
        option1.text = "== !"
        option2.text = "!="
        option3.text =  "or"


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


            findNavController().navigate(R.id.action_f_MC_4_4_wrong_to_i_4_5)
        }


    }


    // neu


}


// neu


