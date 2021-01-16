package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class TreeCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Trees");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}