package com.example.restart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Cat MyCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCat = new Cat(4,"Barsik","Siberian","Silver");
        MyCat.talk();
        Cat cat2 = new Cat(9,"Murzik","RusBlue","Silver");
        cat2.talk();
    }
}