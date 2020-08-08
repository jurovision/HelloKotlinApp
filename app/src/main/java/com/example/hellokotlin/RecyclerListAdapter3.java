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

import android.graphics.Color;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*import co.paulburke.android.itemtouchhelperdemo.helper.ItemTouchHelperAdapter;
import co.paulburke.android.itemtouchhelperdemo.helper.ItemTouchHelperViewHolder;*/

/*
 * @author Paul Burke (ipaulpro)
 */
public class RecyclerListAdapter3 extends RecyclerView.Adapter<RecyclerListAdapter3.ItemViewHolder>
        implements ItemTouchHelperAdapter {

    public static String[] STRINGS3 = new String[]{
            "One", "Two", "Three"
    };

    public static Integer[] INTS3 = new Integer[]{
            0,1,2
    };

    public static void resetIntArray(){
        INTS3[0] = 0;
        INTS3[1] = 1;
        INTS3[2] = 2;
    }
    // Hier weitermachen

    private final List<String> mItems = new ArrayList<>();
    public static List<Integer> mAnswers3 = new ArrayList<>();


    public RecyclerListAdapter3() {
        mItems.addAll(Arrays.asList(STRINGS3));
        mAnswers3.addAll(Arrays.asList(INTS3));
    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {
        holder.textView.setText(Html.fromHtml(mItems.get(position)));
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        String prev = mItems.remove(fromPosition);
        mItems.add(toPosition > fromPosition ? toPosition - 1 : toPosition, prev);
        notifyItemMoved(fromPosition, toPosition);
        // Integer Feld auch vertauschen, zur einfacheren Kontrolle der Reihenfolge der Antworten
        Integer tempNum = INTS3[toPosition];
        INTS3[toPosition] = INTS3[fromPosition];
        INTS3[fromPosition] = tempNum;
 /*       Integer prevInt = mAnswers.remove(fromPosition);
        mAnswers.add(toPosition > fromPosition ? toPosition - 1 : toPosition, prevInt);
        notifyItemMoved(fromPosition, toPosition);
        System.out.println("ArrayList in Reihenfolge: " + mAnswers.get(0) + " " + mAnswers.get(1) + " " + mAnswers.get(2) + " " + mAnswers.get(3));*/
/*
        System.out.println("Int Array in Reihenfolge: " + INTS[0] + " " + INTS[1]  + " " + INTS[2] + " " + INTS[3]);
*/

    }


    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder implements
            ItemTouchHelperViewHolder {

        public final TextView textView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView;
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }
    }
}