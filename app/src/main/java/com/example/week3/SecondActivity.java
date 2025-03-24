package com.example.week3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;



public class SecondActivity extends AppCompatActivity {
    EditText teacher_fix;
    Button btn_fixed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Find view by ID
        teacher_fix = findViewById(R.id.paragraph_editText);
        btn_fixed = findViewById(R.id.corrected_Button);
        Intent myIntent = getIntent();
        String paragraph_received = myIntent.getStringExtra("student_write");
        teacher_fix.setText(paragraph_received);
        btn_fixed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String teacher_type = teacher_fix.getText().toString();
                myIntent.putExtra("fixed", teacher_type);
                setResult(33, myIntent);
                finish();
            }
        });
    }
}