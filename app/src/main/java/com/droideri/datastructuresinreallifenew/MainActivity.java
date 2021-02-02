package com.droideri.datastructuresinreallifenew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    public void goToVocab(View view) {
        Intent intent = new Intent(MainActivity.this, Vocab.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String message = "Hey! Checkout this amazing app on the Real Life Applications & Vocabulary of Data Structures along with cool visuals and the complete code here: https://play.google.com/store/apps/details?id=com.droideri.datastructuresinreallifenew";
        sharingIntent.putExtra(Intent.EXTRA_TEXT, message);
        startActivity(Intent.createChooser(sharingIntent, "Share Using"));
        return super.onOptionsItemSelected(item);
    }
}