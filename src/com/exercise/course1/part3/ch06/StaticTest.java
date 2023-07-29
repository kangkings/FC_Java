package com.exercise.course1.part3.ch06;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //hap()메서드가 static키워드가 아니면 호출이 불가능하다
        //main은 최초 메모리 static-zone에 올라가기 때문에 올라가지 않은 hap()메서드를 찾을 수 없기 때문이다
        int sum = hap(a,b);
        System.out.println("sum = " + sum);

    }
    //Q 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드를 정의하시오
    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
