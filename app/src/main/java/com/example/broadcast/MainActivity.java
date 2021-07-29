package com.example.broadcast;

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
// broadcast acustom intent.
        public void broadcastIntent (View view) {

            Intent intent = new Intent();
            intent.setAction("Android_Developer");
        }
    }

