package com.exercise.course1.part2.ch03;

public class VDATest {
    public static void main(String[] args) {
        //Q. 정수:int 한 개를 저장하기 위해서 변수를 선언 하시오
        int v; //변수선언->기억공간
        v=10;
        System.out.println("v = " + v);
        //Q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하시오
        int a = 10;
        int b = a;
        int c = b*10;
        System.out.println("c = " + c);
        //Q. sum이라는 변수에 1부터 50까지의 수를 누적해서 출력 하시오
        int sum = 0;
        sum = sum+1; //지역변수는 초기화 하지 않고 변수를 연산하면 연산이 불가능 하다
        sum = sum =2;//이부분은 규칙성이 발견되기 때문에 반복문을 이용하면 된다.
        sum = sum =3;
        sum = sum =4;
        sum = sum =5;
        sum = sum =6;
        sum = sum =7;
        //Q. x =10, y=20을 저장하고 변수의 값을 서로 교환하여 출력하시오
        int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;

    }

}
