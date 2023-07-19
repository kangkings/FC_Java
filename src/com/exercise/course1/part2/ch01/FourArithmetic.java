package com.exercise.course1.part2.ch01;

public class FourArithmetic {
    public static void main(String[] args) {
        /*
        클래스 하나가 다른 프로그램과 연결되어있지 않고 단독으로 동작할 경우
        해당 클래스는 main을 가지고 있어야한다
        */
        int a, b;
        a = 12;
        b = 2;
        System.out.println("a+b=" + (a + b));//a+b=14
        System.out.println("a-b=" + (a - b));//a-b=10
        System.out.println("a*b=" + (a * b));//a*b=24
        System.out.println("a/b=" + (a / b));//a/b=6


    }
}
