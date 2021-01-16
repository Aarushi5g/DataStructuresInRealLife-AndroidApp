package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class GraphCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_code);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Coding Graphs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}