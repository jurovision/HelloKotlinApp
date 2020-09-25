
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

class Info_usage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text1 = "<p><strong>Hinweise zur Benutzung von HelloKotlin</strong></p>\n" +
                "<p>Sch&ouml;n, dass du HelloKotlin benutzt! Damit du die App problemlos und ohne Verwirrung nutzen kannst, beachte bitte folgende Hinweise:</p>\n" +
                "<ul>\n" +
                "<li>HelloKotlin ist gedacht f&uuml;r Leute, die schon erste Erfahrungen in einer Programmiersprache haben. Wenn du diese nicht hast, ist die App wahrscheinlich nicht das Richtige f&uuml;r dich.</li>\n" +
                "<li>Die Lektionen sind dazu gedacht, in einem Durchgang gel&ouml;st zu werden. Dein Fortschritt wird nicht gespeichert. Falls du deine Sitzung unterbrechen musst, gehe sp&auml;ter einfach wieder dahin, wo du zuletzt aufgeh&ouml;rt hast.</li>\n" +
                "<li>Um Codefragmente in den entsprechenden Aufgaben zu verschieben, musst du sie erst einen Moment gedr&uuml;ckt halten, bis sie grau werden.</li>\n" +
                "<li>HelloKotlin wurde optimiert f&uuml;r Ger&auml;te mit einer Aufl&ouml;sung von 768 x 1280 bis 1080 mal 2340 Pixeln, die eine kleine oder normale Anzeigengr&ouml;&szlig;e verwenden. Sollte die App nicht richtig dargestellt werden, verringere bitte die Vergr&ouml;&szlig;erung deiner Anzeige.</li>\n" +
                "</ul>\n" +
                "<p>Viel Spa&szlig; bei deinen ersten Schritten in Kotlin!</p>"
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