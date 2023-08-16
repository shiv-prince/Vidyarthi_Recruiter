package com.example.vidyarthirecruiter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SectionDash extends AppCompatActivity {

    Button secA,secB,secC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_dash);

        Intent frombranch = getIntent();
        String secBit = frombranch.getStringExtra("urlbit");

        secA  = (Button) findViewById(R.id.secA);
        secB  = (Button) findViewById(R.id.secB);
        secC  = (Button) findViewById(R.id.secC);
        if(secBit.equals("?branch=ECE") || secBit.equals("?branch=ISE")){
            secC.setVisibility(View.GONE);
        }
        secA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sec= secBit+"&section=A";
                Intent i = new Intent(SectionDash.this,MainActivity.class);
                i.putExtra("section",sec);
                startActivity(i);
            }
        });
        secB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sec= secBit+"&section=B";
                Intent i = new Intent(SectionDash.this,MainActivity.class);
                i.putExtra("section",sec);
                startActivity(i);
            }
        });
        secC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sec= secBit+"&section=C";
                Intent i = new Intent(SectionDash.this,MainActivity.class);
                i.putExtra("section",sec);
                startActivity(i);
            }
        });
    }
}