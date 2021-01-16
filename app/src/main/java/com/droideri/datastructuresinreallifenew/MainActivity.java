package com.droideri.datastructuresinreallifenew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToArray(View view) {
        Intent intent = new Intent(MainActivity.this, Array.class);
        startActivity(intent);
    }

    public void goToLinkedList(View view) {
        Intent intent = new Intent(MainActivity.this, LinkedList.class);
        startActivity(intent);
    }

    public void goToStack(View view) {
        Intent intent = new Intent(MainActivity.this, Stack.class);
        startActivity(intent);
    }

    public void goToQueue(View view) {
        Intent intent = new Intent(MainActivity.this, Queue.class);
        startActivity(intent);
    }

    public void goToHeap(View view) {
        Intent intent = new Intent(MainActivity.this, Heap.class);
        startActivity(intent);
    }

    public void goToHashTable(View view) {
        Intent intent = new Intent(MainActivity.this, HashTable.class);
        startActivity(intent);
    }

    public void goToTree(View view) {
        Intent intent = new Intent(MainActivity.this, Tree.class);
        startActivity(intent);
    }

    public void goToGraph(View view) {
        Intent intent = new Intent(MainActivity.this, Graph.class);
        startActivity(intent);
    }

}