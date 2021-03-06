
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
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DD_1_13 extends Fragment {

    public DD_1_13() {
    }

    TextView textview;
    String text = "Mittels // können einzeilige Kommentare im Code untergebracht werden. So " +
            "können wir unseren Code später besser verstehen. Kannst du die Fragmente anhand der Kommentare anordnen?";

    TextView progressText;
    String progress = "13 / 15";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter3.STRINGS3[0] = "<div style=\"-en-clipboard: true;\"><span style=\"color: #003300;\"><em>println</em></span>(a2) <span style=\"color: #808080;\">// Schritt 3</span></div>";
        RecyclerListAdapter3.STRINGS3[2] = "<p><span style=\"color: #0000ff;\">var</span> a1 = " +
                "<span style=\"color: #3366ff;\">40</span> + <span style=\"color: #3366ff;\">5</span> " +
                "<span style=\"color: #808080;\">// Schritt 1</span></p> ";
        RecyclerListAdapter3.STRINGS3[1] ="<div style=\"-en-clipboard: true;\"><span style=\"color:" +
                " #0000ff;\">var</span> a2 = a1+ <span style=\"color: #3366ff;\">44</span> <span style=\"" +
                "color: #808080;\">// Schritt 2</span></div>";




        // Text ändern Teil 1
        View view = inflater.inflate(R.layout.fragment_drag_and_drop,
                container, false);
        textview = (TextView) view.findViewById(R.id.dd_text);
        changeTextProperties(text);

        //Progress Text ändern Teil 1
        progressText = (TextView) view.findViewById(R.id.progress);
        changeProgress(progress);

        return view;


    }

    // Text ändern Teil 2
    public void changeTextProperties(String text)
    {
        textview.setText(Html.fromHtml(text));
    }
    //Progress Text ändern Teil 2
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

        ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        view.findViewById(R.id.button_forward_dd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (
                        RecyclerListAdapter3.INTS3[0] == 2  &&
                        RecyclerListAdapter3.INTS3[1] == 1  &&
                        RecyclerListAdapter3.INTS3[2] == 0

                ) {
                    RecyclerListAdapter3.resetIntArray();
                    NavHostFragment.findNavController(DD_1_13.this)
                            .navigate(R.id.action_DD_1_10_to_f_DD_1_11_right);
                } else {
                    RecyclerListAdapter3.resetIntArray();
                    NavHostFragment.findNavController(DD_1_13.this)
                            .navigate(R.id.action_DD_1_10_to_f_DD_1_11_wrong);
                }
            }
        });

    }


}