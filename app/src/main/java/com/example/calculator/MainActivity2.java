package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button addbtn = findViewById(R.id.btnAdd);
        Button subbtn = findViewById(R.id.btnSub);
        Button mulbtn = findViewById(R.id.btnMul);
        Button divbtn = findViewById(R.id.btnDiv);

        addbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openAddition();
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                openSubtraction();
            }
        });
    }
    private void openAddition(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void openSubtraction(){
        Intent intent = new Intent(this, subtraction.class);
        startActivity(intent);
    }
}