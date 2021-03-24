package com.example.ontrack31c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;

    public void jumpClick (View view)
    {
        Intent intent = new Intent(this, Question1.class);
        intent.putExtra("username", username.getText().toString());
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.nameinput);
    }
}