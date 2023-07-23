package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        //Q 삼항연산자를 이용하여 정수 2개 중 max value와 min value를 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

    }
}
