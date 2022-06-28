package com.approxsoft.routinemanagement.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.approxsoft.routinemanagement.R;
import com.approxsoft.routinemanagement.RoutineFile.ShowRoutine;

public class RoutineShowActivity extends AppCompatActivity {

    RecyclerView routineView;
    TextView timeA, timeB, timeC, timeD, timeE, timeF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine_show);

        timeA = findViewById(R.id.a_time);
        timeB = findViewById(R.id.b_time);
        timeC = findViewById(R.id.c_time);
        timeD = findViewById(R.id.d_time);
        timeE = findViewById(R.id.e_time);
        timeF = findViewById(R.id.f_time);

        routineView = findViewById(R.id.routine_view);
        routineView.setHasFixedSize(true);
        LinearLayoutManager routine = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        routine.setReverseLayout(true);
        routine.setStackFromEnd(true);
        routineView.setLayoutManager(routine);

        ShowRoutine.showRoutine(timeA, timeB, timeC, timeD, timeE, timeF,routineView);


    }
}