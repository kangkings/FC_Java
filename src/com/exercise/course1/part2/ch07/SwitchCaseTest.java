package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        //switch-case문을 활용하여 요일에 해당하는 운동을 출력
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
                System.out.println("수영하기");
                break;
            case "Wednesday":
                System.out.println("수영하기");
                break;
            case "Thursday":
                System.out.println("휴식");
                break;
            case "Friday":
                System.out.println("휴식");
                break;
            case "Saturday":
                System.out.println("휴식");
                break;

        }
    }
}
