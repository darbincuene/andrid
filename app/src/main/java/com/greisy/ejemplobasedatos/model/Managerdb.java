package com.greisy.ejemplobasedatos.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Managerdb {

    //declarar mi conexion

    BdHelper bdHelper;
    SQLiteDatabase bd;

    BdHelper bdHelper2;
    SQLiteDatabase bd2;

    public  Managerdb(Context context){
        bdHelper = new BdHelper(context);

    }

    //metodo que abre mi base de datos modo escritura
    public void  openbDwr(){
        bd=bdHelper.getWritableDatabase();
    }
    //metodo que habre mi base de datos modo lectura
    public  void openbDr(){
        bd=bdHelper.getReadableDatabase();
    }

    public  long insertDatos(){
        //llamamos la base de datos el metodo

        openbDwr(); //pasi 1 abro la base de datos modo lectura

        ContentValues values= new ContentValues();
        values.put("cod","1");
        values.put("nombre", "morales");
        long resul=bd.insert("ciudad", null,values);

        return  resul;
    }

    public  long insertardatos2(){

        openbDwr();
        ContentValues values = new ContentValues();
        values.put("cod","2");
        values.put("nombre","lionel");
        values.put("apellido","messi");
        values.put("edad",36);
        values.put("correo","messi23@gmail.com");
        values.put("telefono","3163221524");
        long resultado=bd.insert("Datos",null,values);

        return resultado;
    }
}
