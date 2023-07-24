package com.exercise.course1.part2.ch07;

public class LoopLoopTest {
    public static void main(String[] args) {
        //이중 반복문을 사용하여 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println(i+"단");
            for (int j = 1; j <= 9 ; j++) {
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }
    }
}
