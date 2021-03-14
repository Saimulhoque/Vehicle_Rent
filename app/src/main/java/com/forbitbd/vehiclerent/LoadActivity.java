package com.forbitbd.vehiclerent;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.forbitbd.vehiclerent.login.LoginActivity;

public class LoadActivity extends AppCompatActivity {
    Handler handler = new Handler();
    Runnable runnable;
    int delay = 1000;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
    }

    @Override
    protected void onResume() {
        handler.postDelayed(runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(runnable,delay);
                Intent intent = new Intent(LoadActivity.this, LoginActivity.class);
                startActivity(intent);
            }

        },delay);

        super.onResume();
        }

    @Override
    protected void onPause() {
        handler.removeCallbacks(runnable);
        super.onPause();
    }
}