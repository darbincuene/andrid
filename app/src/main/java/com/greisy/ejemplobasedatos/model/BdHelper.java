package com.greisy.ejemplobasedatos.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

//extender de sqliteopenhelperr heredamos de la clase sqlite
public class BdHelper extends SQLiteOpenHelper  {
    public BdHelper(@Nullable Context context) {
        super(context, constantes.NOM_BD, null, constantes.VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(constantes.SENTENCIATABLA);
        db.execSQL(constantes.SENTENCIATABLA2);

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
