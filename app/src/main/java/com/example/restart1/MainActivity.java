package com.example.restart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Calculators myCalculators;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCalculators = new Calculators(100,"MK-103","Programming",15000);
        myCalculators.talk();
        Calculators calculators2 = new Calculators(250,"Cassio","Graphical",25000);
        calculators2.talk();
        Mechanical Ariphmometer = new Mechanical(4, "Iron Felix", "Ariphmometer",7500);
        Ariphmometer.talk();
    }
}