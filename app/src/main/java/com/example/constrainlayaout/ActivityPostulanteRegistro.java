package com.example.constrainlayaout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityPostulanteRegistro extends AppCompatActivity implements View.OnClickListener {
    EditText editTextDNI,editTextNombre,editTextApellido,editTextColegio,editTextCarrera,editTextNac;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);
        btnRegistrar = findViewById(R.id.buttonRegistar);
        editTextDNI = findViewById(R.id.editTextDNIReg);
        editTextNombre = findViewById(R.id.editTextNombreReg);
        editTextApellido = findViewById(R.id.editTextApellidoReg);
        editTextNac = findViewById(R.id.editTextDateNaciemientoReg);
        editTextColegio = findViewById(R.id.editTextCoelgioReg);
        editTextCarrera = findViewById(R.id.editTextCarreraReg);

        btnRegistrar.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        String dni = editTextDNI.getText().toString();
        String nombre = editTextNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();
        String nac = editTextNac.getText().toString();
        String colegio = editTextColegio.getText().toString();
        String carrera = editTextCarrera.getText().toString();

        if(!dni.isEmpty()){
            Intent intentInfo = new Intent(this, ActivityPostulanteInfo.class);
            intentInfo.putExtra("DNI", dni);
            startActivity(intentInfo);
        }
    }
}