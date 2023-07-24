package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if(x>=0){
            System.out.println("0 or 양수");
        }else {
            System.out.println("음수");
        }

        //Q 정수 1개를 입력받아 짝수인지 홀수인지 판단하시오
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
        
        //Q 입력받은 수가 12의 배수인지를 출력
        int a = sc.nextInt();
        if (a%12==0){
            System.out.println("12의 배수");
        }else {
            System.out.println("12의 배수가 아님");
        }
    }
}
