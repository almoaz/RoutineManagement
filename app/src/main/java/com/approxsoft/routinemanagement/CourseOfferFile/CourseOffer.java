package com.approxsoft.routinemanagement.CourseOfferFile;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.approxsoft.routinemanagement.Activity.MainActivity;
import com.approxsoft.routinemanagement.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class CourseOffer {

    static DatabaseReference courserReference = FirebaseDatabase.getInstance().getReference();
    static DatabaseReference teacherReference = FirebaseDatabase.getInstance().getReference();
    static DatabaseReference course1stOpen = FirebaseDatabase.getInstance().getReference().child("Department Of CSE And CSIT").child("Semester Course Offer");
    static DatabaseReference courseOpen = FirebaseDatabase.getInstance().getReference().child("Department Of CSE And CSIT").child("Semester Course Offer");
    static Context context;
    static String clickBtn = "yes";
    static String handlerStart = "false";
    static AlertDialog.Builder builder;
    static Spinner sa1stAC;
    static Spinner selectTeacher;


    public static void courseOffer(Spinner selectCourseOfferCourse, Spinner selectCourserOfferSemester, TextView courseOfferSubmitBtn, RecyclerView semester1stView, RecyclerView semester2ndView, RecyclerView semester3rdView, RecyclerView semester4thView, RecyclerView semester5thView, RecyclerView semester6thView, RecyclerView semester7thView, RecyclerView semester8thView, RecyclerView semester9thView, RecyclerView semester10thView, RecyclerView semester11thView, RecyclerView semester12thView)
    {



        DisplaySemester1stView("",semester1stView);
        DisplaySemester2ndView("",semester2ndView);
        DisplaySemester3rdView("",semester3rdView);
        DisplaySemester4thView("",semester4thView);
        DisplaySemester5thView("",semester5thView);
        DisplaySemester6thView("",semester6thView);
        DisplaySemester7thView("",semester7thView);
        DisplaySemester8thView("",semester8thView);
        DisplaySemester9thView("",semester9thView);
        DisplaySemester10thView("",semester10thView);
        DisplaySemester11thView("",semester11thView);
        DisplaySemester12thView("",semester12thView);



        courseOfferSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                clickBtn = "yes";

                courserReference.child("Department Of CSE And CSIT").child("Semester Course Offer").child(selectCourserOfferSemester.getSelectedItem().toString()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {

                            long childLong = snapshot.getChildrenCount();


                            if (clickBtn.equals("yes") && childLong>=1)
                            {
                                courserReference.child("Department Of CSE And CSIT").child("Semester Course Offer").child(selectCourserOfferSemester.getSelectedItem().toString()).child(selectCourseOfferCourse.getSelectedItem().toString()).child("CourseName").setValue(selectCourseOfferCourse.getSelectedItem().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful())
                                        {
                                            courserReference.child("Department Of CSE And CSIT").child("All Course Offer").child(selectCourseOfferCourse.getSelectedItem().toString()).child("CourseName").setValue(selectCourseOfferCourse.getSelectedItem().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    if (task.isSuccessful())
                                                    {
                                                        clickBtn = "no";
                                                        handlerStart = "true";

                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("1st Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester1stView("",semester1stView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("2nd Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester2ndView("",semester2ndView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("3rd Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester3rdView("",semester3rdView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("4th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester4thView("",semester4thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("5th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester5thView("",semester5thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("6th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester6thView("",semester6thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("7th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester7thView("",semester7thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("8th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester8thView("",semester8thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("9th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester9thView("",semester9thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("10th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester10thView("",semester10thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("11th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester11thView("",semester11thView);
                                                        }
                                                        else
                                                        if (selectCourserOfferSemester.getSelectedItem().toString().equals("12th Semester"))
                                                        {
                                                            selectCourseOfferCourse.setSelection(0);
                                                            DisplaySemester12thView("",semester12thView);
                                                        }


                                                    }
                                                }
                                            });
                                        }
                                    }
                                });

                            }



                        }else
                        {

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                /** HashMap<String, Object> courseMap = new HashMap<>();

                 courseMap.put("Condition","true");

                 courserReference.child("Department Of CSE And CSIT").child("Semester Course Offer").child(selectCourserOfferSemester.getSelectedItem().toString()).updateChildren(courseMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful())
                {
                courserReference.child("Department Of CSE And CSIT").child("All Course Offer").child(selectCourserOfferSemester.getSelectedItem().toString()).updateChildren(courseMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful())
                {

                }
                }
                });
                }
                }
                });*/


            }
        });









    }

    private static void DisplaySemester12thView(String searchBoxInput, RecyclerView semester12thView) {
        Query query = courseOpen.child("12th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("12th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("12th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();

                                        teacherName(cTName,courseViewHolder.courseTeacherName);
                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("12th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("12th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("12th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester12thView.setAdapter(adapter);
    }

    private static void DisplaySemester11thView(String searchBoxInput, RecyclerView semester11thView) {

        Query query = courseOpen.child("11th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("11th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("11th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("11th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("11th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });



                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("11th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }

            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester11thView.setAdapter(adapter);
    }

    private static void DisplaySemester10thView(String searchBoxInput, RecyclerView semester10thView) {

        Query query = courseOpen.child("10th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("10th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("10th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();

                                        teacherName(cTName,courseViewHolder.courseTeacherName);
                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("10th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("10th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("10th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester10thView.setAdapter(adapter);
    }

    private static void DisplaySemester9thView(String searchBoxInput, RecyclerView semester9thView) {

        Query query = courseOpen.child("9th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("9th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("9th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("9th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("9th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("9th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester9thView.setAdapter(adapter);
    }

    private static void DisplaySemester8thView(String searchBoxInput, RecyclerView semester8thView) {
        Query query = courseOpen.child("8th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("8th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("8th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("8th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("8th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("8th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester8thView.setAdapter(adapter);
    }

    private static void DisplaySemester7thView(String searchBoxInput, RecyclerView semester7thView) {

        Query query = courseOpen.child("7th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("7th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("7th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("7th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("7th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("7th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester7thView.setAdapter(adapter);
    }

    private static void DisplaySemester6thView(String searchBoxInput, RecyclerView semester6thView) {
        Query query = courseOpen.child("6th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("6th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("6th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("6th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("6th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("6th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester6thView.setAdapter(adapter);
    }

    private static void DisplaySemester5thView(String searchBoxInput, RecyclerView semester5thView) {

        Query query = courseOpen.child("5th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("5th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("5th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("5th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("5th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("5th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester5thView.setAdapter(adapter);
    }

    private static void DisplaySemester4thView(String searchBoxInput, RecyclerView semester4thView) {

        Query query = courseOpen.child("4th Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("4th Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("4th Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("4th Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("4th Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("4th Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester4thView.setAdapter(adapter);
    }

    private static void DisplaySemester3rdView(String searchBoxInput, RecyclerView semester3rdView) {

        Query query = courseOpen.child("3rd Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("3rd Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("3rd Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("3rd Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("3rd Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("3rd Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester3rdView.setAdapter(adapter);
    }

    private static void DisplaySemester2ndView(String searchBoxInput, RecyclerView semester2ndView) {

        Query query = courseOpen.child("2nd Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("2nd Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("2nd Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = snapshot.child(usersIDs).child("teacherName").getValue().toString();
                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                        //courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("2nd Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });



                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("2nd Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("2nd Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });


            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester2ndView.setAdapter(adapter);
    }

    private static void DisplaySemester1stView(String searchBoxInput, RecyclerView semester1stView) {
        Query query = courseOpen.child("1st Semester").orderByChild("CourseName")
                .startAt(searchBoxInput).endAt(searchBoxInput + "\uf8ff");// haven't implemented a proper list sort yet.

        FirebaseRecyclerOptions<CourseData> options = new FirebaseRecyclerOptions.Builder<CourseData>().setQuery(query, CourseData.class).build();

        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<CourseData, CourseViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final CourseViewHolder courseViewHolder, final int position, @NonNull final CourseData courseData) {

                String usersIDs = getRef(position).getKey();

                courseViewHolder.courseName.setText(courseData.getCourseName());
                courseViewHolder.courseTeacherName.setText(courseData.getTeacherName());


                assert usersIDs != null;
                courseOpen.child("1st Semester").child(usersIDs).addValueEventListener(new ValueEventListener() {
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists())
                        {
                            String text = snapshot.child("CourseName").getValue().toString();


                            courseViewHolder.courseName.setText(text);

                            courseOpen.child("1st Semester").addValueEventListener(new ValueEventListener() {
                                @Override
                                public void onDataChange(@NonNull DataSnapshot snapshot)
                                {
                                    if (snapshot.child(usersIDs).hasChild("teacherName"))
                                    {
                                        courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                        courseViewHolder.addBtn.setVisibility(View.GONE);
                                        courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                        String cTName = Objects.requireNonNull(snapshot.child(usersIDs).child("teacherName").getValue()).toString();

                                        teacherName(cTName,courseViewHolder.courseTeacherName);

                                       // courseViewHolder.courseTeacherName.setText(cTName);

                                        courseViewHolder.cancelBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                courseOpen.child("1st Semester").child(usersIDs).child("teacherName").removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task)
                                                    {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                                            courseViewHolder.addBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.GONE);
                                                        }
                                                    }
                                                });

                                            }
                                        });


                                    }
                                    else{
                                        courseViewHolder.cancelBtn.setVisibility(View.GONE);
                                        courseViewHolder.addBtn.setVisibility(View.VISIBLE);

                                        courseViewHolder.selectTeacherName.setVisibility(View.VISIBLE);
                                        courseViewHolder.courseTeacherName.setVisibility(View.GONE);

                                        courseViewHolder.addBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                String tName = String.valueOf(courseViewHolder.selectTeacherName.getSelectedItemPosition());
                                                courseOpen.child("1st Semester").child(usersIDs).child("teacherName").setValue(tName).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if (task.isSuccessful())
                                                        {
                                                            courseViewHolder.addBtn.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setVisibility(View.GONE);
                                                            courseViewHolder.selectTeacherName.setSelection(0);
                                                            courseViewHolder.cancelBtn.setVisibility(View.VISIBLE);
                                                            courseViewHolder.courseTeacherName.setVisibility(View.VISIBLE);

                                                        }

                                                    }
                                                });

                                            }
                                        });
                                    }

                                }

                                @Override
                                public void onCancelled(@NonNull DatabaseError error) {

                                }
                            });








                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



                courseViewHolder.itemLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.deleteCancelLayout.setVisibility(View.VISIBLE);

                        courseViewHolder.deleteCourse.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                courseOpen.child("1st Semester").child(usersIDs).removeValue();
                                courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                            }
                        });

                    }
                });

                courseViewHolder.deleteCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);
                    }
                });

                courseViewHolder.rightArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        courseViewHolder.rightArrow.setVisibility(View.GONE);
                        courseViewHolder.addTeacherLayout.setVisibility(View.VISIBLE);
                        courseViewHolder.deleteCancelLayout.setVisibility(View.GONE);

                    }
                });

                courseViewHolder.leftArrow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        courseViewHolder.addTeacherLayout.setVisibility(View.GONE);
                        courseViewHolder.rightArrow.setVisibility(View.VISIBLE);


                    }
                });





            }



            public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_offer_item, parent ,false);
                return new CourseViewHolder(view);
            }
        };
        adapter.startListening();
        semester1stView.setAdapter(adapter);
    }

    private static void teacherName(String cTName, TextView courseTeacherName) {

        if (cTName.equals("1"))
        {
            courseTeacherName.setText("Mr.Syed Jamaluddin Ahmad");
        }
        if (cTName.equals("2"))
        {
            courseTeacherName.setText("Mrs. Tasnim Niger");
        }
        if (cTName.equals("3"))
        {
            courseTeacherName.setText("Mr.Zahid Hasan");
        }
        if (cTName.equals("4"))
        {
            courseTeacherName.setText("Md.Abdullah Bin Masud");
        }
        if (cTName.equals("5"))
        {
            courseTeacherName.setText("Ms.Sharmina Rahman");
        }
        if (cTName.equals("6"))
        {
            courseTeacherName.setText("Ms.Fayazunnesa Chowdhury");
        }
        if (cTName.equals("7"))
        {
            courseTeacherName.setText("Roksana Khandoker");
        }
        if (cTName.equals("8"))
        {
            courseTeacherName.setText("Tania Annur");
        }
        if (cTName.equals("9"))
        {
            courseTeacherName.setText("Tasnim Ahmed");
        }
        if (cTName.equals("10"))
        {
            courseTeacherName.setText("Prof.Dr.Rabiul Islam");
        }
        if (cTName.equals("11"))
        {
            courseTeacherName.setText("Sanjana Shahnaj");
        }
        if (cTName.equals("12"))
        {
            courseTeacherName.setText("Mr.Mijanur Rahman");
        }
        if (cTName.equals("13"))
        {
            courseTeacherName.setText("Prof.Dr.Shamim Akter");
        }
        if (cTName.equals("14"))
        {
            courseTeacherName.setText("Mr.Mehedi Hassan");
        }
        if (cTName.equals("15"))
        {
            courseTeacherName.setText("Abul Hasnath");
        }
        if (cTName.equals("16"))
        {
            courseTeacherName.setText("Mr.Hasan Mahmud");
        }
        if (cTName.equals("17"))
        {
            courseTeacherName.setText("Mrinmoy Mitra");
        }
        if (cTName.equals("18"))
        {
            courseTeacherName.setText("Mr.Siraj");
        }
        if (cTName.equals("19"))
        {
            courseTeacherName.setText("TBA");
        }
    }


    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        View mView;
        View recordView;
        TextView courseName, courseCredit, courseTeacherName, addBtn, cancelBtn, deleteCourse, deleteCancel;
        ImageView rightArrow, leftArrow;
        Spinner selectTeacherName;
        LinearLayout addTeacherLayout, itemLayout, deleteCancelLayout;




        CourseViewHolder(View itemView) {
            super(itemView);

            recordView = itemView;

            mView = itemView;

            courseName = itemView.findViewById(R.id.course_name);
            courseCredit = itemView.findViewById(R.id.course_credit);
            courseTeacherName = itemView.findViewById(R.id.course_teacher_name);
            addBtn = itemView.findViewById(R.id.add_teacher);
            cancelBtn = itemView.findViewById(R.id.delete_teacher);
            rightArrow = itemView.findViewById(R.id.right_arrow);
            leftArrow = itemView.findViewById(R.id.left_arrow);
            selectTeacherName = itemView.findViewById(R.id.select_course_teacher);
            addTeacherLayout = itemView.findViewById(R.id.add_teacher_layout);
            itemLayout = itemView.findViewById(R.id.course_item_layout);
            deleteCourse = itemView.findViewById(R.id.delete_course);
            deleteCancel = itemView.findViewById(R.id.delete_cancel);
            deleteCancelLayout = itemView.findViewById(R.id.course_delete_cancel_layout);


        }





    }

}

