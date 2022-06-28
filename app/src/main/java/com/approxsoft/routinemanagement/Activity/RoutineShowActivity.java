package com.approxsoft.routinemanagement.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.approxsoft.routinemanagement.R;

public class RoutineShowActivity extends AppCompatActivity {

    RecyclerView routineView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_show);

        routineView = findViewById(R.id.routine_view);
        routineView.setHasFixedSize(true);
        LinearLayoutManager routine = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        routine.setReverseLayout(true);
        routine.setStackFromEnd(true);
        routineView.setLayoutManager(routine);
    }
}