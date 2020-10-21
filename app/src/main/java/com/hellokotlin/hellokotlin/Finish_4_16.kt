
package com.hellokotlin.hellokotlin

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_chapter_finish.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Finish_4_16 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_finish_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chapter = "4 - Bedingungen und Arrays"
        val text = "<p>Gut gemacht, du hast <span style=\"color: #339966;\"><strong>Kapitel</strong> <strong>$chapter</strong> </span>abgeschlossen! Du kannst direkt den Kotlin Editor &ouml;ffnen und Arrays und Bedingungen ausprobieren. Erstelle beispielsweise ein Array mit den Charakteren aus deiner Lieblingsserie oder verzweigte Bedingungen daf&uuml;r, was du an einem sonnigen Tag machst, w&auml;hrend dein Elektroauto 2 Stunden laden muss \uD83D\uDE09&nbsp; </p>"
        instruction.text = Html.fromHtml(text)

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_finish_4_16_to_FirstFragment)
        }
    }
}