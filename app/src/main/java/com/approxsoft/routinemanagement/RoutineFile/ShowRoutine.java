package com.approxsoft.routinemanagement.RoutineFile;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.approxsoft.routinemanagement.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class ShowRoutine {
    static DatabaseReference routineReference = FirebaseDatabase.getInstance().getReference();

    public static void showRoutine(RecyclerView routineView,TextView timeA, TextView timeB, TextView timeC, TextView timeD, TextView timeE, TextView timeF){

        routineReference.child("Department Of CSE And CSIT").child("Routine").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot)
            {
                if (snapshot.hasChild("Time"))
                {
                    String t1 = Objects.requireNonNull(snapshot.child("Time").child("aTime").getValue()).toString();
                    String t2 = Objects.requireNonNull(snapshot.child("Time").child("bTime").getValue()).toString();
                    String t3 = Objects.requireNonNull(snapshot.child("Time").child("cTime").getValue()).toString();
                    String t4 = Objects.requireNonNull(snapshot.child("Time").child("dTime").getValue()).toString();
                    String t5 = Objects.requireNonNull(snapshot.child("Time").child("eTime").getValue()).toString();
                    String t6 = Objects.requireNonNull(snapshot.child("Time").child("fTime").getValue()).toString();


                    timeA.setText(t1);
                    timeB.setText(t2);
                    timeC.setText(t3);
                    timeD.setText(t4);
                    timeE.setText(t5);
                    timeF.setText(t6);



                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        DisplayAllRoutineRecords(routineView);


    }


    private static void DisplayAllRoutineRecords(RecyclerView routineView) {

        Query query = routineReference.child("Department Of CSE And CSIT").child("Routine").orderByChild("count")
                .startAt("").endAt("" + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<RoutineData> options = new FirebaseRecyclerOptions.Builder<RoutineData>().setQuery(query, RoutineData.class).build();

        FirebaseRecyclerAdapter<RoutineData, RoutineRecordViewHolder> adapter = new FirebaseRecyclerAdapter<RoutineData, RoutineRecordViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final RoutineRecordViewHolder routineRecordViewHolder, final int position, @NonNull final RoutineData routineData) {

                String usersIDs = getRef(position).getKey();


                assert usersIDs != null;
                routineReference.child("Department Of CSE And CSIT").child("Routine").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot)
                    {
                        if (snapshot.exists()) {

                            //----------- FOR 1ST SEMESTER-----------/

                            String a1c = Objects.requireNonNull(snapshot.child("A1C").getValue()).toString();
                            String b1c = Objects.requireNonNull(snapshot.child("B1C").getValue()).toString();
                            String c1c = Objects.requireNonNull(snapshot.child("C1C").getValue()).toString();
                            String d1c = Objects.requireNonNull(snapshot.child("D1C").getValue()).toString();
                            String e1c = Objects.requireNonNull(snapshot.child("E1C").getValue()).toString();
                            String f1c = Objects.requireNonNull(snapshot.child("F1C").getValue()).toString();

                            String a1t = Objects.requireNonNull(snapshot.child("A1T").getValue()).toString();
                            String b1t = Objects.requireNonNull(snapshot.child("B1T").getValue()).toString();
                            String c1t = Objects.requireNonNull(snapshot.child("C1T").getValue()).toString();
                            String d1t = Objects.requireNonNull(snapshot.child("D1T").getValue()).toString();
                            String e1t = Objects.requireNonNull(snapshot.child("E1T").getValue()).toString();
                            String f1t = Objects.requireNonNull(snapshot.child("F1T").getValue()).toString();

                            String a1r = Objects.requireNonNull(snapshot.child("A1R").getValue()).toString();
                            String b1r = Objects.requireNonNull(snapshot.child("B1R").getValue()).toString();
                            String c1r = Objects.requireNonNull(snapshot.child("C1R").getValue()).toString();
                            String d1r = Objects.requireNonNull(snapshot.child("D1R").getValue()).toString();
                            String e1r = Objects.requireNonNull(snapshot.child("E1R").getValue()).toString();
                            String f1r = Objects.requireNonNull(snapshot.child("F1R").getValue()).toString();

                            routineRecordViewHolder.ac1.setText(a1c);
                            routineRecordViewHolder.bc1.setText(b1c);
                            routineRecordViewHolder.cc1.setText(c1c);
                            routineRecordViewHolder.dc1.setText(d1c);
                            routineRecordViewHolder.ec1.setText(e1c);
                            routineRecordViewHolder.fc1.setText(f1c);

                            routineRecordViewHolder.at1.setText(a1t+"  ("+a1r+")");
                            routineRecordViewHolder.bt1.setText(b1t+"  ("+b1r+")");
                            routineRecordViewHolder.ct1.setText(c1t+"  ("+c1r+")");
                            routineRecordViewHolder.dt1.setText(d1t+"  ("+d1r+")");
                            routineRecordViewHolder.et1.setText(e1t+"  ("+e1r+")");
                            routineRecordViewHolder.ft1.setText(f1t+"  ("+f1r+")");

                              //----------- FOR 2ND SEMESTER-----------/

                            String a2c = Objects.requireNonNull(snapshot.child("A2C").getValue()).toString();
                            String b2c = Objects.requireNonNull(snapshot.child("B2C").getValue()).toString();
                            String c2c = Objects.requireNonNull(snapshot.child("C2C").getValue()).toString();
                            String d2c = Objects.requireNonNull(snapshot.child("D2C").getValue()).toString();
                            String e2c = Objects.requireNonNull(snapshot.child("E2C").getValue()).toString();
                            String f2c = Objects.requireNonNull(snapshot.child("F2C").getValue()).toString();

                            String a2t = Objects.requireNonNull(snapshot.child("A2T").getValue()).toString();
                            String b2t = Objects.requireNonNull(snapshot.child("B2T").getValue()).toString();
                            String c2t = Objects.requireNonNull(snapshot.child("C2T").getValue()).toString();
                            String d2t = Objects.requireNonNull(snapshot.child("D2T").getValue()).toString();
                            String e2t = Objects.requireNonNull(snapshot.child("E2T").getValue()).toString();
                            String f2t = Objects.requireNonNull(snapshot.child("F2T").getValue()).toString();

                            String a2r = Objects.requireNonNull(snapshot.child("A2R").getValue()).toString();
                            String b2r = Objects.requireNonNull(snapshot.child("B2R").getValue()).toString();
                            String c2r = Objects.requireNonNull(snapshot.child("C2R").getValue()).toString();
                            String d2r = Objects.requireNonNull(snapshot.child("D2R").getValue()).toString();
                            String e2r = Objects.requireNonNull(snapshot.child("E2R").getValue()).toString();
                            String f2r = Objects.requireNonNull(snapshot.child("F2R").getValue()).toString();

                            routineRecordViewHolder.ac2.setText(a2c);
                            routineRecordViewHolder.bc2.setText(b2c);
                            routineRecordViewHolder.cc2.setText(c2c);
                            routineRecordViewHolder.dc2.setText(d2c);
                            routineRecordViewHolder.ec2.setText(e2c);
                            routineRecordViewHolder.fc2.setText(f2c);

                            routineRecordViewHolder.at2.setText(a2t+"  ("+a2r+")");
                            routineRecordViewHolder.bt2.setText(b2t+"  ("+b2r+")");
                            routineRecordViewHolder.ct2.setText(c2t+"  ("+c2r+")");
                            routineRecordViewHolder.dt2.setText(d2t+"  ("+d2r+")");
                            routineRecordViewHolder.et2.setText(e2t+"  ("+e2r+")");
                            routineRecordViewHolder.ft2.setText(f2t+"  ("+f2r+")");


                            //----------- FOR 3RD SEMESTER-----------/

                            String a3c = Objects.requireNonNull(snapshot.child("A3C").getValue()).toString();
                            String b3c = Objects.requireNonNull(snapshot.child("B3C").getValue()).toString();
                            String c3c = Objects.requireNonNull(snapshot.child("C3C").getValue()).toString();
                            String d3c = Objects.requireNonNull(snapshot.child("D3C").getValue()).toString();
                            String e3c = Objects.requireNonNull(snapshot.child("E3C").getValue()).toString();
                            String f3c = Objects.requireNonNull(snapshot.child("F3C").getValue()).toString();

                            String a3t = Objects.requireNonNull(snapshot.child("A3T").getValue()).toString();
                            String b3t = Objects.requireNonNull(snapshot.child("B3T").getValue()).toString();
                            String c3t = Objects.requireNonNull(snapshot.child("C3T").getValue()).toString();
                            String d3t = Objects.requireNonNull(snapshot.child("D3T").getValue()).toString();
                            String e3t = Objects.requireNonNull(snapshot.child("E3T").getValue()).toString();
                            String f3t = Objects.requireNonNull(snapshot.child("F3T").getValue()).toString();

                            String a3r = Objects.requireNonNull(snapshot.child("A3R").getValue()).toString();
                            String b3r = Objects.requireNonNull(snapshot.child("B3R").getValue()).toString();
                            String c3r = Objects.requireNonNull(snapshot.child("C3R").getValue()).toString();
                            String d3r = Objects.requireNonNull(snapshot.child("D3R").getValue()).toString();
                            String e3r = Objects.requireNonNull(snapshot.child("E3R").getValue()).toString();
                            String f3r = Objects.requireNonNull(snapshot.child("F3R").getValue()).toString();

                            routineRecordViewHolder.ac3.setText(a3c);
                            routineRecordViewHolder.bc3.setText(b3c);
                            routineRecordViewHolder.cc3.setText(c3c);
                            routineRecordViewHolder.dc3.setText(d3c);
                            routineRecordViewHolder.ec3.setText(e3c);
                            routineRecordViewHolder.fc3.setText(f3c);

                            routineRecordViewHolder.at3.setText(a3t+"  ("+a3r+")");
                            routineRecordViewHolder.bt3.setText(b3t+"  ("+b3r+")");
                            routineRecordViewHolder.ct3.setText(c3t+"  ("+c3r+")");
                            routineRecordViewHolder.dt3.setText(d3t+"  ("+d3r+")");
                            routineRecordViewHolder.et3.setText(e3t+"  ("+e3r+")");
                            routineRecordViewHolder.ft3.setText(f3t+"  ("+f3r+")");


                            //----------- FOR 4TH SEMESTER-----------/

                            String a4c = Objects.requireNonNull(snapshot.child("A4C").getValue()).toString();
                            String b4c = Objects.requireNonNull(snapshot.child("B4C").getValue()).toString();
                            String c4c = Objects.requireNonNull(snapshot.child("C4C").getValue()).toString();
                            String d4c = Objects.requireNonNull(snapshot.child("D4C").getValue()).toString();
                            String e4c = Objects.requireNonNull(snapshot.child("E4C").getValue()).toString();
                            String f4c = Objects.requireNonNull(snapshot.child("F4C").getValue()).toString();

                            String a4t = Objects.requireNonNull(snapshot.child("A4T").getValue()).toString();
                            String b4t = Objects.requireNonNull(snapshot.child("B4T").getValue()).toString();
                            String c4t = Objects.requireNonNull(snapshot.child("C4T").getValue()).toString();
                            String d4t = Objects.requireNonNull(snapshot.child("D4T").getValue()).toString();
                            String e4t = Objects.requireNonNull(snapshot.child("E4T").getValue()).toString();
                            String f4t = Objects.requireNonNull(snapshot.child("F4T").getValue()).toString();

                            String a4r = Objects.requireNonNull(snapshot.child("A4R").getValue()).toString();
                            String b4r = Objects.requireNonNull(snapshot.child("B4R").getValue()).toString();
                            String c4r = Objects.requireNonNull(snapshot.child("C4R").getValue()).toString();
                            String d4r = Objects.requireNonNull(snapshot.child("D4R").getValue()).toString();
                            String e4r = Objects.requireNonNull(snapshot.child("E4R").getValue()).toString();
                            String f4r = Objects.requireNonNull(snapshot.child("F4R").getValue()).toString();

                            routineRecordViewHolder.ac4.setText(a4c);
                            routineRecordViewHolder.bc4.setText(b4c);
                            routineRecordViewHolder.cc4.setText(c4c);
                            routineRecordViewHolder.dc4.setText(d4c);
                            routineRecordViewHolder.ec4.setText(e4c);
                            routineRecordViewHolder.fc4.setText(f4c);

                            routineRecordViewHolder.at4.setText(a4t+"  ("+a4r+")");
                            routineRecordViewHolder.bt4.setText(b4t+"  ("+b4r+")");
                            routineRecordViewHolder.ct4.setText(c4t+"  ("+c4r+")");
                            routineRecordViewHolder.dt4.setText(d4t+"  ("+d4r+")");
                            routineRecordViewHolder.et4.setText(e4t+"  ("+e4r+")");
                            routineRecordViewHolder.ft4.setText(f4t+"  ("+f4r+")");



                            //----------- FOR 5TH SEMESTER-----------/

                            String a5c = Objects.requireNonNull(snapshot.child("A5C").getValue()).toString();
                            String b5c = Objects.requireNonNull(snapshot.child("B5C").getValue()).toString();
                            String c5c = Objects.requireNonNull(snapshot.child("C5C").getValue()).toString();
                            String d5c = Objects.requireNonNull(snapshot.child("D5C").getValue()).toString();
                            String e5c = Objects.requireNonNull(snapshot.child("E5C").getValue()).toString();
                            String f5c = Objects.requireNonNull(snapshot.child("F5C").getValue()).toString();

                            String a5t = Objects.requireNonNull(snapshot.child("A5T").getValue()).toString();
                            String b5t = Objects.requireNonNull(snapshot.child("B5T").getValue()).toString();
                            String c5t = Objects.requireNonNull(snapshot.child("C5T").getValue()).toString();
                            String d5t = Objects.requireNonNull(snapshot.child("D5T").getValue()).toString();
                            String e5t = Objects.requireNonNull(snapshot.child("E5T").getValue()).toString();
                            String f5t = Objects.requireNonNull(snapshot.child("F5T").getValue()).toString();

                            String a5r = Objects.requireNonNull(snapshot.child("A5R").getValue()).toString();
                            String b5r = Objects.requireNonNull(snapshot.child("B5R").getValue()).toString();
                            String c5r = Objects.requireNonNull(snapshot.child("C5R").getValue()).toString();
                            String d5r = Objects.requireNonNull(snapshot.child("D5R").getValue()).toString();
                            String e5r = Objects.requireNonNull(snapshot.child("E5R").getValue()).toString();
                            String f5r = Objects.requireNonNull(snapshot.child("F5R").getValue()).toString();

                            routineRecordViewHolder.ac5.setText(a5c);
                            routineRecordViewHolder.bc5.setText(b5c);
                            routineRecordViewHolder.cc5.setText(c5c);
                            routineRecordViewHolder.dc5.setText(d5c);
                            routineRecordViewHolder.ec5.setText(e5c);
                            routineRecordViewHolder.fc5.setText(f5c);

                            routineRecordViewHolder.at5.setText(a5t+"  ("+a5r+")");
                            routineRecordViewHolder.bt5.setText(b5t+"  ("+b5r+")");
                            routineRecordViewHolder.ct5.setText(c5t+"  ("+c5r+")");
                            routineRecordViewHolder.dt5.setText(d5t+"  ("+d5r+")");
                            routineRecordViewHolder.et5.setText(e5t+"  ("+e5r+")");
                            routineRecordViewHolder.ft5.setText(f5t+"  ("+f5r+")");


                            //----------- FOR 6TH SEMESTER-----------/

                            String a6c = Objects.requireNonNull(snapshot.child("A6C").getValue()).toString();
                            String b6c = Objects.requireNonNull(snapshot.child("B6C").getValue()).toString();
                            String c6c = Objects.requireNonNull(snapshot.child("C6C").getValue()).toString();
                            String d6c = Objects.requireNonNull(snapshot.child("D6C").getValue()).toString();
                            String e6c = Objects.requireNonNull(snapshot.child("E6C").getValue()).toString();
                            String f6c = Objects.requireNonNull(snapshot.child("F6C").getValue()).toString();

                            String a6t = Objects.requireNonNull(snapshot.child("A6T").getValue()).toString();
                            String b6t = Objects.requireNonNull(snapshot.child("B6T").getValue()).toString();
                            String c6t = Objects.requireNonNull(snapshot.child("C6T").getValue()).toString();
                            String d6t = Objects.requireNonNull(snapshot.child("D6T").getValue()).toString();
                            String e6t = Objects.requireNonNull(snapshot.child("E6T").getValue()).toString();
                            String f6t = Objects.requireNonNull(snapshot.child("F6T").getValue()).toString();

                            String a6r = Objects.requireNonNull(snapshot.child("A6R").getValue()).toString();
                            String b6r = Objects.requireNonNull(snapshot.child("B6R").getValue()).toString();
                            String c6r = Objects.requireNonNull(snapshot.child("C6R").getValue()).toString();
                            String d6r = Objects.requireNonNull(snapshot.child("D6R").getValue()).toString();
                            String e6r = Objects.requireNonNull(snapshot.child("E6R").getValue()).toString();
                            String f6r = Objects.requireNonNull(snapshot.child("F6R").getValue()).toString();

                            routineRecordViewHolder.ac6.setText(a6c);
                            routineRecordViewHolder.bc6.setText(b6c);
                            routineRecordViewHolder.cc6.setText(c6c);
                            routineRecordViewHolder.dc6.setText(d6c);
                            routineRecordViewHolder.ec6.setText(e6c);
                            routineRecordViewHolder.fc6.setText(f6c);

                            routineRecordViewHolder.at6.setText(a6t+"  ("+a6r+")");
                            routineRecordViewHolder.bt6.setText(b6t+"  ("+b6r+")");
                            routineRecordViewHolder.ct6.setText(c6t+"  ("+c6r+")");
                            routineRecordViewHolder.dt6.setText(d6t+"  ("+d6r+")");
                            routineRecordViewHolder.et6.setText(e6t+"  ("+e6r+")");
                            routineRecordViewHolder.ft6.setText(f6t+"  ("+f6r+")");

                            //----------- FOR 7TH SEMESTER-----------/

                            String a7c = Objects.requireNonNull(snapshot.child("A7C").getValue()).toString();
                            String b7c = Objects.requireNonNull(snapshot.child("B7C").getValue()).toString();
                            String c7c = Objects.requireNonNull(snapshot.child("C7C").getValue()).toString();
                            String d7c = Objects.requireNonNull(snapshot.child("D7C").getValue()).toString();
                            String e7c = Objects.requireNonNull(snapshot.child("E7C").getValue()).toString();
                            String f7c = Objects.requireNonNull(snapshot.child("F7C").getValue()).toString();

                            String a7t = Objects.requireNonNull(snapshot.child("A7T").getValue()).toString();
                            String b7t = Objects.requireNonNull(snapshot.child("B7T").getValue()).toString();
                            String c7t = Objects.requireNonNull(snapshot.child("C7T").getValue()).toString();
                            String d7t = Objects.requireNonNull(snapshot.child("D7T").getValue()).toString();
                            String e7t = Objects.requireNonNull(snapshot.child("E7T").getValue()).toString();
                            String f7t = Objects.requireNonNull(snapshot.child("F7T").getValue()).toString();

                            String a7r = Objects.requireNonNull(snapshot.child("A7R").getValue()).toString();
                            String b7r = Objects.requireNonNull(snapshot.child("B7R").getValue()).toString();
                            String c7r = Objects.requireNonNull(snapshot.child("C7R").getValue()).toString();
                            String d7r = Objects.requireNonNull(snapshot.child("D7R").getValue()).toString();
                            String e7r = Objects.requireNonNull(snapshot.child("E7R").getValue()).toString();
                            String f7r = Objects.requireNonNull(snapshot.child("F7R").getValue()).toString();

                            routineRecordViewHolder.ac7.setText(a7c);
                            routineRecordViewHolder.bc7.setText(b7c);
                            routineRecordViewHolder.cc7.setText(c7c);
                            routineRecordViewHolder.dc7.setText(d7c);
                            routineRecordViewHolder.ec7.setText(e7c);
                            routineRecordViewHolder.fc7.setText(f7c);

                            routineRecordViewHolder.at7.setText(a7t+"  ("+a7r+")");
                            routineRecordViewHolder.bt7.setText(b7t+"  ("+b7r+")");
                            routineRecordViewHolder.ct7.setText(c7t+"  ("+c7r+")");
                            routineRecordViewHolder.dt7.setText(d7t+"  ("+d7r+")");
                            routineRecordViewHolder.et7.setText(e7t+"  ("+e7r+")");
                            routineRecordViewHolder.ft7.setText(f7t+"  ("+f7r+")");

                            //----------- FOR 8TH SEMESTER-----------/

                            String a8c = Objects.requireNonNull(snapshot.child("A8C").getValue()).toString();
                            String b8c = Objects.requireNonNull(snapshot.child("B8C").getValue()).toString();
                            String c8c = Objects.requireNonNull(snapshot.child("C8C").getValue()).toString();
                            String d8c = Objects.requireNonNull(snapshot.child("D8C").getValue()).toString();
                            String e8c = Objects.requireNonNull(snapshot.child("E8C").getValue()).toString();
                            String f8c = Objects.requireNonNull(snapshot.child("F8C").getValue()).toString();

                            String a8t = Objects.requireNonNull(snapshot.child("A8T").getValue()).toString();
                            String b8t = Objects.requireNonNull(snapshot.child("B8T").getValue()).toString();
                            String c8t = Objects.requireNonNull(snapshot.child("C8T").getValue()).toString();
                            String d8t = Objects.requireNonNull(snapshot.child("D8T").getValue()).toString();
                            String e8t = Objects.requireNonNull(snapshot.child("E8T").getValue()).toString();
                            String f8t = Objects.requireNonNull(snapshot.child("F8T").getValue()).toString();

                            String a8r = Objects.requireNonNull(snapshot.child("A8R").getValue()).toString();
                            String b8r = Objects.requireNonNull(snapshot.child("B8R").getValue()).toString();
                            String c8r = Objects.requireNonNull(snapshot.child("C8R").getValue()).toString();
                            String d8r = Objects.requireNonNull(snapshot.child("D8R").getValue()).toString();
                            String e8r = Objects.requireNonNull(snapshot.child("E8R").getValue()).toString();
                            String f8r = Objects.requireNonNull(snapshot.child("F8R").getValue()).toString();

                            routineRecordViewHolder.ac8.setText(a8c);
                            routineRecordViewHolder.bc8.setText(b8c);
                            routineRecordViewHolder.cc8.setText(c8c);
                            routineRecordViewHolder.dc8.setText(d8c);
                            routineRecordViewHolder.ec8.setText(e8c);
                            routineRecordViewHolder.fc8.setText(f8c);

                            routineRecordViewHolder.at8.setText(a8t+"  ("+a8r+")");
                            routineRecordViewHolder.bt8.setText(b8t+"  ("+b8r+")");
                            routineRecordViewHolder.ct8.setText(c8t+"  ("+c8r+")");
                            routineRecordViewHolder.dt8.setText(d8t+"  ("+d8r+")");
                            routineRecordViewHolder.et8.setText(e8t+"  ("+e8r+")");
                            routineRecordViewHolder.ft8.setText(f8t+"  ("+f8r+")");

                            //----------- FOR 9TH SEMESTER-----------/

                            String a9c = Objects.requireNonNull(snapshot.child("A9C").getValue()).toString();
                            String b9c = Objects.requireNonNull(snapshot.child("B9C").getValue()).toString();
                            String c9c = Objects.requireNonNull(snapshot.child("C9C").getValue()).toString();
                            String d9c = Objects.requireNonNull(snapshot.child("D9C").getValue()).toString();
                            String e9c = Objects.requireNonNull(snapshot.child("E9C").getValue()).toString();
                            String f9c = Objects.requireNonNull(snapshot.child("F9C").getValue()).toString();

                            String a9t = Objects.requireNonNull(snapshot.child("A9T").getValue()).toString();
                            String b9t = Objects.requireNonNull(snapshot.child("B9T").getValue()).toString();
                            String c9t = Objects.requireNonNull(snapshot.child("C9T").getValue()).toString();
                            String d9t = Objects.requireNonNull(snapshot.child("D9T").getValue()).toString();
                            String e9t = Objects.requireNonNull(snapshot.child("E9T").getValue()).toString();
                            String f9t = Objects.requireNonNull(snapshot.child("F9T").getValue()).toString();

                            String a9r = Objects.requireNonNull(snapshot.child("A9R").getValue()).toString();
                            String b9r = Objects.requireNonNull(snapshot.child("B9R").getValue()).toString();
                            String c9r = Objects.requireNonNull(snapshot.child("C9R").getValue()).toString();
                            String d9r = Objects.requireNonNull(snapshot.child("D9R").getValue()).toString();
                            String e9r = Objects.requireNonNull(snapshot.child("E9R").getValue()).toString();
                            String f9r = Objects.requireNonNull(snapshot.child("F9R").getValue()).toString();

                            routineRecordViewHolder.ac9.setText(a9c);
                            routineRecordViewHolder.bc9.setText(b9c);
                            routineRecordViewHolder.cc9.setText(c9c);
                            routineRecordViewHolder.dc9.setText(d9c);
                            routineRecordViewHolder.ec9.setText(e9c);
                            routineRecordViewHolder.fc9.setText(f9c);

                            routineRecordViewHolder.at9.setText(a9t+"  ("+a9r+")");
                            routineRecordViewHolder.bt9.setText(b9t+"  ("+b9r+")");
                            routineRecordViewHolder.ct9.setText(c9t+"  ("+c9r+")");
                            routineRecordViewHolder.dt9.setText(d9t+"  ("+d9r+")");
                            routineRecordViewHolder.et9.setText(e9t+"  ("+e9r+")");
                            routineRecordViewHolder.ft9.setText(f9t+"  ("+f9r+")");


                            //----------- FOR 10TH SEMESTER-----------/

                            String a10c = Objects.requireNonNull(snapshot.child("A10C").getValue()).toString();
                            String b10c = Objects.requireNonNull(snapshot.child("B10C").getValue()).toString();
                            String c10c = Objects.requireNonNull(snapshot.child("C10C").getValue()).toString();
                            String d10c = Objects.requireNonNull(snapshot.child("D10C").getValue()).toString();
                            String e10c = Objects.requireNonNull(snapshot.child("E10C").getValue()).toString();
                            String f10c = Objects.requireNonNull(snapshot.child("F10C").getValue()).toString();

                            String a10t = Objects.requireNonNull(snapshot.child("A10T").getValue()).toString();
                            String b10t = Objects.requireNonNull(snapshot.child("B10T").getValue()).toString();
                            String c10t = Objects.requireNonNull(snapshot.child("C10T").getValue()).toString();
                            String d10t = Objects.requireNonNull(snapshot.child("D10T").getValue()).toString();
                            String e10t = Objects.requireNonNull(snapshot.child("E10T").getValue()).toString();
                            String f10t = Objects.requireNonNull(snapshot.child("F10T").getValue()).toString();

                            String a10r = Objects.requireNonNull(snapshot.child("A10R").getValue()).toString();
                            String b10r = Objects.requireNonNull(snapshot.child("B10R").getValue()).toString();
                            String c10r = Objects.requireNonNull(snapshot.child("C10R").getValue()).toString();
                            String d10r = Objects.requireNonNull(snapshot.child("D10R").getValue()).toString();
                            String e10r = Objects.requireNonNull(snapshot.child("E10R").getValue()).toString();
                            String f10r = Objects.requireNonNull(snapshot.child("F10R").getValue()).toString();

                            routineRecordViewHolder.ac10.setText(a10c);
                            routineRecordViewHolder.bc10.setText(b10c);
                            routineRecordViewHolder.cc10.setText(c10c);
                            routineRecordViewHolder.dc10.setText(d10c);
                            routineRecordViewHolder.ec10.setText(e10c);
                            routineRecordViewHolder.fc10.setText(f10c);

                            routineRecordViewHolder.at10.setText(a10t+"  ("+a10r+")");
                            routineRecordViewHolder.bt10.setText(b10t+"  ("+b10r+")");
                            routineRecordViewHolder.ct10.setText(c10t+"  ("+c10r+")");
                            routineRecordViewHolder.dt10.setText(d10t+"  ("+d10r+")");
                            routineRecordViewHolder.et10.setText(e10t+"  ("+e10r+")");
                            routineRecordViewHolder.ft10.setText(f10t+"  ("+f10r+")");


                            //----------- FOR 11TH SEMESTER-----------/

                            String a11c = Objects.requireNonNull(snapshot.child("A11C").getValue()).toString();
                            String b11c = Objects.requireNonNull(snapshot.child("B11C").getValue()).toString();
                            String c11c = Objects.requireNonNull(snapshot.child("C11C").getValue()).toString();
                            String d11c = Objects.requireNonNull(snapshot.child("D11C").getValue()).toString();
                            String e11c = Objects.requireNonNull(snapshot.child("E11C").getValue()).toString();
                            String f11c = Objects.requireNonNull(snapshot.child("F11C").getValue()).toString();

                            String a11t = Objects.requireNonNull(snapshot.child("A11T").getValue()).toString();
                            String b11t = Objects.requireNonNull(snapshot.child("B11T").getValue()).toString();
                            String c11t = Objects.requireNonNull(snapshot.child("C11T").getValue()).toString();
                            String d11t = Objects.requireNonNull(snapshot.child("D11T").getValue()).toString();
                            String e11t = Objects.requireNonNull(snapshot.child("E11T").getValue()).toString();
                            String f11t = Objects.requireNonNull(snapshot.child("F11T").getValue()).toString();

                            String a11r = Objects.requireNonNull(snapshot.child("A11R").getValue()).toString();
                            String b11r = Objects.requireNonNull(snapshot.child("B11R").getValue()).toString();
                            String c11r = Objects.requireNonNull(snapshot.child("C11R").getValue()).toString();
                            String d11r = Objects.requireNonNull(snapshot.child("D11R").getValue()).toString();
                            String e11r = Objects.requireNonNull(snapshot.child("E11R").getValue()).toString();
                            String f11r = Objects.requireNonNull(snapshot.child("F11R").getValue()).toString();

                            routineRecordViewHolder.ac11.setText(a11c);
                            routineRecordViewHolder.bc11.setText(b11c);
                            routineRecordViewHolder.cc11.setText(c11c);
                            routineRecordViewHolder.dc11.setText(d11c);
                            routineRecordViewHolder.ec11.setText(e11c);
                            routineRecordViewHolder.fc11.setText(f11c);

                            routineRecordViewHolder.at11.setText(a11t+"  ("+a11r+")");
                            routineRecordViewHolder.bt11.setText(b11t+"  ("+b11r+")");
                            routineRecordViewHolder.ct11.setText(c11t+"  ("+c11r+")");
                            routineRecordViewHolder.dt11.setText(d11t+"  ("+d11r+")");
                            routineRecordViewHolder.et11.setText(e11t+"  ("+e11r+")");
                            routineRecordViewHolder.ft11.setText(f11t+"  ("+f11r+")");


                            //----------- FOR 12TH SEMESTER-----------/

                            String a12c = Objects.requireNonNull(snapshot.child("A12C").getValue()).toString();
                            String b12c = Objects.requireNonNull(snapshot.child("B12C").getValue()).toString();
                            String c12c = Objects.requireNonNull(snapshot.child("C12C").getValue()).toString();
                            String d12c = Objects.requireNonNull(snapshot.child("D12C").getValue()).toString();
                            String e12c = Objects.requireNonNull(snapshot.child("E12C").getValue()).toString();
                            String f12c = Objects.requireNonNull(snapshot.child("F12C").getValue()).toString();

                            String a12t = Objects.requireNonNull(snapshot.child("A12T").getValue()).toString();
                            String b12t = Objects.requireNonNull(snapshot.child("B12T").getValue()).toString();
                            String c12t = Objects.requireNonNull(snapshot.child("C12T").getValue()).toString();
                            String d12t = Objects.requireNonNull(snapshot.child("D12T").getValue()).toString();
                            String e12t = Objects.requireNonNull(snapshot.child("E12T").getValue()).toString();
                            String f12t = Objects.requireNonNull(snapshot.child("F12T").getValue()).toString();

                            String a12r = Objects.requireNonNull(snapshot.child("A12R").getValue()).toString();
                            String b12r = Objects.requireNonNull(snapshot.child("B12R").getValue()).toString();
                            String c12r = Objects.requireNonNull(snapshot.child("C12R").getValue()).toString();
                            String d12r = Objects.requireNonNull(snapshot.child("D12R").getValue()).toString();
                            String e12r = Objects.requireNonNull(snapshot.child("E12R").getValue()).toString();
                            String f12r = Objects.requireNonNull(snapshot.child("F12R").getValue()).toString();


                            routineRecordViewHolder.ac12.setText(a12c);
                            routineRecordViewHolder.bc12.setText(b12c);
                            routineRecordViewHolder.cc12.setText(c12c);
                            routineRecordViewHolder.dc12.setText(d12c);
                            routineRecordViewHolder.ec12.setText(e12c);
                            routineRecordViewHolder.fc12.setText(f12c);

                            routineRecordViewHolder.at12.setText(a12t+"  ("+a12r+")");
                            routineRecordViewHolder.bt12.setText(b12t+"  ("+b12r+")");
                            routineRecordViewHolder.ct12.setText(c12t+"  ("+c12r+")");
                            routineRecordViewHolder.dt12.setText(d12t+"  ("+d12r+")");
                            routineRecordViewHolder.et12.setText(e12t+"  ("+e12r+")");
                            routineRecordViewHolder.ft12.setText(f12t+"  ("+f12r+")");



                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });





            }

            @NonNull
            public RoutineRecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.routine_item, parent ,false);
                return new RoutineRecordViewHolder(view);
            }
        };
        adapter.startListening();
        routineView.setAdapter(adapter);

    }





    public static class RoutineRecordViewHolder extends RecyclerView.ViewHolder {

        View mView;
        View recordView;
        TextView dayName, ac1, bc1,cc1,dc1,ec1,fc1,at1, bt1,ct1,dt1,et1,ft1, ar1, br1,cr1,dr1,er1,fr1, ac2, bc2,cc2,dc2,ec2,fc2,at2, bt2,ct2,dt2,et2,ft2, ar2, br2,cr2,dr2,er2,fr2, ac3, bc3,cc3,dc3,ec3,fc3,at3, bt3,ct3,dt3,et3,ft3, ar3, br3,cr3,dr3,er3,fr3,
                ac4, bc4,cc4,dc4,ec4,fc4,at4, bt4,ct4,dt4,et4,ft4, ar4, br4,cr4,dr4,er4,fr4, ac5, bc5,cc5,dc5,ec5,fc5,at5, bt5,ct5,dt5,et5,ft5, ar5, br5,cr5,dr5,er5,fr5, ac6, bc6,cc6,dc6,ec6,fc6,at6, bt6,ct6,dt6,et6,ft6, ar6, br6,cr6,dr6,er6,fr6,
                ac7, bc7,cc7,dc7,ec7,fc7,at7, bt7,ct7,dt7,et7,ft7, ar7, br7,cr7,dr7,er7,fr7, ac8, bc8,cc8,dc8,ec8,fc8,at8, bt8,ct8,dt8,et8,ft8, ar8, br8,cr8,dr8,er8,fr8, ac9, bc9,cc9,dc9,ec9,fc9,at9, bt9,ct9,dt9,et9,ft9, ar9, br9,cr9,dr9,er9,fr9,
                ac10, bc10,cc10,dc10,ec10,fc10,at10, bt10,ct10,dt10,et10,ft10, ar10, br10,cr10,dr10,er10,fr10, ac11, bc11,cc11,dc11,ec11,fc11,at11, bt11,ct11,dt11,et11,ft11, ar11, br11,cr11,dr11,er11,fr11, ac12, bc12,cc12,dc12,ec12,fc12,at12, bt12,ct12,dt12,et12,ft12, ar12, br12,cr12,dr12,er12,fr12;


        RoutineRecordViewHolder(View itemView) {
            super(itemView);

            recordView = itemView;

            dayName = itemView.findViewById(R.id.day_name);

            ac1 = itemView.findViewById(R.id.AC1);
            bc1 = itemView.findViewById(R.id.BC1);
            cc1 = itemView.findViewById(R.id.CC1);
            dc1 = itemView.findViewById(R.id.DC1);
            ec1 = itemView.findViewById(R.id.EC1);
            fc1 = itemView.findViewById(R.id.FC1);
            at1 = itemView.findViewById(R.id.AT1);
            bt1 = itemView.findViewById(R.id.BT1);
            ct1 = itemView.findViewById(R.id.CT1);
            dt1 = itemView.findViewById(R.id.DT1);
            et1 = itemView.findViewById(R.id.ET1);
            ft1 = itemView.findViewById(R.id.FT1);

            ac2 = itemView.findViewById(R.id.AC2);
            bc2 = itemView.findViewById(R.id.BC2);
            cc2 = itemView.findViewById(R.id.CC2);
            dc2 = itemView.findViewById(R.id.DC2);
            ec2 = itemView.findViewById(R.id.EC2);
            fc2 = itemView.findViewById(R.id.FC2);
            at2 = itemView.findViewById(R.id.AT2);
            bt2 = itemView.findViewById(R.id.BT2);
            ct2 = itemView.findViewById(R.id.CT2);
            dt2 = itemView.findViewById(R.id.DT2);
            et2 = itemView.findViewById(R.id.ET2);
            ft2 = itemView.findViewById(R.id.FT2);

            ac3 = itemView.findViewById(R.id.AC3);
            bc3 = itemView.findViewById(R.id.BC3);
            cc3 = itemView.findViewById(R.id.CC3);
            dc3 = itemView.findViewById(R.id.DC3);
            ec3 = itemView.findViewById(R.id.EC3);
            fc3 = itemView.findViewById(R.id.FC3);
            at3 = itemView.findViewById(R.id.AT3);
            bt3 = itemView.findViewById(R.id.BT3);
            ct3 = itemView.findViewById(R.id.CT3);
            dt3 = itemView.findViewById(R.id.DT3);
            et3 = itemView.findViewById(R.id.ET3);
            ft3 = itemView.findViewById(R.id.FT3);


            ac4 = itemView.findViewById(R.id.AC4);
            bc4 = itemView.findViewById(R.id.BC4);
            cc4 = itemView.findViewById(R.id.CC4);
            dc4 = itemView.findViewById(R.id.DC4);
            ec4 = itemView.findViewById(R.id.EC4);
            fc4 = itemView.findViewById(R.id.FC4);
            at4 = itemView.findViewById(R.id.AT4);
            bt4 = itemView.findViewById(R.id.BT4);
            ct4 = itemView.findViewById(R.id.CT4);
            dt4 = itemView.findViewById(R.id.DT4);
            et4 = itemView.findViewById(R.id.ET4);
            ft4 = itemView.findViewById(R.id.FT4);

            ac5 = itemView.findViewById(R.id.AC5);
            bc5 = itemView.findViewById(R.id.BC5);
            cc5 = itemView.findViewById(R.id.CC5);
            dc5 = itemView.findViewById(R.id.DC5);
            ec5 = itemView.findViewById(R.id.EC5);
            fc5 = itemView.findViewById(R.id.FC5);
            at5 = itemView.findViewById(R.id.AT5);
            bt5 = itemView.findViewById(R.id.BT5);
            ct5 = itemView.findViewById(R.id.CT5);
            dt5 = itemView.findViewById(R.id.DT5);
            et5 = itemView.findViewById(R.id.ET5);
            ft5 = itemView.findViewById(R.id.FT5);

            ac6 = itemView.findViewById(R.id.AC6);
            bc6 = itemView.findViewById(R.id.BC6);
            cc6 = itemView.findViewById(R.id.CC6);
            dc6 = itemView.findViewById(R.id.DC6);
            ec6 = itemView.findViewById(R.id.EC6);
            fc6 = itemView.findViewById(R.id.FC6);
            at6 = itemView.findViewById(R.id.AT6);
            bt6 = itemView.findViewById(R.id.BT6);
            ct6 = itemView.findViewById(R.id.CT6);
            dt6 = itemView.findViewById(R.id.DT6);
            et6 = itemView.findViewById(R.id.ET6);
            ft6 = itemView.findViewById(R.id.FT6);


            ac7 = itemView.findViewById(R.id.AC7);
            bc7 = itemView.findViewById(R.id.BC7);
            cc7 = itemView.findViewById(R.id.CC7);
            dc7 = itemView.findViewById(R.id.DC7);
            ec7 = itemView.findViewById(R.id.EC7);
            fc7 = itemView.findViewById(R.id.FC7);
            at7 = itemView.findViewById(R.id.AT7);
            bt7 = itemView.findViewById(R.id.BT7);
            ct7 = itemView.findViewById(R.id.CT7);
            dt7 = itemView.findViewById(R.id.DT7);
            et7 = itemView.findViewById(R.id.ET7);
            ft7 = itemView.findViewById(R.id.FT7);

            ac8 = itemView.findViewById(R.id.AC8);
            bc8 = itemView.findViewById(R.id.BC8);
            cc8 = itemView.findViewById(R.id.CC8);
            dc8 = itemView.findViewById(R.id.DC8);
            ec8 = itemView.findViewById(R.id.EC8);
            fc8 = itemView.findViewById(R.id.FC8);
            at8 = itemView.findViewById(R.id.AT8);
            bt8 = itemView.findViewById(R.id.BT8);
            ct8 = itemView.findViewById(R.id.CT8);
            dt8 = itemView.findViewById(R.id.DT8);
            et8 = itemView.findViewById(R.id.ET8);
            ft8 = itemView.findViewById(R.id.FT8);

            ac9 = itemView.findViewById(R.id.AC9);
            bc9 = itemView.findViewById(R.id.BC9);
            cc9 = itemView.findViewById(R.id.CC9);
            dc9 = itemView.findViewById(R.id.DC9);
            ec9 = itemView.findViewById(R.id.EC9);
            fc9 = itemView.findViewById(R.id.FC9);
            at9 = itemView.findViewById(R.id.AT9);
            bt9 = itemView.findViewById(R.id.BT9);
            ct9 = itemView.findViewById(R.id.CT9);
            dt9 = itemView.findViewById(R.id.DT9);
            et9 = itemView.findViewById(R.id.ET9);
            ft9 = itemView.findViewById(R.id.FT9);


            ac10 = itemView.findViewById(R.id.AC10);
            bc10 = itemView.findViewById(R.id.BC10);
            cc10 = itemView.findViewById(R.id.CC10);
            dc10 = itemView.findViewById(R.id.DC10);
            ec10 = itemView.findViewById(R.id.EC10);
            fc10 = itemView.findViewById(R.id.FC10);
            at10 = itemView.findViewById(R.id.AT10);
            bt10 = itemView.findViewById(R.id.BT10);
            ct10 = itemView.findViewById(R.id.CT10);
            dt10 = itemView.findViewById(R.id.DT10);
            et10 = itemView.findViewById(R.id.ET10);
            ft10 = itemView.findViewById(R.id.FT10);

            ac11 = itemView.findViewById(R.id.AC11);
            bc11 = itemView.findViewById(R.id.BC11);
            cc11 = itemView.findViewById(R.id.CC11);
            dc11 = itemView.findViewById(R.id.DC11);
            ec11 = itemView.findViewById(R.id.EC11);
            fc11 = itemView.findViewById(R.id.FC11);
            at11 = itemView.findViewById(R.id.AT11);
            bt11 = itemView.findViewById(R.id.BT11);
            ct11 = itemView.findViewById(R.id.CT11);
            dt11 = itemView.findViewById(R.id.DT11);
            et11 = itemView.findViewById(R.id.ET11);
            ft11 = itemView.findViewById(R.id.FT11);

            ac12 = itemView.findViewById(R.id.AC12);
            bc12 = itemView.findViewById(R.id.BC12);
            cc12 = itemView.findViewById(R.id.CC12);
            dc12 = itemView.findViewById(R.id.DC12);
            ec12 = itemView.findViewById(R.id.EC12);
            fc12 = itemView.findViewById(R.id.FC12);
            at12 = itemView.findViewById(R.id.AT12);
            bt12 = itemView.findViewById(R.id.BT12);
            ct12 = itemView.findViewById(R.id.CT12);
            dt12 = itemView.findViewById(R.id.DT12);
            et12 = itemView.findViewById(R.id.ET12);
            ft12 = itemView.findViewById(R.id.FT12);












            mView = itemView;

        }



    }
}
