package com.example.hireme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationPage extends AppCompatActivity {

    Button register_btn;
    EditText PersonName;
    EditText gender;
    EditText role;
    EditText contact_no;
    EditText pincode;
    EditText address;
    EditText driver_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        PersonName = (EditText) findViewById(R.id.PersonName);
        gender = (EditText) findViewById(R.id.gender);
        role = (EditText) findViewById(R.id.role);
        contact_no = (EditText) findViewById(R.id.contact_no);
        pincode = (EditText) findViewById(R.id.pincode);
        address = (EditText) findViewById(R.id.address);
        driver_no = (EditText) findViewById(R.id.driver_no);
        register_btn = (Button) findViewById(R.id.register_btn);

        String person_name = PersonName.getText().toString();
        String Gender = gender.getText().toString();
        String role_str = role.getText().toString();
        String contact = contact_no.getText().toString();
        String pincode_str = pincode.getText().toString();
        String loc = address.getText().toString();
        String driver_no_d = driver_no.getText().toString();

        MyDbHelper dbHelper = new MyDbHelper(RegistrationPage.this);
            register_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                   // dbHelper.addUser(person_name, contact, loc, pincode_str, Gender, role_str, driver_no_d);
                    dbHelper.addUser("Aastha","5675444","satyam","45677","f","d","23ert");
                }
            });
        }
}