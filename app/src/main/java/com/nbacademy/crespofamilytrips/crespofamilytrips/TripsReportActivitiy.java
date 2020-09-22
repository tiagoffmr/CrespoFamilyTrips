package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class TripsReportActivitiy extends AppCompatActivity {

    Context mContext;

    Spinner mSpToSelectTrip, mSpToSelectDestination, mSpToSelectDay;
    TextView mTvForReportResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trips_report);

        init();
    }//onCreate

    void init(){
        mContext = this;

        mSpToSelectTrip = findViewById(R.id.idSpToSelectTrip);
        mSpToSelectDestination = findViewById(R.id.idSpToSelectDestination);
        mSpToSelectDay = findViewById(R.id.idSpToSelectCategory);
        mTvForReportResults = findViewById(R.id.idTvForReportResults);
    }//init
}