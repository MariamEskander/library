package com.android.mariam.calculater;

/**
 * Created by Mariam.Narouz on 12/25/2017.
 */

public class Calculations {
    public int add(int a , int b){
        return  a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a , int b){
        return a*b;
    }

    public int div(int a , int b){
        if (b == 0 || b>a ) return  0;
        return a/b;

    }
}
