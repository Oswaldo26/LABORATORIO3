package com.example.constrainlayaout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      Button btnRegistro = findViewById(R.id.btnRegistro);
      Button btnInfo = findViewById(R.id.btnInfo);


          btnRegistro.setOnClickListener(this);


          btnInfo.setOnClickListener(this);






    }


    @Override
    public void onClick(View view) {
        Intent intentRegistro = new Intent(this, ActivityPostulanteRegistro.class);
        startActivity(intentRegistro);
    }
}