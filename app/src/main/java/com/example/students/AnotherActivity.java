package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    public static final String STUDENT = "student";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        //make Intent
        Intent intent = getIntent();
        Student student= (Student) intent.getSerializableExtra(STUDENT);
        TextView studentView = findViewById(R.id.anotherStudentTextView);
        studentView.setText(student.toString());
    }
}