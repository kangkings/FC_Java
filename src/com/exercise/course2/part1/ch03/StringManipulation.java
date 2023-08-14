package com.exercise.course2.part1.ch03;

public class StringManipulation {
    public static void main(String[] args) {
        //Hello World라는 문자열을 생성
        String str = "Hello World";
        System.out.println(str.indexOf("H"));
        System.out.println(str.charAt(1));
        System.out.println(str.substring(5,8));
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replaceAll("H","h"));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            
        }
    }
}
