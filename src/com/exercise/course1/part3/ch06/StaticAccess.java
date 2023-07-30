package com.exercise.course1.part3.ch06;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //MyUtil
        //기울어진 메서드는 static표시, static인경우 클래스명.메서드로 호출
        int sum = MyUtility.hap(a,b);
        System.out.println(sum);

        //none-static 메서드인 경우 객체를 만들어서 호출
        MyUtility u = new MyUtility();
        sum = u.hap2(a,b);
        System.out.println(sum);
    }
}
