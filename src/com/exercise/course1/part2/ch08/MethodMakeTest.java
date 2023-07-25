package com.exercise.course1.part2.ch08;

public class MethodMakeTest {
    //Q 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하라
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        int sum = add(x,y);
        System.out.println(sum);
    }
}
