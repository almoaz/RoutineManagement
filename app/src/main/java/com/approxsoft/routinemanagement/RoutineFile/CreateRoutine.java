package com.approxsoft.routinemanagement.RoutineFile;

import android.widget.EditText;
import android.widget.Spinner;

import java.util.HashMap;

public class CreateRoutine {

    public static void createRoutine(String sat, Spinner a1C, Spinner b1C, Spinner c1C, Spinner d1C, Spinner e1C, Spinner f1C, Spinner a1T, Spinner b1T, Spinner c1T, Spinner d1T, Spinner e1T, Spinner f1T, Spinner a1R, Spinner b1R, Spinner c1R, Spinner d1R, Spinner e1R, Spinner f1R, Spinner a2C, Spinner b2C, Spinner c2C, Spinner d2C, Spinner e2C, Spinner f2C, Spinner a2T, Spinner b2T, Spinner c2T, Spinner d2T, Spinner e2T, Spinner f2T, Spinner a2R, Spinner b2R, Spinner c2R, Spinner d2R, Spinner e2R, Spinner f2R, Spinner a3C, Spinner b3C, Spinner c3C, Spinner d3C, Spinner e3C, Spinner f3C, Spinner a3T, Spinner b3T, Spinner c3T, Spinner d3T, Spinner e3T, Spinner f3T, Spinner a3R, Spinner b3R, Spinner c3R, Spinner d3R, Spinner e3R, Spinner f3R, Spinner a4C, Spinner b4C, Spinner c4C, Spinner d4C, Spinner e4C, Spinner f4C, Spinner a4T, Spinner b4T, Spinner c4T, Spinner d4T, Spinner e4T, Spinner f4T, Spinner a4R, Spinner b4R, Spinner c4R, Spinner d4R, Spinner e4R, Spinner f4R, Spinner a5C, Spinner b5C, Spinner c5C, Spinner d5C, Spinner e5C, Spinner f5C, Spinner a5T, Spinner b5T, Spinner c5T, Spinner d5T, Spinner e5T, Spinner f5T, Spinner a5R, Spinner b5R, Spinner c5R, Spinner d5R, Spinner e5R, Spinner f5R, Spinner a6C, Spinner b6C, Spinner c6C, Spinner d6C, Spinner e6C, Spinner f6C, Spinner a6T, Spinner b6T, Spinner c6T, Spinner d6T, Spinner e6T, Spinner f6T, Spinner a6R, Spinner b6R, Spinner c6R, Spinner d6R, Spinner e6R, Spinner f6R, Spinner a7C, Spinner b7C, Spinner c7C, Spinner d7C, Spinner e7C, Spinner f7C, Spinner a7T, Spinner b7T, Spinner c7T, Spinner d7T, Spinner e7T, Spinner f7T, Spinner a7R, Spinner b7R, Spinner c7R, Spinner d7R, Spinner e7R, Spinner f7R, Spinner a8C, Spinner b8C, Spinner c8C, Spinner d8C, Spinner e8C, Spinner f8C, Spinner a8T, Spinner b8T, Spinner c8T, Spinner d8T, Spinner e8T, Spinner f8T, Spinner a8R, Spinner b8R, Spinner c8R, Spinner d8R, Spinner e8R, Spinner f8R, Spinner a9C, Spinner b9C, Spinner c9C, Spinner d9C, Spinner e9C, Spinner f9C, Spinner a9T, Spinner b9T, Spinner c9T, Spinner d9T, Spinner e9T, Spinner f9T, Spinner a9R, Spinner b9R, Spinner c9R, Spinner d9R, Spinner e9R, Spinner f9R, Spinner a10C, Spinner b10C, Spinner c10C, Spinner d10C, Spinner e10C, Spinner f10C, Spinner a10T, Spinner b10T, Spinner c10T, Spinner d10T, Spinner e10T, Spinner f10T, Spinner a10R, Spinner b10R, Spinner c10R, Spinner d10R, Spinner e10R, Spinner f10R, Spinner a11C, Spinner b11C, Spinner c11C, Spinner d11C, Spinner e11C, Spinner f11C, Spinner a11T, Spinner b11T, Spinner c11T, Spinner d11T, Spinner e11T, Spinner f11T, Spinner a11R, Spinner b11R, Spinner c11R, Spinner d11R, Spinner e11R, Spinner f11R, Spinner a12C, Spinner b12C, Spinner c12C, Spinner d12C, Spinner e12C, Spinner f12C, Spinner a12T, Spinner b12T, Spinner c12T, Spinner d12T, Spinner e12T, Spinner f12T, Spinner a12R, Spinner b12R, Spinner c12R, Spinner d12R, Spinner e12R, Spinner f12R)
    {
        HashMap<String, String> map = new HashMap<>();
        //----------for 1st semester -----------//
        map.put("A1C",a1C.getSelectedItem().toString());
        map.put("B1C",b1C.getSelectedItem().toString());
        map.put("C1C",c1C.getSelectedItem().toString());
        map.put("D1C",d1C.getSelectedItem().toString());
        map.put("E1C",e1C.getSelectedItem().toString());
        map.put("F1C",f1C.getSelectedItem().toString());

        map.put("A1T",a1T.getSelectedItem().toString());
        map.put("B1T",b1T.getSelectedItem().toString());
        map.put("C1T",c1T.getSelectedItem().toString());
        map.put("D1T",d1T.getSelectedItem().toString());
        map.put("E1T",e1T.getSelectedItem().toString());
        map.put("F1T",f1T.getSelectedItem().toString());

        map.put("A1R",a1R.getSelectedItem().toString());
        map.put("B1R",b1R.getSelectedItem().toString());
        map.put("C1R",c1R.getSelectedItem().toString());
        map.put("D1R",d1R.getSelectedItem().toString());
        map.put("E1R",e1R.getSelectedItem().toString());
        map.put("F1R",f1R.getSelectedItem().toString());


        //----------for 2nd semester -----------//
        map.put("A2C",a2C.getSelectedItem().toString());
        map.put("B2C",b2C.getSelectedItem().toString());
        map.put("C2C",c2C.getSelectedItem().toString());
        map.put("D2C",d2C.getSelectedItem().toString());
        map.put("E2C",e2C.getSelectedItem().toString());
        map.put("F2C",f2C.getSelectedItem().toString());

        map.put("A2T",a2T.getSelectedItem().toString());
        map.put("B2T",b2T.getSelectedItem().toString());
        map.put("C2T",c2T.getSelectedItem().toString());
        map.put("D2T",d2T.getSelectedItem().toString());
        map.put("E2T",e2T.getSelectedItem().toString());
        map.put("F2T",f2T.getSelectedItem().toString());

        map.put("A2R",a2R.getSelectedItem().toString());
        map.put("B2R",b2R.getSelectedItem().toString());
        map.put("C2R",c2R.getSelectedItem().toString());
        map.put("D2R",d2R.getSelectedItem().toString());
        map.put("E2R",e2R.getSelectedItem().toString());
        map.put("F2R",f2R.getSelectedItem().toString());


        //----------for 3rd semester -----------//
        map.put("A3C",a3C.getSelectedItem().toString());
        map.put("B3C",b3C.getSelectedItem().toString());
        map.put("C3C",c3C.getSelectedItem().toString());
        map.put("D3C",d3C.getSelectedItem().toString());
        map.put("E3C",e3C.getSelectedItem().toString());
        map.put("F3C",f3C.getSelectedItem().toString());

        map.put("A3T",a3T.getSelectedItem().toString());
        map.put("B3T",b3T.getSelectedItem().toString());
        map.put("C3T",c3T.getSelectedItem().toString());
        map.put("D3T",d3T.getSelectedItem().toString());
        map.put("E3T",e3T.getSelectedItem().toString());
        map.put("F3T",f3T.getSelectedItem().toString());

        map.put("A3R",a3R.getSelectedItem().toString());
        map.put("B3R",b3R.getSelectedItem().toString());
        map.put("C3R",c3R.getSelectedItem().toString());
        map.put("D3R",d3R.getSelectedItem().toString());
        map.put("E3R",e3R.getSelectedItem().toString());
        map.put("F3R",f3R.getSelectedItem().toString());

        //----------for 4th semester -----------//
        map.put("A4C",a4C.getSelectedItem().toString());
        map.put("B4C",b4C.getSelectedItem().toString());
        map.put("C4C",c4C.getSelectedItem().toString());
        map.put("D4C",d4C.getSelectedItem().toString());
        map.put("E4C",e4C.getSelectedItem().toString());
        map.put("F4C",f4C.getSelectedItem().toString());

        map.put("A4T",a4T.getSelectedItem().toString());
        map.put("B4T",b4T.getSelectedItem().toString());
        map.put("C4T",c4T.getSelectedItem().toString());
        map.put("D4T",d4T.getSelectedItem().toString());
        map.put("E4T",e4T.getSelectedItem().toString());
        map.put("F4T",f4T.getSelectedItem().toString());

        map.put("A4R",a4R.getSelectedItem().toString());
        map.put("B4R",b4R.getSelectedItem().toString());
        map.put("C4R",c4R.getSelectedItem().toString());
        map.put("D4R",d4R.getSelectedItem().toString());
        map.put("E4R",e4R.getSelectedItem().toString());
        map.put("F4R",f4R.getSelectedItem().toString());


        //----------for 5th semester -----------//
        map.put("A5C",a5C.getSelectedItem().toString());
        map.put("B5C",b5C.getSelectedItem().toString());
        map.put("C5C",c5C.getSelectedItem().toString());
        map.put("D5C",d5C.getSelectedItem().toString());
        map.put("E5C",e5C.getSelectedItem().toString());
        map.put("F5C",f5C.getSelectedItem().toString());

        map.put("A5T",a5T.getSelectedItem().toString());
        map.put("B5T",b5T.getSelectedItem().toString());
        map.put("C5T",c5T.getSelectedItem().toString());
        map.put("D5T",d5T.getSelectedItem().toString());
        map.put("E5T",e5T.getSelectedItem().toString());
        map.put("F5T",f5T.getSelectedItem().toString());

        map.put("A5R",a5R.getSelectedItem().toString());
        map.put("B5R",b5R.getSelectedItem().toString());
        map.put("C5R",c5R.getSelectedItem().toString());
        map.put("D5R",d5R.getSelectedItem().toString());
        map.put("E5R",e5R.getSelectedItem().toString());
        map.put("F5R",f5R.getSelectedItem().toString());


        //----------for 6th semester -----------//
        map.put("A6C",a6C.getSelectedItem().toString());
        map.put("B6C",b6C.getSelectedItem().toString());
        map.put("C6C",c6C.getSelectedItem().toString());
        map.put("D6C",d6C.getSelectedItem().toString());
        map.put("E6C",e6C.getSelectedItem().toString());
        map.put("F6C",f6C.getSelectedItem().toString());

        map.put("A6T",a6T.getSelectedItem().toString());
        map.put("B6T",b6T.getSelectedItem().toString());
        map.put("C6T",c6T.getSelectedItem().toString());
        map.put("D6T",d6T.getSelectedItem().toString());
        map.put("E6T",e6T.getSelectedItem().toString());
        map.put("F6T",f6T.getSelectedItem().toString());

        map.put("A6R",a6R.getSelectedItem().toString());
        map.put("B6R",b6R.getSelectedItem().toString());
        map.put("C6R",c6R.getSelectedItem().toString());
        map.put("D6R",d6R.getSelectedItem().toString());
        map.put("E6R",e6R.getSelectedItem().toString());
        map.put("F6R",f6R.getSelectedItem().toString());

        //----------for 7th semester -----------//
        map.put("A7C",a7C.getSelectedItem().toString());
        map.put("B7C",b7C.getSelectedItem().toString());
        map.put("C7C",c7C.getSelectedItem().toString());
        map.put("D7C",d7C.getSelectedItem().toString());
        map.put("E7C",e7C.getSelectedItem().toString());
        map.put("F7C",f7C.getSelectedItem().toString());

        map.put("A7T",a7T.getSelectedItem().toString());
        map.put("B7T",b7T.getSelectedItem().toString());
        map.put("C7T",c7T.getSelectedItem().toString());
        map.put("D7T",d7T.getSelectedItem().toString());
        map.put("E7T",e7T.getSelectedItem().toString());
        map.put("F7T",f7T.getSelectedItem().toString());

        map.put("A7R",a7R.getSelectedItem().toString());
        map.put("B7R",b7R.getSelectedItem().toString());
        map.put("C7R",c7R.getSelectedItem().toString());
        map.put("D7R",d7R.getSelectedItem().toString());
        map.put("E7R",e7R.getSelectedItem().toString());
        map.put("F7R",f7R.getSelectedItem().toString());

        //----------for 8th semester -----------//
        map.put("A8C",a8C.getSelectedItem().toString());
        map.put("B8C",b8C.getSelectedItem().toString());
        map.put("C8C",c8C.getSelectedItem().toString());
        map.put("D8C",d8C.getSelectedItem().toString());
        map.put("E8C",e8C.getSelectedItem().toString());
        map.put("F8C",f8C.getSelectedItem().toString());

        map.put("A8T",a8T.getSelectedItem().toString());
        map.put("B8T",b8T.getSelectedItem().toString());
        map.put("C8T",c8T.getSelectedItem().toString());
        map.put("D8T",d8T.getSelectedItem().toString());
        map.put("E8T",e8T.getSelectedItem().toString());
        map.put("F8T",f8T.getSelectedItem().toString());

        map.put("A8R",a8R.getSelectedItem().toString());
        map.put("B8R",b8R.getSelectedItem().toString());
        map.put("C8R",c8R.getSelectedItem().toString());
        map.put("D8R",d8R.getSelectedItem().toString());
        map.put("E8R",e8R.getSelectedItem().toString());
        map.put("F8R",f8R.getSelectedItem().toString());


        //----------for 9th semester -----------//
        map.put("A9C",a9C.getSelectedItem().toString());
        map.put("B9C",b9C.getSelectedItem().toString());
        map.put("C9C",c9C.getSelectedItem().toString());
        map.put("D9C",d9C.getSelectedItem().toString());
        map.put("E9C",e9C.getSelectedItem().toString());
        map.put("F9C",f9C.getSelectedItem().toString());

        map.put("A9T",a9T.getSelectedItem().toString());
        map.put("B9T",b9T.getSelectedItem().toString());
        map.put("C9T",c9T.getSelectedItem().toString());
        map.put("D9T",d9T.getSelectedItem().toString());
        map.put("E9T",e9T.getSelectedItem().toString());
        map.put("F9T",f9T.getSelectedItem().toString());

        map.put("A9R",a9R.getSelectedItem().toString());
        map.put("B9R",b9R.getSelectedItem().toString());
        map.put("C9R",c9R.getSelectedItem().toString());
        map.put("D9R",d9R.getSelectedItem().toString());
        map.put("E9R",e9R.getSelectedItem().toString());
        map.put("F9R",f9R.getSelectedItem().toString());


        //----------for 10th semester -----------//
        map.put("A10C",a10C.getSelectedItem().toString());
        map.put("B10C",b10C.getSelectedItem().toString());
        map.put("C10C",c10C.getSelectedItem().toString());
        map.put("D10C",d10C.getSelectedItem().toString());
        map.put("E10C",e10C.getSelectedItem().toString());
        map.put("F10C",f10C.getSelectedItem().toString());

        map.put("A10T",a10T.getSelectedItem().toString());
        map.put("B10T",b10T.getSelectedItem().toString());
        map.put("C10T",c10T.getSelectedItem().toString());
        map.put("D10T",d10T.getSelectedItem().toString());
        map.put("E10T",e10T.getSelectedItem().toString());
        map.put("F10T",f10T.getSelectedItem().toString());

        map.put("A10R",a10R.getSelectedItem().toString());
        map.put("B10R",b10R.getSelectedItem().toString());
        map.put("C10R",c10R.getSelectedItem().toString());
        map.put("D10R",d10R.getSelectedItem().toString());
        map.put("E10R",e10R.getSelectedItem().toString());
        map.put("F10R",f10R.getSelectedItem().toString());


        //----------for 11th semester -----------//
        map.put("A11C",a11C.getSelectedItem().toString());
        map.put("B11C",b11C.getSelectedItem().toString());
        map.put("C11C",c11C.getSelectedItem().toString());
        map.put("D11C",d11C.getSelectedItem().toString());
        map.put("E11C",e11C.getSelectedItem().toString());
        map.put("F11C",f11C.getSelectedItem().toString());

        map.put("A11T",a11T.getSelectedItem().toString());
        map.put("B11T",b11T.getSelectedItem().toString());
        map.put("C11T",c11T.getSelectedItem().toString());
        map.put("D11T",d11T.getSelectedItem().toString());
        map.put("E11T",e11T.getSelectedItem().toString());
        map.put("F11T",f11T.getSelectedItem().toString());

        map.put("A11R",a11R.getSelectedItem().toString());
        map.put("B11R",b11R.getSelectedItem().toString());
        map.put("C11R",c11R.getSelectedItem().toString());
        map.put("D11R",d11R.getSelectedItem().toString());
        map.put("E11R",e11R.getSelectedItem().toString());
        map.put("F11R",f11R.getSelectedItem().toString());


        //----------for 12th semester -----------//
        map.put("A12C",a12C.getSelectedItem().toString());
        map.put("B12C",b12C.getSelectedItem().toString());
        map.put("C12C",c12C.getSelectedItem().toString());
        map.put("D12C",d12C.getSelectedItem().toString());
        map.put("E12C",e12C.getSelectedItem().toString());
        map.put("F12C",f12C.getSelectedItem().toString());

        map.put("A12T",a12T.getSelectedItem().toString());
        map.put("B12T",b12T.getSelectedItem().toString());
        map.put("C12T",c12T.getSelectedItem().toString());
        map.put("D12T",d12T.getSelectedItem().toString());
        map.put("E12T",e12T.getSelectedItem().toString());
        map.put("F12T",f12T.getSelectedItem().toString());

        map.put("A12R",a12R.getSelectedItem().toString());
        map.put("B12R",b12R.getSelectedItem().toString());
        map.put("C12R",c12R.getSelectedItem().toString());
        map.put("D12R",d12R.getSelectedItem().toString());
        map.put("E12R",e12R.getSelectedItem().toString());
        map.put("F12R",f12R.getSelectedItem().toString());

    }

    public static void routineTime(EditText aTime, EditText bTime, EditText cTime, EditText dTime, EditText eTime, EditText fTime)
    {
        HashMap<String, String> map = new HashMap<>();
        //----------for 1st semester -----------//
        map.put("aTime",aTime.getText().toString());
        map.put("bTime",bTime.getText().toString());
        map.put("cTime",cTime.getText().toString());
        map.put("dTime",dTime.getText().toString());
        map.put("eTime",eTime.getText().toString());
        map.put("fTime",fTime.getText().toString());
    }
}
