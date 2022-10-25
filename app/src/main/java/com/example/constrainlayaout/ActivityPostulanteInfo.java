package com.example.constrainlayaout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityPostulanteInfo extends AppCompatActivity implements View.OnClickListener {

    ListView lista;
    List<String> listaUsario;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_info);
        Bundle extras = getIntent().getExtras();
        String dniUsuario = extras.getString("DNI");

        lista = findViewById(R.id.listInfo);

        listaUsario = new ArrayList<>();
        listaUsario.add(dniUsuario);

        ArrayAdapter adapterListaUsuarios = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,
                listaUsario
        );

        lista.setAdapter(adapterListaUsuarios);
        btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent intentLogin = new Intent(this, MainActivity.class);
        startActivity(intentLogin);
    }
}