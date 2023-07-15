package com.crio.qcalc;

public class StandardCalculator {

    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int i, int j) {
        result =  i+j;
    };

    private void setResult(int value){
        this.result = value;
        // return value;
    }

    public int getResult(){
        return result;
    }

    public void subtract(int i, int j){
        result =  i-j;
    };

    public void multiply(int i, int j) {
        result =  i*j;
    };

    public void divide(int i, int j){
        result =  i/j;
    };

    public void clear(){
        result = 0;
    };

    public void printResult(){
        System.out.println("Standard Calculator Result" + getResult());
    }



}
