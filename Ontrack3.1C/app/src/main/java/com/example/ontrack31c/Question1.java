package com.example.ontrack31c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    // global variables
    int points = 0;
    boolean submitted = false;
    int green = Color.parseColor("#99cc00");
    int red = Color.parseColor("#FC0000");

    //content  variables
    Button button1;
    Button button2;
    Button button3;

    //a1 (Correct)
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
            Toast.makeText(Question1.this, "Error Please Select Answer First", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(this, Question2.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        //calling on create to show before load of activity
        TextView questnumb = findViewById(R.id.questnumb);
        TextView welcotext = findViewById(R.id.welcotext);
        // adding passed data from previous activity
        Intent gintent = getIntent();
        String username = gintent.getStringExtra("username");
        //setting ui elements before load of activity
        welcotext.setText("Welcome " + username + "!");
        questnumb.setText("1/5");

        button1 = findViewById(R.id.a1);
        button2 = findViewById(R.id.a2);
        button3 = findViewById(R.id.a3);

    }
}