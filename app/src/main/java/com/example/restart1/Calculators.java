package com.example.restart1;

import android.util.Log;

public class Calculators extends Instruments {

    String CalcType;

    public Calculators(int a, String N, String Br, int C){
        this.functionality = a;
        this.Name = N;
        this.CalcType = Br;
        this.Cost = C;
    }
    public void  talk(){
        Log.i("talk()", "This is a "+ Name+" and it's can do "+ functionality + " operations. It's "+ CalcType +" calculator. It's cost is " + Cost + " rubles");
    }


}
