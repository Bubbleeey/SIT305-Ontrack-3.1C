package com.example.ontrack31c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {

    // global variables
    int points;
    String username;
    boolean submitted = false;
    int green = Color.parseColor("#99cc00");
    int red = Color.parseColor("#FC0000");

    //content  variables
    Button button1;
    Button button2;
    Button button3;

    //a1 correct
    public void button1 (View view)
    {
        submitted = true;
        button1.setBackgroundColor(green);
        points++;

    }

    //a2
    public void button2 (View view)
    {
        submitted = true;
        button2.setBackgroundColor(red);
        button1.setBackgroundColor(green);
    }

    //a3
    public void button3 (View view)
    {
        submitted = true;
        button3.setBackgroundColor(red);
        button1.setBackgroundColor(green);
    }

    //submit button function
    public void jumpClick(View view) {
        //checks to make sure the user actully selected an option
        if (submitted == false) {
            Toast.makeText(Question3.this, "Error Please Select Answer First", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, Question4.class);
            intent.putExtra("points", points);
            intent.putExtra("username", username);
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        //calling on create to show before load of activity
        TextView questnumb = findViewById(R.id.questnumb);
        // adding passed data from previous activity
        Intent gintent = getIntent();
        username = gintent.getStringExtra("username");
        points = gintent.getIntExtra("points", 0);
        //setting ui elements before load of activity
        questnumb.setText("3/5");
        //setting progress bar
        ProgressBar quest = (ProgressBar) findViewById(R.id.progressBar);
        quest.setMax(5);
        quest.setProgress(3);

        button1 = findViewById(R.id.a1);
        button2 = findViewById(R.id.a2);
        button3 = findViewById(R.id.a3);
    }
}