package com.exercise.course2.part2.ch01;

public class MinMaxFinder {
    private MinMaxFinder() {
        //객체의 직접생성을 막기위한 private 생성자
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
