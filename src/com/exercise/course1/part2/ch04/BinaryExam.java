package com.exercise.course1.part2.ch04;

public class BinaryExam {
    public static void main(String[] args) {
        //123을 10진, 2진, 8진 16진수로 출력
        int a = 123;
        System.out.println("a = " + a);
        int binary = 0b01010011;
        System.out.println("binary = " + binary);
        int octal = 0123;
        System.out.println("octal = " + octal);
        int hexa = 0x53;
        System.out.println("hexa = " + hexa);
        
    }
}
