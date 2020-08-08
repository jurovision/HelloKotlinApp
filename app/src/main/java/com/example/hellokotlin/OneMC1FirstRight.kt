package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_instruction.*
import kotlinx.android.synthetic.main.fragment_question_purplequiz.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class OneMC1FirstRight : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_purplequiz, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text =
            "<p><span style=\"color: #0000ff;\">fun</span> main(args: Array&lt;String&gt;) {<br />&nbsp;&nbsp;&nbsp; println(<span style=\"color: #339966;\">\"Hello World!\"</span>)<br />}</p>"
        tv_question.text = Html.fromHtml(text)

        //tv_question.text = question.question
        //iv_image.setImageResource(question.image)
        tv_option_one.text = "one"
        tv_option_two.text = "two"
        tv_option_three.text = "three"
        tv_option_four.text = "four"
        progressbar_instruction.progress = 1


        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                tv_option_one.textSize = 22F
                tv_option_two.textSize = 18F
                tv_option_three.textSize = 18F
                tv_option_four.textSize = 18F
            }

            R.id.tv_option_two -> {
                tv_option_one.textSize = 18F
                tv_option_two.textSize = 22F
                tv_option_three.textSize = 18F
                tv_option_four.textSize = 18F
            }

            R.id.tv_option_three -> {
                tv_option_one.textSize = 18F
                tv_option_two.textSize = 18F
                tv_option_three.textSize = 22F
                tv_option_four.textSize = 18F
            }

            R.id.tv_option_four -> {
                tv_option_one.textSize = 18F
                tv_option_two.textSize = 18F
                tv_option_three.textSize = 18F
                tv_option_four.textSize = 22F
            }
        }

        // neu

    }
}