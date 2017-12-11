package com.example.admin.googleplaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewPlaceActivity extends AppCompatActivity {
    MyPlace p;
    TextView tvName, tvAddress,tvPhonNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_place);
        p = (MyPlace) getIntent().getSerializableExtra("Place");
        tvName = findViewById(R.id.tvName2);
        tvAddress = findViewById(R.id.tvAddress2);
        tvPhonNumber = findViewById(R.id.tvPhoneNumber2);
        tvName.setText("Name: " + p.getName());
        tvAddress.setText("Address: " + p.getAddress());
        tvPhonNumber.setText("Phone Number: " + p.getPhoneNumber());
    }
}
