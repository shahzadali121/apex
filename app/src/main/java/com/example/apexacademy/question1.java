package com.example.apexacademy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class question1 extends AppCompatActivity {

    Button btn,btn2,btn3;
    RadioButton R1,R2,b1,b2,C1,C2;
    int Score = 0;
    RatingBar bar;
    TextView ratings;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_question1);
        btn = findViewById(R.id.next);
        R1 = findViewById(R.id.oprtion1);
        R2 = findViewById(R.id.oprtion2);
        b1 = findViewById(R.id.oprtion3);
        b2 = findViewById(R.id.oprtion4);
        btn2 = findViewById(R.id.next2);
        C1 = findViewById(R.id.oprtion5);
        C2 = findViewById(R.id.oprtion6);
        btn3 = findViewById(R.id.next3);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R1.isChecked()==false && R2.isChecked()==false)
                {
                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();

                }if (R1.isChecked()==true || R2.isChecked()==true) {
//                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();
                    if(R1.isChecked() == true)
                    {
                        ++Score;
                        Toast.makeText(getApplicationContext(),String.valueOf(Score),Toast.LENGTH_LONG).show();
                        //Intent(question1.this,)
                    }
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.isChecked()==false && b2.isChecked()==false)
                {
                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();

                }if (b1.isChecked()==true || b2.isChecked()==true) {
//                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();
                    if(b1.isChecked() == true)
                    {
                        ++Score;
                        Toast.makeText(getApplicationContext(),String.valueOf(Score),Toast.LENGTH_LONG).show();
                        //Intent(question1.this,)
                    }
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (C1.isChecked()==false && C2.isChecked()==false)
                {
                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();

                }if (C1.isChecked()==true || C2.isChecked()==true) {
//                    Toast.makeText(question1.this,"Choice your answer",Toast.LENGTH_LONG).show();
                    if(C1.isChecked() == true)
                    {
                        ++Score;
                        Toast.makeText(getApplicationContext(),String.valueOf(Score),Toast.LENGTH_LONG).show();
                        //Intent(question1.this,)
                        Intent Move = new Intent(question1.this, question2.class);
                        startActivity(Move);
                        Toast.makeText(getApplicationContext(),"Next Page", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }



       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
}
