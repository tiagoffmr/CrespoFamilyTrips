package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class NewDestinyActivity extends AppCompatActivity {

    Context mContext;

    EditText mEtForDestinyInput;
    NumberPicker mNpForNumberOfDaysInput;
    Button mBtnToGoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_destiny);

        SQLiteDatabase db = openOrCreateDatabase("CrespoTrips",MODE_PRIVATE,null);
        final DBUtils dbU = new DBUtils(this);
        dbU.onCreate(db);

        init();

        mBtnToGoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbU.Insert_Destination(0,String.valueOf(mEtForDestinyInput.getText()), mNpForNumberOfDaysInput.getValue());

                Intent i = new Intent(NewDestinyActivity.this, DestinationsConfig.class);
                startActivity(i);
            }
        });

    }

    //onCreate

    void init() {
        mContext = this;
        mEtForDestinyInput = findViewById(R.id.idEtForDestinyInput);
        mNpForNumberOfDaysInput = findViewById(R.id.idNpForNumberOfDaysInput);
        mBtnToGoNext = findViewById(R.id.idBtnToGoNext);
    }
}