package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Context mContext;
    Button mBtnMyTrips, mBtnReports, mBtnAddExpenses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       init();
    }//onCreate

    void init(){
        mContext = this;
        mBtnMyTrips = findViewById(R.id.idLlBtnMyTrips);
        mBtnReports = findViewById(R.id.idLlBtnReports);
        mBtnAddExpenses = findViewById(R.id.idLlBtnAddExpenses);

        mBtnMyTrips.setOnClickListener(mButtonClickHandler);
        mBtnReports.setOnClickListener(mButtonClickHandler);
        mBtnAddExpenses.setOnClickListener(mButtonClickHandler);

    }//init

    Button.OnClickListener mButtonClickHandler = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.idLlBtnMyTrips: goToMyTripsActivity();break;
                //case R.id.idLlBtnReports: goToReports();break;
               // case R.id.idLlBtnAddExpenses: goToAddExpenses();break;
            }
        }//onClick
    };//mmButtonClickHandler

    void goToMyTripsActivity(){
        Intent goToMyTripsActivity = new Intent(this, MyTripsActivity.class);
        startActivity(goToMyTripsActivity);
    }//goToMyTrips

    //void goToReports(){
      //  Intent goToReports = new Intent(this, Reports.class);
       // startActivity(goToReports);
//    }//goToReports

    //void goToAddExpenses(){
      //  Intent goToAddExpenses = new Intent(this, AddExpenses.class);
       // startActivity(goToAddExpenses);
   // }//goToAddExpenses

}
