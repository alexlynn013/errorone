package com.example.hogwartsuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class Personal_Information extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5;

    Spinner spinnerChar;
    List<String> charList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information);
        getSupportActionBar().setTitle("Personal Information");

        ch1 = findViewById(R.id.checkb1);
        ch2 = findViewById(R.id.checkb2);
        ch3 = findViewById(R.id.checkb3);
        ch4 = findViewById(R.id.checkb4);
        ch5 = findViewById(R.id.checkb5);

        spinnerChar = findViewById(R.id.spinChar);

        charList.add("Dumbledore");
        charList.add("Dumbledore");
        charList.add("Dumbledore");
        charList.add("Dumbledore");
        charList.add("Dumbledore");
        charList.add("Dumbledore");

        ArrayAdapter<String> charAdapter = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,charList);
        spinnerChar.setAdapter(charAdapter);

        spinnerChar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected "+
                        charList.get(position), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected (AdapterView <?> parent){

            }
        });





    }
}