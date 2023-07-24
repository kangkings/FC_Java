package com.exercise.course1.part2.ch07;

public class WhileLoopTest {
    public static void main(String[] args) {
        //0~5 까지의 수를 출력
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println();

        //Q numbers의 모든 원소 출력
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        i = 0;
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println();

        //Q 1~10까지 출력하기(do while문 사용)
        i = 1;
        do{
            System.out.println(i);
            i++;
        } while(i<=10);

    }
}
