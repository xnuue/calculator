package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button4 = findViewById(R.id.button4);
        EditText et1 = findViewById(R.id.editTextText);
        EditText et2 = findViewById(R.id.editTextTextPassword);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT);
            }
        });
    }
}