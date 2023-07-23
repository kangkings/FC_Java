package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        //Q 나누기와 나머지 연산자의 활용(정수의 자릿수 구하기)
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);
        
        //홀짝 구분
        if (digit%2 == 1){
            System.out.println("홀수");
        }else {
            System.out.println("짝수");
        }
    }
}
