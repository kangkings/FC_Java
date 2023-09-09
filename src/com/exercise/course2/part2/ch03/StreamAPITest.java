package com.exercise.course2.part2.ch03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        int even = 0;
//        for(int num : numbers){
//            if(num %2 == 0){
//                even += num;
//            }
//        }
//        System.out.println("even = " + even);
        //IntStream stream = Arrays.stream(numbers);
        int sumOfEvens = Arrays.stream(numbers)
                .filter(n->n%2==0)
                .sum();
        System.out.println("sumOfEvens = " + sumOfEvens);

        //스트림 필터를 이용해 짝수만 골라내어 다시 배열로 만들기
        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        
    }
}
