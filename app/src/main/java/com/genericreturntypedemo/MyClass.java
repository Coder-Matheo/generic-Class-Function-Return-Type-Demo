package com.genericreturntypedemo;

import android.util.Log;

import java.util.HashMap;

public class MyClass <T, V>{
    private static final String TAG = MyClass.class.getSimpleName();
    T ob;
    V ob2;

    HashMap<T, V> map = new HashMap<>();

    public MyClass(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType(){
        Log.i(TAG, "showType: "+ ob.getClass().getName());
        Log.i(TAG, "showType: "+ ob2.getClass().getName());
    }


}
