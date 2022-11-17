package org.abrox.t5_ejemplos.t5_ejemplo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.abrox.t5_ejemplos.t5_ejemplo2.domain.Persona;

public class SecondaryActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_secondary);

            Persona persona = (Persona)(getIntent().getSerializableExtra("persona"));

            Toast.makeText(SecondaryActivity.this, "El nombre es " + persona.getNombre() + " su edad es " + persona.getEdad(), Toast.LENGTH_LONG).show();


        }


    }
