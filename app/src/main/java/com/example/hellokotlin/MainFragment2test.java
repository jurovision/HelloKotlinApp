package com.example.hellokotlin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainFragment2test extends Fragment {

    public MainFragment2test() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerListAdapter.STRINGS[0] = "<li><strong>Drei</strong></li>\n";
        RecyclerListAdapter.resetIntArray();




        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerListAdapter adapter = new RecyclerListAdapter();
        recyclerView.setAdapter(adapter);

        ItemTouchHelper.Callback callback =
                new SimpleItemTouchHelperCallback(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);


        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (RecyclerListAdapter.AnswerCheck0() == 2) {
                    NavHostFragment.findNavController(MainFragment2test.this)
                            .navigate(R.id.action_mainFragment2test_to_fragmentFirstCorrect);
                } else {
                    NavHostFragment.findNavController(MainFragment2test.this)
                            .navigate(R.id.action_mainFragment2test_to_fragmentFirstWrong);
                }
            }
        });

    }


}
