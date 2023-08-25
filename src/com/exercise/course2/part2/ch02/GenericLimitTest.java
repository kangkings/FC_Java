package com.exercise.course2.part2.ch02;

public class GenericLimitTest {
    public static void main(String[] args) {
        
        //타입을 Number나 그 하위클래스로 제한했음
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.0,2.0,3.0,4.0,5.0};

        AverageCalculator<Integer> integerCalc = new AverageCalculator<>(integers);
        double integerAverage = integerCalc.calculateAverage();
        System.out.println(integerAverage);

        AverageCalculator<Double> doubleCalc = new AverageCalculator<>(doubles);
        double doubleAverage = integerCalc.calculateAverage();
        System.out.println(doubleAverage);
    }
}
