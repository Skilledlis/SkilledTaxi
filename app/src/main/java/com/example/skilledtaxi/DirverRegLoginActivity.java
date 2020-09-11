package com.example.skilledtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DirverRegLoginActivity extends AppCompatActivity {

    private TextView statusDriver, regTV;
    private Button signInBtn, regBtn;
    protected EditText driverEmailET, driverPassET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dirver_reg_login);

        statusDriver = (TextView)findViewById(R.id.statusDriver);
        regTV = (TextView)findViewById(R.id.registerTV);
        signInBtn = (Button)findViewById(R.id.signInDriver);
        regBtn = (Button)findViewById(R.id.registerBtn);
        driverEmailET = (EditText)findViewById(R.id.driverEmail);
        driverPassET = (EditText)findViewById(R.id.driverPassword);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DirverRegLoginActivity.this, "DriverRegBtn", Toast.LENGTH_SHORT).show();
            }
        });

        regTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regBtn.setVisibility(View.VISIBLE);
                signInBtn.setVisibility(View.INVISIBLE);
                regTV.setVisibility(View.INVISIBLE);
                statusDriver.setText("Регистрация для водителей");
            }
        });
    }
}