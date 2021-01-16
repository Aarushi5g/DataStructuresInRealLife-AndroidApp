package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class ArrayCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Arrays");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}