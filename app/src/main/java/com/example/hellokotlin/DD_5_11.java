
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
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DD_5_11 extends Fragment {

    public DD_5_11() {
    }

    TextView textview;
    String text = "<p>Die <strong>Variable</strong>, mit der wir durch die Werte iterieren, kann aber nur <strong>innerhalb</strong> der Schleife benutzt werden. Kannst du den Code entsprechend anordnen?</p>";
    //Progress Text
    TextView progressText;
    String progress = "11 / 15";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter3.STRINGS3[1] = "<p><span style=\"color: #0000ff;\">for</span> (zahl in <span style=\"color: #3366ff;\">1</span>..<span style=\"color: #3366ff;\">4</span>){</p>";
        RecyclerListAdapter3.STRINGS3[0] = "<p><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(zahl)</p>";
        RecyclerListAdapter3.STRINGS3[2] ="<p><span style=\"color: #003300;\">}</span></p>";




        //return inflater.inflate(R.layout.fragment_drag_and_drop, container, false);

        // Versuch, Text zu ändern
        View view = inflater.inflate(R.layout.fragment_drag_and_drop,
                container, false);
        textview = (TextView) view.findViewById(R.id.dd_text);
        changeTextProperties(text);

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

        RecyclerListAdapter3 adapter = new RecyclerListAdapter3();
        recyclerView.setAdapter(adapter);

        //Itemrouchhelper Funktionen auskommentieren, um drag & drop zu deaktivieren
        ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        view.findViewById(R.id.button_forward_dd).setOnClickListener(new View.OnClickListener() {
            // korrekte reihenfolge: 1,2,3,0
            @Override
            public void onClick(View view) {
                if (
                        RecyclerListAdapter3.INTS3[0] == 1  &&
                                RecyclerListAdapter3.INTS3[1] == 0  &&
                                RecyclerListAdapter3.INTS3[2] == 2

                ) {
                    RecyclerListAdapter3.resetIntArray();
                    NavHostFragment.findNavController(DD_5_11.this)
                            .navigate(R.id.action_DD_5_11_to_f_DD_5_12_right);
                } else {
                    RecyclerListAdapter3.resetIntArray();
                    NavHostFragment.findNavController(DD_5_11.this)
                            .navigate(R.id.action_DD_5_11_to_f_DD_5_12_wrong);
                }
            }
        });

    }


}