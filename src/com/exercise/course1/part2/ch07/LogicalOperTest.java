package com.exercise.course1.part2.ch07;

public class LogicalOperTest {
    public static void main(String[] args) {
        //Q 논리연산자의 결과 값을 쓰시오
        int x =1, y=0;
        System.out.println(!(x>0));//0
        System.out.println(x>0&&x<3);//1
        System.out.println(x>0&&y<0);//0
        System.out.println(x<0||y>=0);//1
        System.out.println(x<0&&y<-5);//0

        int a =3, b =5;
        System.out.println((a>=3)&&(b<6));//1
        System.out.println((a!=3)&&(a>2));//0
    }
}
