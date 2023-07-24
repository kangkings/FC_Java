package com.exercise.course1.part2.ch07;

public class AssignOperTest {
    public static void main(String[] args) {
        //Q 아래를 수행 후 결과 값은 얼마?
        int a = 1; //1
        a++;//2
        ++a;//3
        a=a+1;//4
        a+=1;//5
        System.out.println("a = " + a);

        int b=7;
        b--;
        --b;
        b=b-1;
        b-=1;
        System.out.println("b = " + b);
    }
}
