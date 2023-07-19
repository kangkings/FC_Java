package com.exercise.course1.part2.ch03;

public class CarTest {
    public static void main(String[] args) {
        String model = "BMW528i";
        System.out.println("model = " + model);
        long distance = 1000000;
        System.out.println("distance = " + distance);
        int price = 9000000;
        System.out.println("price = " + price);
        char type='A';
        System.out.println("type = " + type);
        boolean auto=true;
        System.out.println("auto = " + auto);
        int year=2000;
        System.out.println("year = " + year);
        float gasmi=12.5f;//실수는 자동으로 double로 인식하기 때문에 float임을 나타내 주어야함
        System.out.println("gasmi = " + gasmi);
    }
}
