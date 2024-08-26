package com.example.apexacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText uname =findViewById(R.id.Username);
        Button btn = findViewById(R.id.btn2);
        EditText password =findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(uname.getText().toString().trim().isEmpty())
                {
                    uname.setError("Username is required");
                }
                if(password.getText().toString().trim().isEmpty())
                {
                    password.setError("Password is required");
                }

                if(uname.getText().toString().equals("admin") && password.getText().toString().equals("adminn") )
                {
                    ProgressBar bar=findViewById(R.id.pbar);
                    bar.setVisibility(View.VISIBLE);
                    Intent Move =new Intent(MainActivity.this, homepage.class);
                    startActivity(Move);
                    Toast.makeText(getApplicationContext(), "login successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Invalid Input Try again...", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
