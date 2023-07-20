package com.exercise.course1.part2.ch04;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;//기본형이 double이기 때문에 f표시 필수
        boolean b = false;
        char c = 'A';
        String s = "APPLE";
        //69를 10진수,2진수,8진수,16진수로 출력
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101; //0b가 붙었기 때문에 2진수로 인식
        System.out.println("binary = " + binary);
        int octal = 0105;//0이 하나만 붙어있으면 8진수 표현
        System.out.println("octal = " + octal);
        int hexa = 0x45;//0x는 16진수 표현
    }
}
