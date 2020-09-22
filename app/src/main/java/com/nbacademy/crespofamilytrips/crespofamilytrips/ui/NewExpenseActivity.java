package com.nbacademy.crespofamilytrips.crespofamilytrips;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class NewExpenseActivity extends AppCompatActivity {
    Context mContext;

    TextView mTvToAddTitle, mTvToAddNewExpense, mTvForBudgetName;
    Spinner mSpToSelectCategory;
    EditText mEtForBudgetInput;
    Button mBtnToOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_expense);

        init();
    }//onCreate

    void init(){
        mContext = this;

        mTvToAddTitle = findViewById(R.id.idTvToAddTitle);
        mTvToAddNewExpense = findViewById(R.id.idTvToAddNewExpense);
        mTvForBudgetName = findViewById(R.id.idTvForBudgetName);
        mSpToSelectCategory = findViewById(R.id.idSpToSelectCategory);
        mEtForBudgetInput = findViewById(R.id.idEtForBudgetInput);
        mBtnToOk = findViewById(R.id.idBtnToOk);

        mBtnToOk.setOnClickListener(mButtonClickHandler);

    }//init

    Button.OnClickListener mButtonClickHandler = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.idBtnToGoNext:
                    goToAllCategories();
                    break;
            }
        }//onClick
    };//mButtonClickHandler

    void goToAllCategories(){
        //Devo ter de verificar se os campos foram preenchidos e bem preenchidos
       // Intent goToAllCategories = new Intent(this, AllCategoriesActivity.class);
       // startActivity(goToAllCategories);
    }//goToAllCategories

}