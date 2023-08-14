package com.exercise.course2.part1.ch03;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] strArray = str.split(",");
        //str = "Hello World, Java";
        //strArray = str.split("\\s+"); => 정규 표헌식을 이용해 공백을 기준으로 문자열 구분
        for (String str1 : strArray) {
            System.out.println(str1);
        }
    }
}
