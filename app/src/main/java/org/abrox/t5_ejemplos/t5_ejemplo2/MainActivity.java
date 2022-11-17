package org.abrox.t5_ejemplos.t5_ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.abrox.t5_ejemplos.t5_ejemplo2.domain.Persona;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirVentana(View view) {
        Intent i = new Intent(this, SecondaryActivity.class);
        EditText etName = (EditText) findViewById(R.id.etName);
        EditText etEdad = (EditText) findViewById(R.id.etAge);

        String nombre = !etName.getText().toString().equals("") ? etName.getText().toString() : "NO HAY NADA";
        int edad = Integer.parseInt(etEdad.getText().toString());

        Persona persona = new Persona(nombre,edad);
        i.putExtra("persona",persona);
        startActivity(i);
    }


}