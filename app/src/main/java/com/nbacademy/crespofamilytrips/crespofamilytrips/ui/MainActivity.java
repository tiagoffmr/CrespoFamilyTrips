package com.nbacademy.crespofamilytrips.crespofamilytrips.ui;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nbacademy.crespofamilytrips.crespofamilytrips.R;
import com.nbacademy.crespofamilytrips.crespofamilytrips.logic.DBUtils;

public class MainActivity extends AppCompatActivity {
    DBUtils dbutils;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbutils.onCreate(db);
        setContentView(R.layout.activity_main);

    }
}
