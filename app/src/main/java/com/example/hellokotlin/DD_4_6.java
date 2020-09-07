

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
        import android.widget.ProgressBar;
        import android.widget.TextView;

        import androidx.fragment.app.Fragment;
        import androidx.navigation.fragment.NavHostFragment;
        import androidx.recyclerview.widget.ItemTouchHelper;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

public class DD_4_6 extends Fragment {

    public DD_4_6() {
    }

    TextView textview;
    String text = "Kannst du die Fragmente so anordnen, dass der Code ausführbar und sinnvoll ist?";

    //Progress Text
    TextView progressText;
    String progress = "6 / 16";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter4.STRINGS[2] = "<p><span style=\"color: #0000ff;\">if</span>(tag==toms_geburtstag)</p>";
        RecyclerListAdapter4.STRINGS[0] = "<p>&nbsp;&nbsp;&nbsp; <em><span style=\"color: #003300;\">println</span></em>(<span style=\"color: #008000;\">\"Alles Gute zum Geburtstag\"</span>)</p>";
        RecyclerListAdapter4.STRINGS[1] ="<p><span style=\"color: #0000ff;\">else</span></p>";
        RecyclerListAdapter4.STRINGS[3] ="<p>&nbsp;&nbsp;&nbsp; <span style=\"color: #003300;\"><em>println</em></span>(<span style=\"color: #008000;\">\"Hallo Tom.\"</span>)</p>";




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

        RecyclerListAdapter4 adapter = new RecyclerListAdapter4();
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
                        RecyclerListAdapter4.INTS[0] == 2  &&
                                RecyclerListAdapter4.INTS[1] == 0  &&
                                RecyclerListAdapter4.INTS[2] == 1  &&
                                RecyclerListAdapter4.INTS[3] == 3

                ) {
                    RecyclerListAdapter4.resetIntArray();
                    NavHostFragment.findNavController(DD_4_6.this)
                            .navigate(R.id.action_DD_4_6_to_f_DD_4_7_right);
                } else {
                    RecyclerListAdapter4.resetIntArray();
                    NavHostFragment.findNavController(DD_4_6.this)
                            .navigate(R.id.action_DD_4_6_to_f_DD_4_7_wrong);
                }
            }
        });

    }


}
