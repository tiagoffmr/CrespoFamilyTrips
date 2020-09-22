package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class NewDestinyActivity extends AppCompatActivity {

    Context mContext;

    TextView mTvForNumberOfDays, mTvForDestinyName;
    EditText mEtForDestinyInput;
    NumberPicker mNpForNumberOfDaysInput;
    Button mBtnToGoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_destiny);
        init();
    }//onCreate

    void init() {
        mContext = this;
        mTvForNumberOfDays = findViewById(R.id.idTvForNumberOfDays);
        mTvForDestinyName = findViewById(R.id.idTvForDestinyName);
        mEtForDestinyInput = findViewById(R.id.idEtForDestinyInput);
        mNpForNumberOfDaysInput = findViewById(R.id.idNpForNumberOfDaysInput);
        mBtnToGoNext = findViewById(R.id.idBtnToGoNext);

        mBtnToGoNext.setOnClickListener(mButtonClickHandler);

    }//init

    Button.OnClickListener mButtonClickHandler = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.idBtnToGoNext:
                  //  goToDestinationExpensesConfig();
                    break;
            }
        }//onClick
    };//mButtonClickHandler
    /*void goToDestinationExpensesConfig(){
        //Devo ter de verificar se os campos foram preenchidos e bem preenchidos
        Intent goToDestinationExpensesConfig = new Intent(this, GoToDestinationExpensesConfig.class);
        startActivity(goToDestinationExpensesConfig);
    }//goToNext*/
}