package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import com.nbacademy.crespofamilytrips.crespofamilytrips.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class newTrip extends AppCompatActivity {
    Context mContext;

    TextView idTripName, idStartDate, idEndDate, idNumberOfTravellers;
    EditText idTripNameInput , startDay , startMonth , startYear , endDay , endMonth , endYear , nrTrav;
    Button nextB;
    String[] tripInfo = new String[] {"", "", "" , ""}; //NOME ,DATAT INICIO, DAATA FIM ,NR PESSOAS



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);

        SQLiteDatabase db = openOrCreateDatabase("CrespoTrips",MODE_PRIVATE,null);
        final DBUtils dbU = new DBUtils(this);
        dbU.onCreate(db);

        init();

        nextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String startAux  = startDay.getText() + "-" + startMonth.getText()+ "-" + startYear.getText();
                String endAux  = endDay.getText() + "-" + endMonth.getText()+ "-" + endYear.getText();

                dbU.Insert_trip(String.valueOf(idTripNameInput.getText()) , Integer.parseInt(idNumberOfTravellers.getText().toString()) , startAux);

                Intent i = new Intent(newTrip.this, DestinationsConfig.class);
                startActivity(i);
            }
        });

    }

    void init(){
        mContext = this;
        idTripName = findViewById(R.id.idTripName);
        idStartDate = findViewById(R.id.idStartDate);
        idEndDate = findViewById(R.id.idEndDate);
        idNumberOfTravellers = findViewById(R.id.idNumberOfTravellers);
        nrTrav = findViewById(R.id.idNumberOfTravellersInput);
        idTripNameInput = findViewById(R.id.idTripNameInput);
        startDay = findViewById(R.id.startDayPicker);
        startMonth = findViewById(R.id.startMonthPicker);
        startYear = findViewById(R.id.startYearPicker);
        endDay = findViewById(R.id.endDayPicker);
        endMonth = findViewById(R.id.endMonthPicker);
        endYear = findViewById(R.id.endYearPicker);
        nextB = findViewById(R.id.idBtnToGoNext2);
    }



}