

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
class ErsteFrageTest : Fragment(), View.OnClickListener{
    // Richtige Antwort festlegen
    var correctAnswer = 3
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
            "<p><span style=\"color: #ff00ff;\">fun</span> main(args: <span style=\"color: #0000ff;\">Array&lt;String&gt;</span>) {<br />&nbsp;&nbsp;&nbsp; println(<span style=\"color: #008000;\">\"Hello World!\"</span>)<br />}</p>"
        dd_text.text = Html.fromHtml(text)

        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        option1.text = "one"
        option2.text = "two"
        option3.text = "three"
        option4.text = "four"


        option1.setOnClickListener(this)
        option2.setOnClickListener(this)
        option3.setOnClickListener(this)
        option4.setOnClickListener(this)
        //button_forward.setOnClickListener(this)
        view.findViewById<Button>(R.id.button_forward).setOnClickListener {

            if (answer == correctAnswer) {

            findNavController().navigate(R.id.action_ersteFrageTest_to_fragmentFirstCorrect)
            } else {
                findNavController().navigate(R.id.action_ersteFrageTest_to_fragmentFirstWrong)
            }

        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.option1 -> {
                option1.setTextColor(Color.BLACK)
                option1.textSize = 20F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 1
            }

            R.id.option2 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(Color.BLACK)
                option2.textSize = 20F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 2
            }

            R.id.option3 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(Color.BLACK)
                option3.textSize = 20F
                option4.setTextColor(-7829368)
                option4.textSize = 16F
                answer = 3
            }

            R.id.option4 -> {
                option1.setTextColor(-7829368)
                option1.textSize = 16F
                option2.setTextColor(-7829368)
                option2.textSize = 16F
                option3.setTextColor(-7829368)
                option3.textSize = 16F
                option4.setTextColor(Color.BLACK)
                option4.textSize = 20F
                answer = 4
            }
/*            R.id.button_forward -> {
                   if (answer == correctAnswer)
                findNavController().navigate(R.id.action_ersteFrageTest_to_fragmentFirstCorrect)

                              else {
                              findNavController().navigate(R.id.action_ersteFrageTest_to_fragmentFirstWrong)
                          }

            }*/
        }

        // neu

    }
}


        // neu


