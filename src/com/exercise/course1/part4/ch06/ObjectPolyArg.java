package com.exercise.course1.part4.ch06;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj){
        if(obj instanceof A){
            ((A)obj).printGo();//다운캐스팅
        }else{
            ((B)obj).printGo();//다운캐스팅
        }
    }
}
