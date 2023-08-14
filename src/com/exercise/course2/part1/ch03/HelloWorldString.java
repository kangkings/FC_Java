package com.exercise.course2.part1.ch03;

public class HelloWorldString {
    public static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println(str.toString()); //String클래스의 toString() 오버라이딩 = 문자열 출력
        String str1 = "Hello World";
        System.out.println(str1.toString());
    }
}
