package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddExpense extends AppCompatActivity {
    Context mContext;

    Spinner mSpToSelectTrip, mSpToSelectDestination, mSpToSelectDay, mSpToSelectCategory;
    EditText mEtForCostInput;
    Button mBtnToAddExpense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        init();
    }//onCreate

    void init(){
        mContext = this;
        mSpToSelectCategory = findViewById(R.id.idSpToSelectCategory);
        mSpToSelectTrip = findViewById(R.id.idSpToSelectTrip);
        mSpToSelectDestination = findViewById(R.id.idSpToSelectDestination);
        mSpToSelectDay = findViewById(R.id.idSpToSelectDay);
        mEtForCostInput = findViewById(R.id.idEtForCostInput);
        mBtnToAddExpense = findViewById(R.id.idBtnToAddExpense);

        mBtnToAddExpense.setOnClickListener(mButtonClickHandler);

    }//init

    Button.OnClickListener mButtonClickHandler = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.idBtnToAddExpense:
                    addExpenseToDB();
                    break;
            }
        }//onClick
    };//mButtonClickHandler

    void addExpenseToDB(){

    }//addExpenseToDB
}