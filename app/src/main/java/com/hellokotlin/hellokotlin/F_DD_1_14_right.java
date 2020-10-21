package com.hellokotlin.hellokotlin;

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

public class F_DD_1_14_right extends Fragment {

    public F_DD_1_14_right() {
    }


    TextView textview;
    String text = "<div style=\"-en-clipboard: true;\"><span style=\"color: #008000;\">Gut" +
            " abgelesen</span> \uD83D\uDE09 Weil wir Variable a1 erst <strong>anlegen</strong> " +
            "m&uuml;ssen, bevor wir sie in a2 <strong>verwenden</strong> und dann das <strong>" +
            "Ergebnis ausgeben</strong>, stimmt nur diese Reihenfolge. Mehrere Zeilen kannst du " +
            "&uuml;brigens mit <strong>/*</strong> ... <strong>*/</strong> auskommentieren.</div>";
    Button textview_button;
    String text_button = "Weiter";
    TextView progressText;
    String progress = "14 / 15";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter3.STRINGS3[1] = "<p>gruss = <span style=\"color: #008000;\">\"Guten Abend.\"</span></p>";
        RecyclerListAdapter3.STRINGS3[0] = "<p><span style=\"color: #0000ff;\">var</span> gruss= <span style=\"color: #008000;\">\"Guten Morgen!\"</span><br /><br /></p>";
        RecyclerListAdapter3.STRINGS3[2] ="<p><em><span style=\"color: #003300;\">println</span></em>(gruss)</p>";


        // Text ändern Teil 1
        View view = inflater.inflate(R.layout.fragment_drag_and_drop,
                container, false);
        textview = (TextView) view.findViewById(R.id.dd_text);
        textview_button = (Button) view.findViewById(R.id.button_forward_dd);
        changeTextProperties(text);
        changeTextProperties_button(text_button);

        progressText = (TextView) view.findViewById(R.id.progress);
        changeProgress(progress);

        return view;


    }

    // Text ändern Teil 2
    public void changeTextProperties(String text)
    {
        textview.setText(Html.fromHtml(text));
    }
    public void changeTextProperties_button(String text_button) { textview_button.setText(text_button); }
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

        RecyclerListAdapter3 adapter = new RecyclerListAdapter3();
        recyclerView.setAdapter(adapter);

        //Itemrouchhelper Funktionen auskommentieren, um drag & drop zu deaktivieren
  /*      ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);*/

        view.findViewById(R.id.button_forward_dd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(F_DD_1_14_right.this)
                        .navigate(R.id.action_f_DD_1_11_right_to_finish_1_15);
            }

        });

    }


}