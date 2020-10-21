

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
class Finish_3_13 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chapter_finish, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val chapter = "3 - Boolsche Variablen"
        val text = "<p>Herzlichen Gl&uuml;ckwunsch, du hast <span style=\"color: #339966;\"><strong>Kapitel</strong> <strong>$chapter</strong> </span>abgeschlossen!</p>"
        instruction.text = Html.fromHtml(text)

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            findNavController().navigate(R.id.action_finish_3_13_to_FirstFragment)
        }
    }
}