package com.example.vidyarthirecruiter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BranchDash extends AppCompatActivity {

    Button cs,is,ec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_dash);
        cs = findViewById(R.id.cse);
        is = findViewById(R.id.ise);
        ec = findViewById(R.id.ece);


        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlbit = "?branch=CSE";
                Intent i  = new Intent(BranchDash.this,SectionDash.class);
                        i.putExtra("urlbit",urlbit);
                startActivity(i);
            }
        });

        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlbit = "?branch=ISE";
                Intent i  = new Intent(BranchDash.this,SectionDash.class);
                i.putExtra("urlbit",urlbit);
                startActivity(i);
            }
        });

        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlbit = "?branch=ECE";
                Intent i  = new Intent(BranchDash.this,SectionDash.class);
                i.putExtra("urlbit",urlbit);
                startActivity(i);
            }
        });
    }
}