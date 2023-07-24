package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        //Q 80점 이상의 학생중이서 90점 이상은 A반, 85점 이상은 B반
        //그렇지 않으면 C반으로 편성하고 점수가 80미만이면 불합격 처리하는 프로그램을 작성
        //단, 점수는 0~100 사이로 받는다
        Scanner sc = new Scanner(System.in);
        int jumsu = sc.nextInt();
        if (jumsu>=0 && jumsu <= 100){// 유효성 체크
            if (jumsu>=80){
                if (jumsu>=90){
                    System.out.println("A반");
                }else if(jumsu >= 85){
                    System.out.println("B반");
                }else{
                    System.out.println("C반");
                }
            }else{
                System.out.println("불합격");
            }
        }else{
            System.out.println("유효한 점수가 아님");
        }


    }
}
