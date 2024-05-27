package com.greisy.ejemplobasedatos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.greisy.ejemplobasedatos.model.Managerdb;

public class Datos extends AppCompatActivity {
    Button botondatos;
    Managerdb managerdb;
    EditText codigociudad, nombreciudad;
    String codigo, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_datos);
        EdgeToEdge.enable(this);
        botondatos=findViewById(R.id.insertar);
        codigociudad=findViewById(R.id.codigo);
        nombreciudad=findViewById(R.id.nombre);
        managerdb= new Managerdb(Datos.this);
        botondatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codigo=codigociudad.getText().toString();
                nombre=nombreciudad.getText().toString();
                long result = managerdb.insertDatos(codigo,nombre);
                if(result<0){
                    Toast.makeText(Datos.this, "datos no insertados", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Datos.this, "datos insertados", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}