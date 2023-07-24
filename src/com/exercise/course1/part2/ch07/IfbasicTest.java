package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력
        int n = sc.nextInt();
        if (n%7==0){
            System.out.println("7의 배수");
        }

        //나이를 입력받아 19세 이상이면 성인임을 출력
        int age = sc.nextInt();
        if (age>=19){
            System.out.println("성인입니다");
        }
    }
}
