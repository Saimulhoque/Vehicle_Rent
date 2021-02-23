package com.forbitbd.vehiclerent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class TripDetailsActivity extends AppCompatActivity {

    private AutoCompleteTextView paymentmethod;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        this.getWindow().setStatusBarColor(Color.TRANSPARENT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_details);

        paymentmethod = findViewById(R.id.paymentmethod);
        String[] PaymentMethod = getResources().getStringArray(R.array.PaymentMethod);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(TripDetailsActivity.this, android.R.layout.simple_spinner_dropdown_item,PaymentMethod);
        paymentmethod.setAdapter(adapter);
    }
}