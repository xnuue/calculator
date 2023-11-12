package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class converter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        RadioButton radioCel = findViewById(R.id.radioButton);
        RadioButton radioFah = findViewById(R.id.radioButton2);
        RadioGroup rgVal = findViewById(R.id.radioGroup);
        TextView ans = findViewById(R.id.textView7);
        Button log = findViewById(R.id.button6);
        Button cal = findViewById(R.id.button5);
        EditText txt = findViewById(R.id.num);
        Button clr = findViewById(R.id.button7);

        cal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try{
                    if (radioCel.isChecked()) {
                        String n1 = txt.getText().toString();
                        double v1 = Double.parseDouble(n1);
                        double result = (v1 * 9/5) + 32;

                        Toast.makeText(getApplicationContext(), "Answer is: " + result, Toast.LENGTH_LONG). show();
                        ans.setText("Answer: "+ result);
                        ans.setVisibility(View.VISIBLE);
                    }
                    else if (radioFah.isChecked()) {
                        String n1 = txt.getText().toString();
                        double v1 = Double.parseDouble(n1);
                        double result = (v1 - 32) * 5/9;

                        Toast.makeText(getApplicationContext(), "Answer is: " + result, Toast.LENGTH_LONG). show();
                        ans.setText("Answer: "+ result);
                        ans.setVisibility(View.VISIBLE);
                    }
                } catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "invalid, pare.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                logout();
            }
        });
        clr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                radioCel.setChecked(false);
                radioFah.setChecked(false);
                txt.setText("");
                ans.setVisibility(View.GONE);
            }
        });
    }
    private void logout(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}