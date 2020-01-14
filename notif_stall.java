package com.example.melody.hci_v20;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class notif_stall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif_stall);
    }
    public void go_main(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
