
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

public class DD_3_11 extends Fragment {

    public DD_3_11() {
    }

    TextView textview;
    String text = "Wie musst du die Codefragmente anordnen, damit d den Wert \"true\" erhält?";

    TextView progressText;
    String progress = "10 / 13";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter4.STRINGS[1] = "<p><span style=\"color: #0000ff;\">var</span> a = <span style=\"color: #0000ff;\">false</span><br /><span style=\"color: #0000ff;\">var</span> b = <span style=\"color: #0000ff;\">true</span><br /><span style=\"color: #0000ff;\">var</span> c = <span style=\"color: #0000ff;\">false</span><br /><span style=\"color: #0000ff;\">var </span>d = <span style=\"color: #0000ff;\">false</span></p>";
        RecyclerListAdapter4.STRINGS[0] = "<p>b = !a<br />a = !a</p>";
        RecyclerListAdapter4.STRINGS[3] ="<p>c = a and b</p>";
        RecyclerListAdapter4.STRINGS[2] ="<p>d = a and b and c</p>";




        // Text ändern Teil 1
        View view = inflater.inflate(R.layout.fragment_drag_and_drop,
                container, false);
        textview = (TextView) view.findViewById(R.id.dd_text);
        changeTextProperties(text);

        // Progress Text ändern Teil 1
        progressText = (TextView) view.findViewById(R.id.progress);
        changeProgress(progress);

        return view;


    }

    // Text ändern Teil 2
    public void changeTextProperties(String text)
    {
        textview.setText(Html.fromHtml(text));
    }
    // Progress Text ändern Teil 2
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

        ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        view.findViewById(R.id.button_forward_dd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (
                        RecyclerListAdapter4.INTS[0] == 1  &&
                                RecyclerListAdapter4.INTS[1] == 0  &&
                                RecyclerListAdapter4.INTS[2] == 3  &&
                                RecyclerListAdapter4.INTS[3] == 2

                ) {
                    RecyclerListAdapter4.resetIntArray();
                    NavHostFragment.findNavController(DD_3_11.this)
                            .navigate(R.id.action_DD_3_11_to_f_DD_3_12_right);
                } else {
                    RecyclerListAdapter4.resetIntArray();
                    NavHostFragment.findNavController(DD_3_11.this)
                            .navigate(R.id.action_DD_3_11_to_f_DD_3_12_wrong);
                }
            }
        });

    }


}