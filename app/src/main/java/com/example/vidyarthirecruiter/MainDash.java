package com.example.vidyarthirecruiter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDash extends AppCompatActivity {

    Button AIT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dash);

        AIT = (Button)findViewById(R.id.AIT);
        AIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDash.this,BranchDash.class);
                startActivity(intent);
                finish();
            }
        });
    }
}