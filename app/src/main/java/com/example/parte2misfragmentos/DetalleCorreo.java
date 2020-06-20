package com.example.parte2misfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView midetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        Bundle midato = getIntent().getExtras();
        midetalle = findViewById(R.id.TxtDetalle);
        midetalle.setText("De: "+midato.getString("de")+" Asunto: "+midato.getString("asunto")+
                " contenido: "+midato.getString("texto"));
    }
}