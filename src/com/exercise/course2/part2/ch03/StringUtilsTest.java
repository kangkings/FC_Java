package com.exercise.course2.part2.ch03;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Converter<String,String> conv = stringUtils::reverse;//인스턴스메서드 참조 (인스턴스명::메서드명)
        String res = conv.convert("hello");
        System.out.println("res = " + res);
    }
}
