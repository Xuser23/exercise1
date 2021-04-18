package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText inEmail, inPass;
    TextView register;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inEmail = findViewById(R.id.lEmail);
        inPass = findViewById(R.id.lPass);
        btnSignIn = findViewById(R.id.btnSignIn);
        register = findViewById(R.id.txtReg);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

        public void onClick(View view) {
            Intent in = new Intent(getApplicationContext(),SignUpActivity.class);

            startActivity(in);
        }
}