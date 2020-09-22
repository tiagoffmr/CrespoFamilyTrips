package com.nbacademy.crespofamilytrips.crespofamilytrips.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.nbacademy.crespofamilytrips.crespofamilytrips.R;

public class NewTrip extends AppCompatActivity {
    Context mContext;

    TextView idTripName, idStartDate, idEndDate, idNumberOfTravellers;
    EditText idTripNameInput;
    DatePicker idStartDateInput, idEndDateInput;
    NumberPicker idNumberOfTravellersInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);

        init();
    }

    void init(){
        mContext = this;
        idTripName = findViewById(R.id.idTripName);
        idStartDate = findViewById(R.id.idStartDate);
        idEndDate = findViewById(R.id.idEndDate);
        idNumberOfTravellers = findViewById(R.id.idNumberOfTravellers);
        idNumberOfTravellersInput = findViewById(R.id.idNumberOfTravellersInput);
        idTripNameInput = findViewById(R.id.idTripNameInput);
        idStartDateInput = findViewById(R.id.idStartDateInput);
        idEndDateInput = findViewById(R.id.idEndDateInput);



    }
}