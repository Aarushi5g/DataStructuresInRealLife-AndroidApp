package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HeapCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Heaps");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}