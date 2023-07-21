package com.exercise.course1.part2.ch04;

public class CastingTest {
    public static void main(String[] args) {
        float f = .10f;//0은 생략가능 0.10
        System.out.println("f = " + f);
        float f2 = 15f;//15.0
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;//3.14
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        //--------------형변환-----------------
        float x = 15.6f;
        int y= (int)x;//(int)로 강제형변환 -> 0.6이 손실된다
        System.out.println("y = " + y);

        char c ='A';
        int cc = c;//더 큰 자료형에 작은게 들어가는건 명시하지 않아도 자동으로 값 손실 없이 이루어짐(자동형변환)
        System.out.println("cc = " + cc);

        int dd = 5;
        double ddd=dd; // 8바이트짜리 double로 4바이트짜리 int가 형변환 될 수 있음(자동형변환)
        System.out.println("ddd = " + ddd);

        double dx=14.67;
        int dy=(int)dx;//반대로 int(4바이트)에 double(8바이트)를 넣으려하면 데이터 손실을 감수하고 명시해줘야함(강제형변환)
        System.out.println("dy = " + dy);
    }
}
