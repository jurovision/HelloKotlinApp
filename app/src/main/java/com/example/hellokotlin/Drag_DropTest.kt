package com.example.hellokotlin

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView
import kotlinx.android.synthetic.main.fragment_instruction.*


class Drag_DropTest: AppCompatActivity() {

    private lateinit var dragDropAdapter: DragDropAdapter
    private var itemsList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_drag_and_drop)

        createFakeItems()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView(){
        dragDropAdapter = DragDropAdapter(itemsList)
        val myList: DragDropSwipeRecyclerView = findViewById(R.id.list)
        myList.layoutManager = LinearLayoutManager(this)
        myList.adapter = dragDropAdapter
        myList.orientation = DragDropSwipeRecyclerView.ListOrientation.VERTICAL_LIST_WITH_VERTICAL_DRAGGING
        myList.reduceItemAlphaOnSwiping = true

        // val onItemSwipeListener
    }

    private fun createFakeItems(){
        for (i in 0..4)
            itemsList.add("item $i")
    }

    private fun fabAddItem(){

    }
}
