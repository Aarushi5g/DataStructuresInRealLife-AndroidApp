package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Objects;

public class HashTable extends AppCompatActivity {

    Button b1, b2;
    TextView t1, t2;
    ImageView i1, i2;
    ScrollView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash_table);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Hash Tables in Real Life");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b1 = (Button) findViewById(R.id.hash_tableButtonS1);
        b2 = (Button) findViewById(R.id.hash_tableButtonS2);
        t1 = (TextView) findViewById(R.id.hash_tableTextS1);
        t2 = (TextView) findViewById(R.id.hash_tableTextS2);
        i1 = (ImageView) findViewById(R.id.hash_tableImageS1);
        i2 = (ImageView) findViewById(R.id.hash_tableImageS2);
        s = (ScrollView) findViewById(R.id.scroll);
    }

    public void b1Clicked(View view) {
        t1.setVisibility(View.VISIBLE);
        i1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.GONE);
        i2.setVisibility(View.GONE);
        s.fullScroll(View.FOCUS_DOWN);
    }

    public void b2Clicked(View view) {
        t2.setVisibility(View.VISIBLE);
        i2.setVisibility(View.VISIBLE);
        t1.setVisibility(View.GONE);
        i1.setVisibility(View.GONE);
        s.fullScroll(View.FOCUS_DOWN);
    }

    public void CodeClicked(View view) {
        Intent intent = new Intent(HashTable.this, HashTableCode.class);
        startActivity(intent);
    }
}