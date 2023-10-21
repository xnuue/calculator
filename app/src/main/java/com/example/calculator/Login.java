package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        Button button = findViewById(R.id.button);
        Button button4 = findViewById(R.id.button4);
        EditText et1 = findViewById(R.id.editTextText);
        EditText et2 = findViewById(R.id.editTextTextPassword);



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_SHORT). show();
                    openLogin();
                } else
                    Toast.makeText(getApplicationContext(), "Wrong user or pass!", Toast.LENGTH_SHORT). show();
                    et1.setText("");
                    et2.setText("");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                System.exit(0);
            }
        });
    }
    private void openLogin(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}