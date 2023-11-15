package com.example.restart1;

import android.util.Log;

public class Mechanical extends Instruments{
    String MechType;
    public Mechanical(int a, String N, String Br, int C){
        this.functionality = a;
        this.Name = N;
        this.MechType = Br;
        this.Cost = C;
    }
    public void  talk(){
        Log.i("talk()", "This is a "+ Name+" and it's can do "+ functionality + " operations. It's "+ MechType +" . It's cost is " + Cost + " rubles");
    }
}
