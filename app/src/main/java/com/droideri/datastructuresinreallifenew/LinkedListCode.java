package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class LinkedListCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_list_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Linked Lists");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}