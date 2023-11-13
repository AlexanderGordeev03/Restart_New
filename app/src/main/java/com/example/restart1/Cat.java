package com.example.restart1;

import android.util.Log;

public class Cat {
    int age;
    String Name;
    String Breed;
    String Color;
    public Cat (int a, String N, String Br, String Col){
        int age1 = a;
        String name1 = N;
        String Breed1 = Br;
        String Color1 = Col;
    }
    public void  talk(){
        Log.i("talk()", "This is a "+ Name+" and it's "+ age + "years old. It's color is "+Color+" breed is"+Breed);
    }


}
