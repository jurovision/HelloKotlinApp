
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

        import com.hellokotlin.hellokotlin.R;

public class F_DD_5_12_wrong extends Fragment {

    public F_DD_5_12_wrong() {
    }


    TextView textview;
    String text = "<p><span style=\"color: #ff0000;\">Nicht ganz.</span> Nur <strong>zwischen</strong> den geschwungenen Klammern der Schleife k&ouml;nnen wir <em><strong>zahl</strong> </em>hier bedenkenlos benutzen.</p>";
    Button textview_button;
    String text_button = "Weiter";
    TextView progressText;
    String progress = "12 / 15";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerListAdapter3.STRINGS3[0] = "<p><span style=\"color: #0000ff;\">for</span> (zahl in <span style=\"color: #3366ff;\">1</span>..<span style=\"color: #3366ff;\">4</span>){</p>";
        RecyclerListAdapter3.STRINGS3[1] = "<p><em><span style=\"color: #003300;\">&nbsp;&nbsp;&nbsp; println</span></em>(zahl)</p>";
        RecyclerListAdapter3.STRINGS3[2] ="<p><span style=\"color: #003300;\">}</span></p>";



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
                NavHostFragment.findNavController(F_DD_5_12_wrong.this)
                        .navigate(R.id.action_f_DD_5_12_wrong_to_t_5_13);
            }

        });

    }


}