package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HashTableCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash_table_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Hash Tables");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}