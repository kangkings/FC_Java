package com.exercise.course1.part2.ch07;

public class PrePostOperTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(--x);//예상결과: 9, 실제결과: 9
        System.out.println(x++);//예상결과: 9, 실제결과: 9
        System.out.println(x--);//예상결과: 10, 실제결과: 10
        System.out.println(++x);//예상결과: 10, 실제결과: 10
        System.out.println(x);//예상결과: 10, 실제결과: 10
    }
}
