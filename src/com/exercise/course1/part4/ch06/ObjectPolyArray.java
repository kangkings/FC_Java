package com.exercise.course1.part4.ch06;

public class ObjectPolyArray {
    public static void main(String[] args) {
        //A,B를 담을 배열을 생성
        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();

        display(obj);

        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else{
                ((B)obj[i]).printGo();
            }
        }
    }

    private static void display(Object[] obj){
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else{
                ((B)obj[i]).printGo();
            }
        }
    }
}
