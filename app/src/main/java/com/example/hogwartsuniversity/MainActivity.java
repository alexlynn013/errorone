package com.example.hogwartsuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart01 = findViewById(R.id.btn_startForm);

    }

    public void btnClickStart(View v){

        Intent i = new Intent(MainActivity.this , Form.class );
        Log.d("TAG", "btnClickStart: ");

        startActivity(i);


    }

}