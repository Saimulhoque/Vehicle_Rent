package com.forbitbd.vehiclerent;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class TripPostActivity extends AppCompatActivity {

    private MaterialButton btnreview;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_post);

        btnreview = findViewById(R.id.review);
        btnreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TripPostActivity.this,DateTimeActivity.class);
                startActivity(intent);
            }

        });
    }
}