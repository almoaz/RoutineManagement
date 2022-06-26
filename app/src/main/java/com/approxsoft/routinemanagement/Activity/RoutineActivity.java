package com.approxsoft.routinemanagement.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.approxsoft.routinemanagement.R;
import com.approxsoft.routinemanagement.RoutineFile.Routine;
import com.approxsoft.routinemanagement.RoutineFile.RoutineCheck;

public class RoutineActivity extends AppCompatActivity {

    ///----------for Routine Time And Semester Auto Select ---------///
    EditText aTime,bTime,cTime,dTime,eTime,fTime;
    Spinner sATime,sBTime,sCTime,sDTime,sETime,sFTime;
    Spinner select1st,select2nd,select3rd,select4th,select5th,select6th,select7th,select8th,select9th,select10th,select11th,select12th, weekSelect, routineConditionSelect;
    TextView select1stText,select2ndText,select3rdText,select4thText,select5thText,select6thText,select7thText,select8thText,select9thText,select10thText,select11thText,select12thText,weekSelectText, routineConditionSelectText,routineCount;

    ///----------for 1st Semester Routine Cell ---------///
    Spinner A1stC,B1stC,C1stC,D1stC,E1stC,F1stC, A1stT,B1stT,C1stT,D1stT,E1stT,F1stT, A1stR,B1stR,C1stR,D1stR,E1stR,F1stR, A1C2,B1C2,C1C2,D1C2,E1C2,F1C2, A1T2,B1T2,C1T2,D1T2,E1T2,F1T2, A1R2,B1R2,C1R2,D1R2,E1R2,F1R2, A1C3,B1C3,C1C3,D1C3,E1C3,F1C3, A1T3,B1T3,C1T3,D1T3,E1T3,F1T3, A1R3,B1R3,C1R3,D1R3,E1R3,F1R3, A1C4,B1C4,C1C4,D1C4,E1C4,F1C4, A1T4,B1T4,C1T4,D1T4,E1T4,F1T4, A1R4,B1R4,C1R4,D1R4,E1R4,F1R4, A1C5,B1C5,C1C5,D1C5,E1C5,F1C5,A1T5,B1T5,C1T5,D1T5,E1T5,F1T5,A1R5,B1R5,C1R5,D1R5,E1R5,F1R5, A1C6,B1C6,C1C6,D1C6,E1C6,F1C6,A1T6,B1T6,C1T6,D1T6,E1T6,F1T6,A1R6,B1R6,C1R6,D1R6,E1R6,F1R6 ,A1C7,B1C7,C1C7,D1C7,E1C7,F1C7,A1T7,B1T7,C1T7,D1T7,E1T7,F1T7,A1R7,B1R7,C1R7,D1R7,E1R7,F1R7;

    ///----------for 2nd Semester Routine Cell ---------///
    Spinner A2ndC,B2C,C2C,D2C,E2C,F2C, A2T,B2T,C2T,D2T,E2T,F2T, A2R,B2R,C2R,D2R,E2R,F2R, A2C2,B2C2,C2C2,D2C2,E2C2,F2C2, A2T2,B2T2,C2T2,D2T2,E2T2,F2T2, A2R2,B2R2,C2R2,D2R2,E2R2,F2R2, A2C3,B2C3,C2C3,D2C3,E2C3,F2C3, A2T3,B2T3,C2T3,D2T3,E2T3,F2T3, A2R3,B2R3,C2R3,D2R3,E2R3,F2R3  ,A2C4,B2C4,C2C4,D2C4,E2C4,F2C4,A2T4,B2T4,C2T4,D2T4,E2T4,F2T4,A2R4,B2R4,C2R4,D2R4,E2R4,F2R4,A2C5,B2C5,C2C5,D2C5,E2C5,F2C5,A2T5,B2T5,C2T5,D2T5,E2T5,F2T5,A2R5,B2R5,C2R5,D2R5,E2R5,F2R5,A2C6,B2C6,C2C6,D2C6,E2C6,F2C6,A2T6,B2T6,C2T6,D2T6,E2T6,F2T6,A2R6,B2R6,C2R6,D2R6,E2R6,F2R6 ,A2C7,B2C7,C2C7,D2C7,E2C7,F2C7,A2T7,B2T7,C2T7,D2T7,E2T7,F2T7,A2R7,B2R7,C2R7,D2R7,E2R7,F2R7;

    //----------for 3rd Semester Routine Cell ---------///
    Spinner A3rdC,B3C,C3C,D3C,E3C,F3C, A3T,B3T,C3T,D3T,E3T,F3T, A3R,B3R,C3R,D3R,E3R,F3R , A3C2,B3C2,C3C2,D3C2,E3C2,F3C2, A3T2,B3T2,C3T2,D3T2,E3T2,F3T2, A3R2,B3R2,C3R2,D3R2,E3R2,F3R2, A3C3,B3C3,C3C3,D3C3,E3C3,F3C3, A3T3,B3T3,C3T3,D3T3,E3T3,F3T3, A3R3,B3R3,C3R3,D3R3,E3R3,F3R3 ,A3C4,B3C4,C3C4,D3C4,E3C4,F3C4,A3T4,B3T4,C3T4,D3T4,E3T4,F3T4,A3R4,B3R4,C3R4,D3R4,E3R4,F3R4,A3C5,B3C5,C3C5,D3C5,E3C5,F3C5,A3T5,B3T5,C3T5,D3T5,E3T5,F3T5,A3R5,B3R5,C3R5,D3R5,E3R5,F3R5,A3C6,B3C6,C3C6,D3C6,E3C6,F3C6,A3T6,B3T6,C3T6,D3T6,E3T6,F3T6,A3R6,B3R6,C3R6,D3R6,E3R6,F3R6 ,A3C7,B3C7,C3C7,D3C7,E3C7,F3C7,A3T7,B3T7,C3T7,D3T7,E3T7,F3T7,A3R7,B3R7,C3R7,D3R7,E3R7,F3R7;

    //----------for 4th Semester Routine Cell ---------///
    Spinner A4thC,B4C,C4C,D4C,E4C,F4C, A4T,B4T,C4T,D4T,E4T,F4T, A4R,B4R,C4R,D4R,E4R,F4R , A4C2,B4C2,C4C2,D4C2,E4C2,F4C2, A4T2,B4T2,C4T2,D4T2,E4T2,F4T2, A4R2,B4R2,C4R2,D4R2,E4R2,F4R2, A4C3,B4C3,C4C3,D4C3,E4C3,F4C3, A4T3,B4T3,C4T3,D4T3,E4T3,F4T3, A4R3,B4R3,C4R3,D4R3,E4R3,F4R3 ,A4C4,B4C4,C4C4,D4C4,E4C4,F4C4,A4T4,B4T4,C4T4,D4T4,E4T4,F4T4,A4R4,B4R4,C4R4,D4R4,E4R4,F4R4,A4C5,B4C5,C4C5,D4C5,E4C5,F4C5,A4T5,B4T5,C4T5,D4T5,E4T5,F4T5,A4R5,B4R5,C4R5,D4R5,E4R5,F4R5,A4C6,B4C6,C4C6,D4C6,E4C6,F4C6,A4T6,B4T6,C4T6,D4T6,E4T6,F4T6,A4R6,B4R6,C4R6,D4R6,E4R6,F4R6 ,A4C7,B4C7,C4C7,D4C7,E4C7,F4C7,A4T7,B4T7,C4T7,D4T7,E4T7,F4T7,A4R7,B4R7,C4R7,D4R7,E4R7,F4R7;

    //----------for 5th Semester Routine Cell ---------///
    Spinner A5thC,B5C,C5C,D5C,E5C,F5C, A5T,B5T,C5T,D5T,E5T,F5T, A5R,B5R,C5R,D5R,E5R,F5R , A5C2,B5C2,C5C2,D5C2,E5C2,F5C2, A5T2,B5T2,C5T2,D5T2,E5T2,F5T2, A5R2,B5R2,C5R2,D5R2,E5R2,F5R2, A5C3,B5C3,C5C3,D5C3,E5C3,F5C3, A5T3,B5T3,C5T3,D5T3,E5T3,F5T3, A5R3,B5R3,C5R3,D5R3,E5R3,F5R3 ,A5C4,B5C4,C5C4,D5C4,E5C4,F5C4,A5T4,B5T4,C5T4,D5T4,E5T4,F5T4,A5R4,B5R4,C5R4,D5R4,E5R4,F5R4,A5C5,B5C5,C5C5,D5C5,E5C5,F5C5,A5T5,B5T5,C5T5,D5T5,E5T5,F5T5,A5R5,B5R5,C5R5,D5R5,E5R5,F5R5,A5C6,B5C6,C5C6,D5C6,E5C6,F5C6,A5T6,B5T6,C5T6,D5T6,E5T6,F5T6,A5R6,B5R6,C5R6,D5R6,E5R6,F5R6 ,A5C7,B5C7,C5C7,D5C7,E5C7,F5C7,A5T7,B5T7,C5T7,D5T7,E5T7,F5T7,A5R7,B5R7,C5R7,D5R7,E5R7,F5R7;

    //----------for 6th Semester Routine Cell ---------///
    Spinner A6thC,B6C,C6C,D6C,E6C,F6C, A6T,B6T,C6T,D6T,E6T,F6T, A6R,B6R,C6R,D6R,E6R,F6R , A6C2,B6C2,C6C2,D6C2,E6C2,F6C2, A6T2,B6T2,C6T2,D6T2,E6T2,F6T2, A6R2,B6R2,C6R2,D6R2,E6R2,F6R2, A6C3,B6C3,C6C3,D6C3,E6C3,F6C3, A6T3,B6T3,C6T3,D6T3,E6T3,F6T3, A6R3,B6R3,C6R3,D6R3,E6R3,F6R3 ,A6C4,B6C4,C6C4,D6C4,E6C4,F6C4,A6T4,B6T4,C6T4,D6T4,E6T4,F6T4,A6R4,B6R4,C6R4,D6R4,E6R4,F6R4,A6C5,B6C5,C6C5,D6C5,E6C5,F6C5,A6T5,B6T5,C6T5,D6T5,E6T5,F6T5,A6R5,B6R5,C6R5,D6R5,E6R5,F6R5,A6C6,B6C6,C6C6,D6C6,E6C6,F6C6,A6T6,B6T6,C6T6,D6T6,E6T6,F6T6,A6R6,B6R6,C6R6,D6R6,E6R6,F6R6 ,A6C7,B6C7,C6C7,D6C7,E6C7,F6C7,A6T7,B6T7,C6T7,D6T7,E6T7,F6T7,A6R7,B6R7,C6R7,D6R7,E6R7,F6R7;

    //----------for 7th Semester Routine Cell ---------///
    Spinner A7thC,B7C,C7C,D7C,E7C,F7C, A7T,B7T,C7T,D7T,E7T,F7T, A7R,B7R,C7R,D7R,E7R,F7R , A7C2,B7C2,C7C2,D7C2,E7C2,F7C2, A7T2,B7T2,C7T2,D7T2,E7T2,F7T2, A7R2,B7R2,C7R2,D7R2,E7R2,F7R2, A7C3,B7C3,C7C3,D7C3,E7C3,F7C3, A7T3,B7T3,C7T3,D7T3,E7T3,F7T3, A7R3,B7R3,C7R3,D7R3,E7R3,F7R3 ,A7C4,B7C4,C7C4,D7C4,E7C4,F7C4,A7T4,B7T4,C7T4,D7T4,E7T4,F7T4,A7R4,B7R4,C7R4,D7R4,E7R4,F7R4,A7C5,B7C5,C7C5,D7C5,E7C5,F7C5,A7T5,B7T5,C7T5,D7T5,E7T5,F7T5,A7R5,B7R5,C7R5,D7R5,E7R5,F7R5,A7C6,B7C6,C7C6,D7C6,E7C6,F7C6,A7T6,B7T6,C7T6,D7T6,E7T6,F7T6,A7R6,B7R6,C7R6,D7R6,E7R6,F7R6 ,A7C7,B7C7,C7C7,D7C7,E7C7,F7C7,A7T7,B7T7,C7T7,D7T7,E7T7,F7T7,A7R7,B7R7,C7R7,D7R7,E7R7,F7R7;

    //----------for 8th Semester Routine Cell ---------///
    Spinner A8thC,B8C,C8C,D8C,E8C,F8C, A8T,B8T,C8T,D8T,E8T,F8T, A8R,B8R,C8R,D8R,E8R,F8R , A8C2,B8C2,C8C2,D8C2,E8C2,F8C2, A8T2,B8T2,C8T2,D8T2,E8T2,F8T2, A8R2,B8R2,C8R2,D8R2,E8R2,F8R2, A8C3,B8C3,C8C3,D8C3,E8C3,F8C3, A8T3,B8T3,C8T3,D8T3,E8T3,F8T3, A8R3,B8R3,C8R3,D8R3,E8R3,F8R3 ,A8C4,B8C4,C8C4,D8C4,E8C4,F8C4,A8T4,B8T4,C8T4,D8T4,E8T4,F8T4,A8R4,B8R4,C8R4,D8R4,E8R4,F8R4,A8C5,B8C5,C8C5,D8C5,E8C5,F8C5,A8T5,B8T5,C8T5,D8T5,E8T5,F8T5,A8R5,B8R5,C8R5,D8R5,E8R5,F8R5,A8C6,B8C6,C8C6,D8C6,E8C6,F8C6,A8T6,B8T6,C8T6,D8T6,E8T6,F8T6,A8R6,B8R6,C8R6,D8R6,E8R6,F8R6 ,A8C7,B8C7,C8C7,D8C7,E8C7,F8C7,A8T7,B8T7,C8T7,D8T7,E8T7,F8T7,A8R7,B8R7,C8R7,D8R7,E8R7,F8R7;

    //----------for 9th Semester Routine Cell ---------///
    Spinner A9thC,B9C,C9C,D9C,E9C,F9C, A9T,B9T,C9T,D9T,E9T,F9T, A9R,B9R,C9R,D9R,E9R,F9R , A9C2,B9C2,C9C2,D9C2,E9C2,F9C2, A9T2,B9T2,C9T2,D9T2,E9T2,F9T2, A9R2,B9R2,C9R2,D9R2,E9R2,F9R2, A9C3,B9C3,C9C3,D9C3,E9C3,F9C3, A9T3,B9T3,C9T3,D9T3,E9T3,F9T3, A9R3,B9R3,C9R3,D9R3,E9R3,F9R3 ,A9C4,B9C4,C9C4,D9C4,E9C4,F9C4,A9T4,B9T4,C9T4,D9T4,E9T4,F9T4,A9R4,B9R4,C9R4,D9R4,E9R4,F9R4,A9C5,B9C5,C9C5,D9C5,E9C5,F9C5,A9T5,B9T5,C9T5,D9T5,E9T5,F9T5,A9R5,B9R5,C9R5,D9R5,E9R5,F9R5,A9C6,B9C6,C9C6,D9C6,E9C6,F9C6,A9T6,B9T6,C9T6,D9T6,E9T6,F9T6,A9R6,B9R6,C9R6,D9R6,E9R6,F9R6 ,A9C7,B9C7,C9C7,D9C7,E9C7,F9C7,A9T7,B9T7,C9T7,D9T7,E9T7,F9T7,A9R7,B9R7,C9R7,D9R7,E9R7,F9R7;

    //----------for 10th Semester Routine Cell ---------///
    Spinner A10thC,B10C,C10C,D10C,E10C,F10C, A10T,B10T,C10T,D10T,E10T,F10T, A10R,B10R,C10R,D10R,E10R,F10R , A10C2,B10C2,C10C2,D10C2,E10C2,F10C2, A10T2,B10T2,C10T2,D10T2,E10T2,F10T2, A10R2,B10R2,C10R2,D10R2,E10R2,F10R2, A10C3,B10C3,C10C3,D10C3,E10C3,F10C3, A10T3,B10T3,C10T3,D10T3,E10T3,F10T3, A10R3,B10R3,C10R3,D10R3,E10R3,F10R3 ,A10C4,B10C4,C10C4,D10C4,E10C4,F10C4,A10T4,B10T4,C10T4,D10T4,E10T4,F10T4,A10R4,B10R4,C10R4,D10R4,E10R4,F10R4,A10C5,B10C5,C10C5,D10C5,E10C5,F10C5,A10T5,B10T5,C10T5,D10T5,E10T5,F10T5,A10R5,B10R5,C10R5,D10R5,E10R5,F10R5,A10C6,B10C6,C10C6,D10C6,E10C6,F10C6,A10T6,B10T6,C10T6,D10T6,E10T6,F10T6,A10R6,B10R6,C10R6,D10R6,E10R6,F10R6 ,A10C7,B10C7,C10C7,D10C7,E10C7,F10C7,A10T7,B10T7,C10T7,D10T7,E10T7,F10T7,A10R7,B10R7,C10R7,D10R7,E10R7,F10R7;

    //----------for 11th Semester Routine Cell ---------///
    Spinner A11thC,B11C,C11C,D11C,E11C,F11C, A11T,B11T,C11T,D11T,E11T,F11T, A11R,B11R,C11R,D11R,E11R,F11R , A11C2,B11C2,C11C2,D11C2,E11C2,F11C2, A11T2,B11T2,C11T2,D11T2,E11T2,F11T2, A11R2,B11R2,C11R2,D11R2,E11R2,F11R2, A11C3,B11C3,C11C3,D11C3,E11C3,F11C3, A11T3,B11T3,C11T3,D11T3,E11T3,F11T3, A11R3,B11R3,C11R3,D11R3,E11R3,F11R3 ,A11C4,B11C4,C11C4,D11C4,E11C4,F11C4,A11T4,B11T4,C11T4,D11T4,E11T4,F11T4,A11R4,B11R4,C11R4,D11R4,E11R4,F11R4,A11C5,B11C5,C11C5,D11C5,E11C5,F11C5,A11T5,B11T5,C11T5,D11T5,E11T5,F11T5,A11R5,B11R5,C11R5,D11R5,E11R5,F11R5,A11C6,B11C6,C11C6,D11C6,E11C6,F11C6,A11T6,B11T6,C11T6,D11T6,E11T6,F11T6,A11R6,B11R6,C11R6,D11R6,E11R6,F11R6 ,A11C7,B11C7,C11C7,D11C7,E11C7,F11C7,A11T7,B11T7,C11T7,D11T7,E11T7,F11T7,A11R7,B11R7,C11R7,D11R7,E11R7,F11R7;

    //----------for 12th Semester Routine Cell ---------///
    Spinner A12thC,B12C,C12C,D12C,E12C,F12C, A12T,B12T,C12T,D12T,E12T,F12T, A12R,B12R,C12R,D12R,E12R,F12R , A12C2,B12C2,C12C2,D12C2,E12C2,F12C2, A12T2,B12T2,C12T2,D12T2,E12T2,F12T2, A12R2,B12R2,C12R2,D12R2,E12R2,F12R2, A12C3,B12C3,C12C3,D12C3,E12C3,F12C3, A12T3,B12T3,C12T3,D12T3,E12T3,F12T3, A12R3,B12R3,C12R3,D12R3,E12R3,F12R3 ,A12C4,B12C4,C12C4,D12C4,E12C4,F12C4,A12T4,B12T4,C12T4,D12T4,E12T4,F12T4,A12R4,B12R4,C12R4,D12R4,E12R4,F12R4,A12C5,B12C5,C12C5,D12C5,E12C5,F12C5,A12T5,B12T5,C12T5,D12T5,E12T5,F12T5,A12R5,B12R5,C12R5,D12R5,E12R5,F12R5,A12C6,B12C6,C12C6,D12C6,E12C6,F12C6,A12T6,B12T6,C12T6,D12T6,E12T6,F12T6,A12R6,B12R6,C12R6,D12R6,E12R6,F12R6 ,A12C7,B12C7,C12C7,D12C7,E12C7,F12C7,A12T7,B12T7,C12T7,D12T7,E12T7,F12T7,A12R7,B12R7,C12R7,D12R7,E12R7,F12R7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);


        ///----------for 1st Semester Routine Cell ---------///
        A1stC = findViewById(R.id.A_1st_C);
        B1stC = findViewById(R.id.B_1st_C);
        C1stC = findViewById(R.id.C_1st_C);
        D1stC = findViewById(R.id.D_1st_C);
        E1stC = findViewById(R.id.E_1st_C);
        F1stC = findViewById(R.id.F_1st_C);

        A1stT = findViewById(R.id.A_1st_T);
        B1stT = findViewById(R.id.B_1st_T);
        C1stT = findViewById(R.id.C_1st_T);
        D1stT = findViewById(R.id.D_1st_T);
        E1stT = findViewById(R.id.E_1st_T);
        F1stT = findViewById(R.id.F_1st_T);

        A1stR = findViewById(R.id.A_1st_R);
        B1stR = findViewById(R.id.B_1st_R);
        C1stR = findViewById(R.id.C_1st_R);
        D1stR = findViewById(R.id.D_1st_R);
        E1stR = findViewById(R.id.E_1st_R);
        F1stR = findViewById(R.id.F_1st_R);
        //-------- for sunday --------/
        A1C2 = findViewById(R.id.A_1st_C2);
        B1C2 = findViewById(R.id.B_1st_C2);
        C1C2 = findViewById(R.id.C_1st_C2);
        D1C2 = findViewById(R.id.D_1st_C2);
        E1C2 = findViewById(R.id.E_1st_C2);
        F1C2 = findViewById(R.id.F_1st_C2);

        A1T2 = findViewById(R.id.A_1st_T2);
        B1T2 = findViewById(R.id.B_1st_T2);
        C1T2 = findViewById(R.id.C_1st_T2);
        D1T2 = findViewById(R.id.D_1st_T2);
        E1T2 = findViewById(R.id.E_1st_T2);
        F1T2 = findViewById(R.id.F_1st_T2);

        A1R2 = findViewById(R.id.A_1st_R2);
        B1R2 = findViewById(R.id.B_1st_R2);
        C1R2 = findViewById(R.id.C_1st_R2);
        D1R2 = findViewById(R.id.D_1st_R2);
        E1R2 = findViewById(R.id.E_1st_R2);
        F1R2 = findViewById(R.id.F_1st_R2);

        A1C4 = findViewById(R.id.A_1st_C4);
        B1C4 = findViewById(R.id.B_1st_C4);
        C1C4 = findViewById(R.id.C_1st_C4);
        D1C4 = findViewById(R.id.D_1st_C4);
        E1C4 = findViewById(R.id.E_1st_C4);
        F1C4 = findViewById(R.id.F_1st_C4);
        A1T4 = findViewById(R.id.A_1st_T4);
        B1T4 = findViewById(R.id.B_1st_T4);
        C1T4 = findViewById(R.id.C_1st_T4);
        D1T4 = findViewById(R.id.D_1st_T4);
        E1T4 = findViewById(R.id.E_1st_T4);
        F1T4 = findViewById(R.id.F_1st_T4);
        A1R4 = findViewById(R.id.A_1st_R4);
        B1R4 = findViewById(R.id.B_1st_R4);
        C1R4 = findViewById(R.id.C_1st_R4);
        D1R4 = findViewById(R.id.D_1st_R4);
        E1R4 = findViewById(R.id.E_1st_R4);
        F1R4 = findViewById(R.id.F_1st_R4);
        A1C5 = findViewById(R.id.A_1st_C5);
        B1C5 = findViewById(R.id.B_1st_C5);
        C1C5 = findViewById(R.id.C_1st_C5);
        D1C5 = findViewById(R.id.D_1st_C5);
        E1C5 = findViewById(R.id.E_1st_C5);
        F1C5 = findViewById(R.id.F_1st_C5);
        A1T5 = findViewById(R.id.A_1st_T5);
        B1T5 = findViewById(R.id.B_1st_T5);
        C1T5 = findViewById(R.id.C_1st_T5);
        D1T5 = findViewById(R.id.D_1st_T5);
        E1T5 = findViewById(R.id.E_1st_T5);
        F1T5 = findViewById(R.id.F_1st_T5);
        A1R5 = findViewById(R.id.A_1st_R5);
        B1R5 = findViewById(R.id.B_1st_R5);
        C1R5 = findViewById(R.id.C_1st_R5);
        D1R5 = findViewById(R.id.D_1st_R5);
        E1R5 = findViewById(R.id.E_1st_R5);
        F1R5 = findViewById(R.id.F_1st_R5);
        A1C6 = findViewById(R.id.A_1st_C6);
        B1C6 = findViewById(R.id.B_1st_C6);
        C1C6 = findViewById(R.id.C_1st_C6);
        D1C6 = findViewById(R.id.D_1st_C6);
        E1C6 = findViewById(R.id.E_1st_C6);
        F1C6 = findViewById(R.id.F_1st_C6);
        A1T6 = findViewById(R.id.A_1st_T6);
        B1T6 = findViewById(R.id.B_1st_T6);
        C1T6 = findViewById(R.id.C_1st_T6);
        D1T6 = findViewById(R.id.D_1st_T6);
        E1T6 = findViewById(R.id.E_1st_T6);
        F1T6 = findViewById(R.id.F_1st_T6);
        A1R6 = findViewById(R.id.A_1st_R6);
        B1R6 = findViewById(R.id.B_1st_R6);
        C1R6 = findViewById(R.id.C_1st_R6);
        D1R6 = findViewById(R.id.D_1st_R6);
        E1R6 = findViewById(R.id.E_1st_R6);
        F1R6 = findViewById(R.id.F_1st_R6);
        A1R6 = findViewById(R.id.A_1st_R6);

        A1C7 = findViewById(R.id.A_1st_C7);
        B1C7 = findViewById(R.id.B_1st_C7);
        C1C7 = findViewById(R.id.C_1st_C7);
        D1C7 = findViewById(R.id.D_1st_C7);
        E1C7 = findViewById(R.id.E_1st_C7);
        F1C7 = findViewById(R.id.F_1st_C7);
        A1T7 = findViewById(R.id.A_1st_T7);
        B1T7 = findViewById(R.id.B_1st_T7);
        C1T7 = findViewById(R.id.C_1st_T7);
        D1T7 = findViewById(R.id.D_1st_T7);
        E1T7 = findViewById(R.id.E_1st_T7);
        F1T7 = findViewById(R.id.F_1st_T7);
        A1R7 = findViewById(R.id.A_1st_R7);
        B1R7 = findViewById(R.id.B_1st_R7);
        C1R7 = findViewById(R.id.C_1st_R7);
        D1R7 = findViewById(R.id.D_1st_R7);
        E1R7 = findViewById(R.id.E_1st_R7);
        F1R7 = findViewById(R.id.F_1st_R7);
        A1C5 = findViewById(R.id.A_1st_C5);

        RoutineCheck.check1stSubject(A1stC,B1stC,C1stC,D1stC,E1stC,F1stC, A1stT,B1stT,C1stT,D1stT,E1stT,F1stT, A1stR,B1stR,C1stR,D1stR,E1stR,F1stR, A1C2,B1C2,C1C2,D1C2,E1C2,F1C2, A1T2,B1T2,C1T2,D1T2,E1T2,F1T2, A1R2,B1R2,C1R2,D1R2,E1R2,F1R2, A1C3,B1C3,C1C3,D1C3,E1C3,F1C3, A1T3,B1T3,C1T3,D1T3,E1T3,F1T3, A1R3,B1R3,C1R3,D1R3,E1R3,F1R3, A1C4,B1C4,C1C4,D1C4,E1C4,F1C4, A1T4,B1T4,C1T4,D1T4,E1T4,F1T4, A1R4,B1R4,C1R4,D1R4,E1R4,F1R4, A1C5,B1C5,C1C5,D1C5,E1C5,F1C5,A1T5,B1T5,C1T5,D1T5,E1T5,F1T5,A1R5,B1R5,C1R5,D1R5,E1R5,F1R5, A1C6,B1C6,C1C6,D1C6,E1C6,F1C6,A1T6,B1T6,C1T6,D1T6,E1T6,F1T6,A1R6,B1R6,C1R6,D1R6,E1R6,F1R6);



        ///----------for 2nd Semester Routine Cell ---------///
        A2ndC = findViewById(R.id.A_2nd_A_C);
        B2C = findViewById(R.id.B_2nd_A_C);
        C2C = findViewById(R.id.C_2nd_A_C);
        D2C = findViewById(R.id.D_2nd_A_C);
        E2C = findViewById(R.id.E_2nd_A_C);
        F2C = findViewById(R.id.F_2nd_A_C);

        A2T = findViewById(R.id.A_2nd_A_T);
        B2T  = findViewById(R.id.B_2nd_A_T);
        C2T  = findViewById(R.id.C_2nd_A_T);
        D2T  = findViewById(R.id.D_2nd_A_T);
        E2T  = findViewById(R.id.E_2nd_A_T);
        F2T  = findViewById(R.id.F_2nd_A_T);

        A2R = findViewById(R.id.A_2nd_A_R);
        B2R = findViewById(R.id.B_2nd_A_R);
        C2R= findViewById(R.id.C_2nd_A_R);
        D2R = findViewById(R.id.D_2nd_A_R);
        E2R = findViewById(R.id.E_2nd_A_R);
        F2R = findViewById(R.id.F_2nd_A_R);

        //-------- for sunday --------/
        A2C2 = findViewById(R.id.A_2nd_A_C2);
        B2C2 = findViewById(R.id.B_2nd_A_C2);
        C2C2 = findViewById(R.id.C_2nd_A_C2);
        D2C2 = findViewById(R.id.D_2nd_A_C2);
        E2C2 = findViewById(R.id.E_2nd_A_C2);
        F2C2 = findViewById(R.id.F_2nd_A_C2);

        A2T2 = findViewById(R.id.A_2nd_A_T2);
        B2T2 = findViewById(R.id.B_2nd_A_T2);
        C2T2 = findViewById(R.id.C_2nd_A_T2);
        D2T2 = findViewById(R.id.D_2nd_A_T2);
        E2T2 = findViewById(R.id.E_2nd_A_T2);
        F2T2 = findViewById(R.id.F_2nd_A_T2);

        A2R2 = findViewById(R.id.A_2nd_A_R2);
        B2R2 = findViewById(R.id.B_2nd_A_R2);
        C2R2 = findViewById(R.id.C_2nd_A_R2);
        D2R2 = findViewById(R.id.D_2nd_A_R2);
        E2R2 = findViewById(R.id.E_2nd_A_R2);
        F2R2 = findViewById(R.id.F_2nd_A_R2);

        A1C3 = findViewById(R.id.A_1st_C3);
        B1C3 = findViewById(R.id.B_1st_C3);
        C1C3 = findViewById(R.id.C_1st_C3);
        D1C3 = findViewById(R.id.D_1st_C3);
        E1C3 = findViewById(R.id.E_1st_C3);
        F1C3 = findViewById(R.id.F_1st_C3);

        A1T3 = findViewById(R.id.A_1st_T3);
        B1T3 = findViewById(R.id.B_1st_T3);
        C1T3 = findViewById(R.id.C_1st_T3);
        D1T3 = findViewById(R.id.D_1st_T3);
        E1T3 = findViewById(R.id.E_1st_T3);
        F1T3 = findViewById(R.id.F_1st_T3);

        A1R3 = findViewById(R.id.A_1st_R3);
        B1R3 = findViewById(R.id.B_1st_R3);
        C1R3 = findViewById(R.id.C_1st_R3);
        D1R3 = findViewById(R.id.D_1st_R3);
        E1R3 = findViewById(R.id.E_1st_R3);
        F1R3 = findViewById(R.id.F_1st_R3);


        A2C3 = findViewById(R.id.A_2nd_A_C3);
        B2C3 = findViewById(R.id.B_2nd_A_C3);
        C2C3 = findViewById(R.id.C_2nd_A_C3);
        D2C3 = findViewById(R.id.D_2nd_A_C3);
        E2C3 = findViewById(R.id.E_2nd_A_C3);
        F2C3 = findViewById(R.id.F_2nd_A_C3);

        A2T3 = findViewById(R.id.A_2nd_A_T3);
        B2T3 = findViewById(R.id.B_2nd_A_T3);
        C2T3 = findViewById(R.id.C_2nd_A_T3);
        D2T3 = findViewById(R.id.D_2nd_A_T3);
        E2T3 = findViewById(R.id.E_2nd_A_T3);
        F2T3 = findViewById(R.id.F_2nd_A_T3);

        A2R3 = findViewById(R.id.A_2nd_A_R3);
        B2R3 = findViewById(R.id.B_2nd_A_R3);
        C2R3 = findViewById(R.id.C_2nd_A_R3);
        D2R3 = findViewById(R.id.D_2nd_A_R3);
        E2R3 = findViewById(R.id.E_2nd_A_R3);
        F2R3 = findViewById(R.id.F_2nd_A_R3);

        A2C4 = findViewById(R.id.A_2nd_A_C4);
        B2C4 = findViewById(R.id.B_2nd_A_C4);
        C2C4 = findViewById(R.id.C_2nd_A_C4);
        D2C4 = findViewById(R.id.D_2nd_A_C4);
        E2C4 = findViewById(R.id.E_2nd_A_C4);
        F2C4 = findViewById(R.id.F_2nd_A_C4);
        A2T4 = findViewById(R.id.A_2nd_A_T4);
        B2T4 = findViewById(R.id.B_2nd_A_T4);
        C2T4 = findViewById(R.id.C_2nd_A_T4);
        D2T4 = findViewById(R.id.D_2nd_A_T4);
        E2T4 = findViewById(R.id.E_2nd_A_T4);
        F2T4 = findViewById(R.id.F_2nd_A_T4);
        A2R4 = findViewById(R.id.A_2nd_A_R4);
        B2R4 = findViewById(R.id.B_2nd_A_R4);
        C2R4 = findViewById(R.id.C_2nd_A_R4);
        D2R4 = findViewById(R.id.D_2nd_A_R4);
        E2R4 = findViewById(R.id.E_2nd_A_R4);
        F2R4 = findViewById(R.id.F_2nd_A_R4);
        A2C5 = findViewById(R.id.A_2nd_A_C5);
        B2C5 = findViewById(R.id.B_2nd_A_C5);
        C2C5 = findViewById(R.id.C_2nd_A_C5);
        D2C5 = findViewById(R.id.D_2nd_A_C5);
        E2C5 = findViewById(R.id.E_2nd_A_C5);
        F2C5 = findViewById(R.id.F_2nd_A_C5);
        A2T5 = findViewById(R.id.A_2nd_A_T5);
        B2T5 = findViewById(R.id.B_2nd_A_T5);
        C2T5 = findViewById(R.id.C_2nd_A_T5);
        D2T5 = findViewById(R.id.D_2nd_A_T5);
        E2T5 = findViewById(R.id.E_2nd_A_T5);
        F2T5 = findViewById(R.id.F_2nd_A_T5);
        A2R5 = findViewById(R.id.A_2nd_A_R5);
        B2R5 = findViewById(R.id.B_2nd_A_R5);
        C2R5 = findViewById(R.id.C_2nd_A_R5);
        D2R5 = findViewById(R.id.D_2nd_A_R5);
        E2R5 = findViewById(R.id.E_2nd_A_R5);
        F2R5 = findViewById(R.id.F_2nd_A_R5);
        A2C6 = findViewById(R.id.A_2nd_A_C6);
        B2C6 = findViewById(R.id.B_2nd_A_C6);
        C2C6 = findViewById(R.id.C_2nd_A_C6);
        D2C6 = findViewById(R.id.D_2nd_A_C6);
        E2C6 = findViewById(R.id.E_2nd_A_C6);
        F2C6 = findViewById(R.id.F_2nd_A_C6);
        A2T6 = findViewById(R.id.A_2nd_A_T6);
        B2T6 = findViewById(R.id.B_2nd_A_T6);
        C2T6 = findViewById(R.id.C_2nd_A_T6);
        D2T6 = findViewById(R.id.D_2nd_A_T6);
        E2T6 = findViewById(R.id.E_2nd_A_T6);
        F2T6 = findViewById(R.id.F_2nd_A_T6);
        A2R6 = findViewById(R.id.A_2nd_A_R6);
        B2R6 = findViewById(R.id.B_2nd_A_R6);
        C2R6 = findViewById(R.id.C_2nd_A_R6);
        D2R6 = findViewById(R.id.D_2nd_A_R6);
        E2R6 = findViewById(R.id.E_2nd_A_R6);
        F2R6 = findViewById(R.id.F_2nd_A_R6);
        A2R6 = findViewById(R.id.A_2nd_A_R6);

        A2C7 = findViewById(R.id.A_2nd_A_C7);
        B2C7 = findViewById(R.id.B_2nd_A_C7);
        C2C7 = findViewById(R.id.C_2nd_A_C7);
        D2C7 = findViewById(R.id.D_2nd_A_C7);
        E2C7 = findViewById(R.id.E_2nd_A_C7);
        F2C7 = findViewById(R.id.F_2nd_A_C7);
        A2T7 = findViewById(R.id.A_2nd_A_T7);
        B2T7 = findViewById(R.id.B_2nd_A_T7);
        C2T7 = findViewById(R.id.C_2nd_A_T7);
        D2T7 = findViewById(R.id.D_2nd_A_T7);
        E2T7 = findViewById(R.id.E_2nd_A_T7);
        F2T7 = findViewById(R.id.F_2nd_A_T7);
        A2R7 = findViewById(R.id.A_2nd_A_R7);
        B2R7 = findViewById(R.id.B_2nd_A_R7);
        C2R7 = findViewById(R.id.C_2nd_A_R7);
        D2R7 = findViewById(R.id.D_2nd_A_R7);
        E2R7 = findViewById(R.id.E_2nd_A_R7);
        F2R7 = findViewById(R.id.F_2nd_A_R7);
        A2C7 = findViewById(R.id.A_2nd_A_C7);

        RoutineCheck.check2ndSubject(A2ndC,B2C,C2C,D2C,E2C,F2C, A2T,B2T,C2T,D2T,E2T,F2T, A2R,B2R,C2R,D2R,E2R,F2R, A2C2,B2C2,C2C2,D2C2,E2C2,F2C2, A2T2,B2T2,C2T2,D2T2,E2T2,F2T2, A2R2,B2R2,C2R2,D2R2,E2R2,F2R2, A2C3,B2C3,C2C3,D2C3,E2C3,F2C3, A2T3,B2T3,C2T3,D2T3,E2T3,F2T3, A2R3,B2R3,C2R3,D2R3,E2R3,F2R3  ,A2C4,B2C4,C2C4,D2C4,E2C4,F2C4,A2T4,B2T4,C2T4,D2T4,E2T4,F2T4,A2R4,B2R4,C2R4,D2R4,E2R4,F2R4,A2C5,B2C5,C2C5,D2C5,E2C5,F2C5,A2T5,B2T5,C2T5,D2T5,E2T5,F2T5,A2R5,B2R5,C2R5,D2R5,E2R5,F2R5,A2C6,B2C6,C2C6,D2C6,E2C6,F2C6,A2T6,B2T6,C2T6,D2T6,E2T6,F2T6,A2R6,B2R6,C2R6,D2R6,E2R6,F2R6);



        ///----------for 3rd Semester Routine Cell ---------///
        A3rdC = findViewById(R.id.A_3rd_A_C);
        B3C = findViewById(R.id.B_3rd_A_C);
        C3C = findViewById(R.id.C_3rd_A_C);
        D3C = findViewById(R.id.D_3rd_A_C);
        E3C = findViewById(R.id.E_3rd_A_C);
        F3C = findViewById(R.id.F_3rd_A_C);

        A3T = findViewById(R.id.A_3rd_A_T);
        B3T = findViewById(R.id.B_3rd_A_T);
        C3T = findViewById(R.id.C_3rd_A_T);
        D3T = findViewById(R.id.D_3rd_A_T);
        E3T = findViewById(R.id.E_3rd_A_T);
        F3T = findViewById(R.id.F_3rd_A_T);

        A3R = findViewById(R.id.A_3rd_A_R);
        B3R = findViewById(R.id.B_3rd_A_R);
        C3R = findViewById(R.id.C_3rd_A_R);
        D3R = findViewById(R.id.D_3rd_A_R);
        E3R = findViewById(R.id.E_3rd_A_R);
        F3R = findViewById(R.id.F_3rd_A_R);

        //-------- for sunday --------/
        A3C2 = findViewById(R.id.A_3rd_A_C2);
        B3C2 = findViewById(R.id.B_3rd_A_C2);
        C3C2 = findViewById(R.id.C_3rd_A_C2);
        D3C2 = findViewById(R.id.D_3rd_A_C2);
        E3C2 = findViewById(R.id.E_3rd_A_C2);
        F3C2 = findViewById(R.id.F_3rd_A_C2);

        A3T2 = findViewById(R.id.A_3rd_A_T2);
        B3T2 = findViewById(R.id.B_3rd_A_T2);
        C3T2 = findViewById(R.id.C_3rd_A_T2);
        D3T2 = findViewById(R.id.D_3rd_A_T2);
        E3T2 = findViewById(R.id.E_3rd_A_T2);
        F3T2 = findViewById(R.id.F_3rd_A_T2);

        A3R2 = findViewById(R.id.A_3rd_A_R2);
        B3R2 = findViewById(R.id.B_3rd_A_R2);
        C3R2 = findViewById(R.id.C_3rd_A_R2);
        D3R2 = findViewById(R.id.D_3rd_A_R2);
        E3R2 = findViewById(R.id.E_3rd_A_R2);
        F3R2 = findViewById(R.id.F_3rd_A_R2);


        A3C3 = findViewById(R.id.A_3rd_A_C3);
        B3C3 = findViewById(R.id.B_3rd_A_C3);
        C3C3 = findViewById(R.id.C_3rd_A_C3);
        D3C3 = findViewById(R.id.D_3rd_A_C3);
        E3C3 = findViewById(R.id.E_3rd_A_C3);
        F3C3 = findViewById(R.id.F_3rd_A_C3);

        A3T3 = findViewById(R.id.A_3rd_A_T3);
        B3T3 = findViewById(R.id.B_3rd_A_T3);
        C3T3 = findViewById(R.id.C_3rd_A_T3);
        D3T3 = findViewById(R.id.D_3rd_A_T3);
        E3T3 = findViewById(R.id.E_3rd_A_T3);
        F3T3 = findViewById(R.id.F_3rd_A_T3);

        A3R3 = findViewById(R.id.A_3rd_A_R3);
        B3R3 = findViewById(R.id.B_3rd_A_R3);
        C3R3 = findViewById(R.id.C_3rd_A_R3);
        D3R3 = findViewById(R.id.D_3rd_A_R3);
        E3R3 = findViewById(R.id.E_3rd_A_R3);
        F3R3 = findViewById(R.id.F_3rd_A_R3);


        A3C4 = findViewById(R.id.A_3rd_A_C4);
        B3C4 = findViewById(R.id.B_3rd_A_C4);
        C3C4 = findViewById(R.id.C_3rd_A_C4);
        D3C4 = findViewById(R.id.D_3rd_A_C4);
        E3C4 = findViewById(R.id.E_3rd_A_C4);
        F3C4 = findViewById(R.id.F_3rd_A_C4);
        A3T4 = findViewById(R.id.A_3rd_A_T4);
        B3T4 = findViewById(R.id.B_3rd_A_T4);
        C3T4 = findViewById(R.id.C_3rd_A_T4);
        D3T4 = findViewById(R.id.D_3rd_A_T4);
        E3T4 = findViewById(R.id.E_3rd_A_T4);
        F3T4 = findViewById(R.id.F_3rd_A_T4);
        A3R4 = findViewById(R.id.A_3rd_A_R4);
        B3R4 = findViewById(R.id.B_3rd_A_R4);
        C3R4 = findViewById(R.id.C_3rd_A_R4);
        D3R4 = findViewById(R.id.D_3rd_A_R4);
        E3R4 = findViewById(R.id.E_3rd_A_R4);
        F3R4 = findViewById(R.id.F_3rd_A_R4);
        A3C5 = findViewById(R.id.A_3rd_A_C5);
        B3C5 = findViewById(R.id.B_3rd_A_C5);
        C3C5 = findViewById(R.id.C_3rd_A_C5);
        D3C5 = findViewById(R.id.D_3rd_A_C5);
        E3C5 = findViewById(R.id.E_3rd_A_C5);
        F3C5 = findViewById(R.id.F_3rd_A_C5);
        A3T5 = findViewById(R.id.A_3rd_A_T5);
        B3T5 = findViewById(R.id.B_3rd_A_T5);
        C3T5 = findViewById(R.id.C_3rd_A_T5);
        D3T5 = findViewById(R.id.D_3rd_A_T5);
        E3T5 = findViewById(R.id.E_3rd_A_T5);
        F3T5 = findViewById(R.id.F_3rd_A_T5);
        A3R5 = findViewById(R.id.A_3rd_A_R5);
        B3R5 = findViewById(R.id.B_3rd_A_R5);
        C3R5 = findViewById(R.id.C_3rd_A_R5);
        D3R5 = findViewById(R.id.D_3rd_A_R5);
        E3R5 = findViewById(R.id.E_3rd_A_R5);
        F3R5 = findViewById(R.id.F_3rd_A_R5);
        A3C6 = findViewById(R.id.A_3rd_A_C6);
        B3C6 = findViewById(R.id.B_3rd_A_C6);
        C3C6 = findViewById(R.id.C_3rd_A_C6);
        D3C6 = findViewById(R.id.D_3rd_A_C6);
        E3C6 = findViewById(R.id.E_3rd_A_C6);
        F3C6 = findViewById(R.id.F_3rd_A_C6);
        A3T6 = findViewById(R.id.A_3rd_A_T6);
        B3T6 = findViewById(R.id.B_3rd_A_T6);
        C3T6 = findViewById(R.id.C_3rd_A_T6);
        D3T6 = findViewById(R.id.D_3rd_A_T6);
        E3T6 = findViewById(R.id.E_3rd_A_T6);
        F3T6 = findViewById(R.id.F_3rd_A_T6);
        A3R6 = findViewById(R.id.A_3rd_A_R6);
        B3R6 = findViewById(R.id.B_3rd_A_R6);
        C3R6 = findViewById(R.id.C_3rd_A_R6);
        D3R6 = findViewById(R.id.D_3rd_A_R6);
        E3R6 = findViewById(R.id.E_3rd_A_R6);
        F3R6 = findViewById(R.id.F_3rd_A_R6);
        A3R6 = findViewById(R.id.A_3rd_A_R6);

        A3C7 = findViewById(R.id.A_3rd_A_C7);
        B3C7 = findViewById(R.id.B_3rd_A_C7);
        C3C7 = findViewById(R.id.C_3rd_A_C7);
        D3C7 = findViewById(R.id.D_3rd_A_C7);
        E3C7 = findViewById(R.id.E_3rd_A_C7);
        F3C7 = findViewById(R.id.F_3rd_A_C7);
        A3T7 = findViewById(R.id.A_3rd_A_T7);
        B3T7 = findViewById(R.id.B_3rd_A_T7);
        C3T7 = findViewById(R.id.C_3rd_A_T7);
        D3T7 = findViewById(R.id.D_3rd_A_T7);
        E3T7 = findViewById(R.id.E_3rd_A_T7);
        F3T7 = findViewById(R.id.F_3rd_A_T7);
        A3R7 = findViewById(R.id.A_3rd_A_R7);
        B3R7 = findViewById(R.id.B_3rd_A_R7);
        C3R7 = findViewById(R.id.C_3rd_A_R7);
        D3R7 = findViewById(R.id.D_3rd_A_R7);
        E3R7 = findViewById(R.id.E_3rd_A_R7);
        F3R7 = findViewById(R.id.F_3rd_A_R7);
        A3C7 = findViewById(R.id.A_3rd_A_C7);

        RoutineCheck.check3rdSubject(A3rdC,B3C,C3C,D3C,E3C,F3C, A3T,B3T,C3T,D3T,E3T,F3T, A3R,B3R,C3R,D3R,E3R,F3R , A3C2,B3C2,C3C2,D3C2,E3C2,F3C2, A3T2,B3T2,C3T2,D3T2,E3T2,F3T2, A3R2,B3R2,C3R2,D3R2,E3R2,F3R2, A3C3,B3C3,C3C3,D3C3,E3C3,F3C3, A3T3,B3T3,C3T3,D3T3,E3T3,F3T3, A3R3,B3R3,C3R3,D3R3,E3R3,F3R3 ,A3C4,B3C4,C3C4,D3C4,E3C4,F3C4,A3T4,B3T4,C3T4,D3T4,E3T4,F3T4,A3R4,B3R4,C3R4,D3R4,E3R4,F3R4,A3C5,B3C5,C3C5,D3C5,E3C5,F3C5,A3T5,B3T5,C3T5,D3T5,E3T5,F3T5,A3R5,B3R5,C3R5,D3R5,E3R5,F3R5,A3C6,B3C6,C3C6,D3C6,E3C6,F3C6,A3T6,B3T6,C3T6,D3T6,E3T6,F3T6,A3R6,B3R6,C3R6,D3R6,E3R6,F3R6);

        ///----------for 4th Semester Routine Cell ---------///
        A4thC = findViewById(R.id.A_4th_A_C);
        B4C = findViewById(R.id.B_4th_A_C);
        C4C = findViewById(R.id.C_4th_A_C);
        D4C = findViewById(R.id.D_4th_A_C);
        E4C = findViewById(R.id.E_4th_A_C);
        F4C = findViewById(R.id.F_4th_A_C);

        A4T = findViewById(R.id.A_4th_A_T);
        B4T = findViewById(R.id.B_4th_A_T);
        C4T = findViewById(R.id.C_4th_A_T);
        D4T = findViewById(R.id.D_4th_A_T);
        E4T = findViewById(R.id.E_4th_A_T);
        F4T = findViewById(R.id.F_4th_A_T);

        A4R = findViewById(R.id.A_4th_A_R);
        B4R = findViewById(R.id.B_4th_A_R);
        C4R = findViewById(R.id.C_4th_A_R);
        D4R = findViewById(R.id.D_4th_A_R);
        E4R = findViewById(R.id.E_4th_A_R);
        F4R = findViewById(R.id.F_4th_A_R);


        A4C2 = findViewById(R.id.A_4th_A_C2);
        B4C2 = findViewById(R.id.B_4th_A_C2);
        C4C2 = findViewById(R.id.C_4th_A_C2);
        D4C2 = findViewById(R.id.D_4th_A_C2);
        E4C2 = findViewById(R.id.E_4th_A_C2);
        F4C2 = findViewById(R.id.F_4th_A_C2);

        A4T2 = findViewById(R.id.A_4th_A_T2);
        B4T2 = findViewById(R.id.B_4th_A_T2);
        C4T2 = findViewById(R.id.C_4th_A_T2);
        D4T2 = findViewById(R.id.D_4th_A_T2);
        E4T2 = findViewById(R.id.E_4th_A_T2);
        F4T2 = findViewById(R.id.F_4th_A_T2);

        A4R2 = findViewById(R.id.A_4th_A_R2);
        B4R2 = findViewById(R.id.B_4th_A_R2);
        C4R2 = findViewById(R.id.C_4th_A_R2);
        D4R2 = findViewById(R.id.D_4th_A_R2);
        E4R2 = findViewById(R.id.E_4th_A_R2);
        F4R2 = findViewById(R.id.F_4th_A_R2);


        A4C3 = findViewById(R.id.A_4th_A_C3);
        B4C3 = findViewById(R.id.B_4th_A_C3);
        C4C3 = findViewById(R.id.C_4th_A_C3);
        D4C3 = findViewById(R.id.D_4th_A_C3);
        E4C3 = findViewById(R.id.E_4th_A_C3);
        F4C3 = findViewById(R.id.F_4th_A_C3);

        A4T3 = findViewById(R.id.A_4th_A_T3);
        B4T3 = findViewById(R.id.B_4th_A_T3);
        C4T3 = findViewById(R.id.C_4th_A_T3);
        D4T3 = findViewById(R.id.D_4th_A_T3);
        E4T3 = findViewById(R.id.E_4th_A_T3);
        F4T3 = findViewById(R.id.F_4th_A_T3);

        A4R3 = findViewById(R.id.A_4th_A_R3);
        B4R3 = findViewById(R.id.B_4th_A_R3);
        C4R3 = findViewById(R.id.C_4th_A_R3);
        D4R3 = findViewById(R.id.D_4th_A_R3);
        E4R3 = findViewById(R.id.E_4th_A_R3);
        F4R3 = findViewById(R.id.F_4th_A_R3);

        A4C4 = findViewById(R.id.A_4th_A_C4);
        B4C4 = findViewById(R.id.B_4th_A_C4);
        C4C4 = findViewById(R.id.C_4th_A_C4);
        D4C4 = findViewById(R.id.D_4th_A_C4);
        E4C4 = findViewById(R.id.E_4th_A_C4);
        F4C4 = findViewById(R.id.F_4th_A_C4);
        A4T4 = findViewById(R.id.A_4th_A_T4);
        B4T4 = findViewById(R.id.B_4th_A_T4);
        C4T4 = findViewById(R.id.C_4th_A_T4);
        D4T4 = findViewById(R.id.D_4th_A_T4);
        E4T4 = findViewById(R.id.E_4th_A_T4);
        F4T4 = findViewById(R.id.F_4th_A_T4);
        A4R4 = findViewById(R.id.A_4th_A_R4);
        B4R4 = findViewById(R.id.B_4th_A_R4);
        C4R4 = findViewById(R.id.C_4th_A_R4);
        D4R4 = findViewById(R.id.D_4th_A_R4);
        E4R4 = findViewById(R.id.E_4th_A_R4);
        F4R4 = findViewById(R.id.F_4th_A_R4);
        A4C5 = findViewById(R.id.A_4th_A_C5);
        B4C5 = findViewById(R.id.B_4th_A_C5);
        C4C5 = findViewById(R.id.C_4th_A_C5);
        D4C5 = findViewById(R.id.D_4th_A_C5);
        E4C5 = findViewById(R.id.E_4th_A_C5);
        F4C5 = findViewById(R.id.F_4th_A_C5);
        A4T5 = findViewById(R.id.A_4th_A_T5);
        B4T5 = findViewById(R.id.B_4th_A_T5);
        C4T5 = findViewById(R.id.C_4th_A_T5);
        D4T5 = findViewById(R.id.D_4th_A_T5);
        E4T5 = findViewById(R.id.E_4th_A_T5);
        F4T5 = findViewById(R.id.F_4th_A_T5);
        A4R5 = findViewById(R.id.A_4th_A_R5);
        B4R5 = findViewById(R.id.B_4th_A_R5);
        C4R5 = findViewById(R.id.C_4th_A_R5);
        D4R5 = findViewById(R.id.D_4th_A_R5);
        E4R5 = findViewById(R.id.E_4th_A_R5);
        F4R5 = findViewById(R.id.F_4th_A_R5);
        A4C6 = findViewById(R.id.A_4th_A_C6);
        B4C6 = findViewById(R.id.B_4th_A_C6);
        C4C6 = findViewById(R.id.C_4th_A_C6);
        D4C6 = findViewById(R.id.D_4th_A_C6);
        E4C6 = findViewById(R.id.E_4th_A_C6);
        F4C6 = findViewById(R.id.F_4th_A_C6);
        A4T6 = findViewById(R.id.A_4th_A_T6);
        B4T6 = findViewById(R.id.B_4th_A_T6);
        C4T6 = findViewById(R.id.C_4th_A_T6);
        D4T6 = findViewById(R.id.D_4th_A_T6);
        E4T6 = findViewById(R.id.E_4th_A_T6);
        F4T6 = findViewById(R.id.F_4th_A_T6);
        A4R6 = findViewById(R.id.A_4th_A_R6);
        B4R6 = findViewById(R.id.B_4th_A_R6);
        C4R6 = findViewById(R.id.C_4th_A_R6);
        D4R6 = findViewById(R.id.D_4th_A_R6);
        E4R6 = findViewById(R.id.E_4th_A_R6);
        F4R6 = findViewById(R.id.F_4th_A_R6);
        A4R6 = findViewById(R.id.A_4th_A_R6);

        A4C7 = findViewById(R.id.A_4th_A_C7);
        B4C7 = findViewById(R.id.B_4th_A_C7);
        C4C7 = findViewById(R.id.C_4th_A_C7);
        D4C7 = findViewById(R.id.D_4th_A_C7);
        E4C7 = findViewById(R.id.E_4th_A_C7);
        F4C7 = findViewById(R.id.F_4th_A_C7);
        A4T7 = findViewById(R.id.A_4th_A_T7);
        B4T7 = findViewById(R.id.B_4th_A_T7);
        C4T7 = findViewById(R.id.C_4th_A_T7);
        D4T7 = findViewById(R.id.D_4th_A_T7);
        E4T7 = findViewById(R.id.E_4th_A_T7);
        F4T7 = findViewById(R.id.F_4th_A_T7);
        A4R7 = findViewById(R.id.A_4th_A_R7);
        B4R7 = findViewById(R.id.B_4th_A_R7);
        C4R7 = findViewById(R.id.C_4th_A_R7);
        D4R7 = findViewById(R.id.D_4th_A_R7);
        E4R7 = findViewById(R.id.E_4th_A_R7);
        F4R7 = findViewById(R.id.F_4th_A_R7);
        A4C7 = findViewById(R.id.A_4th_A_C7);

        RoutineCheck.check4thSubject(A4thC,B4C,C4C,D4C,E4C,F4C, A4T,B4T,C4T,D4T,E4T,F4T, A4R,B4R,C4R,D4R,E4R,F4R , A4C2,B4C2,C4C2,D4C2,E4C2,F4C2, A4T2,B4T2,C4T2,D4T2,E4T2,F4T2, A4R2,B4R2,C4R2,D4R2,E4R2,F4R2, A4C3,B4C3,C4C3,D4C3,E4C3,F4C3, A4T3,B4T3,C4T3,D4T3,E4T3,F4T3, A4R3,B4R3,C4R3,D4R3,E4R3,F4R3 ,A4C4,B4C4,C4C4,D4C4,E4C4,F4C4,A4T4,B4T4,C4T4,D4T4,E4T4,F4T4,A4R4,B4R4,C4R4,D4R4,E4R4,F4R4,A4C5,B4C5,C4C5,D4C5,E4C5,F4C5,A4T5,B4T5,C4T5,D4T5,E4T5,F4T5,A4R5,B4R5,C4R5,D4R5,E4R5,F4R5,A4C6,B4C6,C4C6,D4C6,E4C6,F4C6,A4T6,B4T6,C4T6,D4T6,E4T6,F4T6,A4R6,B4R6,C4R6,D4R6,E4R6,F4R6);
        ///----------for 5th Semester Routine Cell ---------///
        A5thC = findViewById(R.id.A_5th_A_C);
        B5C = findViewById(R.id.B_5th_A_C);
        C5C = findViewById(R.id.C_5th_A_C);
        D5C = findViewById(R.id.D_5th_A_C);
        E5C = findViewById(R.id.E_5th_A_C);
        F5C = findViewById(R.id.F_5th_A_C);

        A5T = findViewById(R.id.A_5th_A_T);
        B5T = findViewById(R.id.B_5th_A_T);
        C5T = findViewById(R.id.C_5th_A_T);
        D5T = findViewById(R.id.D_5th_A_T);
        E5T = findViewById(R.id.E_5th_A_T);
        F5T = findViewById(R.id.F_5th_A_T);

        A5R = findViewById(R.id.A_5th_A_R);
        B5R = findViewById(R.id.B_5th_A_R);
        C5R = findViewById(R.id.C_5th_A_R);
        D5R = findViewById(R.id.D_5th_A_R);
        E5R = findViewById(R.id.E_5th_A_R);
        F5R = findViewById(R.id.F_5th_A_R);


        A5C2 = findViewById(R.id.A_5th_A_C2);
        B5C2 = findViewById(R.id.B_5th_A_C2);
        C5C2 = findViewById(R.id.C_5th_A_C2);
        D5C2 = findViewById(R.id.D_5th_A_C2);
        E5C2 = findViewById(R.id.E_5th_A_C2);
        F5C2 = findViewById(R.id.F_5th_A_C2);

        A5T2 = findViewById(R.id.A_5th_A_T2);
        B5T2 = findViewById(R.id.B_5th_A_T2);
        C5T2 = findViewById(R.id.C_5th_A_T2);
        D5T2 = findViewById(R.id.D_5th_A_T2);
        E5T2 = findViewById(R.id.E_5th_A_T2);
        F5T2 = findViewById(R.id.F_5th_A_T2);

        A5R2 = findViewById(R.id.A_5th_A_R2);
        B5R2 = findViewById(R.id.B_5th_A_R2);
        C5R2 = findViewById(R.id.C_5th_A_R2);
        D5R2 = findViewById(R.id.D_5th_A_R2);
        E5R2 = findViewById(R.id.E_5th_A_R2);
        F5R2 = findViewById(R.id.F_5th_A_R2);

        A5C3 = findViewById(R.id.A_5th_A_C3);
        B5C3 = findViewById(R.id.B_5th_A_C3);
        C5C3 = findViewById(R.id.C_5th_A_C3);
        D5C3 = findViewById(R.id.D_5th_A_C3);
        E5C3 = findViewById(R.id.E_5th_A_C3);
        F5C3 = findViewById(R.id.F_5th_A_C3);

        A5T3 = findViewById(R.id.A_5th_A_T3);
        B5T3 = findViewById(R.id.B_5th_A_T3);
        C5T3 = findViewById(R.id.C_5th_A_T3);
        D5T3 = findViewById(R.id.D_5th_A_T3);
        E5T3 = findViewById(R.id.E_5th_A_T3);
        F5T3 = findViewById(R.id.F_5th_A_T3);

        A5R3 = findViewById(R.id.A_5th_A_R3);
        B5R3 = findViewById(R.id.B_5th_A_R3);
        C5R3 = findViewById(R.id.C_5th_A_R3);
        D5R3 = findViewById(R.id.D_5th_A_R3);
        E5R3 = findViewById(R.id.E_5th_A_R3);
        F5R3 = findViewById(R.id.F_5th_A_R3);

        A5C4 = findViewById(R.id.A_5th_A_C4);
        B5C4 = findViewById(R.id.B_5th_A_C4);
        C5C4 = findViewById(R.id.C_5th_A_C4);
        D5C4 = findViewById(R.id.D_5th_A_C4);
        E5C4 = findViewById(R.id.E_5th_A_C4);
        F5C4 = findViewById(R.id.F_5th_A_C4);
        A5T4 = findViewById(R.id.A_5th_A_T4);
        B5T4 = findViewById(R.id.B_5th_A_T4);
        C5T4 = findViewById(R.id.C_5th_A_T4);
        D5T4 = findViewById(R.id.D_5th_A_T4);
        E5T4 = findViewById(R.id.E_5th_A_T4);
        F5T4 = findViewById(R.id.F_5th_A_T4);
        A5R4 = findViewById(R.id.A_5th_A_R4);
        B5R4 = findViewById(R.id.B_5th_A_R4);
        C5R4 = findViewById(R.id.C_5th_A_R4);
        D5R4 = findViewById(R.id.D_5th_A_R4);
        E5R4 = findViewById(R.id.E_5th_A_R4);
        F5R4 = findViewById(R.id.F_5th_A_R4);
        A5C5 = findViewById(R.id.A_5th_A_C5);
        B5C5 = findViewById(R.id.B_5th_A_C5);
        C5C5 = findViewById(R.id.C_5th_A_C5);
        D5C5 = findViewById(R.id.D_5th_A_C5);
        E5C5 = findViewById(R.id.E_5th_A_C5);
        F5C5 = findViewById(R.id.F_5th_A_C5);
        A5T5 = findViewById(R.id.A_5th_A_T5);
        B5T5 = findViewById(R.id.B_5th_A_T5);
        C5T5 = findViewById(R.id.C_5th_A_T5);
        D5T5 = findViewById(R.id.D_5th_A_T5);
        E5T5 = findViewById(R.id.E_5th_A_T5);
        F5T5 = findViewById(R.id.F_5th_A_T5);
        A5R5 = findViewById(R.id.A_5th_A_R5);
        B5R5 = findViewById(R.id.B_5th_A_R5);
        C5R5 = findViewById(R.id.C_5th_A_R5);
        D5R5 = findViewById(R.id.D_5th_A_R5);
        E5R5 = findViewById(R.id.E_5th_A_R5);
        F5R5 = findViewById(R.id.F_5th_A_R5);
        A5C6 = findViewById(R.id.A_5th_A_C6);
        B5C6 = findViewById(R.id.B_5th_A_C6);
        C5C6 = findViewById(R.id.C_5th_A_C6);
        D5C6 = findViewById(R.id.D_5th_A_C6);
        E5C6 = findViewById(R.id.E_5th_A_C6);
        F5C6 = findViewById(R.id.F_5th_A_C6);
        A5T6 = findViewById(R.id.A_5th_A_T6);
        B5T6 = findViewById(R.id.B_5th_A_T6);
        C5T6 = findViewById(R.id.C_5th_A_T6);
        D5T6 = findViewById(R.id.D_5th_A_T6);
        E5T6 = findViewById(R.id.E_5th_A_T6);
        F5T6 = findViewById(R.id.F_5th_A_T6);
        A5R6 = findViewById(R.id.A_5th_A_R6);
        B5R6 = findViewById(R.id.B_5th_A_R6);
        C5R6 = findViewById(R.id.C_5th_A_R6);
        D5R6 = findViewById(R.id.D_5th_A_R6);
        E5R6 = findViewById(R.id.E_5th_A_R6);
        F5R6 = findViewById(R.id.F_5th_A_R6);
        A5R6 = findViewById(R.id.A_5th_A_R6);

        A5C7 = findViewById(R.id.A_5th_A_C7);
        B5C7 = findViewById(R.id.B_5th_A_C7);
        C5C7 = findViewById(R.id.C_5th_A_C7);
        D5C7 = findViewById(R.id.D_5th_A_C7);
        E5C7 = findViewById(R.id.E_5th_A_C7);
        F5C7 = findViewById(R.id.F_5th_A_C7);
        A5T7 = findViewById(R.id.A_5th_A_T7);
        B5T7 = findViewById(R.id.B_5th_A_T7);
        C5T7 = findViewById(R.id.C_5th_A_T7);
        D5T7 = findViewById(R.id.D_5th_A_T7);
        E5T7 = findViewById(R.id.E_5th_A_T7);
        F5T7 = findViewById(R.id.F_5th_A_T7);
        A5R7 = findViewById(R.id.A_5th_A_R7);
        B5R7 = findViewById(R.id.B_5th_A_R7);
        C5R7 = findViewById(R.id.C_5th_A_R7);
        D5R7 = findViewById(R.id.D_5th_A_R7);
        E5R7 = findViewById(R.id.E_5th_A_R7);
        F5R7 = findViewById(R.id.F_5th_A_R7);
        A5C7 = findViewById(R.id.A_5th_A_C7);

        RoutineCheck.check5thSubject(A5thC,B5C,C5C,D5C,E5C,F5C, A5T,B5T,C5T,D5T,E5T,F5T, A5R,B5R,C5R,D5R,E5R,F5R , A5C2,B5C2,C5C2,D5C2,E5C2,F5C2, A5T2,B5T2,C5T2,D5T2,E5T2,F5T2, A5R2,B5R2,C5R2,D5R2,E5R2,F5R2, A5C3,B5C3,C5C3,D5C3,E5C3,F5C3, A5T3,B5T3,C5T3,D5T3,E5T3,F5T3, A5R3,B5R3,C5R3,D5R3,E5R3,F5R3 ,A5C4,B5C4,C5C4,D5C4,E5C4,F5C4,A5T4,B5T4,C5T4,D5T4,E5T4,F5T4,A5R4,B5R4,C5R4,D5R4,E5R4,F5R4,A5C5,B5C5,C5C5,D5C5,E5C5,F5C5,A5T5,B5T5,C5T5,D5T5,E5T5,F5T5,A5R5,B5R5,C5R5,D5R5,E5R5,F5R5,A5C6,B5C6,C5C6,D5C6,E5C6,F5C6,A5T6,B5T6,C5T6,D5T6,E5T6,F5T6,A5R6,B5R6,C5R6,D5R6,E5R6,F5R6);

        ///----------for 6th Semester Routine Cell ---------///
        A6thC = findViewById(R.id.A_6th_A_C);
        B6C = findViewById(R.id.B_6th_A_C);
        C6C = findViewById(R.id.C_6th_A_C);
        D6C = findViewById(R.id.D_6th_A_C);
        E6C = findViewById(R.id.E_6th_A_C);
        F6C = findViewById(R.id.F_6th_A_C);

        A6T = findViewById(R.id.A_6th_A_T);
        B6T = findViewById(R.id.B_6th_A_T);
        C6T = findViewById(R.id.C_6th_A_T);
        D6T = findViewById(R.id.D_6th_A_T);
        E6T = findViewById(R.id.E_6th_A_T);
        F6T = findViewById(R.id.F_6th_A_T);

        A6R = findViewById(R.id.A_6th_A_R);
        B6R = findViewById(R.id.B_6th_A_R);
        C6R = findViewById(R.id.C_6th_A_R);
        D6R = findViewById(R.id.D_6th_A_R);
        E6R = findViewById(R.id.E_6th_A_R);
        F6R = findViewById(R.id.F_6th_A_R);


        A6C2 = findViewById(R.id.A_6th_A_C2);
        B6C2 = findViewById(R.id.B_6th_A_C2);
        C6C2 = findViewById(R.id.C_6th_A_C2);
        D6C2 = findViewById(R.id.D_6th_A_C2);
        E6C2 = findViewById(R.id.E_6th_A_C2);
        F6C2 = findViewById(R.id.F_6th_A_C2);

        A6T2 = findViewById(R.id.A_6th_A_T2);
        B6T2 = findViewById(R.id.B_6th_A_T2);
        C6T2 = findViewById(R.id.C_6th_A_T2);
        D6T2 = findViewById(R.id.D_6th_A_T2);
        E6T2 = findViewById(R.id.E_6th_A_T2);
        F6T2 = findViewById(R.id.F_6th_A_T2);

        A6R2 = findViewById(R.id.A_6th_A_R2);
        B6R2 = findViewById(R.id.B_6th_A_R2);
        C6R2 = findViewById(R.id.C_6th_A_R2);
        D6R2 = findViewById(R.id.D_6th_A_R2);
        E6R2 = findViewById(R.id.E_6th_A_R2);
        F6R2 = findViewById(R.id.F_6th_A_R2);

        A6C3 = findViewById(R.id.A_6th_A_C3);
        B6C3 = findViewById(R.id.B_6th_A_C3);
        C6C3 = findViewById(R.id.C_6th_A_C3);
        D6C3 = findViewById(R.id.D_6th_A_C3);
        E6C3 = findViewById(R.id.E_6th_A_C3);
        F6C3 = findViewById(R.id.F_6th_A_C3);

        A6T3 = findViewById(R.id.A_6th_A_T3);
        B6T3 = findViewById(R.id.B_6th_A_T3);
        C6T3 = findViewById(R.id.C_6th_A_T3);
        D6T3 = findViewById(R.id.D_6th_A_T3);
        E6T3 = findViewById(R.id.E_6th_A_T3);
        F6T3 = findViewById(R.id.F_6th_A_T3);

        A6R3 = findViewById(R.id.A_6th_A_R3);
        B6R3 = findViewById(R.id.B_6th_A_R3);
        C6R3 = findViewById(R.id.C_6th_A_R3);
        D6R3 = findViewById(R.id.D_6th_A_R3);
        E6R3 = findViewById(R.id.E_6th_A_R3);
        F6R3 = findViewById(R.id.F_6th_A_R3);

        A6C4 = findViewById(R.id.A_6th_A_C4);
        B6C4 = findViewById(R.id.B_6th_A_C4);
        C6C4 = findViewById(R.id.C_6th_A_C4);
        D6C4 = findViewById(R.id.D_6th_A_C4);
        E6C4 = findViewById(R.id.E_6th_A_C4);
        F6C4 = findViewById(R.id.F_6th_A_C4);
        A6T4 = findViewById(R.id.A_6th_A_T4);
        B6T4 = findViewById(R.id.B_6th_A_T4);
        C6T4 = findViewById(R.id.C_6th_A_T4);
        D6T4 = findViewById(R.id.D_6th_A_T4);
        E6T4 = findViewById(R.id.E_6th_A_T4);
        F6T4 = findViewById(R.id.F_6th_A_T4);
        A6R4 = findViewById(R.id.A_6th_A_R4);
        B6R4 = findViewById(R.id.B_6th_A_R4);
        C6R4 = findViewById(R.id.C_6th_A_R4);
        D6R4 = findViewById(R.id.D_6th_A_R4);
        E6R4 = findViewById(R.id.E_6th_A_R4);
        F6R4 = findViewById(R.id.F_6th_A_R4);
        A6C5 = findViewById(R.id.A_6th_A_C5);
        B6C5 = findViewById(R.id.B_6th_A_C5);
        C6C5 = findViewById(R.id.C_6th_A_C5);
        D6C5 = findViewById(R.id.D_6th_A_C5);
        E6C5 = findViewById(R.id.E_6th_A_C5);
        F6C5 = findViewById(R.id.F_6th_A_C5);
        A6T5 = findViewById(R.id.A_6th_A_T5);
        B6T5 = findViewById(R.id.B_6th_A_T5);
        C6T5 = findViewById(R.id.C_6th_A_T5);
        D6T5 = findViewById(R.id.D_6th_A_T5);
        E6T5 = findViewById(R.id.E_6th_A_T5);
        F6T5 = findViewById(R.id.F_6th_A_T5);
        A6R5 = findViewById(R.id.A_6th_A_R5);
        B6R5 = findViewById(R.id.B_6th_A_R5);
        C6R5 = findViewById(R.id.C_6th_A_R5);
        D6R5 = findViewById(R.id.D_6th_A_R5);
        E6R5 = findViewById(R.id.E_6th_A_R5);
        F6R5 = findViewById(R.id.F_6th_A_R5);
        A6C6 = findViewById(R.id.A_6th_A_C6);
        B6C6 = findViewById(R.id.B_6th_A_C6);
        C6C6 = findViewById(R.id.C_6th_A_C6);
        D6C6 = findViewById(R.id.D_6th_A_C6);
        E6C6 = findViewById(R.id.E_6th_A_C6);
        F6C6 = findViewById(R.id.F_6th_A_C6);
        A6T6 = findViewById(R.id.A_6th_A_T6);
        B6T6 = findViewById(R.id.B_6th_A_T6);
        C6T6 = findViewById(R.id.C_6th_A_T6);
        D6T6 = findViewById(R.id.D_6th_A_T6);
        E6T6 = findViewById(R.id.E_6th_A_T6);
        F6T6 = findViewById(R.id.F_6th_A_T6);
        A6R6 = findViewById(R.id.A_6th_A_R6);
        B6R6 = findViewById(R.id.B_6th_A_R6);
        C6R6 = findViewById(R.id.C_6th_A_R6);
        D6R6 = findViewById(R.id.D_6th_A_R6);
        E6R6 = findViewById(R.id.E_6th_A_R6);
        F6R6 = findViewById(R.id.F_6th_A_R6);
        A6R6 = findViewById(R.id.A_6th_A_R6);

        A6C7 = findViewById(R.id.A_6th_A_C7);
        B6C7 = findViewById(R.id.B_6th_A_C7);
        C6C7 = findViewById(R.id.C_6th_A_C7);
        D6C7 = findViewById(R.id.D_6th_A_C7);
        E6C7 = findViewById(R.id.E_6th_A_C7);
        F6C7 = findViewById(R.id.F_6th_A_C7);
        A6T7 = findViewById(R.id.A_6th_A_T7);
        B6T7 = findViewById(R.id.B_6th_A_T7);
        C6T7 = findViewById(R.id.C_6th_A_T7);
        D6T7 = findViewById(R.id.D_6th_A_T7);
        E6T7 = findViewById(R.id.E_6th_A_T7);
        F6T7 = findViewById(R.id.F_6th_A_T7);
        A6R7 = findViewById(R.id.A_6th_A_R7);
        B6R7 = findViewById(R.id.B_6th_A_R7);
        C6R7 = findViewById(R.id.C_6th_A_R7);
        D6R7 = findViewById(R.id.D_6th_A_R7);
        E6R7 = findViewById(R.id.E_6th_A_R7);
        F6R7 = findViewById(R.id.F_6th_A_R7);
        A6C7 = findViewById(R.id.A_6th_A_C7);

        RoutineCheck.check6thSubject(A6thC,B6C,C6C,D6C,E6C,F6C, A6T,B6T,C6T,D6T,E6T,F6T, A6R,B6R,C6R,D6R,E6R,F6R , A6C2,B6C2,C6C2,D6C2,E6C2,F6C2, A6T2,B6T2,C6T2,D6T2,E6T2,F6T2, A6R2,B6R2,C6R2,D6R2,E6R2,F6R2, A6C3,B6C3,C6C3,D6C3,E6C3,F6C3, A6T3,B6T3,C6T3,D6T3,E6T3,F6T3, A6R3,B6R3,C6R3,D6R3,E6R3,F6R3 ,A6C4,B6C4,C6C4,D6C4,E6C4,F6C4,A6T4,B6T4,C6T4,D6T4,E6T4,F6T4,A6R4,B6R4,C6R4,D6R4,E6R4,F6R4,A6C5,B6C5,C6C5,D6C5,E6C5,F6C5,A6T5,B6T5,C6T5,D6T5,E6T5,F6T5,A6R5,B6R5,C6R5,D6R5,E6R5,F6R5,A6C6,B6C6,C6C6,D6C6,E6C6,F6C6,A6T6,B6T6,C6T6,D6T6,E6T6,F6T6,A6R6,B6R6,C6R6,D6R6,E6R6,F6R6);

        ///----------for 7th Semester Routine Cell ---------///
        A7thC = findViewById(R.id.A_7th_A_C);
        B7C = findViewById(R.id.B_7th_A_C);
        C7C = findViewById(R.id.C_7th_A_C);
        D7C = findViewById(R.id.D_7th_A_C);
        E7C = findViewById(R.id.E_7th_A_C);
        F7C = findViewById(R.id.F_7th_A_C);

        A7T = findViewById(R.id.A_7th_A_T);
        B7T = findViewById(R.id.B_7th_A_T);
        C7T = findViewById(R.id.C_7th_A_T);
        D7T = findViewById(R.id.D_7th_A_T);
        E7T = findViewById(R.id.E_7th_A_T);
        F7T = findViewById(R.id.F_7th_A_T);

        A7R = findViewById(R.id.A_7th_A_R);
        B7R = findViewById(R.id.B_7th_A_R);
        C7R = findViewById(R.id.C_7th_A_R);
        D7R = findViewById(R.id.D_7th_A_R);
        E7R = findViewById(R.id.E_7th_A_R);
        F7R = findViewById(R.id.F_7th_A_R);


        A7C2 = findViewById(R.id.A_7th_A_C2);
        B7C2 = findViewById(R.id.B_7th_A_C2);
        C7C2 = findViewById(R.id.C_7th_A_C2);
        D7C2 = findViewById(R.id.D_7th_A_C2);
        E7C2 = findViewById(R.id.E_7th_A_C2);
        F7C2 = findViewById(R.id.F_7th_A_C2);

        A7T2 = findViewById(R.id.A_7th_A_T2);
        B7T2 = findViewById(R.id.B_7th_A_T2);
        C7T2 = findViewById(R.id.C_7th_A_T2);
        D7T2 = findViewById(R.id.D_7th_A_T2);
        E7T2 = findViewById(R.id.E_7th_A_T2);
        F7T2 = findViewById(R.id.F_7th_A_T2);

        A7R2 = findViewById(R.id.A_7th_A_R2);
        B7R2 = findViewById(R.id.B_7th_A_R2);
        C7R2 = findViewById(R.id.C_7th_A_R2);
        D7R2 = findViewById(R.id.D_7th_A_R2);
        E7R2 = findViewById(R.id.E_7th_A_R2);
        F7R2 = findViewById(R.id.F_7th_A_R2);

        A7C3 = findViewById(R.id.A_7th_A_C3);
        B7C3 = findViewById(R.id.B_7th_A_C3);
        C7C3 = findViewById(R.id.C_7th_A_C3);
        D7C3 = findViewById(R.id.D_7th_A_C3);
        E7C3 = findViewById(R.id.E_7th_A_C3);
        F7C3 = findViewById(R.id.F_7th_A_C3);

        A7T3 = findViewById(R.id.A_7th_A_T3);
        B7T3 = findViewById(R.id.B_7th_A_T3);
        C7T3 = findViewById(R.id.C_7th_A_T3);
        D7T3 = findViewById(R.id.D_7th_A_T3);
        E7T3 = findViewById(R.id.E_7th_A_T3);
        F7T3 = findViewById(R.id.F_7th_A_T3);

        A7R3 = findViewById(R.id.A_7th_A_R3);
        B7R3 = findViewById(R.id.B_7th_A_R3);
        C7R3 = findViewById(R.id.C_7th_A_R3);
        D7R3 = findViewById(R.id.D_7th_A_R3);
        E7R3 = findViewById(R.id.E_7th_A_R3);
        F7R3 = findViewById(R.id.F_7th_A_R3);

        A7C4 = findViewById(R.id.A_7th_A_C4);
        B7C4 = findViewById(R.id.B_7th_A_C4);
        C7C4 = findViewById(R.id.C_7th_A_C4);
        D7C4 = findViewById(R.id.D_7th_A_C4);
        E7C4 = findViewById(R.id.E_7th_A_C4);
        F7C4 = findViewById(R.id.F_7th_A_C4);
        A7T4 = findViewById(R.id.A_7th_A_T4);
        B7T4 = findViewById(R.id.B_7th_A_T4);
        C7T4 = findViewById(R.id.C_7th_A_T4);
        D7T4 = findViewById(R.id.D_7th_A_T4);
        E7T4 = findViewById(R.id.E_7th_A_T4);
        F7T4 = findViewById(R.id.F_7th_A_T4);
        A7R4 = findViewById(R.id.A_7th_A_R4);
        B7R4 = findViewById(R.id.B_7th_A_R4);
        C7R4 = findViewById(R.id.C_7th_A_R4);
        D7R4 = findViewById(R.id.D_7th_A_R4);
        E7R4 = findViewById(R.id.E_7th_A_R4);
        F7R4 = findViewById(R.id.F_7th_A_R4);
        A7C5 = findViewById(R.id.A_7th_A_C5);
        B7C5 = findViewById(R.id.B_7th_A_C5);
        C7C5 = findViewById(R.id.C_7th_A_C5);
        D7C5 = findViewById(R.id.D_7th_A_C5);
        E7C5 = findViewById(R.id.E_7th_A_C5);
        F7C5 = findViewById(R.id.F_7th_A_C5);
        A7T5 = findViewById(R.id.A_7th_A_T5);
        B7T5 = findViewById(R.id.B_7th_A_T5);
        C7T5 = findViewById(R.id.C_7th_A_T5);
        D7T5 = findViewById(R.id.D_7th_A_T5);
        E7T5 = findViewById(R.id.E_7th_A_T5);
        F7T5 = findViewById(R.id.F_7th_A_T5);
        A7R5 = findViewById(R.id.A_7th_A_R5);
        B7R5 = findViewById(R.id.B_7th_A_R5);
        C7R5 = findViewById(R.id.C_7th_A_R5);
        D7R5 = findViewById(R.id.D_7th_A_R5);
        E7R5 = findViewById(R.id.E_7th_A_R5);
        F7R5 = findViewById(R.id.F_7th_A_R5);
        A7C6 = findViewById(R.id.A_7th_A_C6);
        B7C6 = findViewById(R.id.B_7th_A_C6);
        C7C6 = findViewById(R.id.C_7th_A_C6);
        D7C6 = findViewById(R.id.D_7th_A_C6);
        E7C6 = findViewById(R.id.E_7th_A_C6);
        F7C6 = findViewById(R.id.F_7th_A_C6);
        A7T6 = findViewById(R.id.A_7th_A_T6);
        B7T6 = findViewById(R.id.B_7th_A_T6);
        C7T6 = findViewById(R.id.C_7th_A_T6);
        D7T6 = findViewById(R.id.D_7th_A_T6);
        E7T6 = findViewById(R.id.E_7th_A_T6);
        F7T6 = findViewById(R.id.F_7th_A_T6);
        A7R6 = findViewById(R.id.A_7th_A_R6);
        B7R6 = findViewById(R.id.B_7th_A_R6);
        C7R6 = findViewById(R.id.C_7th_A_R6);
        D7R6 = findViewById(R.id.D_7th_A_R6);
        E7R6 = findViewById(R.id.E_7th_A_R6);
        F7R6 = findViewById(R.id.F_7th_A_R6);
        A7R6 = findViewById(R.id.A_7th_A_R6);

        A7C7 = findViewById(R.id.A_7th_A_C7);
        B7C7 = findViewById(R.id.B_7th_A_C7);
        C7C7 = findViewById(R.id.C_7th_A_C7);
        D7C7 = findViewById(R.id.D_7th_A_C7);
        E7C7 = findViewById(R.id.E_7th_A_C7);
        F7C7 = findViewById(R.id.F_7th_A_C7);
        A7T7 = findViewById(R.id.A_7th_A_T7);
        B7T7 = findViewById(R.id.B_7th_A_T7);
        C7T7 = findViewById(R.id.C_7th_A_T7);
        D7T7 = findViewById(R.id.D_7th_A_T7);
        E7T7 = findViewById(R.id.E_7th_A_T7);
        F7T7 = findViewById(R.id.F_7th_A_T7);
        A7R7 = findViewById(R.id.A_7th_A_R7);
        B7R7 = findViewById(R.id.B_7th_A_R7);
        C7R7 = findViewById(R.id.C_7th_A_R7);
        D7R7 = findViewById(R.id.D_7th_A_R7);
        E7R7 = findViewById(R.id.E_7th_A_R7);
        F7R7 = findViewById(R.id.F_7th_A_R7);
        A7C7 = findViewById(R.id.A_7th_A_C7);


        RoutineCheck.check7thSubject(A7thC,B7C,C7C,D7C,E7C,F7C, A7T,B7T,C7T,D7T,E7T,F7T, A7R,B7R,C7R,D7R,E7R,F7R , A7C2,B7C2,C7C2,D7C2,E7C2,F7C2, A7T2,B7T2,C7T2,D7T2,E7T2,F7T2, A7R2,B7R2,C7R2,D7R2,E7R2,F7R2, A7C3,B7C3,C7C3,D7C3,E7C3,F7C3, A7T3,B7T3,C7T3,D7T3,E7T3,F7T3, A7R3,B7R3,C7R3,D7R3,E7R3,F7R3 ,A7C4,B7C4,C7C4,D7C4,E7C4,F7C4,A7T4,B7T4,C7T4,D7T4,E7T4,F7T4,A7R4,B7R4,C7R4,D7R4,E7R4,F7R4,A7C5,B7C5,C7C5,D7C5,E7C5,F7C5,A7T5,B7T5,C7T5,D7T5,E7T5,F7T5,A7R5,B7R5,C7R5,D7R5,E7R5,F7R5,A7C6,B7C6,C7C6,D7C6,E7C6,F7C6,A7T6,B7T6,C7T6,D7T6,E7T6,F7T6,A7R6,B7R6,C7R6,D7R6,E7R6,F7R6);

        ///----------for 8th Semester Routine Cell ---------///
        A8thC = findViewById(R.id.A_8th_A_C);
        B8C = findViewById(R.id.B_8th_A_C);
        C8C = findViewById(R.id.C_8th_A_C);
        D8C = findViewById(R.id.D_8th_A_C);
        E8C = findViewById(R.id.E_8th_A_C);
        F8C = findViewById(R.id.F_8th_A_C);

        A8T = findViewById(R.id.A_8th_A_T);
        B8T = findViewById(R.id.B_8th_A_T);
        C8T = findViewById(R.id.C_8th_A_T);
        D8T = findViewById(R.id.D_8th_A_T);
        E8T = findViewById(R.id.E_8th_A_T);
        F8T = findViewById(R.id.F_8th_A_T);

        A8R = findViewById(R.id.A_8th_A_R);
        B8R = findViewById(R.id.B_8th_A_R);
        C8R = findViewById(R.id.C_8th_A_R);
        D8R = findViewById(R.id.D_8th_A_R);
        E8R = findViewById(R.id.E_8th_A_R);
        F8R = findViewById(R.id.F_8th_A_R);


        A8C2 = findViewById(R.id.A_8th_A_C2);
        B8C2 = findViewById(R.id.B_8th_A_C2);
        C8C2 = findViewById(R.id.C_8th_A_C2);
        D8C2 = findViewById(R.id.D_8th_A_C2);
        E8C2 = findViewById(R.id.E_8th_A_C2);
        F8C2 = findViewById(R.id.F_8th_A_C2);

        A8T2 = findViewById(R.id.A_8th_A_T2);
        B8T2 = findViewById(R.id.B_8th_A_T2);
        C8T2 = findViewById(R.id.C_8th_A_T2);
        D8T2 = findViewById(R.id.D_8th_A_T2);
        E8T2 = findViewById(R.id.E_8th_A_T2);
        F8T2 = findViewById(R.id.F_8th_A_T2);

        A8R2 = findViewById(R.id.A_8th_A_R2);
        B8R2 = findViewById(R.id.B_8th_A_R2);
        C8R2 = findViewById(R.id.C_8th_A_R2);
        D8R2 = findViewById(R.id.D_8th_A_R2);
        E8R2 = findViewById(R.id.E_8th_A_R2);
        F8R2 = findViewById(R.id.F_8th_A_R2);


        A8C3 = findViewById(R.id.A_8th_A_C3);
        B8C3 = findViewById(R.id.B_8th_A_C3);
        C8C3 = findViewById(R.id.C_8th_A_C3);
        D8C3 = findViewById(R.id.D_8th_A_C3);
        E8C3 = findViewById(R.id.E_8th_A_C3);
        F8C3 = findViewById(R.id.F_8th_A_C3);

        A8T3 = findViewById(R.id.A_8th_A_T3);
        B8T3 = findViewById(R.id.B_8th_A_T3);
        C8T3 = findViewById(R.id.C_8th_A_T3);
        D8T3 = findViewById(R.id.D_8th_A_T3);
        E8T3 = findViewById(R.id.E_8th_A_T3);
        F8T3 = findViewById(R.id.F_8th_A_T3);

        A8R3 = findViewById(R.id.A_8th_A_R3);
        B8R3 = findViewById(R.id.B_8th_A_R3);
        C8R3 = findViewById(R.id.C_8th_A_R3);
        D8R3 = findViewById(R.id.D_8th_A_R3);
        E8R3 = findViewById(R.id.E_8th_A_R3);
        F8R3 = findViewById(R.id.F_8th_A_R3);

        A8C4 = findViewById(R.id.A_8th_A_C4);
        B8C4 = findViewById(R.id.B_8th_A_C4);
        C8C4 = findViewById(R.id.C_8th_A_C4);
        D8C4 = findViewById(R.id.D_8th_A_C4);
        E8C4 = findViewById(R.id.E_8th_A_C4);
        F8C4 = findViewById(R.id.F_8th_A_C4);
        A8T4 = findViewById(R.id.A_8th_A_T4);
        B8T4 = findViewById(R.id.B_8th_A_T4);
        C8T4 = findViewById(R.id.C_8th_A_T4);
        D8T4 = findViewById(R.id.D_8th_A_T4);
        E8T4 = findViewById(R.id.E_8th_A_T4);
        F8T4 = findViewById(R.id.F_8th_A_T4);
        A8R4 = findViewById(R.id.A_8th_A_R4);
        B8R4 = findViewById(R.id.B_8th_A_R4);
        C8R4 = findViewById(R.id.C_8th_A_R4);
        D8R4 = findViewById(R.id.D_8th_A_R4);
        E8R4 = findViewById(R.id.E_8th_A_R4);
        F8R4 = findViewById(R.id.F_8th_A_R4);
        A8C5 = findViewById(R.id.A_8th_A_C5);
        B8C5 = findViewById(R.id.B_8th_A_C5);
        C8C5 = findViewById(R.id.C_8th_A_C5);
        D8C5 = findViewById(R.id.D_8th_A_C5);
        E8C5 = findViewById(R.id.E_8th_A_C5);
        F8C5 = findViewById(R.id.F_8th_A_C5);
        A8T5 = findViewById(R.id.A_8th_A_T5);
        B8T5 = findViewById(R.id.B_8th_A_T5);
        C8T5 = findViewById(R.id.C_8th_A_T5);
        D8T5 = findViewById(R.id.D_8th_A_T5);
        E8T5 = findViewById(R.id.E_8th_A_T5);
        F8T5 = findViewById(R.id.F_8th_A_T5);
        A8R5 = findViewById(R.id.A_8th_A_R5);
        B8R5 = findViewById(R.id.B_8th_A_R5);
        C8R5 = findViewById(R.id.C_8th_A_R5);
        D8R5 = findViewById(R.id.D_8th_A_R5);
        E8R5 = findViewById(R.id.E_8th_A_R5);
        F8R5 = findViewById(R.id.F_8th_A_R5);
        A8C6 = findViewById(R.id.A_8th_A_C6);
        B8C6 = findViewById(R.id.B_8th_A_C6);
        C8C6 = findViewById(R.id.C_8th_A_C6);
        D8C6 = findViewById(R.id.D_8th_A_C6);
        E8C6 = findViewById(R.id.E_8th_A_C6);
        F8C6 = findViewById(R.id.F_8th_A_C6);
        A8T6 = findViewById(R.id.A_8th_A_T6);
        B8T6 = findViewById(R.id.B_8th_A_T6);
        C8T6 = findViewById(R.id.C_8th_A_T6);
        D8T6 = findViewById(R.id.D_8th_A_T6);
        E8T6 = findViewById(R.id.E_8th_A_T6);
        F8T6 = findViewById(R.id.F_8th_A_T6);
        A8R6 = findViewById(R.id.A_8th_A_R6);
        B8R6 = findViewById(R.id.B_8th_A_R6);
        C8R6 = findViewById(R.id.C_8th_A_R6);
        D8R6 = findViewById(R.id.D_8th_A_R6);
        E8R6 = findViewById(R.id.E_8th_A_R6);
        F8R6 = findViewById(R.id.F_8th_A_R6);
        A8R6 = findViewById(R.id.A_8th_A_R6);

        A8C7 = findViewById(R.id.A_8th_A_C7);
        B8C7 = findViewById(R.id.B_8th_A_C7);
        C8C7 = findViewById(R.id.C_8th_A_C7);
        D8C7 = findViewById(R.id.D_8th_A_C7);
        E8C7 = findViewById(R.id.E_8th_A_C7);
        F8C7 = findViewById(R.id.F_8th_A_C7);
        A8T7 = findViewById(R.id.A_8th_A_T7);
        B8T7 = findViewById(R.id.B_8th_A_T7);
        C8T7 = findViewById(R.id.C_8th_A_T7);
        D8T7 = findViewById(R.id.D_8th_A_T7);
        E8T7 = findViewById(R.id.E_8th_A_T7);
        F8T7 = findViewById(R.id.F_8th_A_T7);
        A8R7 = findViewById(R.id.A_8th_A_R7);
        B8R7 = findViewById(R.id.B_8th_A_R7);
        C8R7 = findViewById(R.id.C_8th_A_R7);
        D8R7 = findViewById(R.id.D_8th_A_R7);
        E8R7 = findViewById(R.id.E_8th_A_R7);
        F8R7 = findViewById(R.id.F_8th_A_R7);
        A8C7 = findViewById(R.id.A_8th_A_C7);

        RoutineCheck.check8thSubject(A8thC,B8C,C8C,D8C,E8C,F8C, A8T,B8T,C8T,D8T,E8T,F8T, A8R,B8R,C8R,D8R,E8R,F8R , A8C2,B8C2,C8C2,D8C2,E8C2,F8C2, A8T2,B8T2,C8T2,D8T2,E8T2,F8T2, A8R2,B8R2,C8R2,D8R2,E8R2,F8R2, A8C3,B8C3,C8C3,D8C3,E8C3,F8C3, A8T3,B8T3,C8T3,D8T3,E8T3,F8T3, A8R3,B8R3,C8R3,D8R3,E8R3,F8R3 ,A8C4,B8C4,C8C4,D8C4,E8C4,F8C4,A8T4,B8T4,C8T4,D8T4,E8T4,F8T4,A8R4,B8R4,C8R4,D8R4,E8R4,F8R4,A8C5,B8C5,C8C5,D8C5,E8C5,F8C5,A8T5,B8T5,C8T5,D8T5,E8T5,F8T5,A8R5,B8R5,C8R5,D8R5,E8R5,F8R5,A8C6,B8C6,C8C6,D8C6,E8C6,F8C6,A8T6,B8T6,C8T6,D8T6,E8T6,F8T6,A8R6,B8R6,C8R6,D8R6,E8R6,F8R6);

        ///----------for 9th Semester Routine Cell ---------///
        A9thC = findViewById(R.id.A_9th_A_C);
        B9C = findViewById(R.id.B_9th_A_C);
        C9C = findViewById(R.id.C_9th_A_C);
        D9C = findViewById(R.id.D_9th_A_C);
        E9C = findViewById(R.id.E_9th_A_C);
        F9C = findViewById(R.id.F_9th_A_C);

        A9T = findViewById(R.id.A_9th_A_T);
        B9T = findViewById(R.id.B_9th_A_T);
        C9T = findViewById(R.id.C_9th_A_T);
        D9T = findViewById(R.id.D_9th_A_T);
        E9T = findViewById(R.id.E_9th_A_T);
        F9T = findViewById(R.id.F_9th_A_T);

        A9R = findViewById(R.id.A_9th_A_R);
        B9R = findViewById(R.id.B_9th_A_R);
        C9R = findViewById(R.id.C_9th_A_R);
        D9R = findViewById(R.id.D_9th_A_R);
        E9R = findViewById(R.id.E_9th_A_R);
        F9R = findViewById(R.id.F_9th_A_R);


        A9C2 = findViewById(R.id.A_9th_A_C2);
        B9C2 = findViewById(R.id.B_9th_A_C2);
        C9C2 = findViewById(R.id.C_9th_A_C2);
        D9C2 = findViewById(R.id.D_9th_A_C2);
        E9C2 = findViewById(R.id.E_9th_A_C2);
        F9C2 = findViewById(R.id.F_9th_A_C2);

        A9T2 = findViewById(R.id.A_9th_A_T2);
        B9T2 = findViewById(R.id.B_9th_A_T2);
        C9T2 = findViewById(R.id.C_9th_A_T2);
        D9T2 = findViewById(R.id.D_9th_A_T2);
        E9T2 = findViewById(R.id.E_9th_A_T2);
        F9T2 = findViewById(R.id.F_9th_A_T2);

        A9R2 = findViewById(R.id.A_9th_A_R2);
        B9R2 = findViewById(R.id.B_9th_A_R2);
        C9R2 = findViewById(R.id.C_9th_A_R2);
        D9R2 = findViewById(R.id.D_9th_A_R2);
        E9R2 = findViewById(R.id.E_9th_A_R2);
        F9R2 = findViewById(R.id.F_9th_A_R2);

        A9C3 = findViewById(R.id.A_9th_A_C3);
        B9C3 = findViewById(R.id.B_9th_A_C3);
        C9C3 = findViewById(R.id.C_9th_A_C3);
        D9C3 = findViewById(R.id.D_9th_A_C3);
        E9C3 = findViewById(R.id.E_9th_A_C3);
        F9C3 = findViewById(R.id.F_9th_A_C3);

        A9T3 = findViewById(R.id.A_9th_A_T3);
        B9T3 = findViewById(R.id.B_9th_A_T3);
        C9T3 = findViewById(R.id.C_9th_A_T3);
        D9T3 = findViewById(R.id.D_9th_A_T3);
        E9T3 = findViewById(R.id.E_9th_A_T3);
        F9T3 = findViewById(R.id.F_9th_A_T3);

        A9R3 = findViewById(R.id.A_9th_A_R3);
        B9R3 = findViewById(R.id.B_9th_A_R3);
        C9R3 = findViewById(R.id.C_9th_A_R3);
        D9R3 = findViewById(R.id.D_9th_A_R3);
        E9R3 = findViewById(R.id.E_9th_A_R3);
        F9R3 = findViewById(R.id.F_9th_A_R3);

        A9C4 = findViewById(R.id.A_9th_A_C4);
        B9C4 = findViewById(R.id.B_9th_A_C4);
        C9C4 = findViewById(R.id.C_9th_A_C4);
        D9C4 = findViewById(R.id.D_9th_A_C4);
        E9C4 = findViewById(R.id.E_9th_A_C4);
        F9C4 = findViewById(R.id.F_9th_A_C4);
        A9T4 = findViewById(R.id.A_9th_A_T4);
        B9T4 = findViewById(R.id.B_9th_A_T4);
        C9T4 = findViewById(R.id.C_9th_A_T4);
        D9T4 = findViewById(R.id.D_9th_A_T4);
        E9T4 = findViewById(R.id.E_9th_A_T4);
        F9T4 = findViewById(R.id.F_9th_A_T4);
        A9R4 = findViewById(R.id.A_9th_A_R4);
        B9R4 = findViewById(R.id.B_9th_A_R4);
        C9R4 = findViewById(R.id.C_9th_A_R4);
        D9R4 = findViewById(R.id.D_9th_A_R4);
        E9R4 = findViewById(R.id.E_9th_A_R4);
        F9R4 = findViewById(R.id.F_9th_A_R4);
        A9C5 = findViewById(R.id.A_9th_A_C5);
        B9C5 = findViewById(R.id.B_9th_A_C5);
        C9C5 = findViewById(R.id.C_9th_A_C5);
        D9C5 = findViewById(R.id.D_9th_A_C5);
        E9C5 = findViewById(R.id.E_9th_A_C5);
        F9C5 = findViewById(R.id.F_9th_A_C5);
        A9T5 = findViewById(R.id.A_9th_A_T5);
        B9T5 = findViewById(R.id.B_9th_A_T5);
        C9T5 = findViewById(R.id.C_9th_A_T5);
        D9T5 = findViewById(R.id.D_9th_A_T5);
        E9T5 = findViewById(R.id.E_9th_A_T5);
        F9T5 = findViewById(R.id.F_9th_A_T5);
        A9R5 = findViewById(R.id.A_9th_A_R5);
        B9R5 = findViewById(R.id.B_9th_A_R5);
        C9R5 = findViewById(R.id.C_9th_A_R5);
        D9R5 = findViewById(R.id.D_9th_A_R5);
        E9R5 = findViewById(R.id.E_9th_A_R5);
        F9R5 = findViewById(R.id.F_9th_A_R5);
        A9C6 = findViewById(R.id.A_9th_A_C6);
        B9C6 = findViewById(R.id.B_9th_A_C6);
        C9C6 = findViewById(R.id.C_9th_A_C6);
        D9C6 = findViewById(R.id.D_9th_A_C6);
        E9C6 = findViewById(R.id.E_9th_A_C6);
        F9C6 = findViewById(R.id.F_9th_A_C6);
        A9T6 = findViewById(R.id.A_9th_A_T6);
        B9T6 = findViewById(R.id.B_9th_A_T6);
        C9T6 = findViewById(R.id.C_9th_A_T6);
        D9T6 = findViewById(R.id.D_9th_A_T6);
        E9T6 = findViewById(R.id.E_9th_A_T6);
        F9T6 = findViewById(R.id.F_9th_A_T6);
        A9R6 = findViewById(R.id.A_9th_A_R6);
        B9R6 = findViewById(R.id.B_9th_A_R6);
        C9R6 = findViewById(R.id.C_9th_A_R6);
        D9R6 = findViewById(R.id.D_9th_A_R6);
        E9R6 = findViewById(R.id.E_9th_A_R6);
        F9R6 = findViewById(R.id.F_9th_A_R6);
        A9R6 = findViewById(R.id.A_9th_A_R6);

        A9C7 = findViewById(R.id.A_9th_A_C7);
        B9C7 = findViewById(R.id.B_9th_A_C7);
        C9C7 = findViewById(R.id.C_9th_A_C7);
        D9C7 = findViewById(R.id.D_9th_A_C7);
        E9C7 = findViewById(R.id.E_9th_A_C7);
        F9C7 = findViewById(R.id.F_9th_A_C7);
        A9T7 = findViewById(R.id.A_9th_A_T7);
        B9T7 = findViewById(R.id.B_9th_A_T7);
        C9T7 = findViewById(R.id.C_9th_A_T7);
        D9T7 = findViewById(R.id.D_9th_A_T7);
        E9T7 = findViewById(R.id.E_9th_A_T7);
        F9T7 = findViewById(R.id.F_9th_A_T7);
        A9R7 = findViewById(R.id.A_9th_A_R7);
        B9R7 = findViewById(R.id.B_9th_A_R7);
        C9R7 = findViewById(R.id.C_9th_A_R7);
        D9R7 = findViewById(R.id.D_9th_A_R7);
        E9R7 = findViewById(R.id.E_9th_A_R7);
        F9R7 = findViewById(R.id.F_9th_A_R7);
        A9C7 = findViewById(R.id.A_9th_A_C7);

        RoutineCheck.check9thSubject(A9thC,B9C,C9C,D9C,E9C,F9C, A9T,B9T,C9T,D9T,E9T,F9T, A9R,B9R,C9R,D9R,E9R,F9R , A9C2,B9C2,C9C2,D9C2,E9C2,F9C2, A9T2,B9T2,C9T2,D9T2,E9T2,F9T2, A9R2,B9R2,C9R2,D9R2,E9R2,F9R2, A9C3,B9C3,C9C3,D9C3,E9C3,F9C3, A9T3,B9T3,C9T3,D9T3,E9T3,F9T3, A9R3,B9R3,C9R3,D9R3,E9R3,F9R3 ,A9C4,B9C4,C9C4,D9C4,E9C4,F9C4,A9T4,B9T4,C9T4,D9T4,E9T4,F9T4,A9R4,B9R4,C9R4,D9R4,E9R4,F9R4,A9C5,B9C5,C9C5,D9C5,E9C5,F9C5,A9T5,B9T5,C9T5,D9T5,E9T5,F9T5,A9R5,B9R5,C9R5,D9R5,E9R5,F9R5,A9C6,B9C6,C9C6,D9C6,E9C6,F9C6,A9T6,B9T6,C9T6,D9T6,E9T6,F9T6,A9R6,B9R6,C9R6,D9R6,E9R6,F9R6);

        ///----------for 10th Semester Routine Cell ---------///
        A10thC = findViewById(R.id.A_10th_A_C);
        B10C = findViewById(R.id.B_10th_A_C);
        C10C = findViewById(R.id.C_10th_A_C);
        D10C = findViewById(R.id.D_10th_A_C);
        E10C = findViewById(R.id.E_10th_A_C);
        F10C = findViewById(R.id.F_10th_A_C);

        A10T = findViewById(R.id.A_10th_A_T);
        B10T = findViewById(R.id.B_10th_A_T);
        C10T = findViewById(R.id.C_10th_A_T);
        D10T = findViewById(R.id.D_10th_A_T);
        E10T = findViewById(R.id.E_10th_A_T);
        F10T = findViewById(R.id.F_10th_A_T);

        A10R = findViewById(R.id.A_10th_A_R);
        B10R = findViewById(R.id.B_10th_A_R);
        C10R = findViewById(R.id.C_10th_A_R);
        D10R = findViewById(R.id.D_10th_A_R);
        E10R = findViewById(R.id.E_10th_A_R);
        F10R = findViewById(R.id.F_10th_A_R);


        A10C2 = findViewById(R.id.A_10th_A_C2);
        B10C2 = findViewById(R.id.B_10th_A_C2);
        C10C2 = findViewById(R.id.C_10th_A_C2);
        D10C2 = findViewById(R.id.D_10th_A_C2);
        E10C2 = findViewById(R.id.E_10th_A_C2);
        F10C2 = findViewById(R.id.F_10th_A_C2);

        A10T2 = findViewById(R.id.A_10th_A_T2);
        B10T2 = findViewById(R.id.B_10th_A_T2);
        C10T2 = findViewById(R.id.C_10th_A_T2);
        D10T2 = findViewById(R.id.D_10th_A_T2);
        E10T2 = findViewById(R.id.E_10th_A_T2);
        F10T2 = findViewById(R.id.F_10th_A_T2);

        A10R2 = findViewById(R.id.A_10th_A_R2);
        B10R2 = findViewById(R.id.B_10th_A_R2);
        C10R2 = findViewById(R.id.C_10th_A_R2);
        D10R2 = findViewById(R.id.D_10th_A_R2);
        E10R2 = findViewById(R.id.E_10th_A_R2);
        F10R2 = findViewById(R.id.F_10th_A_R2);

        A10C3 = findViewById(R.id.A_10th_A_C3);
        B10C3 = findViewById(R.id.B_10th_A_C3);
        C10C3 = findViewById(R.id.C_10th_A_C3);
        D10C3 = findViewById(R.id.D_10th_A_C3);
        E10C3 = findViewById(R.id.E_10th_A_C3);
        F10C3 = findViewById(R.id.F_10th_A_C3);

        A10T3 = findViewById(R.id.A_10th_A_T3);
        B10T3 = findViewById(R.id.B_10th_A_T3);
        C10T3 = findViewById(R.id.C_10th_A_T3);
        D10T3 = findViewById(R.id.D_10th_A_T3);
        E10T3 = findViewById(R.id.E_10th_A_T3);
        F10T3 = findViewById(R.id.F_10th_A_T3);

        A10R3 = findViewById(R.id.A_10th_A_R3);
        B10R3 = findViewById(R.id.B_10th_A_R3);
        C10R3 = findViewById(R.id.C_10th_A_R3);
        D10R3 = findViewById(R.id.D_10th_A_R3);
        E10R3 = findViewById(R.id.E_10th_A_R3);
        F10R3 = findViewById(R.id.F_10th_A_R3);

        A10C4 = findViewById(R.id.A_10th_A_C4);
        B10C4 = findViewById(R.id.B_10th_A_C4);
        C10C4 = findViewById(R.id.C_10th_A_C4);
        D10C4 = findViewById(R.id.D_10th_A_C4);
        E10C4 = findViewById(R.id.E_10th_A_C4);
        F10C4 = findViewById(R.id.F_10th_A_C4);
        A10T4 = findViewById(R.id.A_10th_A_T4);
        B10T4 = findViewById(R.id.B_10th_A_T4);
        C10T4 = findViewById(R.id.C_10th_A_T4);
        D10T4 = findViewById(R.id.D_10th_A_T4);
        E10T4 = findViewById(R.id.E_10th_A_T4);
        F10T4 = findViewById(R.id.F_10th_A_T4);
        A10R4 = findViewById(R.id.A_10th_A_R4);
        B10R4 = findViewById(R.id.B_10th_A_R4);
        C10R4 = findViewById(R.id.C_10th_A_R4);
        D10R4 = findViewById(R.id.D_10th_A_R4);
        E10R4 = findViewById(R.id.E_10th_A_R4);
        F10R4 = findViewById(R.id.F_10th_A_R4);
        A10C5 = findViewById(R.id.A_10th_A_C5);
        B10C5 = findViewById(R.id.B_10th_A_C5);
        C10C5 = findViewById(R.id.C_10th_A_C5);
        D10C5 = findViewById(R.id.D_10th_A_C5);
        E10C5 = findViewById(R.id.E_10th_A_C5);
        F10C5 = findViewById(R.id.F_10th_A_C5);
        A10T5 = findViewById(R.id.A_10th_A_T5);
        B10T5 = findViewById(R.id.B_10th_A_T5);
        C10T5 = findViewById(R.id.C_10th_A_T5);
        D10T5 = findViewById(R.id.D_10th_A_T5);
        E10T5 = findViewById(R.id.E_10th_A_T5);
        F10T5 = findViewById(R.id.F_10th_A_T5);
        A10R5 = findViewById(R.id.A_10th_A_R5);
        B10R5 = findViewById(R.id.B_10th_A_R5);
        C10R5 = findViewById(R.id.C_10th_A_R5);
        D10R5 = findViewById(R.id.D_10th_A_R5);
        E10R5 = findViewById(R.id.E_10th_A_R5);
        F10R5 = findViewById(R.id.F_10th_A_R5);
        A10C6 = findViewById(R.id.A_10th_A_C6);
        B10C6 = findViewById(R.id.B_10th_A_C6);
        C10C6 = findViewById(R.id.C_10th_A_C6);
        D10C6 = findViewById(R.id.D_10th_A_C6);
        E10C6 = findViewById(R.id.E_10th_A_C6);
        F10C6 = findViewById(R.id.F_10th_A_C6);
        A10T6 = findViewById(R.id.A_10th_A_T6);
        B10T6 = findViewById(R.id.B_10th_A_T6);
        C10T6 = findViewById(R.id.C_10th_A_T6);
        D10T6 = findViewById(R.id.D_10th_A_T6);
        E10T6 = findViewById(R.id.E_10th_A_T6);
        F10T6 = findViewById(R.id.F_10th_A_T6);
        A10R6 = findViewById(R.id.A_10th_A_R6);
        B10R6 = findViewById(R.id.B_10th_A_R6);
        C10R6 = findViewById(R.id.C_10th_A_R6);
        D10R6 = findViewById(R.id.D_10th_A_R6);
        E10R6 = findViewById(R.id.E_10th_A_R6);
        F10R6 = findViewById(R.id.F_10th_A_R6);
        A10R6 = findViewById(R.id.A_10th_A_R6);

        A10C7 = findViewById(R.id.A_10th_A_C7);
        B10C7 = findViewById(R.id.B_10th_A_C7);
        C10C7 = findViewById(R.id.C_10th_A_C7);
        D10C7 = findViewById(R.id.D_10th_A_C7);
        E10C7 = findViewById(R.id.E_10th_A_C7);
        F10C7 = findViewById(R.id.F_10th_A_C7);
        A10T7 = findViewById(R.id.A_10th_A_T7);
        B10T7 = findViewById(R.id.B_10th_A_T7);
        C10T7 = findViewById(R.id.C_10th_A_T7);
        D10T7 = findViewById(R.id.D_10th_A_T7);
        E10T7 = findViewById(R.id.E_10th_A_T7);
        F10T7 = findViewById(R.id.F_10th_A_T7);
        A10R7 = findViewById(R.id.A_10th_A_R7);
        B10R7 = findViewById(R.id.B_10th_A_R7);
        C10R7 = findViewById(R.id.C_10th_A_R7);
        D10R7 = findViewById(R.id.D_10th_A_R7);
        E10R7 = findViewById(R.id.E_10th_A_R7);
        F10R7 = findViewById(R.id.F_10th_A_R7);
        A10C7 = findViewById(R.id.A_10th_A_C7);

        RoutineCheck.check10thSubject(A10thC,B10C,C10C,D10C,E10C,F10C, A10T,B10T,C10T,D10T,E10T,F10T, A10R,B10R,C10R,D10R,E10R,F10R , A10C2,B10C2,C10C2,D10C2,E10C2,F10C2, A10T2,B10T2,C10T2,D10T2,E10T2,F10T2, A10R2,B10R2,C10R2,D10R2,E10R2,F10R2, A10C3,B10C3,C10C3,D10C3,E10C3,F10C3, A10T3,B10T3,C10T3,D10T3,E10T3,F10T3, A10R3,B10R3,C10R3,D10R3,E10R3,F10R3 ,A10C4,B10C4,C10C4,D10C4,E10C4,F10C4,A10T4,B10T4,C10T4,D10T4,E10T4,F10T4,A10R4,B10R4,C10R4,D10R4,E10R4,F10R4,A10C5,B10C5,C10C5,D10C5,E10C5,F10C5,A10T5,B10T5,C10T5,D10T5,E10T5,F10T5,A10R5,B10R5,C10R5,D10R5,E10R5,F10R5,A10C6,B10C6,C10C6,D10C6,E10C6,F10C6,A10T6,B10T6,C10T6,D10T6,E10T6,F10T6,A10R6,B10R6,C10R6,D10R6,E10R6,F10R6);

        ///----------for 11th Semester Routine Cell ---------///
        A11thC = findViewById(R.id.A_11th_A_C);
        B11C = findViewById(R.id.B_11th_A_C);
        C11C = findViewById(R.id.C_11th_A_C);
        D11C = findViewById(R.id.D_11th_A_C);
        E11C = findViewById(R.id.E_11th_A_C);
        F11C = findViewById(R.id.F_11th_A_C);

        A11T = findViewById(R.id.A_11th_A_T);
        B11T = findViewById(R.id.B_11th_A_T);
        C11T = findViewById(R.id.C_11th_A_T);
        D11T = findViewById(R.id.D_11th_A_T);
        E11T = findViewById(R.id.E_11th_A_T);
        F11T = findViewById(R.id.F_11th_A_T);

        A11R = findViewById(R.id.A_11th_A_R);
        B11R = findViewById(R.id.B_11th_A_R);
        C11R = findViewById(R.id.C_11th_A_R);
        D11R = findViewById(R.id.D_11th_A_R);
        E11R = findViewById(R.id.E_11th_A_R);
        F11R = findViewById(R.id.F_11th_A_R);


        A11C2 = findViewById(R.id.A_11th_A_C2);
        B11C2 = findViewById(R.id.B_11th_A_C2);
        C11C2 = findViewById(R.id.C_11th_A_C2);
        D11C2 = findViewById(R.id.D_11th_A_C2);
        E11C2 = findViewById(R.id.E_11th_A_C2);
        F11C2 = findViewById(R.id.F_11th_A_C2);

        A11T2 = findViewById(R.id.A_11th_A_T2);
        B11T2 = findViewById(R.id.B_11th_A_T2);
        C11T2 = findViewById(R.id.C_11th_A_T2);
        D11T2 = findViewById(R.id.D_11th_A_T2);
        E11T2 = findViewById(R.id.E_11th_A_T2);
        F11T2 = findViewById(R.id.F_11th_A_T2);

        A11R2 = findViewById(R.id.A_11th_A_R2);
        B11R2 = findViewById(R.id.B_11th_A_R2);
        C11R2 = findViewById(R.id.C_11th_A_R2);
        D11R2 = findViewById(R.id.D_11th_A_R2);
        E11R2 = findViewById(R.id.E_11th_A_R2);
        F11R2 = findViewById(R.id.F_11th_A_R2);

        A11C3 = findViewById(R.id.A_11th_A_C3);
        B11C3 = findViewById(R.id.B_11th_A_C3);
        C11C3 = findViewById(R.id.C_11th_A_C3);
        D11C3 = findViewById(R.id.D_11th_A_C3);
        E11C3 = findViewById(R.id.E_11th_A_C3);
        F11C3 = findViewById(R.id.F_11th_A_C3);

        A11T3 = findViewById(R.id.A_11th_A_T3);
        B11T3 = findViewById(R.id.B_11th_A_T3);
        C11T3 = findViewById(R.id.C_11th_A_T3);
        D11T3 = findViewById(R.id.D_11th_A_T3);
        E11T3 = findViewById(R.id.E_11th_A_T3);
        F11T3 = findViewById(R.id.F_11th_A_T3);

        A11R3 = findViewById(R.id.A_11th_A_R3);
        B11R3 = findViewById(R.id.B_11th_A_R3);
        C11R3 = findViewById(R.id.C_11th_A_R3);
        D11R3 = findViewById(R.id.D_11th_A_R3);
        E11R3 = findViewById(R.id.E_11th_A_R3);
        F11R3 = findViewById(R.id.F_11th_A_R3);

        A11C4 = findViewById(R.id.A_11th_A_C4);
        B11C4 = findViewById(R.id.B_11th_A_C4);
        C11C4 = findViewById(R.id.C_11th_A_C4);
        D11C4 = findViewById(R.id.D_11th_A_C4);
        E11C4 = findViewById(R.id.E_11th_A_C4);
        F11C4 = findViewById(R.id.F_11th_A_C4);
        A11T4 = findViewById(R.id.A_11th_A_T4);
        B11T4 = findViewById(R.id.B_11th_A_T4);
        C11T4 = findViewById(R.id.C_11th_A_T4);
        D11T4 = findViewById(R.id.D_11th_A_T4);
        E11T4 = findViewById(R.id.E_11th_A_T4);
        F11T4 = findViewById(R.id.F_11th_A_T4);
        A11R4 = findViewById(R.id.A_11th_A_R4);
        B11R4 = findViewById(R.id.B_11th_A_R4);
        C11R4 = findViewById(R.id.C_11th_A_R4);
        D11R4 = findViewById(R.id.D_11th_A_R4);
        E11R4 = findViewById(R.id.E_11th_A_R4);
        F11R4 = findViewById(R.id.F_11th_A_R4);
        A11C5 = findViewById(R.id.A_11th_A_C5);
        B11C5 = findViewById(R.id.B_11th_A_C5);
        C11C5 = findViewById(R.id.C_11th_A_C5);
        D11C5 = findViewById(R.id.D_11th_A_C5);
        E11C5 = findViewById(R.id.E_11th_A_C5);
        F11C5 = findViewById(R.id.F_11th_A_C5);
        A11T5 = findViewById(R.id.A_11th_A_T5);
        B11T5 = findViewById(R.id.B_11th_A_T5);
        C11T5 = findViewById(R.id.C_11th_A_T5);
        D11T5 = findViewById(R.id.D_11th_A_T5);
        E11T5 = findViewById(R.id.E_11th_A_T5);
        F11T5 = findViewById(R.id.F_11th_A_T5);
        A11R5 = findViewById(R.id.A_11th_A_R5);
        B11R5 = findViewById(R.id.B_11th_A_R5);
        C11R5 = findViewById(R.id.C_11th_A_R5);
        D11R5 = findViewById(R.id.D_11th_A_R5);
        E11R5 = findViewById(R.id.E_11th_A_R5);
        F11R5 = findViewById(R.id.F_11th_A_R5);
        A11C6 = findViewById(R.id.A_11th_A_C6);
        B11C6 = findViewById(R.id.B_11th_A_C6);
        C11C6 = findViewById(R.id.C_11th_A_C6);
        D11C6 = findViewById(R.id.D_11th_A_C6);
        E11C6 = findViewById(R.id.E_11th_A_C6);
        F11C6 = findViewById(R.id.F_11th_A_C6);
        A11T6 = findViewById(R.id.A_11th_A_T6);
        B11T6 = findViewById(R.id.B_11th_A_T6);
        C11T6 = findViewById(R.id.C_11th_A_T6);
        D11T6 = findViewById(R.id.D_11th_A_T6);
        E11T6 = findViewById(R.id.E_11th_A_T6);
        F11T6 = findViewById(R.id.F_11th_A_T6);
        A11R6 = findViewById(R.id.A_11th_A_R6);
        B11R6 = findViewById(R.id.B_11th_A_R6);
        C11R6 = findViewById(R.id.C_11th_A_R6);
        D11R6 = findViewById(R.id.D_11th_A_R6);
        E11R6 = findViewById(R.id.E_11th_A_R6);
        F11R6 = findViewById(R.id.F_11th_A_R6);
        A11R6 = findViewById(R.id.A_11th_A_R6);

        A11C7 = findViewById(R.id.A_11th_A_C7);
        B11C7 = findViewById(R.id.B_11th_A_C7);
        C11C7 = findViewById(R.id.C_11th_A_C7);
        D11C7 = findViewById(R.id.D_11th_A_C7);
        E11C7 = findViewById(R.id.E_11th_A_C7);
        F11C7 = findViewById(R.id.F_11th_A_C7);
        A11T7 = findViewById(R.id.A_11th_A_T7);
        B11T7 = findViewById(R.id.B_11th_A_T7);
        C11T7 = findViewById(R.id.C_11th_A_T7);
        D11T7 = findViewById(R.id.D_11th_A_T7);
        E11T7 = findViewById(R.id.E_11th_A_T7);
        F11T7 = findViewById(R.id.F_11th_A_T7);
        A11R7 = findViewById(R.id.A_11th_A_R7);
        B11R7 = findViewById(R.id.B_11th_A_R7);
        C11R7 = findViewById(R.id.C_11th_A_R7);
        D11R7 = findViewById(R.id.D_11th_A_R7);
        E11R7 = findViewById(R.id.E_11th_A_R7);
        F11R7 = findViewById(R.id.F_11th_A_R7);
        A11C7 = findViewById(R.id.A_11th_A_C7);

        RoutineCheck.check11thSubject(A11thC,B11C,C11C,D11C,E11C,F11C, A11T,B11T,C11T,D11T,E11T,F11T, A11R,B11R,C11R,D11R,E11R,F11R , A11C2,B11C2,C11C2,D11C2,E11C2,F11C2, A11T2,B11T2,C11T2,D11T2,E11T2,F11T2, A11R2,B11R2,C11R2,D11R2,E11R2,F11R2, A11C3,B11C3,C11C3,D11C3,E11C3,F11C3, A11T3,B11T3,C11T3,D11T3,E11T3,F11T3, A11R3,B11R3,C11R3,D11R3,E11R3,F11R3 ,A11C4,B11C4,C11C4,D11C4,E11C4,F11C4,A11T4,B11T4,C11T4,D11T4,E11T4,F11T4,A11R4,B11R4,C11R4,D11R4,E11R4,F11R4,A11C5,B11C5,C11C5,D11C5,E11C5,F11C5,A11T5,B11T5,C11T5,D11T5,E11T5,F11T5,A11R5,B11R5,C11R5,D11R5,E11R5,F11R5,A11C6,B11C6,C11C6,D11C6,E11C6,F11C6,A11T6,B11T6,C11T6,D11T6,E11T6,F11T6,A11R6,B11R6,C11R6,D11R6,E11R6,F11R6);

        ///----------for 12th Semester Routine Cell ---------///
        A12thC = findViewById(R.id.A_12th_A_C);
        B12C = findViewById(R.id.B_12th_A_C);
        C12C = findViewById(R.id.C_12th_A_C);
        D12C = findViewById(R.id.D_12th_A_C);
        E12C = findViewById(R.id.E_12th_A_C);
        F12C = findViewById(R.id.F_12th_A_C);

        A12T = findViewById(R.id.A_12th_A_T);
        B12T = findViewById(R.id.B_12th_A_T);
        C12T = findViewById(R.id.C_12th_A_T);
        D12T = findViewById(R.id.D_12th_A_T);
        E12T = findViewById(R.id.E_12th_A_T);
        F12T = findViewById(R.id.F_12th_A_T);

        A12R = findViewById(R.id.A_12th_A_R);
        B12R = findViewById(R.id.B_12th_A_R);
        C12R = findViewById(R.id.C_12th_A_R);
        D12R = findViewById(R.id.D_12th_A_R);
        E12R = findViewById(R.id.E_12th_A_R);
        F12R = findViewById(R.id.F_12th_A_R);


        A12C2 = findViewById(R.id.A_12th_A_C2);
        B12C2 = findViewById(R.id.B_12th_A_C2);
        C12C2 = findViewById(R.id.C_12th_A_C2);
        D12C2 = findViewById(R.id.D_12th_A_C2);
        E12C2 = findViewById(R.id.E_12th_A_C2);
        F12C2 = findViewById(R.id.F_12th_A_C2);

        A12T2 = findViewById(R.id.A_12th_A_T2);
        B12T2 = findViewById(R.id.B_12th_A_T2);
        C12T2 = findViewById(R.id.C_12th_A_T2);
        D12T2 = findViewById(R.id.D_12th_A_T2);
        E12T2 = findViewById(R.id.E_12th_A_T2);
        F12T2 = findViewById(R.id.F_12th_A_T2);

        A12R2 = findViewById(R.id.A_12th_A_R2);
        B12R2 = findViewById(R.id.B_12th_A_R2);
        C12R2 = findViewById(R.id.C_12th_A_R2);
        D12R2 = findViewById(R.id.D_12th_A_R2);
        E12R2 = findViewById(R.id.E_12th_A_R2);
        F12R2 = findViewById(R.id.F_12th_A_R2);

        A12C3 = findViewById(R.id.A_12th_A_C3);
        B12C3 = findViewById(R.id.B_12th_A_C3);
        C12C3 = findViewById(R.id.C_12th_A_C3);
        D12C3 = findViewById(R.id.D_12th_A_C3);
        E12C3 = findViewById(R.id.E_12th_A_C3);
        F12C3 = findViewById(R.id.F_12th_A_C3);

        A12T3 = findViewById(R.id.A_12th_A_T3);
        B12T3 = findViewById(R.id.B_12th_A_T3);
        C12T3 = findViewById(R.id.C_12th_A_T3);
        D12T3 = findViewById(R.id.D_12th_A_T3);
        E12T3 = findViewById(R.id.E_12th_A_T3);
        F12T3 = findViewById(R.id.F_12th_A_T3);

        A12R3 = findViewById(R.id.A_12th_A_R3);
        B12R3 = findViewById(R.id.B_12th_A_R3);
        C12R3 = findViewById(R.id.C_12th_A_R3);
        D12R3 = findViewById(R.id.D_12th_A_R3);
        E12R3 = findViewById(R.id.E_12th_A_R3);
        F12R3 = findViewById(R.id.F_12th_A_R3);

        A12C4 = findViewById(R.id.A_12th_A_C4);
        B12C4 = findViewById(R.id.B_12th_A_C4);
        C12C4 = findViewById(R.id.C_12th_A_C4);
        D12C4 = findViewById(R.id.D_12th_A_C4);
        E12C4 = findViewById(R.id.E_12th_A_C4);
        F12C4 = findViewById(R.id.F_12th_A_C4);
        A12T4 = findViewById(R.id.A_12th_A_T4);
        B12T4 = findViewById(R.id.B_12th_A_T4);
        C12T4 = findViewById(R.id.C_12th_A_T4);
        D12T4 = findViewById(R.id.D_12th_A_T4);
        E12T4 = findViewById(R.id.E_12th_A_T4);
        F12T4 = findViewById(R.id.F_12th_A_T4);
        A12R4 = findViewById(R.id.A_12th_A_R4);
        B12R4 = findViewById(R.id.B_12th_A_R4);
        C12R4 = findViewById(R.id.C_12th_A_R4);
        D12R4 = findViewById(R.id.D_12th_A_R4);
        E12R4 = findViewById(R.id.E_12th_A_R4);
        F12R4 = findViewById(R.id.F_12th_A_R4);
        A12C5 = findViewById(R.id.A_12th_A_C5);
        B12C5 = findViewById(R.id.B_12th_A_C5);
        C12C5 = findViewById(R.id.C_12th_A_C5);
        D12C5 = findViewById(R.id.D_12th_A_C5);
        E12C5 = findViewById(R.id.E_12th_A_C5);
        F12C5 = findViewById(R.id.F_12th_A_C5);
        A12T5 = findViewById(R.id.A_12th_A_T5);
        B12T5 = findViewById(R.id.B_12th_A_T5);
        C12T5 = findViewById(R.id.C_12th_A_T5);
        D12T5 = findViewById(R.id.D_12th_A_T5);
        E12T5 = findViewById(R.id.E_12th_A_T5);
        F12T5 = findViewById(R.id.F_12th_A_T5);
        A12R5 = findViewById(R.id.A_12th_A_R5);
        B12R5 = findViewById(R.id.B_12th_A_R5);
        C12R5 = findViewById(R.id.C_12th_A_R5);
        D12R5 = findViewById(R.id.D_12th_A_R5);
        E12R5 = findViewById(R.id.E_12th_A_R5);
        F12R5 = findViewById(R.id.F_12th_A_R5);
        A12C6 = findViewById(R.id.A_12th_A_C6);
        B12C6 = findViewById(R.id.B_12th_A_C6);
        C12C6 = findViewById(R.id.C_12th_A_C6);
        D12C6 = findViewById(R.id.D_12th_A_C6);
        E12C6 = findViewById(R.id.E_12th_A_C6);
        F12C6 = findViewById(R.id.F_12th_A_C6);
        A12T6 = findViewById(R.id.A_12th_A_T6);
        B12T6 = findViewById(R.id.B_12th_A_T6);
        C12T6 = findViewById(R.id.C_12th_A_T6);
        D12T6 = findViewById(R.id.D_12th_A_T6);
        E12T6 = findViewById(R.id.E_12th_A_T6);
        F12T6 = findViewById(R.id.F_12th_A_T6);
        A12R6 = findViewById(R.id.A_12th_A_R6);
        B12R6 = findViewById(R.id.B_12th_A_R6);
        C12R6 = findViewById(R.id.C_12th_A_R6);
        D12R6 = findViewById(R.id.D_12th_A_R6);
        E12R6 = findViewById(R.id.E_12th_A_R6);
        F12R6 = findViewById(R.id.F_12th_A_R6);
        A12R6 = findViewById(R.id.A_12th_A_R6);

        A12C7 = findViewById(R.id.A_12th_A_C7);
        B12C7 = findViewById(R.id.B_12th_A_C7);
        C12C7 = findViewById(R.id.C_12th_A_C7);
        D12C7 = findViewById(R.id.D_12th_A_C7);
        E12C7 = findViewById(R.id.E_12th_A_C7);
        F12C7 = findViewById(R.id.F_12th_A_C7);
        A12T7 = findViewById(R.id.A_12th_A_T7);
        B12T7 = findViewById(R.id.B_12th_A_T7);
        C12T7 = findViewById(R.id.C_12th_A_T7);
        D12T7 = findViewById(R.id.D_12th_A_T7);
        E12T7 = findViewById(R.id.E_12th_A_T7);
        F12T7 = findViewById(R.id.F_12th_A_T7);
        A12R7 = findViewById(R.id.A_12th_A_R7);
        B12R7 = findViewById(R.id.B_12th_A_R7);
        C12R7 = findViewById(R.id.C_12th_A_R7);
        D12R7 = findViewById(R.id.D_12th_A_R7);
        E12R7 = findViewById(R.id.E_12th_A_R7);
        F12R7 = findViewById(R.id.F_12th_A_R7);
        A12C7 = findViewById(R.id.A_12th_A_C7);


        RoutineCheck.check12thSubject(A12thC,B12C,C12C,D12C,E12C,F12C, A12T,B12T,C12T,D12T,E12T,F12T, A12R,B12R,C12R,D12R,E12R,F12R , A12C2,B12C2,C12C2,D12C2,E12C2,F12C2, A12T2,B12T2,C12T2,D12T2,E12T2,F12T2, A12R2,B12R2,C12R2,D12R2,E12R2,F12R2, A12C3,B12C3,C12C3,D12C3,E12C3,F12C3, A12T3,B12T3,C12T3,D12T3,E12T3,F12T3, A12R3,B12R3,C12R3,D12R3,E12R3,F12R3 ,A12C4,B12C4,C12C4,D12C4,E12C4,F12C4,A12T4,B12T4,C12T4,D12T4,E12T4,F12T4,A12R4,B12R4,C12R4,D12R4,E12R4,F12R4,A12C5,B12C5,C12C5,D12C5,E12C5,F12C5,A12T5,B12T5,C12T5,D12T5,E12T5,F12T5,A12R5,B12R5,C12R5,D12R5,E12R5,F12R5,A12C6,B12C6,C12C6,D12C6,E12C6,F12C6,A12T6,B12T6,C12T6,D12T6,E12T6,F12T6,A12R6,B12R6,C12R6,D12R6,E12R6,F12R6);

        ////---------------- For Routine Time And Semester Auto Select -------------////

        aTime = findViewById(R.id.A_time);
        bTime = findViewById(R.id.B_time);
        cTime = findViewById(R.id.C_time);
        dTime = findViewById(R.id.D_time);
        eTime = findViewById(R.id.E_time);
        fTime = findViewById(R.id.F_time);

        sATime = findViewById(R.id.s_a_time);
        sBTime = findViewById(R.id.s_b_time);
        sCTime = findViewById(R.id.s_c_time);
        sDTime = findViewById(R.id.s_d_time);
        sETime = findViewById(R.id.s_e_time);
        sFTime = findViewById(R.id.s_f_time);

        select1st = findViewById(R.id.select_1st);
        select2nd = findViewById(R.id.select_2nd);
        select3rd = findViewById(R.id.select_3rd);
        select4th = findViewById(R.id.select_4th);
        select5th = findViewById(R.id.select_5th);
        select6th = findViewById(R.id.select_6th);
        select7th = findViewById(R.id.select_7th);
        select8th = findViewById(R.id.select_8th);
        select9th = findViewById(R.id.select_9th);
        select10th = findViewById(R.id.select_10th);
        select11th = findViewById(R.id.select_11th);
        select12th = findViewById(R.id.select_12th);
        routineConditionSelect = findViewById(R.id.routine_condition);
        weekSelect = findViewById(R.id.week_select);

        select1stText = findViewById(R.id.select_1st_text);
        select2ndText = findViewById(R.id.select_2nd_text);
        select3rdText = findViewById(R.id.select_3rd_text);
        select4thText = findViewById(R.id.select_4th_text);
        select5thText = findViewById(R.id.select_5th_text);
        select6thText = findViewById(R.id.select_6th_text);
        select7thText = findViewById(R.id.select_7th_text);
        select8thText = findViewById(R.id.select_8th_text);
        select9thText = findViewById(R.id.select_9th_text);
        select10thText = findViewById(R.id.select_10th_text);
        select11thText = findViewById(R.id.select_11th_text);
        select12thText = findViewById(R.id.select_12th_text);
        routineConditionSelectText = findViewById(R.id.routine_condition_text);
        weekSelectText = findViewById(R.id.week_select_text);

        routineCount = findViewById(R.id.count_edit_text);

        Routine.timeAndSemesterSelectionRoutine(aTime,bTime,cTime,dTime,eTime,fTime,sATime,sBTime,sCTime,sDTime,sETime,sFTime
                ,select1st,select2nd,select3rd,select4th,select5th,select6th,select7th,select8th,select9th,select10th,select11th,select12th, weekSelect, routineConditionSelect
                ,select1stText,select2ndText,select3rdText,select4thText,select5thText,select6thText,select7thText,select8thText,select9thText,select10thText,select11thText,select12thText,weekSelectText, routineConditionSelectText,routineCount);




    }
}