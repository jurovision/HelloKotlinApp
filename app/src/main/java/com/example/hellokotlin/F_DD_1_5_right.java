package com.example.hellokotlin;

/*
 * Copyright (C) 2015 Paul Burke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class F_DD_1_5_right extends Fragment {

    public F_DD_1_5_right() {
    }


    TextView textview;
    String text = "<p><span style=\"color: #008000;\">Richtig.</span> Wir m&uuml;ssen nat&uuml;rlich zuerst die<strong> variable <em>var</em> anlegen</strong>, bevor wir sie ausgeben k&ouml;nnen. Au&szlig;erdem beginnt das Programm immer mit <strong><em>fun main</em></strong> und der Code muss zwischen den geschwungenen Klammern <em><strong>{</strong></em>...<em><strong>}</strong></em> stehen.</p>";
    Button textview_button;
    String text_button = "Weiter";

    //Progress Text
    TextView progressText;
    String progress = "5 / 15";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter4.STRINGS[0] = "<p><span style=\"color: #0000ff;\">fun</span> " +
                "main(<span style=\"color: #808080;\">args: Array&lt;String&gt;</span>) {</p>";
        RecyclerListAdapter4.STRINGS[1] = "<p>&nbsp;&nbsp;&nbsp; <span style=\"color: #0000ff;\"" +
                ">var</span> <span style=\"text-decoration: underline;\">gruss</span> = <span style=\"color: #008000;\">\"Moin\"</span></p>";
        RecyclerListAdapter4.STRINGS[2] ="<div style=\"-en-clipboard: true;\">&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(gruss)</div>";
        RecyclerListAdapter4.STRINGS[3] ="<p><span style=\"color: #000000;\">}</span><br /></span></p>";



        //return inflater.inflate(R.layout.fragment_drag_and_drop, container, false);

        // Versuch, Text zu ändern
        View view = inflater.inflate(R.layout.fragment_drag_and_drop,
                container, false);
        textview = (TextView) view.findViewById(R.id.dd_text);
        textview_button = (Button) view.findViewById(R.id.button_forward_dd);
        changeTextProperties(text);
        changeTextProperties_button(text_button);

        //Progress Text
        progressText = (TextView) view.findViewById(R.id.progress);
        changeProgress(progress);

        return view;


    }

    // Text ändern
    public void changeTextProperties(String text)
    {
        textview.setText(Html.fromHtml(text));
    }
    public void changeTextProperties_button(String text_button) { textview_button.setText(text_button); }
    //Progress Text
    public void changeProgress(String progress)
    {
        progressText.setText(progress);
    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerListAdapter4 adapter = new RecyclerListAdapter4();
        recyclerView.setAdapter(adapter);

        //Itemrouchhelper Funktionen auskommentieren, um drag & drop zu deaktivieren
  /*      ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);*/

        view.findViewById(R.id.button_forward_dd).setOnClickListener(new View.OnClickListener() {
            // korrekte reihenfolge: 1,2,3,0
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(F_DD_1_5_right.this)
                        .navigate(R.id.action_f_DD_1_5_right_to_i_1_6);
            }
        });

    }


}