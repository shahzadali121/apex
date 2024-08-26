package com.example.apexacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class homepage extends AppCompatActivity {
    ImageView q;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        ImageView q= findViewById(R.id.quiz);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View q) {
                Intent Move = new Intent(homepage.this, question1.class);
                startActivity(Move);

            }
        });





    }
}