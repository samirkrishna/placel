package com.hasi.samirkrishna.placefinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Guide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
