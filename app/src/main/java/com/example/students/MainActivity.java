package com.example.students;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomAdapter adapter;
    private static final String LOG_TAG = "STUDENTS";
    private final Student[] allStudents = Students.getAllStudents();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Orange", allStudents.toString());

        // Want to update the Adapters data when coming back from the child activity
        RecyclerView recyclerView = findViewById(R.id.rvStudents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(this,Arrays.asList(allStudents));
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(new CustomAdapter.ItemClickListener() {

            //@Override
            public void onItemClick(View view, int position) {
                Student student = adapter.getItem(position);
                Log.d(LOG_TAG, "Clicked " + position + " " + adapter.getItemId(position) + " " + student);
                Intent intent = new Intent(getBaseContext(), AnotherActivity.class);
                intent.putExtra(AnotherActivity.STUDENT, student );
                startActivity(intent);
            }
        });
    }


    public void getdetailsstudent(View view, int position) {
        Student student = adapter.getItem(position);
        Intent intent = new Intent(this, AnotherActivity.class);
        intent.putExtra(AnotherActivity.STUDENT, student);
        startActivity(intent);
    }
}