package com.approxsoft.routinemanagement.RoutineFile;

import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CellCheckRoutine {


   ///----------for 1st Semester Routine Cell ---------///
   static String A1stC,B1stC,C1stC,D1stC,E1stC,F1stC, A1stT,B1stT,C1stT,D1stT,E1stT,F1stT, A1stR,B1stR,C1stR,D1stR,E1stR,F1stR, A1C2,B1C2,C1C2,D1C2,E1C2,F1C2, A1T2,B1T2,C1T2,D1T2,E1T2,F1T2, A1R2,B1R2,C1R2,D1R2,E1R2,F1R2, A1C3,B1C3,C1C3,D1C3,E1C3,F1C3, A1T3,B1T3,C1T3,D1T3,E1T3,F1T3, A1R3,B1R3,C1R3,D1R3,E1R3,F1R3, A1C4,B1C4,C1C4,D1C4,E1C4,F1C4, A1T4,B1T4,C1T4,D1T4,E1T4,F1T4, A1R4,B1R4,C1R4,D1R4,E1R4,F1R4, A1C5,B1C5,C1C5,D1C5,E1C5,F1C5,A1T5,B1T5,C1T5,D1T5,E1T5,F1T5,A1R5,B1R5,C1R5,D1R5,E1R5,F1R5, A1C6,B1C6,C1C6,D1C6,E1C6,F1C6,A1T6,B1T6,C1T6,D1T6,E1T6,F1T6,A1R6,B1R6,C1R6,D1R6,E1R6,F1R6 ,A1C7,B1C7,C1C7,D1C7,E1C7,F1C7,A1T7,B1T7,C1T7,D1T7,E1T7,F1T7,A1R7,B1R7,C1R7,D1R7,E1R7,F1R7;

   ///----------for 2nd Semester Routine Cell ---------///
   static String A2ndC,B2C,C2C,D2C,E2C,F2C, A2T,B2T,C2T,D2T,E2T,F2T, A2R,B2R,C2R,D2R,E2R,F2R, A2C2,B2C2,C2C2,D2C2,E2C2,F2C2, A2T2,B2T2,C2T2,D2T2,E2T2,F2T2, A2R2,B2R2,C2R2,D2R2,E2R2,F2R2, A2C3,B2C3,C2C3,D2C3,E2C3,F2C3, A2T3,B2T3,C2T3,D2T3,E2T3,F2T3, A2R3,B2R3,C2R3,D2R3,E2R3,F2R3  ,A2C4,B2C4,C2C4,D2C4,E2C4,F2C4,A2T4,B2T4,C2T4,D2T4,E2T4,F2T4,A2R4,B2R4,C2R4,D2R4,E2R4,F2R4,A2C5,B2C5,C2C5,D2C5,E2C5,F2C5,A2T5,B2T5,C2T5,D2T5,E2T5,F2T5,A2R5,B2R5,C2R5,D2R5,E2R5,F2R5,A2C6,B2C6,C2C6,D2C6,E2C6,F2C6,A2T6,B2T6,C2T6,D2T6,E2T6,F2T6,A2R6,B2R6,C2R6,D2R6,E2R6,F2R6 ,A2C7,B2C7,C2C7,D2C7,E2C7,F2C7,A2T7,B2T7,C2T7,D2T7,E2T7,F2T7,A2R7,B2R7,C2R7,D2R7,E2R7,F2R7;

   //----------for 3rd Semester Routine Cell ---------///
   static String A3rdC,B3C,C3C,D3C,E3C,F3C, A3T,B3T,C3T,D3T,E3T,F3T, A3R,B3R,C3R,D3R,E3R,F3R , A3C2,B3C2,C3C2,D3C2,E3C2,F3C2, A3T2,B3T2,C3T2,D3T2,E3T2,F3T2, A3R2,B3R2,C3R2,D3R2,E3R2,F3R2, A3C3,B3C3,C3C3,D3C3,E3C3,F3C3, A3T3,B3T3,C3T3,D3T3,E3T3,F3T3, A3R3,B3R3,C3R3,D3R3,E3R3,F3R3 ,A3C4,B3C4,C3C4,D3C4,E3C4,F3C4,A3T4,B3T4,C3T4,D3T4,E3T4,F3T4,A3R4,B3R4,C3R4,D3R4,E3R4,F3R4,A3C5,B3C5,C3C5,D3C5,E3C5,F3C5,A3T5,B3T5,C3T5,D3T5,E3T5,F3T5,A3R5,B3R5,C3R5,D3R5,E3R5,F3R5,A3C6,B3C6,C3C6,D3C6,E3C6,F3C6,A3T6,B3T6,C3T6,D3T6,E3T6,F3T6,A3R6,B3R6,C3R6,D3R6,E3R6,F3R6 ,A3C7,B3C7,C3C7,D3C7,E3C7,F3C7,A3T7,B3T7,C3T7,D3T7,E3T7,F3T7,A3R7,B3R7,C3R7,D3R7,E3R7,F3R7;

   //----------for 4th Semester Routine Cell ---------///
   static String A4thC,B4C,C4C,D4C,E4C,F4C, A4T,B4T,C4T,D4T,E4T,F4T, A4R,B4R,C4R,D4R,E4R,F4R , A4C2,B4C2,C4C2,D4C2,E4C2,F4C2, A4T2,B4T2,C4T2,D4T2,E4T2,F4T2, A4R2,B4R2,C4R2,D4R2,E4R2,F4R2, A4C3,B4C3,C4C3,D4C3,E4C3,F4C3, A4T3,B4T3,C4T3,D4T3,E4T3,F4T3, A4R3,B4R3,C4R3,D4R3,E4R3,F4R3 ,A4C4,B4C4,C4C4,D4C4,E4C4,F4C4,A4T4,B4T4,C4T4,D4T4,E4T4,F4T4,A4R4,B4R4,C4R4,D4R4,E4R4,F4R4,A4C5,B4C5,C4C5,D4C5,E4C5,F4C5,A4T5,B4T5,C4T5,D4T5,E4T5,F4T5,A4R5,B4R5,C4R5,D4R5,E4R5,F4R5,A4C6,B4C6,C4C6,D4C6,E4C6,F4C6,A4T6,B4T6,C4T6,D4T6,E4T6,F4T6,A4R6,B4R6,C4R6,D4R6,E4R6,F4R6 ,A4C7,B4C7,C4C7,D4C7,E4C7,F4C7,A4T7,B4T7,C4T7,D4T7,E4T7,F4T7,A4R7,B4R7,C4R7,D4R7,E4R7,F4R7;

   //----------for 5th Semester Routine Cell ---------///
   static String A5thC,B5C,C5C,D5C,E5C,F5C, A5T,B5T,C5T,D5T,E5T,F5T, A5R,B5R,C5R,D5R,E5R,F5R , A5C2,B5C2,C5C2,D5C2,E5C2,F5C2, A5T2,B5T2,C5T2,D5T2,E5T2,F5T2, A5R2,B5R2,C5R2,D5R2,E5R2,F5R2, A5C3,B5C3,C5C3,D5C3,E5C3,F5C3, A5T3,B5T3,C5T3,D5T3,E5T3,F5T3, A5R3,B5R3,C5R3,D5R3,E5R3,F5R3 ,A5C4,B5C4,C5C4,D5C4,E5C4,F5C4,A5T4,B5T4,C5T4,D5T4,E5T4,F5T4,A5R4,B5R4,C5R4,D5R4,E5R4,F5R4,A5C5,B5C5,C5C5,D5C5,E5C5,F5C5,A5T5,B5T5,C5T5,D5T5,E5T5,F5T5,A5R5,B5R5,C5R5,D5R5,E5R5,F5R5,A5C6,B5C6,C5C6,D5C6,E5C6,F5C6,A5T6,B5T6,C5T6,D5T6,E5T6,F5T6,A5R6,B5R6,C5R6,D5R6,E5R6,F5R6 ,A5C7,B5C7,C5C7,D5C7,E5C7,F5C7,A5T7,B5T7,C5T7,D5T7,E5T7,F5T7,A5R7,B5R7,C5R7,D5R7,E5R7,F5R7;

   //----------for 6th Semester Routine Cell ---------///
   static String A6thC,B6C,C6C,D6C,E6C,F6C, A6T,B6T,C6T,D6T,E6T,F6T, A6R,B6R,C6R,D6R,E6R,F6R , A6C2,B6C2,C6C2,D6C2,E6C2,F6C2, A6T2,B6T2,C6T2,D6T2,E6T2,F6T2, A6R2,B6R2,C6R2,D6R2,E6R2,F6R2, A6C3,B6C3,C6C3,D6C3,E6C3,F6C3, A6T3,B6T3,C6T3,D6T3,E6T3,F6T3, A6R3,B6R3,C6R3,D6R3,E6R3,F6R3 ,A6C4,B6C4,C6C4,D6C4,E6C4,F6C4,A6T4,B6T4,C6T4,D6T4,E6T4,F6T4,A6R4,B6R4,C6R4,D6R4,E6R4,F6R4,A6C5,B6C5,C6C5,D6C5,E6C5,F6C5,A6T5,B6T5,C6T5,D6T5,E6T5,F6T5,A6R5,B6R5,C6R5,D6R5,E6R5,F6R5,A6C6,B6C6,C6C6,D6C6,E6C6,F6C6,A6T6,B6T6,C6T6,D6T6,E6T6,F6T6,A6R6,B6R6,C6R6,D6R6,E6R6,F6R6 ,A6C7,B6C7,C6C7,D6C7,E6C7,F6C7,A6T7,B6T7,C6T7,D6T7,E6T7,F6T7,A6R7,B6R7,C6R7,D6R7,E6R7,F6R7;

   //----------for 7th Semester Routine Cell ---------///
   static String A7thC,B7C,C7C,D7C,E7C,F7C, A7T,B7T,C7T,D7T,E7T,F7T, A7R,B7R,C7R,D7R,E7R,F7R , A7C2,B7C2,C7C2,D7C2,E7C2,F7C2, A7T2,B7T2,C7T2,D7T2,E7T2,F7T2, A7R2,B7R2,C7R2,D7R2,E7R2,F7R2, A7C3,B7C3,C7C3,D7C3,E7C3,F7C3, A7T3,B7T3,C7T3,D7T3,E7T3,F7T3, A7R3,B7R3,C7R3,D7R3,E7R3,F7R3 ,A7C4,B7C4,C7C4,D7C4,E7C4,F7C4,A7T4,B7T4,C7T4,D7T4,E7T4,F7T4,A7R4,B7R4,C7R4,D7R4,E7R4,F7R4,A7C5,B7C5,C7C5,D7C5,E7C5,F7C5,A7T5,B7T5,C7T5,D7T5,E7T5,F7T5,A7R5,B7R5,C7R5,D7R5,E7R5,F7R5,A7C6,B7C6,C7C6,D7C6,E7C6,F7C6,A7T6,B7T6,C7T6,D7T6,E7T6,F7T6,A7R6,B7R6,C7R6,D7R6,E7R6,F7R6 ,A7C7,B7C7,C7C7,D7C7,E7C7,F7C7,A7T7,B7T7,C7T7,D7T7,E7T7,F7T7,A7R7,B7R7,C7R7,D7R7,E7R7,F7R7;

   //----------for 8th Semester Routine Cell ---------///
   static String A8thC,B8C,C8C,D8C,E8C,F8C, A8T,B8T,C8T,D8T,E8T,F8T, A8R,B8R,C8R,D8R,E8R,F8R , A8C2,B8C2,C8C2,D8C2,E8C2,F8C2, A8T2,B8T2,C8T2,D8T2,E8T2,F8T2, A8R2,B8R2,C8R2,D8R2,E8R2,F8R2, A8C3,B8C3,C8C3,D8C3,E8C3,F8C3, A8T3,B8T3,C8T3,D8T3,E8T3,F8T3, A8R3,B8R3,C8R3,D8R3,E8R3,F8R3 ,A8C4,B8C4,C8C4,D8C4,E8C4,F8C4,A8T4,B8T4,C8T4,D8T4,E8T4,F8T4,A8R4,B8R4,C8R4,D8R4,E8R4,F8R4,A8C5,B8C5,C8C5,D8C5,E8C5,F8C5,A8T5,B8T5,C8T5,D8T5,E8T5,F8T5,A8R5,B8R5,C8R5,D8R5,E8R5,F8R5,A8C6,B8C6,C8C6,D8C6,E8C6,F8C6,A8T6,B8T6,C8T6,D8T6,E8T6,F8T6,A8R6,B8R6,C8R6,D8R6,E8R6,F8R6 ,A8C7,B8C7,C8C7,D8C7,E8C7,F8C7,A8T7,B8T7,C8T7,D8T7,E8T7,F8T7,A8R7,B8R7,C8R7,D8R7,E8R7,F8R7;

   //----------for 9th Semester Routine Cell ---------///
   static String A9thC,B9C,C9C,D9C,E9C,F9C, A9T,B9T,C9T,D9T,E9T,F9T, A9R,B9R,C9R,D9R,E9R,F9R , A9C2,B9C2,C9C2,D9C2,E9C2,F9C2, A9T2,B9T2,C9T2,D9T2,E9T2,F9T2, A9R2,B9R2,C9R2,D9R2,E9R2,F9R2, A9C3,B9C3,C9C3,D9C3,E9C3,F9C3, A9T3,B9T3,C9T3,D9T3,E9T3,F9T3, A9R3,B9R3,C9R3,D9R3,E9R3,F9R3 ,A9C4,B9C4,C9C4,D9C4,E9C4,F9C4,A9T4,B9T4,C9T4,D9T4,E9T4,F9T4,A9R4,B9R4,C9R4,D9R4,E9R4,F9R4,A9C5,B9C5,C9C5,D9C5,E9C5,F9C5,A9T5,B9T5,C9T5,D9T5,E9T5,F9T5,A9R5,B9R5,C9R5,D9R5,E9R5,F9R5,A9C6,B9C6,C9C6,D9C6,E9C6,F9C6,A9T6,B9T6,C9T6,D9T6,E9T6,F9T6,A9R6,B9R6,C9R6,D9R6,E9R6,F9R6 ,A9C7,B9C7,C9C7,D9C7,E9C7,F9C7,A9T7,B9T7,C9T7,D9T7,E9T7,F9T7,A9R7,B9R7,C9R7,D9R7,E9R7,F9R7;

   //----------for 10th Semester Routine Cell ---------///
   static String A10thC,B10C,C10C,D10C,E10C,F10C, A10T,B10T,C10T,D10T,E10T,F10T, A10R,B10R,C10R,D10R,E10R,F10R , A10C2,B10C2,C10C2,D10C2,E10C2,F10C2, A10T2,B10T2,C10T2,D10T2,E10T2,F10T2, A10R2,B10R2,C10R2,D10R2,E10R2,F10R2, A10C3,B10C3,C10C3,D10C3,E10C3,F10C3, A10T3,B10T3,C10T3,D10T3,E10T3,F10T3, A10R3,B10R3,C10R3,D10R3,E10R3,F10R3 ,A10C4,B10C4,C10C4,D10C4,E10C4,F10C4,A10T4,B10T4,C10T4,D10T4,E10T4,F10T4,A10R4,B10R4,C10R4,D10R4,E10R4,F10R4,A10C5,B10C5,C10C5,D10C5,E10C5,F10C5,A10T5,B10T5,C10T5,D10T5,E10T5,F10T5,A10R5,B10R5,C10R5,D10R5,E10R5,F10R5,A10C6,B10C6,C10C6,D10C6,E10C6,F10C6,A10T6,B10T6,C10T6,D10T6,E10T6,F10T6,A10R6,B10R6,C10R6,D10R6,E10R6,F10R6 ,A10C7,B10C7,C10C7,D10C7,E10C7,F10C7,A10T7,B10T7,C10T7,D10T7,E10T7,F10T7,A10R7,B10R7,C10R7,D10R7,E10R7,F10R7;

   //----------for 11th Semester Routine Cell ---------///
   static String A11thC,B11C,C11C,D11C,E11C,F11C, A11T,B11T,C11T,D11T,E11T,F11T, A11R,B11R,C11R,D11R,E11R,F11R , A11C2,B11C2,C11C2,D11C2,E11C2,F11C2, A11T2,B11T2,C11T2,D11T2,E11T2,F11T2, A11R2,B11R2,C11R2,D11R2,E11R2,F11R2, A11C3,B11C3,C11C3,D11C3,E11C3,F11C3, A11T3,B11T3,C11T3,D11T3,E11T3,F11T3, A11R3,B11R3,C11R3,D11R3,E11R3,F11R3 ,A11C4,B11C4,C11C4,D11C4,E11C4,F11C4,A11T4,B11T4,C11T4,D11T4,E11T4,F11T4,A11R4,B11R4,C11R4,D11R4,E11R4,F11R4,A11C5,B11C5,C11C5,D11C5,E11C5,F11C5,A11T5,B11T5,C11T5,D11T5,E11T5,F11T5,A11R5,B11R5,C11R5,D11R5,E11R5,F11R5,A11C6,B11C6,C11C6,D11C6,E11C6,F11C6,A11T6,B11T6,C11T6,D11T6,E11T6,F11T6,A11R6,B11R6,C11R6,D11R6,E11R6,F11R6 ,A11C7,B11C7,C11C7,D11C7,E11C7,F11C7,A11T7,B11T7,C11T7,D11T7,E11T7,F11T7,A11R7,B11R7,C11R7,D11R7,E11R7,F11R7;

   //----------for 12th Semester Routine Cell ---------///
   static String A12thC,B12C,C12C,D12C,E12C,F12C, A12T,B12T,C12T,D12T,E12T,F12T, A12R,B12R,C12R,D12R,E12R,F12R , A12C2,B12C2,C12C2,D12C2,E12C2,F12C2, A12T2,B12T2,C12T2,D12T2,E12T2,F12T2, A12R2,B12R2,C12R2,D12R2,E12R2,F12R2, A12C3,B12C3,C12C3,D12C3,E12C3,F12C3, A12T3,B12T3,C12T3,D12T3,E12T3,F12T3, A12R3,B12R3,C12R3,D12R3,E12R3,F12R3 ,A12C4,B12C4,C12C4,D12C4,E12C4,F12C4,A12T4,B12T4,C12T4,D12T4,E12T4,F12T4,A12R4,B12R4,C12R4,D12R4,E12R4,F12R4,A12C5,B12C5,C12C5,D12C5,E12C5,F12C5,A12T5,B12T5,C12T5,D12T5,E12T5,F12T5,A12R5,B12R5,C12R5,D12R5,E12R5,F12R5,A12C6,B12C6,C12C6,D12C6,E12C6,F12C6,A12T6,B12T6,C12T6,D12T6,E12T6,F12T6,A12R6,B12R6,C12R6,D12R6,E12R6,F12R6 ,A12C7,B12C7,C12C7,D12C7,E12C7,F12C7,A12T7,B12T7,C12T7,D12T7,E12T7,F12T7,A12R7,B12R7,C12R7,D12R7,E12R7,F12R7;


   public static void saCelCheck(Spinner a1stC, Spinner b1stC, Spinner c1stC, Spinner d1stC, Spinner e1stC, Spinner f1stC, Spinner a1stT, Spinner b1stT, Spinner c1stT, Spinner d1stT, Spinner e1stT, Spinner f1stT, Spinner a1stR, Spinner b1stR, Spinner c1stR, Spinner d1stR, Spinner e1stR, Spinner f1stR, Spinner a2ndC, Spinner b2C, Spinner c2C, Spinner d2C, Spinner e2C, Spinner f2C, Spinner a2T, Spinner b2T, Spinner c2T, Spinner d2T, Spinner e2T, Spinner f2T, Spinner a2R, Spinner b2R, Spinner c2R, Spinner d2R, Spinner e2R, Spinner f2R, Spinner a3rdC, Spinner b3C, Spinner c3C, Spinner d3C, Spinner e3C, Spinner f3C, Spinner a3T, Spinner b3T, Spinner c3T, Spinner d3T, Spinner e3T, Spinner f3T, Spinner a3R, Spinner b3R, Spinner c3R, Spinner d3R, Spinner e3R, Spinner f3R, Spinner a4thC, Spinner b4C, Spinner c4C, Spinner d4C, Spinner e4C, Spinner f4C, Spinner a4T, Spinner b4T, Spinner c4T, Spinner d4T, Spinner e4T, Spinner f4T, Spinner a4R, Spinner b4R, Spinner c4R, Spinner d4R, Spinner e4R, Spinner f4R, Spinner a5thC, Spinner b5C, Spinner c5C, Spinner d5C, Spinner e5C, Spinner f5C, Spinner a5T, Spinner b5T, Spinner c5T, Spinner d5T, Spinner e5T, Spinner f5T, Spinner a5R, Spinner b5R, Spinner c5R, Spinner d5R, Spinner e5R, Spinner f5R, Spinner a6thC, Spinner b6C, Spinner c6C, Spinner d6C, Spinner e6C, Spinner f6C, Spinner a6T, Spinner b6T, Spinner c6T, Spinner d6T, Spinner e6T, Spinner f6T, Spinner a6R, Spinner b6R, Spinner c6R, Spinner d6R, Spinner e6R, Spinner f6R, Spinner a7thC, Spinner b7C, Spinner c7C, Spinner d7C, Spinner e7C, Spinner f7C, Spinner a7T, Spinner b7T, Spinner c7T, Spinner d7T, Spinner e7T, Spinner f7T, Spinner a7R, Spinner b7R, Spinner c7R, Spinner d7R, Spinner e7R, Spinner f7R, Spinner a8thC, Spinner b8C, Spinner c8C, Spinner d8C, Spinner e8C, Spinner f8C, Spinner a8T, Spinner b8T, Spinner c8T, Spinner d8T, Spinner e8T, Spinner f8T, Spinner a8R, Spinner b8R, Spinner c8R, Spinner d8R, Spinner e8R, Spinner f8R, Spinner a9thC, Spinner b9C, Spinner c9C, Spinner d9C, Spinner e9C, Spinner f9C, Spinner a9T, Spinner b9T, Spinner c9T, Spinner d9T, Spinner e9T, Spinner f9T, Spinner a9R, Spinner b9R, Spinner c9R, Spinner d9R, Spinner e9R, Spinner f9R, Spinner a10thC, Spinner b10C, Spinner c10C, Spinner d10C, Spinner e10C, Spinner f10C, Spinner a10T, Spinner b10T, Spinner c10T, Spinner d10T, Spinner e10T, Spinner f10T, Spinner a10R, Spinner b10R, Spinner c10R, Spinner d10R, Spinner e10R, Spinner f10R, Spinner a11thC, Spinner b11C, Spinner c11C, Spinner d11C, Spinner e11C, Spinner f11C, Spinner a11T, Spinner b11T, Spinner c11T, Spinner d11T, Spinner e11T, Spinner f11T, Spinner a11R, Spinner b11R, Spinner c11R, Spinner d11R, Spinner e11R, Spinner f11R, Spinner a12thC, Spinner b12C, Spinner c12C, Spinner d12C, Spinner e12C, Spinner f12C, Spinner a12T, Spinner b12T, Spinner c12T, Spinner d12T, Spinner e12T, Spinner f12T, Spinner a12R, Spinner b12R, Spinner c12R, Spinner d12R, Spinner e12R, Spinner f12R){

      a1stT.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a1stT.getSelectedItemPosition()==0)
            {
               a1stT.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a1stT,a2T,a3T,a4T,a5T,a6T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {
            // TODO Auto-generated method stub

         }
      });
      a2T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a2T.getSelectedItemPosition()==0)
            {
               a2T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a2T,a1stT,a3T,a4T,a5T,a6T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {
            // TODO Auto-generated method stub

         }
      });
      a3T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a3T.getSelectedItemPosition()==0)
            {
               a3T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a3T,a1stT,a2T,a4T,a5T,a6T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {
            // TODO Auto-generated method stub

         }
      });
      a4T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a4T.getSelectedItemPosition()==0)
            {
               a4T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a4T,a1stT,a2T,a3T,a5T,a6T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {
            // TODO Auto-generated method stub

         }
      });
      a5T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            if (a5T.getSelectedItemPosition()==0)
            {
               a5T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a5T,a1stT,a2T,a3T,a4T,a6T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }
      });
      a6T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a6T.getSelectedItemPosition()==0)
            {
               a6T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a6T,a1stT,a2T,a3T,a4T,a5T,a7T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a7T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a7T.getSelectedItemPosition()==0)
            {
               a7T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a7T,a1stT,a2T,a3T,a4T,a5T,a6T,a8T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a8T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a8T.getSelectedItemPosition()==0)
            {
               a8T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a8T,a1stT,a2T,a3T,a4T,a5T,a7T,a6T,a9T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a9T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a9T.getSelectedItemPosition()==0)
            {
               a9T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a9T,a1stT,a2T,a3T,a4T,a5T,a7T,a8T,a6T,a10T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a10T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a10T.getSelectedItemPosition()==0)
            {
               a10T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a10T,a1stT,a2T,a3T,a4T,a5T,a7T,a8T,a9T,a6T,a11T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a11T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a11T.getSelectedItemPosition()==0)
            {
               a11T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a11T,a1stT,a2T,a3T,a4T,a5T,a7T,a8T,a9T,a10T,a6T,a12T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      a12T.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (a12T.getSelectedItemPosition()==0)
            {
               a12T.setBackgroundColor(Color.WHITE);
            }else
            {
               teacherCheck(a12T,a1stT,a2T,a3T,a4T,a5T,a7T,a8T,a9T,a10T,a11T,a6T);
            }


         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {


         }

      });

      A1stC = a1stC.getSelectedItem().toString();
      A2ndC = a2ndC.getSelectedItem().toString();
      A3rdC = a3rdC.getSelectedItem().toString();
      A4thC = a4thC.getSelectedItem().toString();
      A5thC = a5thC.getSelectedItem().toString();
      A6thC = a6thC.getSelectedItem().toString();
      A7thC = a7thC.getSelectedItem().toString();
      A8thC = a8thC.getSelectedItem().toString();
      A9thC = a9thC.getSelectedItem().toString();
      A10thC = a10thC.getSelectedItem().toString();
      A11thC = a11thC.getSelectedItem().toString();
      A12thC = a12thC.getSelectedItem().toString();


      B1stC = b1stC.getSelectedItem().toString();
      B2C = b2C.getSelectedItem().toString();
      B3C = b3C.getSelectedItem().toString();
      B4C = b4C.getSelectedItem().toString();
      B5C = b5C.getSelectedItem().toString();
      B5C = b5C.getSelectedItem().toString();
      B7C = b7C.getSelectedItem().toString();
      B8C = b8C.getSelectedItem().toString();
      B9C = b9C.getSelectedItem().toString();
      B10C = b10C.getSelectedItem().toString();
      B11C = b11C.getSelectedItem().toString();
      B12C = b12C.getSelectedItem().toString();

      C1stC = c1stC.getSelectedItem().toString();
      C2C = c2C.getSelectedItem().toString();
      C3C = c3C.getSelectedItem().toString();
      C4C = c4C.getSelectedItem().toString();
      C5C = c5C.getSelectedItem().toString();
      C5C = c5C.getSelectedItem().toString();
      C7C = c7C.getSelectedItem().toString();
      C8C = c8C.getSelectedItem().toString();
      C9C = c9C.getSelectedItem().toString();
      C10C = c10C.getSelectedItem().toString();
      C11C = c11C.getSelectedItem().toString();
      C12C = c12C.getSelectedItem().toString();

      D1stC = d1stC.getSelectedItem().toString();
      D2C = d2C.getSelectedItem().toString();
      D3C = d3C.getSelectedItem().toString();
      D4C = d4C.getSelectedItem().toString();
      D5C = d5C.getSelectedItem().toString();
      D5C = d5C.getSelectedItem().toString();
      D7C = d7C.getSelectedItem().toString();
      D8C = d8C.getSelectedItem().toString();
      D9C = d9C.getSelectedItem().toString();
      D10C = d10C.getSelectedItem().toString();
      D11C = d11C.getSelectedItem().toString();
      D12C = d12C.getSelectedItem().toString();


      E1stC = e1stC.getSelectedItem().toString();
      E2C = e2C.getSelectedItem().toString();
      E3C = e3C.getSelectedItem().toString();
      E4C = e4C.getSelectedItem().toString();
      E5C = e5C.getSelectedItem().toString();
      E5C = e5C.getSelectedItem().toString();
      E7C = e7C.getSelectedItem().toString();
      E8C = e8C.getSelectedItem().toString();
      E9C = e9C.getSelectedItem().toString();
      E10C = e10C.getSelectedItem().toString();
      E11C = e11C.getSelectedItem().toString();
      E12C = e12C.getSelectedItem().toString();


      F1stC = f1stC.getSelectedItem().toString();
      F2C = f2C.getSelectedItem().toString();
      F3C = f3C.getSelectedItem().toString();
      F4C = f4C.getSelectedItem().toString();
      F5C = f5C.getSelectedItem().toString();
      F5C = f5C.getSelectedItem().toString();
      F7C = f7C.getSelectedItem().toString();
      F8C = f8C.getSelectedItem().toString();
      F9C = f9C.getSelectedItem().toString();
      F10C = f10C.getSelectedItem().toString();
      F11C = f11C.getSelectedItem().toString();
      F12C = f12C.getSelectedItem().toString();


      A1stT = a1stT.getSelectedItem().toString();
      A2T = a2T.getSelectedItem().toString();
      A3T = a3T.getSelectedItem().toString();
      A4T = a4T.getSelectedItem().toString();
      A5T = a5T.getSelectedItem().toString();
      A6T = a6T.getSelectedItem().toString();
      A7T = a7T.getSelectedItem().toString();
      A8T = a8T.getSelectedItem().toString();
      A9T = a9T.getSelectedItem().toString();
      A10T = a10T.getSelectedItem().toString();
      A11T = a11T.getSelectedItem().toString();
      A12T = a12T.getSelectedItem().toString();

      B1stT = b1stT.getSelectedItem().toString();
      B2T = b2T.getSelectedItem().toString();
      B3T = b3T.getSelectedItem().toString();
      B4T = b4T.getSelectedItem().toString();
      B5T = b5T.getSelectedItem().toString();
      B6T = b6T.getSelectedItem().toString();
      B7T = b7T.getSelectedItem().toString();
      B8T = b8T.getSelectedItem().toString();
      B9T = b9T.getSelectedItem().toString();
      B10T = b10T.getSelectedItem().toString();
      B11T = b11T.getSelectedItem().toString();
      B12T = b12T.getSelectedItem().toString();

      C1stT = c1stT.getSelectedItem().toString();
      C2T = c2T.getSelectedItem().toString();
      C3T = c3T.getSelectedItem().toString();
      C4T = c4T.getSelectedItem().toString();
      C5T = c5T.getSelectedItem().toString();
      C6T = c6T.getSelectedItem().toString();
      C7T = c7T.getSelectedItem().toString();
      C8T = c8T.getSelectedItem().toString();
      C9T = c9T.getSelectedItem().toString();
      C10T = c10T.getSelectedItem().toString();
      C11T = c11T.getSelectedItem().toString();
      C12T = c12T.getSelectedItem().toString();

      D1stT = d1stT.getSelectedItem().toString();
      D2T = d2T.getSelectedItem().toString();
      D3T = d3T.getSelectedItem().toString();
      D4T = d4T.getSelectedItem().toString();
      D5T = d5T.getSelectedItem().toString();
      D6T = d6T.getSelectedItem().toString();
      D7T = d7T.getSelectedItem().toString();
      D8T = d8T.getSelectedItem().toString();
      D9T = d9T.getSelectedItem().toString();
      D10T = d10T.getSelectedItem().toString();
      D11T = d11T.getSelectedItem().toString();
      D12T = d12T.getSelectedItem().toString();

      E1stT = e1stT.getSelectedItem().toString();
      E2T = e2T.getSelectedItem().toString();
      E3T = e3T.getSelectedItem().toString();
      E4T = e4T.getSelectedItem().toString();
      E5T = e5T.getSelectedItem().toString();
      E6T = e6T.getSelectedItem().toString();
      E7T = e7T.getSelectedItem().toString();
      E8T = e8T.getSelectedItem().toString();
      E9T = e9T.getSelectedItem().toString();
      E10T = e10T.getSelectedItem().toString();
      E11T = e11T.getSelectedItem().toString();
      E12T = e12T.getSelectedItem().toString();

      F1stT = f1stT.getSelectedItem().toString();
      F2T = f2T.getSelectedItem().toString();
      F3T = f3T.getSelectedItem().toString();
      F4T = f4T.getSelectedItem().toString();
      F5T = f5T.getSelectedItem().toString();
      F6T = f6T.getSelectedItem().toString();
      F7T = f7T.getSelectedItem().toString();
      F8T = f8T.getSelectedItem().toString();
      F9T = f9T.getSelectedItem().toString();
      F10T = f10T.getSelectedItem().toString();
      F11T = f11T.getSelectedItem().toString();
      F12T = e12T.getSelectedItem().toString();





      A1stR = a1stR.getSelectedItem().toString();
      A2R = a2R.getSelectedItem().toString();
      A3R = a3R.getSelectedItem().toString();
      A4R = a4R.getSelectedItem().toString();
      A5R = a5R.getSelectedItem().toString();
      A6R = a6R.getSelectedItem().toString();
      A7R = a7R.getSelectedItem().toString();
      A8R = a8R.getSelectedItem().toString();
      A9R = a9R.getSelectedItem().toString();
      A10R = a10R.getSelectedItem().toString();
      A11R = a11R.getSelectedItem().toString();
      A12R = a12R.getSelectedItem().toString();


      B1stR = b1stR.getSelectedItem().toString();
      B2R = b2R.getSelectedItem().toString();
      B3R = b3R.getSelectedItem().toString();
      B4R = b4R.getSelectedItem().toString();
      B5R = b5R.getSelectedItem().toString();
      B6R = b6R.getSelectedItem().toString();
      B7R = b7R.getSelectedItem().toString();
      B8R = b8R.getSelectedItem().toString();
      B9R = b9R.getSelectedItem().toString();
      B10R = b10R.getSelectedItem().toString();
      B11R = b11R.getSelectedItem().toString();
      B12R = b12R.getSelectedItem().toString();

      C1stR = c1stR.getSelectedItem().toString();
      C2R = c2R.getSelectedItem().toString();
      C3R = c3R.getSelectedItem().toString();
      C4R = c4R.getSelectedItem().toString();
      C5R = c5R.getSelectedItem().toString();
      C6R = c6R.getSelectedItem().toString();
      C7R = c7R.getSelectedItem().toString();
      C8R = c8R.getSelectedItem().toString();
      C9R = c9R.getSelectedItem().toString();
      C10R = c10R.getSelectedItem().toString();
      C11R = c11R.getSelectedItem().toString();
      C12R = c12R.getSelectedItem().toString();

      D1stR = d1stR.getSelectedItem().toString();
      D2R = d2R.getSelectedItem().toString();
      D3R = d3R.getSelectedItem().toString();
      D4R = d4R.getSelectedItem().toString();
      D5R = d5R.getSelectedItem().toString();
      D6R = d6R.getSelectedItem().toString();
      D7R = d7R.getSelectedItem().toString();
      D8R = d8R.getSelectedItem().toString();
      D9R = d9R.getSelectedItem().toString();
      D10R = d10R.getSelectedItem().toString();
      D11R = d11R.getSelectedItem().toString();
      D12R = d12R.getSelectedItem().toString();

      E1stR = e1stR.getSelectedItem().toString();
      E2R = e2R.getSelectedItem().toString();
      E3R = e3R.getSelectedItem().toString();
      E4R = e4R.getSelectedItem().toString();
      E5R = e5R.getSelectedItem().toString();
      E6R = e6R.getSelectedItem().toString();
      E7R = e7R.getSelectedItem().toString();
      E8R = e8R.getSelectedItem().toString();
      E9R = e9R.getSelectedItem().toString();
      E10R = e10R.getSelectedItem().toString();
      E11R = e11R.getSelectedItem().toString();
      E12R = e12R.getSelectedItem().toString();

      F1stR = f1stR.getSelectedItem().toString();
      F2R = f2R.getSelectedItem().toString();
      F3R = f3R.getSelectedItem().toString();
      F4R = f4R.getSelectedItem().toString();
      F5R = f5R.getSelectedItem().toString();
      F6R = f6R.getSelectedItem().toString();
      F7R = f7R.getSelectedItem().toString();
      F8R = f8R.getSelectedItem().toString();
      F9R = f9R.getSelectedItem().toString();
      F10R = f10R.getSelectedItem().toString();
      F11R = f11R.getSelectedItem().toString();
      F12R = f12R.getSelectedItem().toString();



   }

   private static void teacherCheck(Spinner a, Spinner b, Spinner c, Spinner d, Spinner e, Spinner f, Spinner g, Spinner h, Spinner i, Spinner j, Spinner k, Spinner l) {

      if (!(a.getSelectedItemPosition() ==0) && a.getSelectedItem().equals(b.getSelectedItem())|| a.getSelectedItem().equals(c.getSelectedItem()) || a.getSelectedItem().equals(d.getSelectedItem()) || a.getSelectedItem().equals(e.getSelectedItem()) || a.getSelectedItem().equals(f.getSelectedItem()) || a.getSelectedItem().equals(g.getSelectedItem()) || a.getSelectedItem().equals(h.getSelectedItem()) || a.getSelectedItem().equals(i.getSelectedItem()) || a.getSelectedItem().equals(j.getSelectedItem()) || a.getSelectedItem().equals(k.getSelectedItem()) || a.getSelectedItem().equals(l.getSelectedItem()))
      {
         a.setBackgroundColor(Color.RED);
      }
      else
      {
         a.setBackgroundColor(Color.WHITE);
      }

   }

   public static void suCelCheck(Spinner a1C2, Spinner b1C2, Spinner c1C2, Spinner d1C2, Spinner e1C2, Spinner f1C2, Spinner a1T2, Spinner b1T2, Spinner c1T2, Spinner d1T2, Spinner e1T2, Spinner f1T2, Spinner a1R2, Spinner b1R2, Spinner c1R2, Spinner d1R2, Spinner e1R2, Spinner f1R2, Spinner a2C2, Spinner b2C2, Spinner c2C2, Spinner d2C2, Spinner e2C2, Spinner f2C2, Spinner a2T2, Spinner b2T2, Spinner c2T2, Spinner d2T2, Spinner e2T2, Spinner f2T2, Spinner a2R2, Spinner b2R2, Spinner c2R2, Spinner d2R2, Spinner e2R2, Spinner f2R2, Spinner a3C2, Spinner b3C2, Spinner c3C2, Spinner d3C2, Spinner e3C2, Spinner f3C2, Spinner a3T2, Spinner b3T2, Spinner c3T2, Spinner d3T2, Spinner e3T2, Spinner f3T2, Spinner a3R2, Spinner b3R2, Spinner c3R2, Spinner d3R2, Spinner e3R2, Spinner f3R2, Spinner a4C2, Spinner b4C2, Spinner c4C2, Spinner d4C2, Spinner e4C2, Spinner f4C2, Spinner a4T2, Spinner b4T2, Spinner c4T2, Spinner d4T2, Spinner e4T2, Spinner f4T2, Spinner a4R2, Spinner b4R2, Spinner c4R2, Spinner d4R2, Spinner e4R2, Spinner f4R2, Spinner a5C2, Spinner b5C2, Spinner c5C2, Spinner d5C2, Spinner e5C2, Spinner f5C2, Spinner a5T2, Spinner b5T2, Spinner c5T2, Spinner d5T2, Spinner e5T2, Spinner f5T2, Spinner a5R2, Spinner b5R2, Spinner c5R2, Spinner d5R2, Spinner e5R2, Spinner f5R2, Spinner a6C2, Spinner b6C2, Spinner c6C2, Spinner d6C2, Spinner e6C2, Spinner f6C2, Spinner a6T2, Spinner b6T2, Spinner c6T2, Spinner d6T2, Spinner e6T2, Spinner f6T2, Spinner a6R2, Spinner b6R2, Spinner c6R2, Spinner d6R2, Spinner e6R2, Spinner f6R2, Spinner a7C2, Spinner b7C2, Spinner c7C2, Spinner d7C2, Spinner e7C2, Spinner f7C2, Spinner a7T2, Spinner b7T2, Spinner c7T2, Spinner d7T2, Spinner e7T2, Spinner f7T2, Spinner a7R2, Spinner b7R2, Spinner c7R2, Spinner d7R2, Spinner e7R2, Spinner f7R2, Spinner a8C2, Spinner b8C2, Spinner c8C2, Spinner d8C2, Spinner e8C2, Spinner f8C2, Spinner a8T2, Spinner b8T2, Spinner c8T2, Spinner d8T2, Spinner e8T2, Spinner f8T2, Spinner a8R2, Spinner b8R2, Spinner c8R2, Spinner d8R2, Spinner e8R2, Spinner f8R2, Spinner a9C2, Spinner b9C2, Spinner c9C2, Spinner d9C2, Spinner e9C2, Spinner f9C2, Spinner a9T2, Spinner b9T2, Spinner c9T2, Spinner d9T2, Spinner e9T2, Spinner f9T2, Spinner a9R2, Spinner b9R2, Spinner c9R2, Spinner d9R2, Spinner e9R2, Spinner f9R2, Spinner a10C2, Spinner b10C2, Spinner c10C2, Spinner d10C2, Spinner e10C2, Spinner f10C2, Spinner a10T2, Spinner b10T2, Spinner c10T2, Spinner d10T2, Spinner e10T2, Spinner f10T2, Spinner a10R2, Spinner b10R2, Spinner c10R2, Spinner d10R2, Spinner e10R2, Spinner f10R2, Spinner a11C2, Spinner b11C2, Spinner c11C2, Spinner d11C2, Spinner e11C2, Spinner f11C2, Spinner a11T2, Spinner b11T2, Spinner c11T2, Spinner d11T2, Spinner e11T2, Spinner f11T2, Spinner a11R2, Spinner b11R2, Spinner c11R2, Spinner d11R2, Spinner e11R2, Spinner f11R2, Spinner a12C2, Spinner b12C2, Spinner c12C2, Spinner d12C2, Spinner e12C2, Spinner f12C2, Spinner a12T2, Spinner b12T2, Spinner c12T2, Spinner d12T2, Spinner e12T2, Spinner f12T2, Spinner a12R2, Spinner b12R2, Spinner c12R2, Spinner d12R2, Spinner e12R2, Spinner f12R2)
   {
      A1C2 = a1C2.getSelectedItem().toString();
      A2C2 = a2C2.getSelectedItem().toString();
      A3C2 = a3C2.getSelectedItem().toString();
      A4C2 = a4C2.getSelectedItem().toString();
      A5C2 = a5C2.getSelectedItem().toString();
      A6C2 = a6C2.getSelectedItem().toString();
      A7C2 = a7C2.getSelectedItem().toString();
      A8C2 = a8C2.getSelectedItem().toString();
      A9C2 = a9C2.getSelectedItem().toString();
      A10C2 = a10C2.getSelectedItem().toString();
      A11C2 = a11C2.getSelectedItem().toString();
      A12C2 = a12C2.getSelectedItem().toString();


      B1C2 = b1C2.getSelectedItem().toString();
      B2C2 = b2C2.getSelectedItem().toString();
      B3C2 = b3C2.getSelectedItem().toString();
      B4C2 = b4C2.getSelectedItem().toString();
      B5C2 = b5C2.getSelectedItem().toString();
      B5C2 = b5C2.getSelectedItem().toString();
      B7C2 = b7C2.getSelectedItem().toString();
      B8C2 = b8C2.getSelectedItem().toString();
      B9C2= b9C2.getSelectedItem().toString();
      B10C2 = b10C2.getSelectedItem().toString();
      B11C2= b11C2.getSelectedItem().toString();
      B12C2 = b12C2.getSelectedItem().toString();

      C1C2 = c1C2.getSelectedItem().toString();
      C2C2 = c2C2.getSelectedItem().toString();
      C3C2 = c3C2.getSelectedItem().toString();
      C4C2 = c4C2.getSelectedItem().toString();
      C5C2 = c5C2.getSelectedItem().toString();
      C5C2 = c5C2.getSelectedItem().toString();
      C7C2 = c7C2.getSelectedItem().toString();
      C8C2 = c8C2.getSelectedItem().toString();
      C9C2 = c9C2.getSelectedItem().toString();
      C10C2 = c10C2.getSelectedItem().toString();
      C11C2 = c11C2.getSelectedItem().toString();
      C12C2 = c12C2.getSelectedItem().toString();

      D1C2 = d1C2.getSelectedItem().toString();
      D2C2 = d2C2.getSelectedItem().toString();
      D3C2 = d3C2.getSelectedItem().toString();
      D4C2 = d4C2.getSelectedItem().toString();
      D5C2 = d5C2.getSelectedItem().toString();
      D5C2 = d5C2.getSelectedItem().toString();
      D7C2 = d7C2.getSelectedItem().toString();
      D8C2 = d8C2.getSelectedItem().toString();
      D9C2 = d9C2.getSelectedItem().toString();
      D10C2 = d10C2.getSelectedItem().toString();
      D11C2 = d11C2.getSelectedItem().toString();
      D12C2 = d12C2.getSelectedItem().toString();


      E1C2 = e1C2.getSelectedItem().toString();
      E2C2 = e2C2.getSelectedItem().toString();
      E3C2 = e3C2.getSelectedItem().toString();
      E4C2 = e4C2.getSelectedItem().toString();
      E5C2 = e5C2.getSelectedItem().toString();
      E5C2 = e5C2.getSelectedItem().toString();
      E7C2 = e7C2.getSelectedItem().toString();
      E8C2 = e8C2.getSelectedItem().toString();
      E9C2 = e9C2.getSelectedItem().toString();
      E10C2 = e10C2.getSelectedItem().toString();
      E11C2 = e11C2.getSelectedItem().toString();
      E12C2 = e12C2.getSelectedItem().toString();


      F1C2 = f1C2.getSelectedItem().toString();
      F2C2 = f2C2.getSelectedItem().toString();
      F3C2 = f3C2.getSelectedItem().toString();
      F4C2 = f4C2.getSelectedItem().toString();
      F5C2 = f5C2.getSelectedItem().toString();
      F5C2 = f5C2.getSelectedItem().toString();
      F7C2 = f7C2.getSelectedItem().toString();
      F8C2 = f8C2.getSelectedItem().toString();
      F9C2 = f9C2.getSelectedItem().toString();
      F10C2 = f10C2.getSelectedItem().toString();
      F11C2 = f11C2.getSelectedItem().toString();
      F12C2 = f12C2.getSelectedItem().toString();


      A1T2 = a1T2.getSelectedItem().toString();
      A2T2 = a2T2.getSelectedItem().toString();
      A3T2 = a3T2.getSelectedItem().toString();
      A4T2 = a4T2.getSelectedItem().toString();
      A5T2 = a5T2.getSelectedItem().toString();
      A6T2 = a6T2.getSelectedItem().toString();
      A7T2 = a7T2.getSelectedItem().toString();
      A8T2 = a8T2.getSelectedItem().toString();
      A9T2 = a9T2.getSelectedItem().toString();
      A10T2 = a10T2.getSelectedItem().toString();
      A11T2 = a11T2.getSelectedItem().toString();
      A12T2 = a12T2.getSelectedItem().toString();

      B1T2 = b1T2.getSelectedItem().toString();
      B2T2 = b2T2.getSelectedItem().toString();
      B3T2 = b3T2.getSelectedItem().toString();
      B4T2 = b4T2.getSelectedItem().toString();
      B5T2 = b5T2.getSelectedItem().toString();
      B6T2 = b6T2.getSelectedItem().toString();
      B7T2 = b7T2.getSelectedItem().toString();
      B8T2 = b8T2.getSelectedItem().toString();
      B9T2 = b9T2.getSelectedItem().toString();
      B10T2 = b10T2.getSelectedItem().toString();
      B11T2 = b11T2.getSelectedItem().toString();
      B12T2 = b12T2.getSelectedItem().toString();

      C1T2 = c1T2.getSelectedItem().toString();
      C2T2 = c2T2.getSelectedItem().toString();
      C3T2 = c3T2.getSelectedItem().toString();
      C4T2 = c4T2.getSelectedItem().toString();
      C5T2 = c5T2.getSelectedItem().toString();
      C6T2 = c6T2.getSelectedItem().toString();
      C7T2 = c7T2.getSelectedItem().toString();
      C8T2 = c8T2.getSelectedItem().toString();
      C9T2 = c9T2.getSelectedItem().toString();
      C10T2 = c10T2.getSelectedItem().toString();
      C11T2 = c11T2.getSelectedItem().toString();
      C12T2 = c12T2.getSelectedItem().toString();

      D1T2 = d1T2.getSelectedItem().toString();
      D2T2 = d2T2.getSelectedItem().toString();
      D3T2 = d3T2.getSelectedItem().toString();
      D4T2 = d4T2.getSelectedItem().toString();
      D5T2 = d5T2.getSelectedItem().toString();
      D6T2 = d6T2.getSelectedItem().toString();
      D7T2 = d7T2.getSelectedItem().toString();
      D8T2 = d8T2.getSelectedItem().toString();
      D9T2 = d9T2.getSelectedItem().toString();
      D10T2 = d10T2.getSelectedItem().toString();
      D11T2 = d11T2.getSelectedItem().toString();
      D12T2 = d12T2.getSelectedItem().toString();

      E1T2 = e1T2.getSelectedItem().toString();
      E2T2 = e2T2.getSelectedItem().toString();
      E3T2 = e3T2.getSelectedItem().toString();
      E4T2 = e4T2.getSelectedItem().toString();
      E5T2 = e5T2.getSelectedItem().toString();
      E6T2 = e6T2.getSelectedItem().toString();
      E7T2 = e7T2.getSelectedItem().toString();
      E8T2 = e8T2.getSelectedItem().toString();
      E9T2 = e9T2.getSelectedItem().toString();
      E10T2 = e10T2.getSelectedItem().toString();
      E11T2 = e11T2.getSelectedItem().toString();
      E12T2 = e12T2.getSelectedItem().toString();

      F1T2 = f1T2.getSelectedItem().toString();
      F2T2 = f2T2.getSelectedItem().toString();
      F3T2 = f3T2.getSelectedItem().toString();
      F4T2 = f4T2.getSelectedItem().toString();
      F5T2 = f5T2.getSelectedItem().toString();
      F6T2 = f6T2.getSelectedItem().toString();
      F7T2 = f7T2.getSelectedItem().toString();
      F8T2 = f8T2.getSelectedItem().toString();
      F9T2 = f9T2.getSelectedItem().toString();
      F10T2= f10T2.getSelectedItem().toString();
      F11T2 = f11T2.getSelectedItem().toString();
      F12T2 = e12T2.getSelectedItem().toString();





      A1R2 = a1R2.getSelectedItem().toString();
      A2R2 = a2R2.getSelectedItem().toString();
      A3R2 = a3R2.getSelectedItem().toString();
      A4R2 = a4R2.getSelectedItem().toString();
      A5R2 = a5R2.getSelectedItem().toString();
      A6R2 = a6R2.getSelectedItem().toString();
      A7R2 = a7R2.getSelectedItem().toString();
      A8R2 = a8R2.getSelectedItem().toString();
      A9R2 = a9R2.getSelectedItem().toString();
      A10R2 = a10R2.getSelectedItem().toString();
      A11R2 = a11R2.getSelectedItem().toString();
      A12R2 = a12R2.getSelectedItem().toString();


      B1R2 = b1R2.getSelectedItem().toString();
      B2R2 = b2R2.getSelectedItem().toString();
      B3R2 = b3R2.getSelectedItem().toString();
      B4R2 = b4R2.getSelectedItem().toString();
      B5R2 = b5R2.getSelectedItem().toString();
      B6R2 = b6R2.getSelectedItem().toString();
      B7R2 = b7R2.getSelectedItem().toString();
      B8R2 = b8R2.getSelectedItem().toString();
      B9R2 = b9R2.getSelectedItem().toString();
      B10R2 = b10R2.getSelectedItem().toString();
      B11R2 = b11R2.getSelectedItem().toString();
      B12R2 = b12R2.getSelectedItem().toString();

      C1R2 = c1R2.getSelectedItem().toString();
      C2R2 = c2R2.getSelectedItem().toString();
      C3R2 = c3R2.getSelectedItem().toString();
      C4R2 = c4R2.getSelectedItem().toString();
      C5R2 = c5R2.getSelectedItem().toString();
      C6R2 = c6R2.getSelectedItem().toString();
      C7R2 = c7R2.getSelectedItem().toString();
      C8R2 = c8R2.getSelectedItem().toString();
      C9R2= c9R2.getSelectedItem().toString();
      C10R2 = c10R2.getSelectedItem().toString();
      C11R2 = c11R2.getSelectedItem().toString();
      C12R2 = c12R2.getSelectedItem().toString();

      D1R2 = d1R2.getSelectedItem().toString();
      D2R2 = d2R2.getSelectedItem().toString();
      D3R2 = d3R2.getSelectedItem().toString();
      D4R2 = d4R2.getSelectedItem().toString();
      D5R2 = d5R2.getSelectedItem().toString();
      D6R2 = d6R2.getSelectedItem().toString();
      D7R2 = d7R2.getSelectedItem().toString();
      D8R2 = d8R2.getSelectedItem().toString();
      D9R2 = d9R2.getSelectedItem().toString();
      D10R2 = d10R2.getSelectedItem().toString();
      D11R2 = d11R2.getSelectedItem().toString();
      D12R2 = d12R2.getSelectedItem().toString();

      E1R2 = e1R2.getSelectedItem().toString();
      E2R2 = e2R2.getSelectedItem().toString();
      E3R2 = e3R2.getSelectedItem().toString();
      E4R2 = e4R2.getSelectedItem().toString();
      E5R2 = e5R2.getSelectedItem().toString();
      E6R2 = e6R2.getSelectedItem().toString();
      E7R2 = e7R2.getSelectedItem().toString();
      E8R2 = e8R2.getSelectedItem().toString();
      E9R2 = e9R2.getSelectedItem().toString();
      E10R2 = e10R2.getSelectedItem().toString();
      E11R2 = e11R2.getSelectedItem().toString();
      E12R2 = e12R2.getSelectedItem().toString();

      F1R2 = f1R2.getSelectedItem().toString();
      F2R2 = f2R2.getSelectedItem().toString();
      F3R2 = f3R2.getSelectedItem().toString();
      F4R2 = f4R2.getSelectedItem().toString();
      F5R2 = f5R2.getSelectedItem().toString();
      F6R2 = f6R2.getSelectedItem().toString();
      F7R2 = f7R2.getSelectedItem().toString();
      F8R2 = f8R2.getSelectedItem().toString();
      F9R2 = f9R2.getSelectedItem().toString();
      F10R2 = f10R2.getSelectedItem().toString();
      F11R2 = f11R2.getSelectedItem().toString();
      F12R2 = f12R2.getSelectedItem().toString();
   }

   public static void moCelCheck(Spinner a1C3, Spinner b1C3, Spinner c1C3, Spinner d1C3, Spinner e1C3, Spinner f1C3, Spinner a1T3, Spinner b1T3, Spinner c1T3, Spinner d1T3, Spinner e1T3, Spinner f1T3, Spinner a1R3, Spinner b1R3, Spinner c1R3, Spinner d1R3, Spinner e1R3, Spinner f1R3, Spinner a2C3, Spinner b2C3, Spinner c2C3, Spinner d2C3, Spinner e2C3, Spinner f2C3, Spinner a2T3, Spinner b2T3, Spinner c2T3, Spinner d2T3, Spinner e2T3, Spinner f2T3, Spinner a2R3, Spinner b2R3, Spinner c2R3, Spinner d2R3, Spinner e2R3, Spinner f2R3, Spinner a3C3, Spinner b3C3, Spinner c3C3, Spinner d3C3, Spinner e3C3, Spinner f3C3, Spinner a3T3, Spinner b3T3, Spinner c3T3, Spinner d3T3, Spinner e3T3, Spinner f3T3, Spinner a3R3, Spinner b3R3, Spinner c3R3, Spinner d3R3, Spinner e3R3, Spinner f3R3, Spinner a4C3, Spinner b4C3, Spinner c4C3, Spinner d4C3, Spinner e4C3, Spinner f4C3, Spinner a4T3, Spinner b4T3, Spinner c4T3, Spinner d4T3, Spinner e4T3, Spinner f4T3, Spinner a4R3, Spinner b4R3, Spinner c4R3, Spinner d4R3, Spinner e4R3, Spinner f4R3, Spinner a5C3, Spinner b5C3, Spinner c5C3, Spinner d5C3, Spinner e5C3, Spinner f5C3, Spinner a5T3, Spinner b5T3, Spinner c5T3, Spinner d5T3, Spinner e5T3, Spinner f5T3, Spinner a5R3, Spinner b5R3, Spinner c5R3, Spinner d5R3, Spinner e5R3, Spinner f5R3, Spinner a6C3, Spinner b6C3, Spinner c6C3, Spinner d6C3, Spinner e6C3, Spinner f6C3, Spinner a6T3, Spinner b6T3, Spinner c6T3, Spinner d6T3, Spinner e6T3, Spinner f6T3, Spinner a6R3, Spinner b6R3, Spinner c6R3, Spinner d6R3, Spinner e6R3, Spinner f6R3, Spinner a7C3, Spinner b7C3, Spinner c7C3, Spinner d7C3, Spinner e7C3, Spinner f7C3, Spinner a7T3, Spinner b7T3, Spinner c7T3, Spinner d7T3, Spinner e7T3, Spinner f7T3, Spinner a7R3, Spinner b7R3, Spinner c7R3, Spinner d7R3, Spinner e7R3, Spinner f7R3, Spinner a8C3, Spinner b8C3, Spinner c8C3, Spinner d8C3, Spinner e8C3, Spinner f8C3, Spinner a8T3, Spinner b8T3, Spinner c8T3, Spinner d8T3, Spinner e8T3, Spinner f8T3, Spinner a8R3, Spinner b8R3, Spinner c8R3, Spinner d8R3, Spinner e8R3, Spinner f8R3, Spinner a9C3, Spinner b9C3, Spinner c9C3, Spinner d9C3, Spinner e9C3, Spinner f9C3, Spinner a9T3, Spinner b9T3, Spinner c9T3, Spinner d9T3, Spinner e9T3, Spinner f9T3, Spinner a9R3, Spinner b9R3, Spinner c9R3, Spinner d9R3, Spinner e9R3, Spinner f9R3, Spinner a10C3, Spinner b10C3, Spinner c10C3, Spinner d10C3, Spinner e10C3, Spinner f10C3, Spinner a10T3, Spinner b10T3, Spinner c10T3, Spinner d10T3, Spinner e10T3, Spinner f10T3, Spinner a10R3, Spinner b10R3, Spinner c10R3, Spinner d10R3, Spinner e10R3, Spinner f10R3, Spinner a11C3, Spinner b11C3, Spinner c11C3, Spinner d11C3, Spinner e11C3, Spinner f11C3, Spinner a11T3, Spinner b11T3, Spinner c11T3, Spinner d11T3, Spinner e11T3, Spinner f11T3, Spinner a11R3, Spinner b11R3, Spinner c11R3, Spinner d11R3, Spinner e11R3, Spinner f11R3, Spinner a12C3, Spinner b12C3, Spinner c12C3, Spinner d12C3, Spinner e12C3, Spinner f12C3, Spinner a12T3, Spinner b12T3, Spinner c12T3, Spinner d12T3, Spinner e12T3, Spinner f12T3, Spinner a12R3, Spinner b12R3, Spinner c12R3, Spinner d12R3, Spinner e12R3, Spinner f12R3)
   {
      A1C3 = a1C3.getSelectedItem().toString();
      A2C3 = a2C3.getSelectedItem().toString();
      A3C3 = a3C3.getSelectedItem().toString();
      A4C3 = a4C3.getSelectedItem().toString();
      A5C3 = a5C3.getSelectedItem().toString();
      A6C3 = a6C3.getSelectedItem().toString();
      A7C3 = a7C3.getSelectedItem().toString();
      A8C3 = a8C3.getSelectedItem().toString();
      A9C3 = a9C3.getSelectedItem().toString();
      A10C3 = a10C3.getSelectedItem().toString();
      A11C3 = a11C3.getSelectedItem().toString();
      A12C3 = a12C3.getSelectedItem().toString();


      B1C3 = b1C3.getSelectedItem().toString();
      B2C3 = b2C3.getSelectedItem().toString();
      B3C3 = b3C3.getSelectedItem().toString();
      B4C3 = b4C3.getSelectedItem().toString();
      B5C3 = b5C3.getSelectedItem().toString();
      B5C3 = b5C3.getSelectedItem().toString();
      B7C3 = b7C3.getSelectedItem().toString();
      B8C3 = b8C3.getSelectedItem().toString();
      B9C3= b9C3.getSelectedItem().toString();
      B10C3 = b10C3.getSelectedItem().toString();
      B11C3= b11C3.getSelectedItem().toString();
      B12C3 = b12C3.getSelectedItem().toString();

      C1C2 = c1C3.getSelectedItem().toString();
      C2C2 = c2C3.getSelectedItem().toString();
      C3C2 = c3C3.getSelectedItem().toString();
      C4C2 = c4C3.getSelectedItem().toString();
      C5C2 = c5C3.getSelectedItem().toString();
      C5C2 = c5C3.getSelectedItem().toString();
      C7C2 = c7C3.getSelectedItem().toString();
      C8C2 = c8C3.getSelectedItem().toString();
      C9C2 = c9C3.getSelectedItem().toString();
      C10C2 = c10C3.getSelectedItem().toString();
      C11C2 = c11C3.getSelectedItem().toString();
      C12C2 = c12C3.getSelectedItem().toString();

      D1C3 = d1C3.getSelectedItem().toString();
      D2C3 = d2C3.getSelectedItem().toString();
      D3C3 = d3C3.getSelectedItem().toString();
      D4C3 = d4C3.getSelectedItem().toString();
      D5C3 = d5C3.getSelectedItem().toString();
      D5C3 = d5C3.getSelectedItem().toString();
      D7C3 = d7C3.getSelectedItem().toString();
      D8C3 = d8C3.getSelectedItem().toString();
      D9C3 = d9C3.getSelectedItem().toString();
      D10C3 = d10C3.getSelectedItem().toString();
      D11C3 = d11C3.getSelectedItem().toString();
      D12C3 = d12C3.getSelectedItem().toString();


      E1C3 = e1C3.getSelectedItem().toString();
      E2C3 = e2C3.getSelectedItem().toString();
      E3C3 = e3C3.getSelectedItem().toString();
      E4C3 = e4C3.getSelectedItem().toString();
      E5C3 = e5C3.getSelectedItem().toString();
      E5C3 = e5C3.getSelectedItem().toString();
      E7C3 = e7C3.getSelectedItem().toString();
      E8C3 = e8C3.getSelectedItem().toString();
      E9C3 = e9C3.getSelectedItem().toString();
      E10C3 = e10C3.getSelectedItem().toString();
      E11C3 = e11C3.getSelectedItem().toString();
      E12C3 = e12C3.getSelectedItem().toString();


      F1C3 = f1C3.getSelectedItem().toString();
      F2C3 = f2C3.getSelectedItem().toString();
      F3C3 = f3C3.getSelectedItem().toString();
      F4C3 = f4C3.getSelectedItem().toString();
      F5C3 = f5C3.getSelectedItem().toString();
      F5C3 = f5C3.getSelectedItem().toString();
      F7C3 = f7C3.getSelectedItem().toString();
      F8C3 = f8C3.getSelectedItem().toString();
      F9C3 = f9C3.getSelectedItem().toString();
      F10C3 = f10C3.getSelectedItem().toString();
      F11C3 = f11C3.getSelectedItem().toString();
      F12C3 = f12C3.getSelectedItem().toString();


      A1T3 = a1T3.getSelectedItem().toString();
      A2T3 = a2T3.getSelectedItem().toString();
      A3T3 = a3T3.getSelectedItem().toString();
      A4T3 = a4T3.getSelectedItem().toString();
      A5T3 = a5T3.getSelectedItem().toString();
      A6T3 = a6T3.getSelectedItem().toString();
      A7T3 = a7T3.getSelectedItem().toString();
      A8T3 = a8T3.getSelectedItem().toString();
      A9T3 = a9T3.getSelectedItem().toString();
      A10T3 = a10T3.getSelectedItem().toString();
      A11T3 = a11T3.getSelectedItem().toString();
      A12T3 = a12T3.getSelectedItem().toString();

      B1T3 = b1T3.getSelectedItem().toString();
      B2T3 = b2T3.getSelectedItem().toString();
      B3T3 = b3T3.getSelectedItem().toString();
      B4T3 = b4T3.getSelectedItem().toString();
      B5T3 = b5T3.getSelectedItem().toString();
      B6T3 = b6T3.getSelectedItem().toString();
      B7T3 = b7T3.getSelectedItem().toString();
      B8T3 = b8T3.getSelectedItem().toString();
      B9T3 = b9T3.getSelectedItem().toString();
      B10T3 = b10T3.getSelectedItem().toString();
      B11T3 = b11T3.getSelectedItem().toString();
      B12T3 = b12T3.getSelectedItem().toString();

      C1T3 = c1T3.getSelectedItem().toString();
      C2T3 = c2T3.getSelectedItem().toString();
      C3T3 = c3T3.getSelectedItem().toString();
      C4T3 = c4T3.getSelectedItem().toString();
      C5T3 = c5T3.getSelectedItem().toString();
      C6T3 = c6T3.getSelectedItem().toString();
      C7T3 = c7T3.getSelectedItem().toString();
      C8T3 = c8T3.getSelectedItem().toString();
      C9T3 = c9T3.getSelectedItem().toString();
      C10T3 = c10T3.getSelectedItem().toString();
      C11T3 = c11T3.getSelectedItem().toString();
      C12T3 = c12T3.getSelectedItem().toString();

      D1T3 = d1T3.getSelectedItem().toString();
      D2T3 = d2T3.getSelectedItem().toString();
      D3T3 = d3T3.getSelectedItem().toString();
      D4T3 = d4T3.getSelectedItem().toString();
      D5T3 = d5T3.getSelectedItem().toString();
      D6T3 = d6T3.getSelectedItem().toString();
      D7T3 = d7T3.getSelectedItem().toString();
      D8T3 = d8T3.getSelectedItem().toString();
      D9T3 = d9T3.getSelectedItem().toString();
      D10T3 = d10T3.getSelectedItem().toString();
      D11T3 = d11T3.getSelectedItem().toString();
      D12T3 = d12T3.getSelectedItem().toString();

      E1T3 = e1T3.getSelectedItem().toString();
      E2T3 = e2T3.getSelectedItem().toString();
      E3T3 = e3T3.getSelectedItem().toString();
      E4T3 = e4T3.getSelectedItem().toString();
      E5T3 = e5T3.getSelectedItem().toString();
      E6T3 = e6T3.getSelectedItem().toString();
      E7T3 = e7T3.getSelectedItem().toString();
      E8T3 = e8T3.getSelectedItem().toString();
      E9T3 = e9T3.getSelectedItem().toString();
      E10T3 = e10T3.getSelectedItem().toString();
      E11T3 = e11T3.getSelectedItem().toString();
      E12T3 = e12T3.getSelectedItem().toString();

      F1T3 = f1T3.getSelectedItem().toString();
      F2T3 = f2T3.getSelectedItem().toString();
      F3T3 = f3T3.getSelectedItem().toString();
      F4T3 = f4T3.getSelectedItem().toString();
      F5T3 = f5T3.getSelectedItem().toString();
      F6T3 = f6T3.getSelectedItem().toString();
      F7T3 = f7T3.getSelectedItem().toString();
      F8T3 = f8T3.getSelectedItem().toString();
      F9T3 = f9T3.getSelectedItem().toString();
      F10T3 = f10T3.getSelectedItem().toString();
      F11T3 = f11T3.getSelectedItem().toString();
      F12T3 = e12T3.getSelectedItem().toString();





      A1R3 = a1R3.getSelectedItem().toString();
      A2R3 = a2R3.getSelectedItem().toString();
      A3R3 = a3R3.getSelectedItem().toString();
      A4R3 = a4R3.getSelectedItem().toString();
      A5R3 = a5R3.getSelectedItem().toString();
      A6R3 = a6R3.getSelectedItem().toString();
      A7R3 = a7R3.getSelectedItem().toString();
      A8R3 = a8R3.getSelectedItem().toString();
      A9R3 = a9R3.getSelectedItem().toString();
      A10R3 = a10R3.getSelectedItem().toString();
      A11R3 = a11R3.getSelectedItem().toString();
      A12R3 = a12R3.getSelectedItem().toString();


      B1R3 = b1R3.getSelectedItem().toString();
      B2R3 = b2R3.getSelectedItem().toString();
      B3R3 = b3R3.getSelectedItem().toString();
      B4R3 = b4R3.getSelectedItem().toString();
      B5R3 = b5R3.getSelectedItem().toString();
      B6R3 = b6R3.getSelectedItem().toString();
      B7R3 = b7R3.getSelectedItem().toString();
      B8R3 = b8R3.getSelectedItem().toString();
      B9R3 = b9R3.getSelectedItem().toString();
      B10R3 = b10R3.getSelectedItem().toString();
      B11R3 = b11R3.getSelectedItem().toString();
      B12R3 = b12R3.getSelectedItem().toString();

      C1R3 = c1R3.getSelectedItem().toString();
      C2R3 = c2R3.getSelectedItem().toString();
      C3R3 = c3R3.getSelectedItem().toString();
      C4R3 = c4R3.getSelectedItem().toString();
      C5R3 = c5R3.getSelectedItem().toString();
      C6R3 = c6R3.getSelectedItem().toString();
      C7R3 = c7R3.getSelectedItem().toString();
      C8R3 = c8R3.getSelectedItem().toString();
      C9R3 = c9R3.getSelectedItem().toString();
      C10R3 = c10R3.getSelectedItem().toString();
      C11R3 = c11R3.getSelectedItem().toString();
      C12R3 = c12R3.getSelectedItem().toString();

      D1R3 = d1R3.getSelectedItem().toString();
      D2R3 = d2R3.getSelectedItem().toString();
      D3R3 = d3R3.getSelectedItem().toString();
      D4R3 = d4R3.getSelectedItem().toString();
      D5R3 = d5R3.getSelectedItem().toString();
      D6R3 = d6R3.getSelectedItem().toString();
      D7R3 = d7R3.getSelectedItem().toString();
      D8R3 = d8R3.getSelectedItem().toString();
      D9R3 = d9R3.getSelectedItem().toString();
      D10R3 = d10R3.getSelectedItem().toString();
      D11R3 = d11R3.getSelectedItem().toString();
      D12R3 = d12R3.getSelectedItem().toString();

      E1R3 = e1R3.getSelectedItem().toString();
      E2R3 = e2R3.getSelectedItem().toString();
      E3R3 = e3R3.getSelectedItem().toString();
      E4R3 = e4R3.getSelectedItem().toString();
      E5R3 = e5R3.getSelectedItem().toString();
      E6R3 = e6R3.getSelectedItem().toString();
      E7R3 = e7R3.getSelectedItem().toString();
      E8R3 = e8R3.getSelectedItem().toString();
      E9R3 = e9R3.getSelectedItem().toString();
      E10R3 = e10R3.getSelectedItem().toString();
      E11R3 = e11R3.getSelectedItem().toString();
      E12R3 = e12R3.getSelectedItem().toString();

      F1R3 = f1R3.getSelectedItem().toString();
      F2R3 = f2R3.getSelectedItem().toString();
      F3R3 = f3R3.getSelectedItem().toString();
      F4R3 = f4R3.getSelectedItem().toString();
      F5R3 = f5R3.getSelectedItem().toString();
      F6R3 = f6R3.getSelectedItem().toString();
      F7R3 = f7R3.getSelectedItem().toString();
      F8R3 = f8R3.getSelectedItem().toString();
      F9R3 = f9R3.getSelectedItem().toString();
      F10R3 = f10R3.getSelectedItem().toString();
      F11R3 = f11R3.getSelectedItem().toString();
      F12R3 = f12R3.getSelectedItem().toString();
   }

   public static void tuCelCheck(Spinner a1C4, Spinner b1C4, Spinner c1C4, Spinner d1C4, Spinner e1C4, Spinner f1C4, Spinner a1T4, Spinner b1T4, Spinner c1T4, Spinner d1T4, Spinner e1T4, Spinner f1T4, Spinner a1R4, Spinner b1R4, Spinner c1R4, Spinner d1R4, Spinner e1R4, Spinner f1R4, Spinner a2C4, Spinner b2C4, Spinner c2C4, Spinner d2C4, Spinner e2C4, Spinner f2C4, Spinner a2T4, Spinner b2T4, Spinner c2T4, Spinner d2T4, Spinner e2T4, Spinner f2T4, Spinner a2R4, Spinner b2R4, Spinner c2R4, Spinner d2R4, Spinner e2R4, Spinner f2R4, Spinner a3C4, Spinner b3C4, Spinner c3C4, Spinner d3C4, Spinner e3C4, Spinner f3C4, Spinner a3T4, Spinner b3T4, Spinner c3T4, Spinner d3T4, Spinner e3T4, Spinner f3T4, Spinner a3R4, Spinner b3R4, Spinner c3R4, Spinner d3R4, Spinner e3R4, Spinner f3R4, Spinner a4C4, Spinner b4C4, Spinner c4C4, Spinner d4C4, Spinner e4C4, Spinner f4C4, Spinner a4T4, Spinner b4T4, Spinner c4T4, Spinner d4T4, Spinner e4T4, Spinner f4T4, Spinner a4R4, Spinner b4R4, Spinner c4R4, Spinner d4R4, Spinner e4R4, Spinner f4R4, Spinner a5C4, Spinner b5C4, Spinner c5C4, Spinner d5C4, Spinner e5C4, Spinner f5C4, Spinner a5T4, Spinner b5T4, Spinner c5T4, Spinner d5T4, Spinner e5T4, Spinner f5T4, Spinner a5R4, Spinner b5R4, Spinner c5R4, Spinner d5R4, Spinner e5R4, Spinner f5R4, Spinner a6C4, Spinner b6C4, Spinner c6C4, Spinner d6C4, Spinner e6C4, Spinner f6C4, Spinner a6T4, Spinner b6T4, Spinner c6T4, Spinner d6T4, Spinner e6T4, Spinner f6T4, Spinner a6R4, Spinner b6R4, Spinner c6R4, Spinner d6R4, Spinner e6R4, Spinner f6R4, Spinner a7C4, Spinner b7C4, Spinner c7C4, Spinner d7C4, Spinner e7C4, Spinner f7C4, Spinner a7T4, Spinner b7T4, Spinner c7T4, Spinner d7T4, Spinner e7T4, Spinner f7T4, Spinner a7R4, Spinner b7R4, Spinner c7R4, Spinner d7R4, Spinner e7R4, Spinner f7R4, Spinner a8C4, Spinner b8C4, Spinner c8C4, Spinner d8C4, Spinner e8C4, Spinner f8C4, Spinner a8T4, Spinner b8T4, Spinner c8T4, Spinner d8T4, Spinner e8T4, Spinner f8T4, Spinner a8R4, Spinner b8R4, Spinner c8R4, Spinner d8R4, Spinner e8R4, Spinner f8R4, Spinner a9C4, Spinner b9C4, Spinner c9C4, Spinner d9C4, Spinner e9C4, Spinner f9C4, Spinner a9T4, Spinner b9T4, Spinner c9T4, Spinner d9T4, Spinner e9T4, Spinner f9T4, Spinner a9R4, Spinner b9R4, Spinner c9R4, Spinner d9R4, Spinner e9R4, Spinner f9R4, Spinner a10C4, Spinner b10C4, Spinner c10C4, Spinner d10C4, Spinner e10C4, Spinner f10C4, Spinner a10T4, Spinner b10T4, Spinner c10T4, Spinner d10T4, Spinner e10T4, Spinner f10T4, Spinner a10R4, Spinner b10R4, Spinner c10R4, Spinner d10R4, Spinner e10R4, Spinner f10R4, Spinner a11C4, Spinner b11C4, Spinner c11C4, Spinner d11C4, Spinner e11C4, Spinner f11C4, Spinner a11T4, Spinner b11T4, Spinner c11T4, Spinner d11T4, Spinner e11T4, Spinner f11T4, Spinner a11R4, Spinner b11R4, Spinner c11R4, Spinner d11R4, Spinner e11R4, Spinner f11R4, Spinner a12C4, Spinner b12C4, Spinner c12C4, Spinner d12C4, Spinner e12C4, Spinner f12C4, Spinner a12T4, Spinner b12T4, Spinner c12T4, Spinner d12T4, Spinner e12T4, Spinner f12T4, Spinner a12R4, Spinner b12R4, Spinner c12R4, Spinner d12R4, Spinner e12R4, Spinner f12R4)
   {

   }

   public static void weCelCheck(Spinner a1C5, Spinner b1C5, Spinner c1C5, Spinner d1C5, Spinner e1C5, Spinner f1C5, Spinner a1T5, Spinner b1T5, Spinner c1T5, Spinner d1T5, Spinner e1T5, Spinner f1T5, Spinner a1R5, Spinner b1R5, Spinner c1R5, Spinner d1R5, Spinner e1R5, Spinner f1R5, Spinner a2C5, Spinner b2C5, Spinner c2C5, Spinner d2C5, Spinner e2C5, Spinner f2C5, Spinner a2T5, Spinner b2T5, Spinner c2T5, Spinner d2T5, Spinner e2T5, Spinner f2T5, Spinner a2R5, Spinner b2R5, Spinner c2R5, Spinner d2R5, Spinner e2R5, Spinner f2R5, Spinner a3C5, Spinner b3C5, Spinner c3C5, Spinner d3C5, Spinner e3C5, Spinner f3C5, Spinner a3T5, Spinner b3T5, Spinner c3T5, Spinner d3T5, Spinner e3T5, Spinner f3T5, Spinner a3R5, Spinner b3R5, Spinner c3R5, Spinner d3R5, Spinner e3R5, Spinner f3R5, Spinner a4C5, Spinner b4C5, Spinner c4C5, Spinner d4C5, Spinner e4C5, Spinner f4C5, Spinner a4T5, Spinner b4T5, Spinner c4T5, Spinner d4T5, Spinner e4T5, Spinner f4T5, Spinner a4R5, Spinner b4R5, Spinner c4R5, Spinner d4R5, Spinner e4R5, Spinner f4R5, Spinner a5C5, Spinner b5C5, Spinner c5C5, Spinner d5C5, Spinner e5C5, Spinner f5C5, Spinner a5T5, Spinner b5T5, Spinner c5T5, Spinner d5T5, Spinner e5T5, Spinner f5T5, Spinner a5R5, Spinner b5R5, Spinner c5R5, Spinner d5R5, Spinner e5R5, Spinner f5R5, Spinner a6C5, Spinner b6C5, Spinner c6C5, Spinner d6C5, Spinner e6C5, Spinner f6C5, Spinner a6T5, Spinner b6T5, Spinner c6T5, Spinner d6T5, Spinner e6T5, Spinner f6T5, Spinner a6R5, Spinner b6R5, Spinner c6R5, Spinner d6R5, Spinner e6R5, Spinner f6R5, Spinner a7C5, Spinner b7C5, Spinner c7C5, Spinner d7C5, Spinner e7C5, Spinner f7C5, Spinner a7T5, Spinner b7T5, Spinner c7T5, Spinner d7T5, Spinner e7T5, Spinner f7T5, Spinner a7R5, Spinner b7R5, Spinner c7R5, Spinner d7R5, Spinner e7R5, Spinner f7R5, Spinner a8C5, Spinner b8C5, Spinner c8C5, Spinner d8C5, Spinner e8C5, Spinner f8C5, Spinner a8T5, Spinner b8T5, Spinner c8T5, Spinner d8T5, Spinner e8T5, Spinner f8T5, Spinner a8R5, Spinner b8R5, Spinner c8R5, Spinner d8R5, Spinner e8R5, Spinner f8R5, Spinner a9C5, Spinner b9C5, Spinner c9C5, Spinner d9C5, Spinner e9C5, Spinner f9C5, Spinner a9T5, Spinner b9T5, Spinner c9T5, Spinner d9T5, Spinner e9T5, Spinner f9T5, Spinner a9R5, Spinner b9R5, Spinner c9R5, Spinner d9R5, Spinner e9R5, Spinner f9R5, Spinner a10C5, Spinner b10C5, Spinner c10C5, Spinner d10C5, Spinner e10C5, Spinner f10C5, Spinner a10T5, Spinner b10T5, Spinner c10T5, Spinner d10T5, Spinner e10T5, Spinner f10T5, Spinner a10R5, Spinner b10R5, Spinner c10R5, Spinner d10R5, Spinner e10R5, Spinner f10R5, Spinner a11C5, Spinner b11C5, Spinner c11C5, Spinner d11C5, Spinner e11C5, Spinner f11C5, Spinner a11T5, Spinner b11T5, Spinner c11T5, Spinner d11T5, Spinner e11T5, Spinner f11T5, Spinner a11R5, Spinner b11R5, Spinner c11R5, Spinner d11R5, Spinner e11R5, Spinner f11R5, Spinner a12C5, Spinner b12C5, Spinner c12C5, Spinner d12C5, Spinner e12C5, Spinner f12C5, Spinner a12T5, Spinner b12T5, Spinner c12T5, Spinner d12T5, Spinner e12T5, Spinner f12T5, Spinner a12R5, Spinner b12R5, Spinner c12R5, Spinner d12R5, Spinner e12R5, Spinner f12R5)
   {

   }

   public static void thCelCheck(Spinner a1C6, Spinner b1C6, Spinner c1C6, Spinner d1C6, Spinner e1C6, Spinner f1C6, Spinner a1T6, Spinner b1T6, Spinner c1T6, Spinner d1T6, Spinner e1T6, Spinner f1T6, Spinner a1R6, Spinner b1R6, Spinner c1R6, Spinner d1R6, Spinner e1R6, Spinner f1R6, Spinner a2C6, Spinner b2C6, Spinner c2C6, Spinner d2C6, Spinner e2C6, Spinner f2C6, Spinner a2T6, Spinner b2T6, Spinner c2T6, Spinner d2T6, Spinner e2T6, Spinner f2T6, Spinner a2R6, Spinner b2R6, Spinner c2R6, Spinner d2R6, Spinner e2R6, Spinner f2R6, Spinner a3C6, Spinner b3C6, Spinner c3C6, Spinner d3C6, Spinner e3C6, Spinner f3C6, Spinner a3T6, Spinner b3T6, Spinner c3T6, Spinner d3T6, Spinner e3T6, Spinner f3T6, Spinner a3R6, Spinner b3R6, Spinner c3R6, Spinner d3R6, Spinner e3R6, Spinner f3R6, Spinner a4C6, Spinner b4C6, Spinner c4C6, Spinner d4C6, Spinner e4C6, Spinner f4C6, Spinner a4T6, Spinner b4T6, Spinner c4T6, Spinner d4T6, Spinner e4T6, Spinner f4T6, Spinner a4R6, Spinner b4R6, Spinner c4R6, Spinner d4R6, Spinner e4R6, Spinner f4R6, Spinner a5C6, Spinner b5C6, Spinner c5C6, Spinner d5C6, Spinner e5C6, Spinner f5C6, Spinner a5T6, Spinner b5T6, Spinner c5T6, Spinner d5T6, Spinner e5T6, Spinner f5T6, Spinner a5R6, Spinner b5R6, Spinner c5R6, Spinner d5R6, Spinner e5R6, Spinner f5R6, Spinner a6C6, Spinner b6C6, Spinner c6C6, Spinner d6C6, Spinner e6C6, Spinner f6C6, Spinner a6T6, Spinner b6T6, Spinner c6T6, Spinner d6T6, Spinner e6T6, Spinner f6T6, Spinner a6R6, Spinner b6R6, Spinner c6R6, Spinner d6R6, Spinner e6R6, Spinner f6R6, Spinner a7C6, Spinner b7C6, Spinner c7C6, Spinner d7C6, Spinner e7C6, Spinner f7C6, Spinner a7T6, Spinner b7T6, Spinner c7T6, Spinner d7T6, Spinner e7T6, Spinner f7T6, Spinner a7R6, Spinner b7R6, Spinner c7R6, Spinner d7R6, Spinner e7R6, Spinner f7R6, Spinner a8C6, Spinner b8C6, Spinner c8C6, Spinner d8C6, Spinner e8C6, Spinner f8C6, Spinner a8T6, Spinner b8T6, Spinner c8T6, Spinner d8T6, Spinner e8T6, Spinner f8T6, Spinner a8R6, Spinner b8R6, Spinner c8R6, Spinner d8R6, Spinner e8R6, Spinner f8R6, Spinner a9C6, Spinner b9C6, Spinner c9C6, Spinner d9C6, Spinner e9C6, Spinner f9C6, Spinner a9T6, Spinner b9T6, Spinner c9T6, Spinner d9T6, Spinner e9T6, Spinner f9T6, Spinner a9R6, Spinner b9R6, Spinner c9R6, Spinner d9R6, Spinner e9R6, Spinner f9R6, Spinner a10C6, Spinner b10C6, Spinner c10C6, Spinner d10C6, Spinner e10C6, Spinner f10C6, Spinner a10T6, Spinner b10T6, Spinner c10T6, Spinner d10T6, Spinner e10T6, Spinner f10T6, Spinner a10R6, Spinner b10R6, Spinner c10R6, Spinner d10R6, Spinner e10R6, Spinner f10R6, Spinner a11C6, Spinner b11C6, Spinner c11C6, Spinner d11C6, Spinner e11C6, Spinner f11C6, Spinner a11T6, Spinner b11T6, Spinner c11T6, Spinner d11T6, Spinner e11T6, Spinner f11T6, Spinner a11R6, Spinner b11R6, Spinner c11R6, Spinner d11R6, Spinner e11R6, Spinner f11R6, Spinner a12C6, Spinner b12C6, Spinner c12C6, Spinner d12C6, Spinner e12C6, Spinner f12C6, Spinner a12T6, Spinner b12T6, Spinner c12T6, Spinner d12T6, Spinner e12T6, Spinner f12T6, Spinner a12R6, Spinner b12R6, Spinner c12R6, Spinner d12R6, Spinner e12R6, Spinner f12R6)
   {

   }

   public static void frCelCheck(Spinner a1C7, Spinner b1C7, Spinner c1C7, Spinner d1C7, Spinner e1C7, Spinner f1C7, Spinner a1T7, Spinner b1T7, Spinner c1T7, Spinner d1T7, Spinner e1T7, Spinner f1T7, Spinner a1R7, Spinner b1R7, Spinner c1R7, Spinner d1R7, Spinner e1R7, Spinner f1R7, Spinner a2C7, Spinner b2C7, Spinner c2C7, Spinner d2C7, Spinner e2C7, Spinner f2C7, Spinner a2T7, Spinner b2T7, Spinner c2T7, Spinner d2T7, Spinner e2T7, Spinner f2T7, Spinner a2R7, Spinner b2R7, Spinner c2R7, Spinner d2R7, Spinner e2R7, Spinner f2R7, Spinner a3C7, Spinner b3C7, Spinner c3C7, Spinner d3C7, Spinner e3C7, Spinner f3C7, Spinner a3T7, Spinner b3T7, Spinner c3T7, Spinner d3T7, Spinner e3T7, Spinner f3T7, Spinner a3R7, Spinner b3R7, Spinner c3R7, Spinner d3R7, Spinner e3R7, Spinner f3R7, Spinner a4C7, Spinner b4C7, Spinner c4C7, Spinner d4C7, Spinner e4C7, Spinner f4C7, Spinner a4T7, Spinner b4T7, Spinner c4T7, Spinner d4T7, Spinner e4T7, Spinner f4T7, Spinner a4R7, Spinner b4R7, Spinner c4R7, Spinner d4R7, Spinner e4R7, Spinner f4R7, Spinner a5C7, Spinner b5C7, Spinner c5C7, Spinner d5C7, Spinner e5C7, Spinner f5C7, Spinner a5T7, Spinner b5T7, Spinner c5T7, Spinner d5T7, Spinner e5T7, Spinner f5T7, Spinner a5R7, Spinner b5R7, Spinner c5R7, Spinner d5R7, Spinner e5R7, Spinner f5R7, Spinner a6C7, Spinner b6C7, Spinner c6C7, Spinner d6C7, Spinner e6C7, Spinner f6C7, Spinner a6T7, Spinner b6T7, Spinner c6T7, Spinner d6T7, Spinner e6T7, Spinner f6T7, Spinner a6R7, Spinner b6R7, Spinner c6R7, Spinner d6R7, Spinner e6R7, Spinner f6R7, Spinner a7C7, Spinner b7C7, Spinner c7C7, Spinner d7C7, Spinner e7C7, Spinner f7C7, Spinner a7T7, Spinner b7T7, Spinner c7T7, Spinner d7T7, Spinner e7T7, Spinner f7T7, Spinner a7R7, Spinner b7R7, Spinner c7R7, Spinner d7R7, Spinner e7R7, Spinner f7R7, Spinner a8C7, Spinner b8C7, Spinner c8C7, Spinner d8C7, Spinner e8C7, Spinner f8C7, Spinner a8T7, Spinner b8T7, Spinner c8T7, Spinner d8T7, Spinner e8T7, Spinner f8T7, Spinner a8R7, Spinner b8R7, Spinner c8R7, Spinner d8R7, Spinner e8R7, Spinner f8R7, Spinner a9C7, Spinner b9C7, Spinner c9C7, Spinner d9C7, Spinner e9C7, Spinner f9C7, Spinner a9T7, Spinner b9T7, Spinner c9T7, Spinner d9T7, Spinner e9T7, Spinner f9T7, Spinner a9R7, Spinner b9R7, Spinner c9R7, Spinner d9R7, Spinner e9R7, Spinner f9R7, Spinner a10C7, Spinner b10C7, Spinner c10C7, Spinner d10C7, Spinner e10C7, Spinner f10C7, Spinner a10T7, Spinner b10T7, Spinner c10T7, Spinner d10T7, Spinner e10T7, Spinner f10T7, Spinner a10R7, Spinner b10R7, Spinner c10R7, Spinner d10R7, Spinner e10R7, Spinner f10R7, Spinner a11C7, Spinner b11C7, Spinner c11C7, Spinner d11C7, Spinner e11C7, Spinner f11C7, Spinner a11T7, Spinner b11T7, Spinner c11T7, Spinner d11T7, Spinner e11T7, Spinner f11T7, Spinner a11R7, Spinner b11R7, Spinner c11R7, Spinner d11R7, Spinner e11R7, Spinner f11R7, Spinner a12C7, Spinner b12C7, Spinner c12C7, Spinner d12C7, Spinner e12C7, Spinner f12C7, Spinner a12T7, Spinner b12T7, Spinner c12T7, Spinner d12T7, Spinner e12T7, Spinner f12T7, Spinner a12R7, Spinner b12R7, Spinner c12R7, Spinner d12R7, Spinner e12R7, Spinner f12R7)
   {

   }

}
