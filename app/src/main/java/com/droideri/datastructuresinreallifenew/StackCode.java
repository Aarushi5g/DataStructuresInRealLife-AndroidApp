package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class StackCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Stacks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}