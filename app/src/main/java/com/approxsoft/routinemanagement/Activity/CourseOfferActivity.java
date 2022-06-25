package com.approxsoft.routinemanagement.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.approxsoft.routinemanagement.CourseOfferFile.CourseOffer;
import com.approxsoft.routinemanagement.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CourseOfferActivity extends AppCompatActivity {

    Spinner selectCourseOfferCourse, selectCourserOfferSemester;
    TextView courseOfferSubmitBtn;
    RecyclerView semester1stView, semester2ndView,semester3rdView,semester4thView,semester5thView,semester6thView,semester7thView,semester8thView,semester9thView,semester10thView,semester11thView,semester12thView;

    DatabaseReference teacherReference = FirebaseDatabase.getInstance().getReference();
    Spinner teacherShortNameSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_offer);


        selectCourseOfferCourse = findViewById(R.id.select_course_offer_course);
        selectCourserOfferSemester = findViewById(R.id.select_course_offer_semester);
        courseOfferSubmitBtn = findViewById(R.id.course_offer_submit_btn);


        semester1stView = findViewById(R.id.semester_1st_course_view);
        semester2ndView = findViewById(R.id.semester_2nd_course_view);
        semester3rdView = findViewById(R.id.semester_3rd_course_view);
        semester4thView = findViewById(R.id.semester_4th_course_view);
        semester5thView = findViewById(R.id.semester_5th_course_view);
        semester6thView = findViewById(R.id.semester_6th_course_view);
        semester7thView = findViewById(R.id.semester_7th_course_view);
        semester8thView = findViewById(R.id.semester_8th_course_view);
        semester9thView = findViewById(R.id.semester_9th_course_view);
        semester10thView = findViewById(R.id.semester_10th_course_view);
        semester11thView = findViewById(R.id.semester_11th_course_view);
        semester12thView = findViewById(R.id.semester_12th_course_view);


        semester1stView.setHasFixedSize(true);
        LinearLayoutManager semester1st = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester1st.setReverseLayout(true);
        semester1st.setStackFromEnd(true);
        semester1stView.setLayoutManager(semester1st);

        semester2ndView.setHasFixedSize(true);
        LinearLayoutManager semester2nd = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester2nd.setReverseLayout(true);
        semester2nd.setStackFromEnd(true);
        semester2ndView.setLayoutManager(semester2nd);

        semester3rdView.setHasFixedSize(true);
        LinearLayoutManager semester3rd = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester3rd.setReverseLayout(true);
        semester3rd.setStackFromEnd(true);
        semester3rdView.setLayoutManager(semester3rd);

        semester4thView.setHasFixedSize(true);
        LinearLayoutManager semester4th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester4th.setReverseLayout(true);
        semester4th.setStackFromEnd(true);
        semester4thView.setLayoutManager(semester4th);

        semester5thView.setHasFixedSize(true);
        LinearLayoutManager semester5th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester5th.setReverseLayout(true);
        semester5th.setStackFromEnd(true);
        semester5thView.setLayoutManager(semester5th);

        semester6thView.setHasFixedSize(true);
        LinearLayoutManager semester6th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester6th.setReverseLayout(true);
        semester6th.setStackFromEnd(true);
        semester6thView.setLayoutManager(semester6th);

        semester7thView.setHasFixedSize(true);
        LinearLayoutManager semester7th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester7th.setReverseLayout(true);
        semester7th.setStackFromEnd(true);
        semester7thView.setLayoutManager(semester7th);

        semester8thView.setHasFixedSize(true);
        LinearLayoutManager semester8th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester8th.setReverseLayout(true);
        semester8th.setStackFromEnd(true);
        semester8thView.setLayoutManager(semester8th);

        semester9thView.setHasFixedSize(true);
        LinearLayoutManager semester9th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester9th.setReverseLayout(true);
        semester9th.setStackFromEnd(true);
        semester9thView.setLayoutManager(semester9th);

        semester10thView.setHasFixedSize(true);
        LinearLayoutManager semester10th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester10th.setReverseLayout(true);
        semester10th.setStackFromEnd(true);
        semester10thView.setLayoutManager(semester10th);

        semester11thView.setHasFixedSize(true);
        LinearLayoutManager semester11th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester11th.setReverseLayout(true);
        semester11th.setStackFromEnd(true);
        semester11thView.setLayoutManager(semester11th);

        semester12thView.setHasFixedSize(true);
        LinearLayoutManager semester12th = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        semester12th.setReverseLayout(true);
        semester12th.setStackFromEnd(true);
        semester12thView.setLayoutManager(semester12th);


        CourseOffer.courseOffer(selectCourseOfferCourse,selectCourserOfferSemester,courseOfferSubmitBtn,semester1stView,semester2ndView,semester3rdView,semester4thView,semester5thView,semester6thView,semester7thView,semester8thView,semester9thView,semester10thView,semester11thView,semester12thView);


        teacherReference.child("Department Of CSE And CSIT").child("TeacherShortName").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {

                final List<String> course = new ArrayList<String>();

                for (DataSnapshot chilsSnapshot : snapshot.getChildren()){

                    String courseData = chilsSnapshot.child("ShortName").getValue(String.class);
                    course.add("");
                    course.add(courseData);

                }
                //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, nomeConsulta);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(CourseOfferActivity.this,android.R.layout.simple_spinner_item,course);

                //teacherShortNameSpin.setAdapter(arrayAdapter);



            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}