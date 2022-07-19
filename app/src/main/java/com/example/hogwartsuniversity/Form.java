package com.example.hogwartsuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.Normalizer;

public class Form extends AppCompatActivity {

    EditText userFname, userLname, userEmail, userPsw;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
//        this.setTitle("Form");

        Log.d("FormTAG", "Form's onCreate: ");
        userFname = findViewById(R.id.txt_formFirstName);
        userLname = findViewById(R.id.txt_formLastName);
        userEmail = findViewById(R.id.txt_formEmail);
        userPsw = findViewById(R.id.txt_formPassword);
        nextBtn = findViewById(R.id.btn_next);

        buildUI();


        }

    private void buildUI() {
        nextBtn.setOnClickListener(v -> {
                try {
                    startActivity(new Intent(getApplicationContext(), Personal_Information.class));
                }
                catch (Exception e){
                    Log.d("TAG1", "onCreate: "+e.getMessage());
                    Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
    );
    }


}

//    public void btnClickForm(View v){
//        Log.d("tag", "btnClickForm: Form");
//        Intent nextInfo = new Intent(getApplicationContext(), Personal_Information.class);
//        startActivity(nextInfo);
//        Toast.makeText(this, "Yes", Toast.LENGTH_SHORT).show();
//
//
//    }


