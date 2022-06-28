package com.approxsoft.routinemanagement.RoutineFile;

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

    public static void showRoutine(TextView timeA, TextView timeB, TextView timeC, TextView timeD, TextView timeE, TextView timeF, RecyclerView routineView){

    }


    private static void DisplayAllRoutineRecords(String s, RecyclerView routineView,TextView time1,TextView time2, TextView time3,TextView time4,TextView time5,TextView time6,TextView time7,TextView routineFor) {

        Query query = routineReference.child("Department Of CSE And CSIT").child("Routine").orderByChild("count")
                .startAt(s).endAt(s + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<RoutineData> options = new FirebaseRecyclerOptions.Builder<RoutineData>().setQuery(query, RoutineData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<RoutineData, RoutineRecordViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final RoutineRecordViewHolder routineRecordViewHolder, final int position, @NonNull final RoutineData routineData) {

                String usersIDs = getRef(position).getKey();

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
                            String t7 = Objects.requireNonNull(snapshot.child("Time").child("gTime").getValue()).toString();


                            time1.setText(t1);
                            time2.setText(t2);
                            time3.setText(t3);
                            time4.setText(t4);
                            time5.setText(t5);
                            time6.setText(t6);
                            time7.setText(t7);


                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                routineReference.child("Department Of CSE And CSIT").child("Routine").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot)
                    {
                        if (snapshot.exists()) {

                            String routine = snapshot.child("routineFor").getValue().toString();

                            routineFor.setText(routine);
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



                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });





            }

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
