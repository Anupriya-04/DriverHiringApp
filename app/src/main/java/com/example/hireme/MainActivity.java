package com.example.hireme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Username_txt;
    EditText Password_txt;
    Button login_btn;
    TextView registration_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username_txt = findViewById(R.id.UserName_txt);
        Password_txt = findViewById(R.id.Password_txt);
        login_btn = findViewById(R.id.login_btn);
        registration_txt = findViewById(R.id.registration_txt);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = Username_txt.getText().toString();
                String password = Password_txt.getText().toString();


                startActivity(new Intent(MainActivity.this,RegistrationPage.class));
                finish();
                // if person is driver then open driver acitivity
                // if person is passenger then open passenger acitivity

            }
        });

        registration_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RegistrationPage.class));
                finish();
            }
        });
    }
}