package com.exercise.course1.part2.ch07;

public class ForLoopTest {
    public static void main(String[] args) {
        //Q 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하시오
        for (int i = 'A'; i <= 'Z' ; i++) {
            System.out.printf("%c: %d",(char)i,i);
            System.out.println();
        }

        System.out.println();

        //Q 배열 numbers의 원소를 향상된 for문(foreach문)으로 출력)
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
