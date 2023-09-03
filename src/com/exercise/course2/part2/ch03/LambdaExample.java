package com.exercise.course2.part2.ch03;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add1 = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int res1 = add1.operation(10,20);
        System.out.println("res1 = " + res1);

        MathOperation add2 = (x, y) -> x+y;
        int res2 = add2.operation(20,30);
        System.out.println("res2 = " + res2);

        MathOperation multi = (x,y) -> x*y;
        int res3 = multi.operation(10,20);
        System.out.println("res3 = " + res3);
    }
}
