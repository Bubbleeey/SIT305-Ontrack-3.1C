package com.example.ontrack31c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Question4 extends AppCompatActivity {

    public void jumpClick (View view)
    {
        Intent intent = new Intent(this, Question5.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }
}