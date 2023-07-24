package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class Yun {
    public static void main(String[] args) {
        //윤년: 2월 29일이 존재하는 연도
        //4의 배수이면서 100의 배수인 해 이거나, 400의 배수인 해
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 4 != 0) || (year % 400 == 0)) {
            System.out.println("윤년임");
        } else {
            System.out.println("윤년이 아님");
        }
    }
}
