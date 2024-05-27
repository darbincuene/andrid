package com.greisy.ejemplobasedatos.controller;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.greisy.ejemplobasedatos.R;
import com.greisy.ejemplobasedatos.model.BdHelper;
import com.greisy.ejemplobasedatos.model.Managerdb;

public class MainActivity extends AppCompatActivity {
    Managerdb managerdb;
    SQLiteDatabase bd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        managerdb = new Managerdb(MainActivity.this);
        long resul = managerdb.insertardatos2();

        if (resul < 0) {
            Toast.makeText(this, "no inserto" , Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"base de datos creada con exito", Toast.LENGTH_SHORT).show();
        }

    }
}