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
    public static void check1stSubject(Spinner a1stC, Spinner b1stC, Spinner c1stC, Spinner d1stC, Spinner e1stC, Spinner f1stC, Spinner a1stT, Spinner b1stT, Spinner c1stT, Spinner d1stT, Spinner e1stT, Spinner f1stT, Spinner a1stR, Spinner b1stR, Spinner c1stR, Spinner d1stR, Spinner e1stR, Spinner f1stR, Spinner a1C2, Spinner b1C2, Spinner c1C2, Spinner d1C2, Spinner e1C2, Spinner f1C2, Spinner a1T2, Spinner b1T2, Spinner c1T2, Spinner d1T2, Spinner e1T2, Spinner f1T2, Spinner a1R2, Spinner b1R2, Spinner c1R2, Spinner d1R2, Spinner e1R2, Spinner f1R2, Spinner a1C3, Spinner b1C3, Spinner c1C3, Spinner d1C3, Spinner e1C3, Spinner f1C3, Spinner a1T3, Spinner b1T3, Spinner c1T3, Spinner d1T3, Spinner e1T3, Spinner f1T3, Spinner a1R3, Spinner b1R3, Spinner c1R3, Spinner d1R3, Spinner e1R3, Spinner f1R3, Spinner a1C4, Spinner b1C4, Spinner c1C4, Spinner d1C4, Spinner e1C4, Spinner f1C4, Spinner a1T4, Spinner b1T4, Spinner c1T4, Spinner d1T4, Spinner e1T4, Spinner f1T4, Spinner a1R4, Spinner b1R4, Spinner c1R4, Spinner d1R4, Spinner e1R4, Spinner f1R4, Spinner a1C5, Spinner b1C5, Spinner c1C5, Spinner d1C5, Spinner e1C5, Spinner f1C5, Spinner a1T5, Spinner b1T5, Spinner c1T5, Spinner d1T5, Spinner e1T5, Spinner f1T5, Spinner a1R5, Spinner b1R5, Spinner c1R5, Spinner d1R5, Spinner e1R5, Spinner f1R5, Spinner a1C6, Spinner b1C6, Spinner c1C6, Spinner d1C6, Spinner e1C6, Spinner f1C6, Spinner a1T6, Spinner b1T6, Spinner c1T6, Spinner d1T6, Spinner e1T6, Spinner f1T6, Spinner a1R6, Spinner b1R6, Spinner c1R6, Spinner d1R6, Spinner e1R6, Spinner f1R6){

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


        b1C4.setSelection(7);
        c1C4.setSelection(4);

        subjectCheck("1st Semester",b1C4,b1T4);
        subjectCheck("1st Semester",c1C4,c1T4);


        d1C5.setSelection(2);
        e1C5.setSelection(3);

        subjectCheck("1st Semester",d1C5,d1T5);
        subjectCheck("1st Semester",e1C5,e1T5);




    }


    public static void check2ndSubject(Spinner a2ndC, Spinner b2C, Spinner c2C, Spinner d2C, Spinner e2C, Spinner f2C, Spinner a2T, Spinner b2T, Spinner c2T, Spinner d2T, Spinner e2T, Spinner f2T, Spinner a2R, Spinner b2R, Spinner c2R, Spinner d2R, Spinner e2R, Spinner f2R, Spinner a2C2, Spinner b2C2, Spinner c2C2, Spinner d2C2, Spinner e2C2, Spinner f2C2, Spinner a2T2, Spinner b2T2, Spinner c2T2, Spinner d2T2, Spinner e2T2, Spinner f2T2, Spinner a2R2, Spinner b2R2, Spinner c2R2, Spinner d2R2, Spinner e2R2, Spinner f2R2, Spinner a2C3, Spinner b2C3, Spinner c2C3, Spinner d2C3, Spinner e2C3, Spinner f2C3, Spinner a2T3, Spinner b2T3, Spinner c2T3, Spinner d2T3, Spinner e2T3, Spinner f2T3, Spinner a2R3, Spinner b2R3, Spinner c2R3, Spinner d2R3, Spinner e2R3, Spinner f2R3, Spinner a2C4, Spinner b2C4, Spinner c2C4, Spinner d2C4, Spinner e2C4, Spinner f2C4, Spinner a2T4, Spinner b2T4, Spinner c2T4, Spinner d2T4, Spinner e2T4, Spinner f2T4, Spinner a2R4, Spinner b2R4, Spinner c2R4, Spinner d2R4, Spinner e2R4, Spinner f2R4, Spinner a2C5, Spinner b2C5, Spinner c2C5, Spinner d2C5, Spinner e2C5, Spinner f2C5, Spinner a2T5, Spinner b2T5, Spinner c2T5, Spinner d2T5, Spinner e2T5, Spinner f2T5, Spinner a2R5, Spinner b2R5, Spinner c2R5, Spinner d2R5, Spinner e2R5, Spinner f2R5, Spinner a2C6, Spinner b2C6, Spinner c2C6, Spinner d2C6, Spinner e2C6, Spinner f2C6, Spinner a2T6, Spinner b2T6, Spinner c2T6, Spinner d2T6, Spinner e2T6, Spinner f2T6, Spinner a2R6, Spinner b2R6, Spinner c2R6, Spinner d2R6, Spinner e2R6, Spinner f2R6) {

        a2C2.setSelection(2);
        b2C2.setSelection(6);
        d2C2.setSelection(4);

        a2C3.setSelection(1);
        c2C3.setSelection(7);

        a2C4.setSelection(2);
        b2C4.setSelection(3);
        c2C4.setSelection(6);

        b2C6.setSelection(4);
        c2C6.setSelection(5);

    }

    public static void check3rdSubject(Spinner a3rdC, Spinner b3C, Spinner c3C, Spinner d3C, Spinner e3C, Spinner f3C, Spinner a3T, Spinner b3T, Spinner c3T, Spinner d3T, Spinner e3T, Spinner f3T, Spinner a3R, Spinner b3R, Spinner c3R, Spinner d3R, Spinner e3R, Spinner f3R, Spinner a3C2, Spinner b3C2, Spinner c3C2, Spinner d3C2, Spinner e3C2, Spinner f3C2, Spinner a3T2, Spinner b3T2, Spinner c3T2, Spinner d3T2, Spinner e3T2, Spinner f3T2, Spinner a3R2, Spinner b3R2, Spinner c3R2, Spinner d3R2, Spinner e3R2, Spinner f3R2, Spinner a3C3, Spinner b3C3, Spinner c3C3, Spinner d3C3, Spinner e3C3, Spinner f3C3, Spinner a3T3, Spinner b3T3, Spinner c3T3, Spinner d3T3, Spinner e3T3, Spinner f3T3, Spinner a3R3, Spinner b3R3, Spinner c3R3, Spinner d3R3, Spinner e3R3, Spinner f3R3, Spinner a3C4, Spinner b3C4, Spinner c3C4, Spinner d3C4, Spinner e3C4, Spinner f3C4, Spinner a3T4, Spinner b3T4, Spinner c3T4, Spinner d3T4, Spinner e3T4, Spinner f3T4, Spinner a3R4, Spinner b3R4, Spinner c3R4, Spinner d3R4, Spinner e3R4, Spinner f3R4, Spinner a3C5, Spinner b3C5, Spinner c3C5, Spinner d3C5, Spinner e3C5, Spinner f3C5, Spinner a3T5, Spinner b3T5, Spinner c3T5, Spinner d3T5, Spinner e3T5, Spinner f3T5, Spinner a3R5, Spinner b3R5, Spinner c3R5, Spinner d3R5, Spinner e3R5, Spinner f3R5, Spinner a3C6, Spinner b3C6, Spinner c3C6, Spinner d3C6, Spinner e3C6, Spinner f3C6, Spinner a3T6, Spinner b3T6, Spinner c3T6, Spinner d3T6, Spinner e3T6, Spinner f3T6, Spinner a3R6, Spinner b3R6, Spinner c3R6, Spinner d3R6, Spinner e3R6, Spinner f3R6) {
        b3C.setSelection(4);
        c3C.setSelection(2);
        e3C.setSelection(5);


        a3C2.setSelection(6);
        b3C2.setSelection(1);

        d3C4.setSelection(2);
        e3C4.setSelection(3);

        a3C6.setSelection(4);

    }

    public static void check4thSubject(Spinner a4thC, Spinner b4C, Spinner c4C, Spinner d4C, Spinner e4C, Spinner f4C, Spinner a4T, Spinner b4T, Spinner c4T, Spinner d4T, Spinner e4T, Spinner f4T, Spinner a4R, Spinner b4R, Spinner c4R, Spinner d4R, Spinner e4R, Spinner f4R, Spinner a4C2, Spinner b4C2, Spinner c4C2, Spinner d4C2, Spinner e4C2, Spinner f4C2, Spinner a4T2, Spinner b4T2, Spinner c4T2, Spinner d4T2, Spinner e4T2, Spinner f4T2, Spinner a4R2, Spinner b4R2, Spinner c4R2, Spinner d4R2, Spinner e4R2, Spinner f4R2, Spinner a4C3, Spinner b4C3, Spinner c4C3, Spinner d4C3, Spinner e4C3, Spinner f4C3, Spinner a4T3, Spinner b4T3, Spinner c4T3, Spinner d4T3, Spinner e4T3, Spinner f4T3, Spinner a4R3, Spinner b4R3, Spinner c4R3, Spinner d4R3, Spinner e4R3, Spinner f4R3, Spinner a4C4, Spinner b4C4, Spinner c4C4, Spinner d4C4, Spinner e4C4, Spinner f4C4, Spinner a4T4, Spinner b4T4, Spinner c4T4, Spinner d4T4, Spinner e4T4, Spinner f4T4, Spinner a4R4, Spinner b4R4, Spinner c4R4, Spinner d4R4, Spinner e4R4, Spinner f4R4, Spinner a4C5, Spinner b4C5, Spinner c4C5, Spinner d4C5, Spinner e4C5, Spinner f4C5, Spinner a4T5, Spinner b4T5, Spinner c4T5, Spinner d4T5, Spinner e4T5, Spinner f4T5, Spinner a4R5, Spinner b4R5, Spinner c4R5, Spinner d4R5, Spinner e4R5, Spinner f4R5, Spinner a4C6, Spinner b4C6, Spinner c4C6, Spinner d4C6, Spinner e4C6, Spinner f4C6, Spinner a4T6, Spinner b4T6, Spinner c4T6, Spinner d4T6, Spinner e4T6, Spinner f4T6, Spinner a4R6, Spinner b4R6, Spinner c4R6, Spinner d4R6, Spinner e4R6, Spinner f4R6) {
        d4C.setSelection(6);
        e4C.setSelection(9);
        f4C.setSelection(5);

        c4C2.setSelection(3);
        d4C2.setSelection(1);

        d4C3.setSelection(1);
        e4C3.setSelection(2);
        f4C3.setSelection(5);

        d4C4.setSelection(10);

        b4C5.setSelection(3);
        c4C5.setSelection(4);
        e4C5.setSelection(6);

    }

    public static void check5thSubject(Spinner a5thC, Spinner b5C, Spinner c5C, Spinner d5C, Spinner e5C, Spinner f5C, Spinner a5T, Spinner b5T, Spinner c5T, Spinner d5T, Spinner e5T, Spinner f5T, Spinner a5R, Spinner b5R, Spinner c5R, Spinner d5R, Spinner e5R, Spinner f5R, Spinner a5C2, Spinner b5C2, Spinner c5C2, Spinner d5C2, Spinner e5C2, Spinner f5C2, Spinner a5T2, Spinner b5T2, Spinner c5T2, Spinner d5T2, Spinner e5T2, Spinner f5T2, Spinner a5R2, Spinner b5R2, Spinner c5R2, Spinner d5R2, Spinner e5R2, Spinner f5R2, Spinner a5C3, Spinner b5C3, Spinner c5C3, Spinner d5C3, Spinner e5C3, Spinner f5C3, Spinner a5T3, Spinner b5T3, Spinner c5T3, Spinner d5T3, Spinner e5T3, Spinner f5T3, Spinner a5R3, Spinner b5R3, Spinner c5R3, Spinner d5R3, Spinner e5R3, Spinner f5R3, Spinner a5C4, Spinner b5C4, Spinner c5C4, Spinner d5C4, Spinner e5C4, Spinner f5C4, Spinner a5T4, Spinner b5T4, Spinner c5T4, Spinner d5T4, Spinner e5T4, Spinner f5T4, Spinner a5R4, Spinner b5R4, Spinner c5R4, Spinner d5R4, Spinner e5R4, Spinner f5R4, Spinner a5C5, Spinner b5C5, Spinner c5C5, Spinner d5C5, Spinner e5C5, Spinner f5C5, Spinner a5T5, Spinner b5T5, Spinner c5T5, Spinner d5T5, Spinner e5T5, Spinner f5T5, Spinner a5R5, Spinner b5R5, Spinner c5R5, Spinner d5R5, Spinner e5R5, Spinner f5R5, Spinner a5C6, Spinner b5C6, Spinner c5C6, Spinner d5C6, Spinner e5C6, Spinner f5C6, Spinner a5T6, Spinner b5T6, Spinner c5T6, Spinner d5T6, Spinner e5T6, Spinner f5T6, Spinner a5R6, Spinner b5R6, Spinner c5R6, Spinner d5R6, Spinner e5R6, Spinner f5R6) {

        a5C3.setSelection(5);
        b5C3.setSelection(6);

        a5C4.setSelection(14);
        b5C4.setSelection(5);
        d5C4.setSelection(13);

        a5C5.setSelection(14);
        b5C5.setSelection(15);
        d5C5.setSelection(3);

        a5C6.setSelection(3);
        b5C6.setSelection(4);


    }

    public static void check6thSubject(Spinner a6thC, Spinner b6C, Spinner c6C, Spinner d6C, Spinner e6C, Spinner f6C, Spinner a6T, Spinner b6T, Spinner c6T, Spinner d6T, Spinner e6T, Spinner f6T, Spinner a6R, Spinner b6R, Spinner c6R, Spinner d6R, Spinner e6R, Spinner f6R, Spinner a6C2, Spinner b6C2, Spinner c6C2, Spinner d6C2, Spinner e6C2, Spinner f6C2, Spinner a6T2, Spinner b6T2, Spinner c6T2, Spinner d6T2, Spinner e6T2, Spinner f6T2, Spinner a6R2, Spinner b6R2, Spinner c6R2, Spinner d6R2, Spinner e6R2, Spinner f6R2, Spinner a6C3, Spinner b6C3, Spinner c6C3, Spinner d6C3, Spinner e6C3, Spinner f6C3, Spinner a6T3, Spinner b6T3, Spinner c6T3, Spinner d6T3, Spinner e6T3, Spinner f6T3, Spinner a6R3, Spinner b6R3, Spinner c6R3, Spinner d6R3, Spinner e6R3, Spinner f6R3, Spinner a6C4, Spinner b6C4, Spinner c6C4, Spinner d6C4, Spinner e6C4, Spinner f6C4, Spinner a6T4, Spinner b6T4, Spinner c6T4, Spinner d6T4, Spinner e6T4, Spinner f6T4, Spinner a6R4, Spinner b6R4, Spinner c6R4, Spinner d6R4, Spinner e6R4, Spinner f6R4, Spinner a6C5, Spinner b6C5, Spinner c6C5, Spinner d6C5, Spinner e6C5, Spinner f6C5, Spinner a6T5, Spinner b6T5, Spinner c6T5, Spinner d6T5, Spinner e6T5, Spinner f6T5, Spinner a6R5, Spinner b6R5, Spinner c6R5, Spinner d6R5, Spinner e6R5, Spinner f6R5, Spinner a6C6, Spinner b6C6, Spinner c6C6, Spinner d6C6, Spinner e6C6, Spinner f6C6, Spinner a6T6, Spinner b6T6, Spinner c6T6, Spinner d6T6, Spinner e6T6, Spinner f6T6, Spinner a6R6, Spinner b6R6, Spinner c6R6, Spinner d6R6, Spinner e6R6, Spinner f6R6) {

        b6C.setSelection(5);
        c6C.setSelection(6);

        b6C2.setSelection(5);
        d6C2.setSelection(3);
        e6C2.setSelection(4);

        a6C3.setSelection(4);
        b6C3.setSelection(1);
        c6C3.setSelection(14);

        a6C5.setSelection(1);
        b6C5.setSelection(2);
        d6C5.setSelection(3);
    }

    public static void check7thSubject(Spinner a7thC, Spinner b7C, Spinner c7C, Spinner d7C, Spinner e7C, Spinner f7C, Spinner a7T, Spinner b7T, Spinner c7T, Spinner d7T, Spinner e7T, Spinner f7T, Spinner a7R, Spinner b7R, Spinner c7R, Spinner d7R, Spinner e7R, Spinner f7R, Spinner a7C2, Spinner b7C2, Spinner c7C2, Spinner d7C2, Spinner e7C2, Spinner f7C2, Spinner a7T2, Spinner b7T2, Spinner c7T2, Spinner d7T2, Spinner e7T2, Spinner f7T2, Spinner a7R2, Spinner b7R2, Spinner c7R2, Spinner d7R2, Spinner e7R2, Spinner f7R2, Spinner a7C3, Spinner b7C3, Spinner c7C3, Spinner d7C3, Spinner e7C3, Spinner f7C3, Spinner a7T3, Spinner b7T3, Spinner c7T3, Spinner d7T3, Spinner e7T3, Spinner f7T3, Spinner a7R3, Spinner b7R3, Spinner c7R3, Spinner d7R3, Spinner e7R3, Spinner f7R3, Spinner a7C4, Spinner b7C4, Spinner c7C4, Spinner d7C4, Spinner e7C4, Spinner f7C4, Spinner a7T4, Spinner b7T4, Spinner c7T4, Spinner d7T4, Spinner e7T4, Spinner f7T4, Spinner a7R4, Spinner b7R4, Spinner c7R4, Spinner d7R4, Spinner e7R4, Spinner f7R4, Spinner a7C5, Spinner b7C5, Spinner c7C5, Spinner d7C5, Spinner e7C5, Spinner f7C5, Spinner a7T5, Spinner b7T5, Spinner c7T5, Spinner d7T5, Spinner e7T5, Spinner f7T5, Spinner a7R5, Spinner b7R5, Spinner c7R5, Spinner d7R5, Spinner e7R5, Spinner f7R5, Spinner a7C6, Spinner b7C6, Spinner c7C6, Spinner d7C6, Spinner e7C6, Spinner f7C6, Spinner a7T6, Spinner b7T6, Spinner c7T6, Spinner d7T6, Spinner e7T6, Spinner f7T6, Spinner a7R6, Spinner b7R6, Spinner c7R6, Spinner d7R6, Spinner e7R6, Spinner f7R6) {
        c7C2.setSelection(5);
        d7C2.setSelection(12);
        e7C2.setSelection(10);

        a7C3.setSelection(10);
        c7C3.setSelection(3);
        d7C3.setSelection(7);

        b7C4.setSelection(7);
        d7C4.setSelection(9);
        e7C4.setSelection(5);

        c7C6.setSelection(3);
        d7C6.setSelection(4);
        e7C6.setSelection(6);


    }


    public static void check8thSubject(Spinner a8thC, Spinner b8C, Spinner c8C, Spinner d8C, Spinner e8C, Spinner f8C, Spinner a8T, Spinner b8T, Spinner c8T, Spinner d8T, Spinner e8T, Spinner f8T, Spinner a8R, Spinner b8R, Spinner c8R, Spinner d8R, Spinner e8R, Spinner f8R, Spinner a8C2, Spinner b8C2, Spinner c8C2, Spinner d8C2, Spinner e8C2, Spinner f8C2, Spinner a8T2, Spinner b8T2, Spinner c8T2, Spinner d8T2, Spinner e8T2, Spinner f8T2, Spinner a8R2, Spinner b8R2, Spinner c8R2, Spinner d8R2, Spinner e8R2, Spinner f8R2, Spinner a8C3, Spinner b8C3, Spinner c8C3, Spinner d8C3, Spinner e8C3, Spinner f8C3, Spinner a8T3, Spinner b8T3, Spinner c8T3, Spinner d8T3, Spinner e8T3, Spinner f8T3, Spinner a8R3, Spinner b8R3, Spinner c8R3, Spinner d8R3, Spinner e8R3, Spinner f8R3, Spinner a8C4, Spinner b8C4, Spinner c8C4, Spinner d8C4, Spinner e8C4, Spinner f8C4, Spinner a8T4, Spinner b8T4, Spinner c8T4, Spinner d8T4, Spinner e8T4, Spinner f8T4, Spinner a8R4, Spinner b8R4, Spinner c8R4, Spinner d8R4, Spinner e8R4, Spinner f8R4, Spinner a8C5, Spinner b8C5, Spinner c8C5, Spinner d8C5, Spinner e8C5, Spinner f8C5, Spinner a8T5, Spinner b8T5, Spinner c8T5, Spinner d8T5, Spinner e8T5, Spinner f8T5, Spinner a8R5, Spinner b8R5, Spinner c8R5, Spinner d8R5, Spinner e8R5, Spinner f8R5, Spinner a8C6, Spinner b8C6, Spinner c8C6, Spinner d8C6, Spinner e8C6, Spinner f8C6, Spinner a8T6, Spinner b8T6, Spinner c8T6, Spinner d8T6, Spinner e8T6, Spinner f8T6, Spinner a8R6, Spinner b8R6, Spinner c8R6, Spinner d8R6, Spinner e8R6, Spinner f8R6) {

        c8C.setSelection(3);
        d8C.setSelection(1);

        a8C2.setSelection(6);
        c8C2.setSelection(13);
        d8C2.setSelection(14);

        b8C4.setSelection(1);
        c8C4.setSelection(2);
        e8C4.setSelection(13);

        a8C6.setSelection(3);
        b8C6.setSelection(4);
        d8C6.setSelection(5);
    }

    public static void check9thSubject(Spinner a9thC, Spinner b9C, Spinner c9C, Spinner d9C, Spinner e9C, Spinner f9C, Spinner a9T, Spinner b9T, Spinner c9T, Spinner d9T, Spinner e9T, Spinner f9T, Spinner a9R, Spinner b9R, Spinner c9R, Spinner d9R, Spinner e9R, Spinner f9R, Spinner a9C2, Spinner b9C2, Spinner c9C2, Spinner d9C2, Spinner e9C2, Spinner f9C2, Spinner a9T2, Spinner b9T2, Spinner c9T2, Spinner d9T2, Spinner e9T2, Spinner f9T2, Spinner a9R2, Spinner b9R2, Spinner c9R2, Spinner d9R2, Spinner e9R2, Spinner f9R2, Spinner a9C3, Spinner b9C3, Spinner c9C3, Spinner d9C3, Spinner e9C3, Spinner f9C3, Spinner a9T3, Spinner b9T3, Spinner c9T3, Spinner d9T3, Spinner e9T3, Spinner f9T3, Spinner a9R3, Spinner b9R3, Spinner c9R3, Spinner d9R3, Spinner e9R3, Spinner f9R3, Spinner a9C4, Spinner b9C4, Spinner c9C4, Spinner d9C4, Spinner e9C4, Spinner f9C4, Spinner a9T4, Spinner b9T4, Spinner c9T4, Spinner d9T4, Spinner e9T4, Spinner f9T4, Spinner a9R4, Spinner b9R4, Spinner c9R4, Spinner d9R4, Spinner e9R4, Spinner f9R4, Spinner a9C5, Spinner b9C5, Spinner c9C5, Spinner d9C5, Spinner e9C5, Spinner f9C5, Spinner a9T5, Spinner b9T5, Spinner c9T5, Spinner d9T5, Spinner e9T5, Spinner f9T5, Spinner a9R5, Spinner b9R5, Spinner c9R5, Spinner d9R5, Spinner e9R5, Spinner f9R5, Spinner a9C6, Spinner b9C6, Spinner c9C6, Spinner d9C6, Spinner e9C6, Spinner f9C6, Spinner a9T6, Spinner b9T6, Spinner c9T6, Spinner d9T6, Spinner e9T6, Spinner f9T6, Spinner a9R6, Spinner b9R6, Spinner c9R6, Spinner d9R6, Spinner e9R6, Spinner f9R6) {

        d9C.setSelection(12);
        f9C.setSelection(14);

        c9C2.setSelection(4);
        d9C2.setSelection(6);
        f9C2.setSelection(1);

        b9C4.setSelection(12);
        c9C4.setSelection(12);
        d9C4.setSelection(1);

        b9C6.setSelection(14);
        c9C6.setSelection(15);
        e9C6.setSelection(5);

    }

    public static void check10thSubject(Spinner a10thC, Spinner b10C, Spinner c10C, Spinner d10C, Spinner e10C, Spinner f10C, Spinner a10T, Spinner b10T, Spinner c10T, Spinner d10T, Spinner e10T, Spinner f10T, Spinner a10R, Spinner b10R, Spinner c10R, Spinner d10R, Spinner e10R, Spinner f10R, Spinner a10C2, Spinner b10C2, Spinner c10C2, Spinner d10C2, Spinner e10C2, Spinner f10C2, Spinner a10T2, Spinner b10T2, Spinner c10T2, Spinner d10T2, Spinner e10T2, Spinner f10T2, Spinner a10R2, Spinner b10R2, Spinner c10R2, Spinner d10R2, Spinner e10R2, Spinner f10R2, Spinner a10C3, Spinner b10C3, Spinner c10C3, Spinner d10C3, Spinner e10C3, Spinner f10C3, Spinner a10T3, Spinner b10T3, Spinner c10T3, Spinner d10T3, Spinner e10T3, Spinner f10T3, Spinner a10R3, Spinner b10R3, Spinner c10R3, Spinner d10R3, Spinner e10R3, Spinner f10R3, Spinner a10C4, Spinner b10C4, Spinner c10C4, Spinner d10C4, Spinner e10C4, Spinner f10C4, Spinner a10T4, Spinner b10T4, Spinner c10T4, Spinner d10T4, Spinner e10T4, Spinner f10T4, Spinner a10R4, Spinner b10R4, Spinner c10R4, Spinner d10R4, Spinner e10R4, Spinner f10R4, Spinner a10C5, Spinner b10C5, Spinner c10C5, Spinner d10C5, Spinner e10C5, Spinner f10C5, Spinner a10T5, Spinner b10T5, Spinner c10T5, Spinner d10T5, Spinner e10T5, Spinner f10T5, Spinner a10R5, Spinner b10R5, Spinner c10R5, Spinner d10R5, Spinner e10R5, Spinner f10R5, Spinner a10C6, Spinner b10C6, Spinner c10C6, Spinner d10C6, Spinner e10C6, Spinner f10C6, Spinner a10T6, Spinner b10T6, Spinner c10T6, Spinner d10T6, Spinner e10T6, Spinner f10T6, Spinner a10R6, Spinner b10R6, Spinner c10R6, Spinner d10R6, Spinner e10R6, Spinner f10R6) {

        f10C.setSelection(9);

        d10C2.setSelection(8);
        f10C2.setSelection(11);

        a10C4.setSelection(12);
        b10C4.setSelection(12);
        d10C4.setSelection(11);

        c10C5.setSelection(13);
        d10C5.setSelection(3);

        b10C6.setSelection(9);
        c10C6.setSelection(10);
        e10C6.setSelection(14);
    }

    public static void check11thSubject(Spinner a11thC, Spinner b11C, Spinner c11C, Spinner d11C, Spinner e11C, Spinner f11C, Spinner a11T, Spinner b11T, Spinner c11T, Spinner d11T, Spinner e11T, Spinner f11T, Spinner a11R, Spinner b11R, Spinner c11R, Spinner d11R, Spinner e11R, Spinner f11R, Spinner a11C2, Spinner b11C2, Spinner c11C2, Spinner d11C2, Spinner e11C2, Spinner f11C2, Spinner a11T2, Spinner b11T2, Spinner c11T2, Spinner d11T2, Spinner e11T2, Spinner f11T2, Spinner a11R2, Spinner b11R2, Spinner c11R2, Spinner d11R2, Spinner e11R2, Spinner f11R2, Spinner a11C3, Spinner b11C3, Spinner c11C3, Spinner d11C3, Spinner e11C3, Spinner f11C3, Spinner a11T3, Spinner b11T3, Spinner c11T3, Spinner d11T3, Spinner e11T3, Spinner f11T3, Spinner a11R3, Spinner b11R3, Spinner c11R3, Spinner d11R3, Spinner e11R3, Spinner f11R3, Spinner a11C4, Spinner b11C4, Spinner c11C4, Spinner d11C4, Spinner e11C4, Spinner f11C4, Spinner a11T4, Spinner b11T4, Spinner c11T4, Spinner d11T4, Spinner e11T4, Spinner f11T4, Spinner a11R4, Spinner b11R4, Spinner c11R4, Spinner d11R4, Spinner e11R4, Spinner f11R4, Spinner a11C5, Spinner b11C5, Spinner c11C5, Spinner d11C5, Spinner e11C5, Spinner f11C5, Spinner a11T5, Spinner b11T5, Spinner c11T5, Spinner d11T5, Spinner e11T5, Spinner f11T5, Spinner a11R5, Spinner b11R5, Spinner c11R5, Spinner d11R5, Spinner e11R5, Spinner f11R5, Spinner a11C6, Spinner b11C6, Spinner c11C6, Spinner d11C6, Spinner e11C6, Spinner f11C6, Spinner a11T6, Spinner b11T6, Spinner c11T6, Spinner d11T6, Spinner e11T6, Spinner f11T6, Spinner a11R6, Spinner b11R6, Spinner c11R6, Spinner d11R6, Spinner e11R6, Spinner f11R6) {

        b11C4.setSelection(9);
        c11C4.setSelection(5);
        d11C4.setSelection(3);
        e11C4.setSelection(1);

        a11C5.setSelection(4);
        b11C5.setSelection(4);
        d11C5.setSelection(6);

        c11C6.setSelection(8);
        d11C6.setSelection(9);

    }

    public static void check12thSubject(Spinner a12thC, Spinner b12C, Spinner c12C, Spinner d12C, Spinner e12C, Spinner f12C, Spinner a12T, Spinner b12T, Spinner c12T, Spinner d12T, Spinner e12T, Spinner f12T, Spinner a12R, Spinner b12R, Spinner c12R, Spinner d12R, Spinner e12R, Spinner f12R, Spinner a12C2, Spinner b12C2, Spinner c12C2, Spinner d12C2, Spinner e12C2, Spinner f12C2, Spinner a12T2, Spinner b12T2, Spinner c12T2, Spinner d12T2, Spinner e12T2, Spinner f12T2, Spinner a12R2, Spinner b12R2, Spinner c12R2, Spinner d12R2, Spinner e12R2, Spinner f12R2, Spinner a12C3, Spinner b12C3, Spinner c12C3, Spinner d12C3, Spinner e12C3, Spinner f12C3, Spinner a12T3, Spinner b12T3, Spinner c12T3, Spinner d12T3, Spinner e12T3, Spinner f12T3, Spinner a12R3, Spinner b12R3, Spinner c12R3, Spinner d12R3, Spinner e12R3, Spinner f12R3, Spinner a12C4, Spinner b12C4, Spinner c12C4, Spinner d12C4, Spinner e12C4, Spinner f12C4, Spinner a12T4, Spinner b12T4, Spinner c12T4, Spinner d12T4, Spinner e12T4, Spinner f12T4, Spinner a12R4, Spinner b12R4, Spinner c12R4, Spinner d12R4, Spinner e12R4, Spinner f12R4, Spinner a12C5, Spinner b12C5, Spinner c12C5, Spinner d12C5, Spinner e12C5, Spinner f12C5, Spinner a12T5, Spinner b12T5, Spinner c12T5, Spinner d12T5, Spinner e12T5, Spinner f12T5, Spinner a12R5, Spinner b12R5, Spinner c12R5, Spinner d12R5, Spinner e12R5, Spinner f12R5, Spinner a12C6, Spinner b12C6, Spinner c12C6, Spinner d12C6, Spinner e12C6, Spinner f12C6, Spinner a12T6, Spinner b12T6, Spinner c12T6, Spinner d12T6, Spinner e12T6, Spinner f12T6, Spinner a12R6, Spinner b12R6, Spinner c12R6, Spinner d12R6, Spinner e12R6, Spinner f12R6) {

        c12C.setSelection(3);
        d12C.setSelection(2);

        b12C3.setSelection(3);

        c12C4.setSelection(5);

        a12C5.setSelection(4);
        b12C5.setSelection(4);
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
