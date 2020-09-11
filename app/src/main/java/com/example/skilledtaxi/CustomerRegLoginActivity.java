package com.example.skilledtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomerRegLoginActivity extends AppCompatActivity {

    private TextView statusCustomer, regTV;
    private Button signInBtn, regBtn;
    protected EditText customerEmailET, customerPassET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_reg_login);

        statusCustomer = (TextView)findViewById(R.id.statusCustomer);
        regTV = (TextView)findViewById(R.id.registerTV);
        signInBtn = (Button)findViewById(R.id.signInCustomer);
        regBtn = (Button)findViewById(R.id.registerBtn);
        customerEmailET = (EditText)findViewById(R.id.customerEmail);
        customerEmailET = (EditText)findViewById(R.id.customerPassword);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomerRegLoginActivity.this, "CustomerRegBtn", Toast.LENGTH_SHORT).show();
            }
        });

        regTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regBtn.setVisibility(View.VISIBLE);
                signInBtn.setVisibility(View.INVISIBLE);
                regTV.setVisibility(View.INVISIBLE);
                statusCustomer.setText("Регистрация для пассажиров");
            }
        });
    }
}