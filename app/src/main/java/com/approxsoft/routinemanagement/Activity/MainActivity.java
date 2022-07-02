package com.approxsoft.routinemanagement.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
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

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

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
    EditText teacherShortName, teacherFullName;
    Button teacherNameSubmitBtn;

    DatabaseReference reference;

    ///---------- for routine ----------///
    TextView routineOpenBtn;


    private final File filePath = new File(Environment.getExternalStorageDirectory() + "/Demo.xls");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reference = FirebaseDatabase.getInstance().getReference().child("Department Of CSE And CSIT");

        mAuth = FirebaseAuth.getInstance();

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);


        loginBtn = findViewById(R.id.log_in);
        Password = findViewById(R.id.password);
        signInPageLayout = findViewById(R.id.sign_in_page_layout);

        homeLayout = findViewById(R.id.home_layout);
        courseOffer = findViewById(R.id.home_course_offer_btn);
        createRoutine = findViewById(R.id.home_create_routine_btn);

        teacherFullName = findViewById(R.id.home_teacher_full_name);
        teacherShortName = findViewById(R.id.home_teacher_short_name);
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



                if (!teacherFullName.getText().toString().equals(""))
                {
                    if (!teacherShortName.getText().toString().equals(""))
                    {
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("FullName",teacherFullName.getText().toString());
                        map.put("ShortName",teacherShortName.getText().toString());
                        reference.child("TeacherShortName").child(teacherShortName.getText().toString()).updateChildren(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful())
                                {
                                    teacherFullName.setText("");
                                    teacherFullName.setHint("Successfully stored");
                                    teacherFullName.setHintTextColor(Color.rgb(255,255,255));

                                    teacherShortName.setText("");
                                    teacherShortName.setHint("Write teacher short name");
                                    teacherShortName.setHintTextColor(Color.argb(44,255,255,255));
                                }

                            }
                        });
                    }
                    else
                    {
                        teacherShortName.setHint("teacher short name");
                        teacherShortName.setHintTextColor(Color.RED);
                    }
                }
                else
                {
                    teacherFullName.setHint("White a teacher short name");
                    teacherFullName.setHintTextColor(Color.RED);
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