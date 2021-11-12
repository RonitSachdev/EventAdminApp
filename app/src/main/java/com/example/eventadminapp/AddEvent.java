package com.example.eventadminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddEvent extends AppCompatActivity {
    String eventname,eventdate,eventinfo;
    EditText ename,edate,einfo;
    Button addEventButton;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        ename = findViewById(R.id.eventName);
        edate = findViewById(R.id.eventDate);
        einfo = findViewById(R.id.eventInfo);
        addEventButton = findViewById(R.id.eventAddBtnInside);


        addEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("events");

                eventname = ename.getText().toString();
                eventdate = edate.getText().toString();
                eventinfo = einfo.getText().toString();
                EventHelperClass helperClass = new EventHelperClass(eventname, eventdate, eventinfo);
                reference.child(eventname).setValue(helperClass);

            }
        });
    }
}