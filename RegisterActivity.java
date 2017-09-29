package com.example.lei.foodordering;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etEmail);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final EditText etAddress = (EditText) findViewById(R.id.etAddress);
        final Button bRegister = (Button) findViewById(R.id.bRegister);
    }
}
