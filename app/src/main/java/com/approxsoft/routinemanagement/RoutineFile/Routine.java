package com.approxsoft.routinemanagement.RoutineFile;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Routine {

    public static void timeAndSemesterSelectionRoutine(EditText aTime, EditText bTime, EditText cTime, EditText dTime, EditText eTime, EditText fTime, Spinner sATime, Spinner sBTime, Spinner sCTime, Spinner sDTime, Spinner sETime, Spinner sFTime, Spinner select1st, Spinner select2nd, Spinner select3rd, Spinner select4th, Spinner select5th, Spinner select6th, Spinner select7th, Spinner select8th, Spinner select9th, Spinner select10th, Spinner select11th, Spinner select12th, Spinner weekSelect, Spinner routineConditionSelect, TextView select1stText, TextView select2ndText, TextView select3rdText, TextView select4thText, TextView select5thText, TextView select6thText, TextView select7thText, TextView select8thText, TextView select9thText, TextView select10thText, TextView select11thText, TextView select12thText, TextView weekSelectText, TextView routineConditionSelectText, TextView routineCount) {
        RoutineTimeMethod(aTime,bTime,cTime,dTime,eTime,fTime,sATime,sBTime,sCTime,sDTime,sETime,sFTime,select1st,select2nd,select3rd,select4th,select5th,select6th,select7th,select8th,select9th,select10th,select11th,select12th,routineConditionSelect,weekSelect ,select1stText,select2ndText,select3rdText,select4thText,select5thText,select6thText,select7thText,select8thText,select9thText,select10thText,select11thText,select12thText,routineConditionSelectText,weekSelectText);
    }




    private static void RoutineTimeMethod(EditText aTime, EditText bTime, EditText cTime, EditText dTime, EditText eTime, EditText fTime, Spinner sATime, Spinner sBTime, Spinner sCTime, Spinner sDTime, Spinner sETime, Spinner sFTime, Spinner select1st, Spinner select2nd, Spinner select3rd, Spinner select4th, Spinner select5th, Spinner select6th, Spinner select7th, Spinner select8th, Spinner select9th, Spinner select10th, Spinner select11th, Spinner select12th, Spinner routineConditionSelect, Spinner weekSelect, TextView select1stText, TextView select2ndText, TextView select3rdText, TextView select4thText, TextView select5thText, TextView select6thText, TextView select7thText, TextView select8thText, TextView select9thText, TextView select10thText, TextView select11thText, TextView select12thText, TextView routineConditionSelectText, TextView weekSelectText) {
        select1st.setSelection(1);
        select2nd.setSelection(2);
        select3rd.setSelection(3);
        select4th.setSelection(4);
        select5th.setSelection(5);
        select6th.setSelection(6);
        select7th.setSelection(7);
        select8th.setSelection(8);
        select9th.setSelection(9);
        select10th.setSelection(10);
        select11th.setSelection(11);
        select12th.setSelection(12);


        sATime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                aTime.setText(sATime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        sBTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                bTime.setText(sBTime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        sCTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                cTime.setText(sCTime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        sDTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                dTime.setText(sDTime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        sETime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                eTime.setText(sETime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        sFTime.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                fTime.setText(sFTime.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });


        select1st.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select1stText.setText(select1st.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select2nd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select2ndText.setText(select2nd.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select3rd.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select3rdText.setText(select3rd.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select4th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select4thText.setText(select4th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select5th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select5thText.setText(select5th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select6th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select6thText.setText(select6th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select7th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select7thText.setText(select7th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select8th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select8thText.setText(select8th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select9th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select9thText.setText(select9th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select10th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select10thText.setText(select10th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select11th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select11thText.setText(select11th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        select12th.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                select12thText.setText(select12th.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        routineConditionSelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                routineConditionSelectText.setText(routineConditionSelect.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        weekSelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,int position, long id) {
                weekSelectText.setText(weekSelect.getSelectedItem().toString()); //this is taking the first value of the spinner by default.

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });




    }
}
