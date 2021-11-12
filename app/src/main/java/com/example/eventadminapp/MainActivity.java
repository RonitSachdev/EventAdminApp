package com.example.eventadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button AddEventButton,StudentRegisteredButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddEventButton = findViewById(R.id.addeventBtn);
        StudentRegisteredButton = findViewById(R.id.registeredBtn);

        AddEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddEvent.class);
                startActivity(intent);
            }
        });

        StudentRegisteredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StudentRegistered.class);
                startActivity(intent);
            }
        });


    }
}