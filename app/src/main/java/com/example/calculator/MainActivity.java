package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        EditText editTextNumber3 = findViewById(R.id.editTextNumber3);



        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               String n1 = editTextNumber.getText().toString();
               String n2 = editTextNumber3.getText().toString();
               try{
                   int v1 = Integer.parseInt(n1);
                   int v2 = Integer.parseInt(n2);
                   int r = v1 + v2;

                   Toast.makeText(getApplicationContext(), "Answer is: " + r, Toast.LENGTH_LONG). show();

               } catch (NumberFormatException e){
                   Toast.makeText(getApplicationContext(), "ang dami!", Toast.LENGTH_SHORT).show();
               }
           }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                editTextNumber3.setText("");
                editTextNumber.setText("");
            }
        });
        button3.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View view){
                Toast.makeText(getApplicationContext(), "Goodbye!", Toast.LENGTH_SHORT). show();
                System.exit(0);
                return true;
            }
        });
    }
}