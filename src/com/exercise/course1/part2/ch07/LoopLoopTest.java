package com.exercise.course1.part2.ch07;

public class LoopLoopTest {
    public static void main(String[] args) {
        //이중 반복문을 사용하여 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d단 \t\t",i);
        }
        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9 ; j++) {
                System.out.printf("%d X %d = %d\t",j,i,i*j);
            }
            System.out.println();
        }
    }
}
