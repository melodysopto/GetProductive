package com.example.melody.hci_v20;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class screen_time extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_time);
    }

    public void time_pick(View view){
        startActivity(new Intent(this,Time_pick.class));
    }
}
