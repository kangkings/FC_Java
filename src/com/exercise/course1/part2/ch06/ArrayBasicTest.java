package com.exercise.course1.part2.ch06;

public class ArrayBasicTest {
    public static void main(String[] args) {
        //Q. 정수 3개를 저장 할 변수를 선언하고 모두 10을 저장
        //데이터 수가 늘어나면 처리가 복잡
        int a = 10;
        int b = 10;
        int c = 10;
        int sum = a+b+c;
        System.out.println("sum = " + sum);
        
        
        //데이터의 양이 많아 질 수록 배열의 장점이 부각됨
        int[] number = new int[3];
        int sum2 = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = 10;
            sum2 += number[i];
        }
        System.out.println("sum2 = " + sum2);

        
    }
}
