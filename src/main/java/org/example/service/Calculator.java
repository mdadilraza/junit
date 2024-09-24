package org.example.service;

public class Calculator {
    public static void main(String[] args) {


    }

    public static int  addTwoNumber (int a , int b) {
        return a+b;
    }

    public static int  subTwoNumber (int a , int b) {
        return a-b;
    }
    public static int  multTwoNumber (int a , int b) {
        return a*b;
    }

    public static int  addAnyNumber (int ...a) {
        int sum =0;
        for(int i :a){
            sum +=i;
        }
        return sum;
    }
}
