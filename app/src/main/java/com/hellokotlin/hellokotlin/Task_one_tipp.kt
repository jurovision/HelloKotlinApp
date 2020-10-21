package com.hellokotlin.hellokotlin


import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class Task_one_tipp : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p>Tipps:</p>\n" +
                "<ul>\n" +
                "<li>Du kannst diese Aufgabe mit einer einzigen \"if-else\" Bedingung l&ouml;sen</li>\n" +
                "<li>Mittels <em>if(beispielBoolean)</em> kannst du eine Anweisung ausf&uuml;hren, wenn der Boolsche Wert wahr ist</li>\n" +
                "</ul>"
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