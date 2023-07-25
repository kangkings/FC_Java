package com.exercise.course1.part2.ch08;

public class ApiOverloading {
    public static void main(String[] args) {
        //출력함수, 매개변수로 여러타입의 데이터를 넘겨주는데 어떻게 처리되나?
        //정답은 Overloading, 매개변수의 타입별로 오버로딩이 돼있기 때문에 전부 처리가능
        System.out.println(10);
        System.out.println(10.5);
        System.out.println('A');
        System.out.println("APPLE");
        
        int max = maxValue(7,9);
        System.out.println("max = " + max);
        int min = minValue(3,8);
        System.out.println("min = " + min);
        

    }
    //Q 두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메서드를 정의하시오
    public static int maxValue(int a, int b){
        return (a<b)? b : a;
    }

    //Q 두개의 정수를 매개변수로 받아서 더 작은수를 리턴하는 메서드를 정의하시오
    public static int minValue(int a, int b){
        return (a<b)? a : b;
    }
}
