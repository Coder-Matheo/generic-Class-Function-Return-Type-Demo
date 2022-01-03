package com.genericreturntypedemo;

public class NumericFun <T extends Number>{
    T num;


    public NumericFun(T ob) {
        this.num = ob;
    }

    double square(){
        return num.intValue() * num.doubleValue();
    }

    boolean absEqual(NumericFun<?> ob){
        //Compare to num obj is equal ob.num
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
            return true;
        }
        return false;
    }
}
