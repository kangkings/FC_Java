package com.exercise.course1.part2.ch08;

public class OverloadingTest {
    //두 메서드의 기능은 같다(변수값 더해주기) 따라서 이름은 통일하여 오버로딩하는게 좋다
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static float add(float a, float b){
        float sum = a+b;
        return sum;
    }
    //정수 총합 메서드

    //실수 총합 메서드
    public static void main(String[] args) {
        //Q 매개변수로 두개의 정수 값을 받아서 총합을 구해 리턴하시오

        //Q 매개변수로 두개의 실수 값을 받아서 총합을 구해 리턴하시오
        float v = add(35.6f, 56.7f);
        System.out.println("v = " + v);

        int vv = add(10,50);
        System.out.println("vv = " + vv);
        //-의문점-
        //동일한 이름의 메서드의 경우 호출되고 나서 어떤 메서드를 실행시킬지 검색하는 과정에서
        //프로그램의 실행 속도에 영향이 있지 않나?
    }
}
