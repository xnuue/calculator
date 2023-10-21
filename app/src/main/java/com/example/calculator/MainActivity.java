package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.btnAdd);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button subtract = findViewById(R.id.btnSub);
        Button multiply = findViewById(R.id.btnMul);
        Button divide = findViewById(R.id.btnDiv);

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        EditText editTextNumber3 = findViewById(R.id.editTextNumber3);
        TextView tv = findViewById(R.id.textView3);
        tv.setVisibility(View.GONE);


        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               try{
                   String n1 = editTextNumber.getText().toString();
                   String n2 = editTextNumber3.getText().toString();

                   int v1 = Integer.parseInt(n1);
                   int v2 = Integer.parseInt(n2);
                   int r = v1 + v2;

                   Toast.makeText(getApplicationContext(), "Answer is: " + r, Toast.LENGTH_LONG). show();
                   tv.setText("Answer: "+ r);
                   tv.setVisibility(View.VISIBLE);

               } catch (NumberFormatException e){
                   Toast.makeText(getApplicationContext(), "invalid, pare.", Toast.LENGTH_SHORT).show();
               }
           }
        });
        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    String n1 = editTextNumber.getText().toString();
                    String n2 = editTextNumber3.getText().toString();

                    int v1 = Integer.parseInt(n1);
                    int v2 = Integer.parseInt(n2);
                    int r = v1 - v2;
                    Toast.makeText(getApplicationContext(), "Answer is: " + r, Toast.LENGTH_LONG).show();
                    tv.setText("Answer: " + r);
                    tv.setVisibility(View.VISIBLE);
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "invalid, pare.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    String n1 = editTextNumber.getText().toString();
                    String n2 = editTextNumber3.getText().toString();

                    int v1 = Integer.parseInt(n1);
                    int v2 = Integer.parseInt(n2);
                    int r = v1 * v2;
                    Toast.makeText(getApplicationContext(), "Answer is: " + r, Toast.LENGTH_LONG).show();
                    tv.setText("Answer: " + r);
                    tv.setVisibility(View.VISIBLE);
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "invalid, pare.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try {
                    String n1 = editTextNumber.getText().toString();
                    String n2 = editTextNumber3.getText().toString();

                    int v1 = Integer.parseInt(n1);
                    int v2 = Integer.parseInt(n2);
                    int r = v1 / v2;
                    Toast.makeText(getApplicationContext(), "Answer is: " + r, Toast.LENGTH_LONG).show();
                    tv.setText("Answer: " + r);
                    tv.setVisibility(View.VISIBLE);
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "invalid, pare.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                editTextNumber3.setText("");
                editTextNumber.setText("");
                tv.setVisibility(View.GONE);
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