package com.exercise.course1.part2.ch04;

public class BinaryExam {
    public static void main(String[] args) {
        //123을 10진, 2진, 8진 16진수로 출력
        int a = 123;
        System.out.println("a = " + a);
        String binary=java.lang.Integer.toBinaryString(a);
        System.out.println(binary);
        String octal=java.lang.Integer.toOctalString(a);
        System.out.println(octal);
        String hexa=java.lang.Integer.toHexString(a);
        System.out.println(hexa);
        
    }
}
