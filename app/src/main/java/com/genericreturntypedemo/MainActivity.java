package com.genericreturntypedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Integer: "+ max(23,42, 1));
        Log.i(TAG, "String: "+ max("apple","tots", "chicken"));

        MyClass<Integer, Double> obj = new MyClass<>(10, 20.3);
        MyClass<Character, String> obj2 = new MyClass<>('A', "Hallo world");

        obj.showType();
        obj2.showType();


        NumericFun<Integer> iob = new NumericFun<Integer>(6);
        NumericFun<Double> dob = new NumericFun<Double>(-6.0);

        Log.i(TAG, "Compare: "+ iob.absEqual(dob));

        Log.i(TAG, "Square: "+ iob.square());


    }


    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;
        if (b.compareTo(a) > 0){
            m = b;
        }
        if (c.compareTo(m) > 0){
            m = c;
        }
        return m;
    }


}