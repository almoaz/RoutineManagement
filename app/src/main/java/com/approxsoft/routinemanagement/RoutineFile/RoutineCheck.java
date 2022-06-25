package com.approxsoft.routinemanagement.RoutineFile;

import android.widget.Spinner;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class RoutineCheck {

    static DatabaseReference courseOfferReference = FirebaseDatabase.getInstance().getReference().child("Department Of CSE And CSIT");
    static String position = "2";
    public static void check1stSubject(Spinner a1stC, Spinner b1stC, Spinner c1stC, Spinner d1stC, Spinner e1stC, Spinner f1stC, Spinner a1stT, Spinner b1stT, Spinner c1stT, Spinner d1stT, Spinner e1stT, Spinner f1stT, Spinner a1stR, Spinner b1stR, Spinner c1stR, Spinner d1stR, Spinner e1stR, Spinner f1stR, Spinner a1C2, Spinner b1C2, Spinner c1C2, Spinner d1C2, Spinner e1C2, Spinner f1C2, Spinner a1T2, Spinner b1T2, Spinner c1T2, Spinner d1T2, Spinner e1T2, Spinner f1T2, Spinner a1R2, Spinner b1R2, Spinner c1R2, Spinner d1R2, Spinner e1R2, Spinner f1R2){

        a1stC.setSelection(7);
        b1stC.setSelection(2);
        d1stC.setSelection(6);

        subjectCheck("1st Semester",a1stC,a1stT);
        subjectCheck("1st Semester",b1stC,b1stT);
        //subjectCheck("1st Semester",c1stC,c1stT);
        subjectCheck("1st Semester",d1stC,d1stT);
        //subjectCheck("1st Semester",e1stC,e1stT);
        //subjectCheck("1st Semester",f1stC,f1stT);

        b1C2.setSelection(4);
        c1C2.setSelection(1);

        subjectCheck("1st Semester",b1C2,b1T2);
        subjectCheck("1st Semester",c1C2,c1T2);




    }


    public static void check2ndSubject(Spinner a2ndC, Spinner b2C, Spinner c2C, Spinner d2C, Spinner e2C, Spinner f2C, Spinner a2T, Spinner b2T, Spinner c2T, Spinner d2T, Spinner e2T, Spinner f2T, Spinner a2R, Spinner b2R, Spinner c2R, Spinner d2R, Spinner e2R, Spinner f2R, Spinner a2C2, Spinner b2C2, Spinner c2C2, Spinner d2C2, Spinner e2C2, Spinner f2C2, Spinner a2T2, Spinner b2T2, Spinner c2T2, Spinner d2T2, Spinner e2T2, Spinner f2T2, Spinner a2R2, Spinner b2R2, Spinner c2R2, Spinner d2R2, Spinner e2R2, Spinner f2R2) {

        a2C2.setSelection(2);
        b2C2.setSelection(6);
        d2C2.setSelection(4);

    }

    public static void check3rdSubject(Spinner a3rdC, Spinner b3C, Spinner c3C, Spinner d3C, Spinner e3C, Spinner f3C, Spinner a3T, Spinner b3T, Spinner c3T, Spinner d3T, Spinner e3T, Spinner f3T, Spinner a3R, Spinner b3R, Spinner c3R, Spinner d3R, Spinner e3R, Spinner f3R, Spinner a3C2, Spinner b3C2, Spinner c3C2, Spinner d3C2, Spinner e3C2, Spinner f3C2, Spinner a3T2, Spinner b3T2, Spinner c3T2, Spinner d3T2, Spinner e3T2, Spinner f3T2, Spinner a3R2, Spinner b3R2, Spinner c3R2, Spinner d3R2, Spinner e3R2, Spinner f3R2) {
        b3C.setSelection(4);
        c3C.setSelection(2);
        e3C.setSelection(5);


        a3C2.setSelection(6);
        b3C2.setSelection(1);

    }

    public static void check4thSubject(Spinner a4thC, Spinner b4C, Spinner c4C, Spinner d4C, Spinner e4C, Spinner f4C, Spinner a4T, Spinner b4T, Spinner c4T, Spinner d4T, Spinner e4T, Spinner f4T, Spinner a4R, Spinner b4R, Spinner c4R, Spinner d4R, Spinner e4R, Spinner f4R, Spinner a4C2, Spinner b4C2, Spinner c4C2, Spinner d4C2, Spinner e4C2, Spinner f4C2, Spinner a4T2, Spinner b4T2, Spinner c4T2, Spinner d4T2, Spinner e4T2, Spinner f4T2, Spinner a4R2, Spinner b4R2, Spinner c4R2, Spinner d4R2, Spinner e4R2, Spinner f4R2) {
        d4C.setSelection(6);
        e4C.setSelection(9);
        f4C.setSelection(5);

        c4C2.setSelection(3);
        d4C2.setSelection(1);

    }

    public static void check5thSubject(Spinner a5thC, Spinner b5C, Spinner c5C, Spinner d5C, Spinner e5C, Spinner f5C, Spinner a5T, Spinner b5T, Spinner c5T, Spinner d5T, Spinner e5T, Spinner f5T, Spinner a5R, Spinner b5R, Spinner c5R, Spinner d5R, Spinner e5R, Spinner f5R, Spinner a5C2, Spinner b5C2, Spinner c5C2, Spinner d5C2, Spinner e5C2, Spinner f5C2, Spinner a5T2, Spinner b5T2, Spinner c5T2, Spinner d5T2, Spinner e5T2, Spinner f5T2, Spinner a5R2, Spinner b5R2, Spinner c5R2, Spinner d5R2, Spinner e5R2, Spinner f5R2) {

        a5thC.setSelection(14);
        b5C.setSelection(5);


    }

    public static void check6thSubject(Spinner a6thC, Spinner b6C, Spinner c6C, Spinner d6C, Spinner e6C, Spinner f6C, Spinner a6T, Spinner b6T, Spinner c6T, Spinner d6T, Spinner e6T, Spinner f6T, Spinner a6R, Spinner b6R, Spinner c6R, Spinner d6R, Spinner e6R, Spinner f6R, Spinner a6C2, Spinner b6C2, Spinner c6C2, Spinner d6C2, Spinner e6C2, Spinner f6C2, Spinner a6T2, Spinner b6T2, Spinner c6T2, Spinner d6T2, Spinner e6T2, Spinner f6T2, Spinner a6R2, Spinner b6R2, Spinner c6R2, Spinner d6R2, Spinner e6R2, Spinner f6R2) {

        b6C.setSelection(5);
        c6C.setSelection(6);

        b6C2.setSelection(1);
        d6C2.setSelection(1);
        e6C2.setSelection(1);
    }

    public static void check7thSubject(Spinner a7thC, Spinner b7C, Spinner c7C, Spinner d7C, Spinner e7C, Spinner f7C, Spinner a7T, Spinner b7T, Spinner c7T, Spinner d7T, Spinner e7T, Spinner f7T, Spinner a7R, Spinner b7R, Spinner c7R, Spinner d7R, Spinner e7R, Spinner f7R, Spinner a7C2, Spinner b7C2, Spinner c7C2, Spinner d7C2, Spinner e7C2, Spinner f7C2, Spinner a7T2, Spinner b7T2, Spinner c7T2, Spinner d7T2, Spinner e7T2, Spinner f7T2, Spinner a7R2, Spinner b7R2, Spinner c7R2, Spinner d7R2, Spinner e7R2, Spinner f7R2) {
        c7C2.setSelection(5);
        d7C2.setSelection(12);
        e7C2.setSelection(10);
    }


    public static void check8thSubject(Spinner a8thC, Spinner b8C, Spinner c8C, Spinner d8C, Spinner e8C, Spinner f8C, Spinner a8T, Spinner b8T, Spinner c8T, Spinner d8T, Spinner e8T, Spinner f8T, Spinner a8R, Spinner b8R, Spinner c8R, Spinner d8R, Spinner e8R, Spinner f8R, Spinner a8C2, Spinner b8C2, Spinner c8C2, Spinner d8C2, Spinner e8C2, Spinner f8C2, Spinner a8T2, Spinner b8T2, Spinner c8T2, Spinner d8T2, Spinner e8T2, Spinner f8T2, Spinner a8R2, Spinner b8R2, Spinner c8R2, Spinner d8R2, Spinner e8R2, Spinner f8R2) {

        c8C.setSelection(3);
        d8C.setSelection(1);

        a8C2.setSelection(6);
        c8C2.setSelection(13);
        d8C2.setSelection(14);
    }

    public static void check9thSubject(Spinner a9thC, Spinner b9C, Spinner c9C, Spinner d9C, Spinner e9C, Spinner f9C, Spinner a9T, Spinner b9T, Spinner c9T, Spinner d9T, Spinner e9T, Spinner f9T, Spinner a9R, Spinner b9R, Spinner c9R, Spinner d9R, Spinner e9R, Spinner f9R, Spinner a9C2, Spinner b9C2, Spinner c9C2, Spinner d9C2, Spinner e9C2, Spinner f9C2, Spinner a9T2, Spinner b9T2, Spinner c9T2, Spinner d9T2, Spinner e9T2, Spinner f9T2, Spinner a9R2, Spinner b9R2, Spinner c9R2, Spinner d9R2, Spinner e9R2, Spinner f9R2) {

        d9C.setSelection(12);
        f9C.setSelection(14);

        c9C2.setSelection(4);
        d9C2.setSelection(6);
        f9C2.setSelection(1);

    }

    public static void check10thSubject(Spinner a10thC, Spinner b10C, Spinner c10C, Spinner d10C, Spinner e10C, Spinner f10C, Spinner a10T, Spinner b10T, Spinner c10T, Spinner d10T, Spinner e10T, Spinner f10T, Spinner a10R, Spinner b10R, Spinner c10R, Spinner d10R, Spinner e10R, Spinner f10R, Spinner a10C2, Spinner b10C2, Spinner c10C2, Spinner d10C2, Spinner e10C2, Spinner f10C2, Spinner a10T2, Spinner b10T2, Spinner c10T2, Spinner d10T2, Spinner e10T2, Spinner f10T2, Spinner a10R2, Spinner b10R2, Spinner c10R2, Spinner d10R2, Spinner e10R2, Spinner f10R2) {

        f10C.setSelection(9);

        d10C2.setSelection(8);
        f10C2.setSelection(11);
    }

    public static void check11thSubject(Spinner a11thC, Spinner b11C, Spinner c11C, Spinner d11C, Spinner e11C, Spinner f11C, Spinner a11T, Spinner b11T, Spinner c11T, Spinner d11T, Spinner e11T, Spinner f11T, Spinner a11R, Spinner b11R, Spinner c11R, Spinner d11R, Spinner e11R, Spinner f11R, Spinner a11C2, Spinner b11C2, Spinner c11C2, Spinner d11C2, Spinner e11C2, Spinner f11C2, Spinner a11T2, Spinner b11T2, Spinner c11T2, Spinner d11T2, Spinner e11T2, Spinner f11T2, Spinner a11R2, Spinner b11R2, Spinner c11R2, Spinner d11R2, Spinner e11R2, Spinner f11R2) {

    }

    public static void check12thSubject(Spinner a12thC, Spinner b12C, Spinner c12C, Spinner d12C, Spinner e12C, Spinner f12C, Spinner a12T, Spinner b12T, Spinner c12T, Spinner d12T, Spinner e12T, Spinner f12T, Spinner a12R, Spinner b12R, Spinner c12R, Spinner d12R, Spinner e12R, Spinner f12R, Spinner a12C2, Spinner b12C2, Spinner c12C2, Spinner d12C2, Spinner e12C2, Spinner f12C2, Spinner a12T2, Spinner b12T2, Spinner c12T2, Spinner d12T2, Spinner e12T2, Spinner f12T2, Spinner a12R2, Spinner b12R2, Spinner c12R2, Spinner d12R2, Spinner e12R2, Spinner f12R2) {

        c12C.setSelection(3);
        d12C.setSelection(2);
    }

    private static void subjectCheck(String s, Spinner c, Spinner t) {
        courseOfferReference.child("Semester Course Offer").child(s).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot)
            {

                String s1 = c.getSelectedItem().toString();
                if (snapshot.hasChild(s1))
                {
                    String t2 = Objects.requireNonNull(snapshot.child(s1).child("teacherName").getValue()).toString().trim();

                    int z = Integer.parseInt(t2);

                    t.setSelection(z);

                }
                else
                {
                    c.setSelection(0);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
