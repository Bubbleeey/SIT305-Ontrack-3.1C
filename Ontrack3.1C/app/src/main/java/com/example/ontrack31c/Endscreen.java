package com.example.ontrack31c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Endscreen extends AppCompatActivity {
    // global variables
    int points;
    String pointsfinal;
    String username;

    public void jumpClick (View view)
    {
        Intent intent = new Intent(this, Question1.class);
        intent.putExtra("username", username);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endscreen);
        // adding passed data from previous activity
        TextView endtext = findViewById(R.id.endtext);
        TextView score = findViewById(R.id.score);
        Intent gintent = getIntent();
        username = gintent.getStringExtra("username");
        points = gintent.getIntExtra("points", 0);
        endtext.setText("Congratulations " + username + "!");
        pointsfinal = String.valueOf(points);
        score.setText(pointsfinal + "/5");
    }
}