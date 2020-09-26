

package com.example.hellokotlin

import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_instruction.*

class Task_one_loesung : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p><span style=\"color: #000000;\">Hier siehst du eine richtige L&ouml;sung f&uuml;r die Aufgabe. Nat&uuml;rlich sind auch andere Wege m&ouml;glich.</span></p>\n" +
                "<p><span style=\"color: #0000ff;\">fun</span> <span style=\"color: #003300;\">main</span> (<span style=\"color: #808080;\">args: Array&lt;String&gt;</span>){<br />&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">fun</span> <span style=\"color: #003300;\">gratulieren</span>(name: String, hatGeburtstag: Boolean){<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">if</span>(hatGeburtstag)<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Alles Gute,</span> <span style=\"color: #0000ff;\">\$</span>name!<span style=\"color: #008000;\">\"</span>)<br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\">else</span><br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Hallo</span> <span style=\"color: #0000ff;\">\$</span>name<span style=\"color: #008000;\">.\"</span>)<br />&nbsp;&nbsp;&nbsp; }<br />&nbsp;&nbsp;&nbsp; gratulieren(<span style=\"color: #008000;\">\"Mama\"</span>, <span style=\"color: #0000ff;\">true</span>)<br />}</p>"
        text_gross.text = Html.fromHtml(text1)

/*        val text2 = "<p><span style=\"color: #333333;\"><strong>Lizenznachweise f&uuml;r Abbildungen</strong></span></p>\n" +
                "<p><span style=\"color: #333333;\">Aus den folgenden Quellen wurden Grafiken verwendet, welche nicht ver&auml;ndert wurden. Vielen Dank an die Urheber.</span></p>\n" +
                "<ul>\n" +
                "<li><span style=\"color: #333333;\">https://en.wikipedia.org/wiki/File:Black_book_icon.svg Urheber: Waldir</span></li>\n" +
                "<li><span style=\"color: #333333;\">https://thenounproject.com/term/logical-and/1348085/&nbsp;Urheber:&nbsp;Swen-Peter Ekkebus<span class=\"uploader-location\">, NL</span>&nbsp; </span></li>\n" +
                "<li><span style=\"color: #333333;\">https://thenounproject.com/term/loop/1073738/ Urheber:&nbsp;Setyo Ari Wibowo<span class=\"uploader-location\">, ID</span>&nbsp; </span></li>\n" +
                "<li><span style=\"color: #333333;\">https://thenounproject.com/term/curly-brackets-sheet/627491/ Urheber: Linseed Studio<span class=\"uploader-location\">, US</span>&nbsp;<br /></span></li>\n" +
                "<li><span style=\"color: #333333;\">https://thenounproject.com/term/category/698608/&nbsp;Urheber: Ricardo Cardoso<span class=\"uploader-location\">, PT</span>&nbsp;<br /></span></li>\n" +
                "<li><span style=\"color: #333333;\">https://thenounproject.com/term/safety/349197/ Urheber: Alexandr Cherkinsky<span class=\"uploader-location\">, RU</span>&nbsp;</span></li>\n" +
                "</ul>"
        text_klein.text = Html.fromHtml(text2)*/


    }
}