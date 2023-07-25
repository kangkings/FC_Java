package com.exercise.course1.part2.ch08;

public class CallByValue {
    public static void floatAdd(float a, float b){
        float hap = a+b;
        System.out.println("hap = " + hap);
        return;
    }

    public static void main(String[] args) {
        float f1 = 3.2f;
        float f2 = 4.4f;
        floatAdd(f1,f2);
    }
}
