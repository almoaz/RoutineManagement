package com.approxsoft.routinemanagement.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.approxsoft.routinemanagement.Activity.CourseOfferActivity;
import com.approxsoft.routinemanagement.R;
import com.approxsoft.routinemanagement.RoutineFile.Routine;
import com.approxsoft.routinemanagement.RoutineFile.RoutineCheck;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    ///--------- for log in ---------- ///
    TextView loginBtn;
    EditText Password;
    FirebaseAuth mAuth;
    LinearLayout signInPageLayout;

    ///----------for Home ------------///
    LinearLayout homeLayout;
    TextView courseOffer, createRoutine;

    ///--------- for teacher ---------///
    EditText teacherName;
    Button teacherNameSubmitBtn;

    DatabaseReference reference;

    ///---------- for routine ----------///
    TextView routineOpenBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reference = FirebaseDatabase.getInstance().getReference().child("Department Of CSE And CSIT");

        mAuth = FirebaseAuth.getInstance();


        loginBtn = findViewById(R.id.log_in);
        Password = findViewById(R.id.password);
        signInPageLayout = findViewById(R.id.sign_in_page_layout);

        homeLayout = findViewById(R.id.home_layout);
        courseOffer = findViewById(R.id.home_course_offer_btn);
        createRoutine = findViewById(R.id.home_create_routine_btn);

        teacherName = findViewById(R.id.home_teacher_name_text);
        teacherNameSubmitBtn = findViewById(R.id.teacher_name_submit_btn);

        routineOpenBtn = findViewById(R.id.home_routine_open_btn);


        courseOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CourseOfferActivity.class);
                startActivity(intent);
            }
        });

        createRoutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoutineActivity.class);
                startActivity(intent);
            }
        });

        routineOpenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RoutineShowActivity.class);
                startActivity(intent);
            }
        });

        Handler handler = new Handler(getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this,"Handler Work",Toast.LENGTH_SHORT).show();
            }
        },10000);

        teacherNameSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!teacherName.getText().toString().equals(""))
                {
                    reference.child("TeacherShortName").child(teacherName.getText().toString()).child("ShortName").setValue(teacherName.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful())
                            {
                                teacherName.setText("");
                                teacherName.setHint("Write teacher short name");
                                teacherName.setHintTextColor(Color.argb(44,255,255,255));
                            }

                        }
                    });
                }
                else
                {
                    teacherName.setHint("White a teacher short name");
                    teacherName.setHintTextColor(Color.RED);
                }
            }
        });




        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Password.getText().toString().equals("12345"))
                {
                    mAuth.signInWithEmailAndPassword("smuctcseandcsit@gmail.com","1234567890").addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task)
                        {
                            if (task.isSuccessful())
                            {
                                signInPageLayout.setVisibility(View.GONE);
                                homeLayout.setVisibility(View.VISIBLE);

                            }
                        }
                    });

                }else
                {
                    Password.setText("");
                    Password.setHint("Password Incorrect");
                    Password.setHintTextColor(Color.RED);
                }
            }
        });


    }
}