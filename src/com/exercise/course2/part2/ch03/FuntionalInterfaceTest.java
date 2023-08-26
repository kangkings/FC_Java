package com.exercise.course2.part2.ch03;

public class FuntionalInterfaceTest implements MathOperation{
    public static void main(String[] args) {
        MathOperation mo = new FuntionalInterfaceTest();
        int result = mo.operation(1,2);
        System.out.println(result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
