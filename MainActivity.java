package com.example.melody.hci_v20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeAc(View view) {
        startActivity(new Intent(this, screen_time.class));
    }

    public void changeAc1(View view) {
        startActivity(new Intent(this, notif_stall.class));
    }
}
