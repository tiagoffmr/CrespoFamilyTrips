package com.nbacademy.crespofamilytrips.crespofamilytrips.logic;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;

public class DBUtils extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "CrespoTrips.db";
    public static final String TRIP_TABLE_NAME = "Trip";
    public static final String TRIP_COLUMN_ID = "Trip_ID";
    public static final String TRIP_COLUMN_NAME = "Trip_Name";
    public static final String TRIP_COLUMN_FAMILY_NUMBER = "Family_Number";
    public static final String TRIP_COLUMN_START_DATE = "Start_Date";

    public static final String DESTINATION_TABLE_NAME = "Destination";
    public static final String DESTINATION_COLUMN_ID = "Destination_ID";
    public static final String DESTINATION_COLUMN_TRIP_ID = "Destination_Trip_ID";
    public static final String DESTINATION_COLUMN_NAME = "Destination_name";
    public static final String DESTINATION_COLUMN_DAYS = "Number_days";

    public static final String CATEGORY_TABLE_NAME = "Category";
    public static final String CATEGORY_COLUMN_ID = "Category_ID";
    public static final String CATEGORY_COLUMN_DESTINATION_ID = "Category_Destination_ID";
    public static final String CATEGORY_COLUMN_NAME = "Category_name";
    public static final String CATEGORY_COLUMN_BUDGET = "Budget";

    public static final String SUB_CATEGORY_TABLE_NAME = "Sub_Category";
    public static final String SUB_CATEGORY_COLUMN_CATEGORY_ID = "Sun_Category_Category_ID";
    public static final String SUB_CATEGORY_COLUMN_SUB_CATEGORY_ID = "Sub_Category_ID";
    public static final String SUB_CATEGORY_COLUMN_SUB_CATEGORY_NAME = "Sub_Category_Name";
    public static final String SUB_CATEGORY_COLUMN_SUB_CATEGORY_PERCENTAGE = "Sub_Category_Percentage";

    public static final String EXPENSE_TABLE_NAME = "Expense";
    public static final String EXPENSE_COLUMN_ID = "Expense_ID";
    public static final String EXPENSE_COLUMN_CATEGORY_ID = "Expense_Category_ID";
    public static final String EXPENSE_COLUMN_DESCRIPTION = "Expense_description";
    public static final String EXPENSE_COLUMN_AMOUNT = "Expense_amount";
    private HashMap hp;

    public DBUtils(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_TRIP = "CREATE TABLE " + TRIP_TABLE_NAME + "("
                + TRIP_COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TRIP_COLUMN_NAME + " TEXT NOT NULL,"
                + TRIP_COLUMN_FAMILY_NUMBER + "INTEGER NOT NULL,"
                + TRIP_COLUMN_START_DATE + "TEXT NOT NULL);";
        db.execSQL(CREATE_TABLE_TRIP);

        String CREATE_TABLE_DESTINATION = "CREATE TABLE " + DESTINATION_TABLE_NAME + "("
                + DESTINATION_COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + DESTINATION_COLUMN_TRIP_ID + "INTEGER NOT NULL,"
                + DESTINATION_COLUMN_NAME + "TEXT NOT NULL,"
                + DESTINATION_COLUMN_DAYS + "INTEGER NOT NULL,"
                + "FOREIGN KEY" + "(" + DESTINATION_COLUMN_TRIP_ID + ")"
                + "REFERENCES " + TRIP_TABLE_NAME + "(" + TRIP_COLUMN_ID + ")" + ");";
        db.execSQL(CREATE_TABLE_DESTINATION);

        String CREATE_TABLE_CATEGORY = "CREATE TABLE" + CATEGORY_TABLE_NAME + "("
                + CATEGORY_COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + CATEGORY_COLUMN_DESTINATION_ID + "INTEGER,"
                + CATEGORY_COLUMN_NAME + "TEXT,"
                + CATEGORY_COLUMN_BUDGET + "INTEGER,"
                + "FOREIGN KEY" + "(" + CATEGORY_COLUMN_DESTINATION_ID + "),"
                + "REFERENCES" + DESTINATION_TABLE_NAME + "(" + DESTINATION_COLUMN_ID + ")" + ");";
        db.execSQL(CREATE_TABLE_DESTINATION);

        String CREATE_TABLE_SUB_CATEGORY = "CREATE TABLE " + SUB_CATEGORY_TABLE_NAME + "("
                + SUB_CATEGORY_COLUMN_CATEGORY_ID + "INTEGER"
                + SUB_CATEGORY_COLUMN_SUB_CATEGORY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SUB_CATEGORY_COLUMN_SUB_CATEGORY_NAME + "TEXT,"
                + SUB_CATEGORY_COLUMN_SUB_CATEGORY_PERCENTAGE + "INTEGER,"
                + "FOREIGN KEY" + "(" + SUB_CATEGORY_COLUMN_CATEGORY_ID + ")"
                + "REFERENCES " + CATEGORY_TABLE_NAME + "(" + CATEGORY_COLUMN_ID + ")" + ");";
        db.execSQL(CREATE_TABLE_SUB_CATEGORY);

        String CREATE_TABLE_EXPENSE = "CREATE TABLE " + EXPENSE_TABLE_NAME + "("
                + EXPENSE_COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
                + EXPENSE_COLUMN_CATEGORY_ID + "INTEGER,"
                + EXPENSE_COLUMN_DESCRIPTION + "TEXT,"
                + EXPENSE_COLUMN_AMOUNT + "INTEGER,"
                + "FOREIGN KEY" + "(" + EXPENSE_COLUMN_CATEGORY_ID + ")"
                + "REFERENCES " + CATEGORY_TABLE_NAME + "(" + CATEGORY_COLUMN_ID + ")" + ");";
        db.execSQL(CREATE_TABLE_EXPENSE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Destination");
        db.execSQL("DROP TABLE IF EXISTS Trip");
        db.execSQL("DROP TABLE IF EXISTS Category");
        db.execSQL("DROP TABLE IF EXISTS Sub_Category");
        db.execSQL("DROP TABLE IF EXISTS Expense");
        onCreate(db);
    }


    public String Insert_trip(String trip_name, int family_number, String start_date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Trip_Name", trip_name);
        contentValues.put("Family_Number", family_number);
        contentValues.put("Start_Date", start_date);
        db.insert("Trip", null, contentValues);
        return "Trip created";
    }

    public String Insert_Destination(int Destination_Trip_ID, String Destination_name, int Number_days) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Destination_Trip_ID", Destination_Trip_ID);
        contentValues.put("Destination_name", Destination_name);
        contentValues.put("Number_days", Number_days);
        db.insert("Destination", null, contentValues);
        return "Destination Created";
    }

    public String Insert_category(int Category_Destination_ID, String Category_name, int Budget) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Category_Destination_ID", Category_Destination_ID);
        contentValues.put("Category_name", Category_name);
        contentValues.put("Budget", Budget);
        db.insert("Category", null, contentValues);
        return "Category Created";
    }

    public String Insert_sub_category(int Sun_Category_Category_ID, String Sub_Category_Name, int Sub_Category_Percentage) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Sun_Category_Category_ID", Sun_Category_Category_ID);
        contentValues.put("Sub_Category_Name", Sub_Category_Name);
        contentValues.put("Sub_Category_Percentage", Sub_Category_Percentage);
        db.insert("Sub_Category", null, contentValues);
        return "Sub_Category Created";
    }

    public String Insert_expense(int Expense_Category_ID, String Expense_description, int Expense_amount) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Expense_Category_ID", Expense_Category_ID);
        contentValues.put("Expense_description", Expense_description);
        contentValues.put("Expense_amount", Expense_amount);
        db.insert("Expense", null, contentValues);
        return "Expense Created";
    }
}