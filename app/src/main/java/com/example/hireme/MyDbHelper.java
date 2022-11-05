package com.example.hireme;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {
    private static final String Database_name = "HireMe";
    private static final int Database_Version = 1;
    private static final String Table_Name_LogIn = "LogIn_Details";
    private static final String Key_id = "id";
    private static final String Key_Name = "username";
    private static final String Key_password = "password";
    private static final String Key_role = "role";
    private static final String Key_cont_no ="contact_No";
    private static final String Key_gender = "gender";
    private static final String Key_location = "location1";
    private static final String Key_pincode = "pincode";
    private static final String Key_driving_no="licence_no";

    public MyDbHelper(Context context) {
        super(context, Database_name, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       // sqLiteDatabase.execSQL("CREATE TABLE " + Table_Name_LogIn + " (" + Key_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
               // + Key_Name+ " TEXT,"+ Key_password + " TEXT,"+ Key_role+" TEXT,"+Key_gender+" TEXT,"+Key_cont_no+" TEXT,"+Key_location+" TEXT,"
               // +Key_pincode+" TEXT,"+Key_driving_no+" TEXT)");
        sqLiteDatabase.execSQL("CREATE TABLE LOGIN_DETAILS (ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT,CONTACT_NO TEXT, LOCATION TEXT,PINCODE TEXT , GENDER TEXT, ROLE TEXT, DRIVING_LNO TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ Table_Name_LogIn);
        onCreate(sqLiteDatabase);
    }

    public void addUser(String username,String contact,String location1 , String pincode ,String gender,String role ,String driving_no ){

        SQLiteDatabase database= this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Key_Name,username);
        values.put(Key_cont_no,contact);
        values.put(Key_gender,gender);
        values.put(Key_role,role);
        values.put(Key_driving_no,driving_no);
        values.put(Key_location,location1);
        values.put(Key_pincode,pincode);
        values.put(Key_password,contact);

        database.insert(Table_Name_LogIn, null,values);
       database.close();

    }
}
