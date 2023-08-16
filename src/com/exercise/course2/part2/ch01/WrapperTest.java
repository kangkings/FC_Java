package com.exercise.course2.part2.ch01;

public class WrapperTest {
    public static void main(String[] args) {
        //정수형 변수에 10을 저장하시오
        int a = 10;//기본자료형
        //Integer aa = new Integer(10);
        Integer aa = 10; //객체는 번지수의 값을 나타내지만 wrapper클래스에 기본자료형이 대입되면 컴파일러가 Auto boxing을 진행하여 값을 넣는다
        System.out.println(aa.intValue());//unboxing(Integer->int)

        Integer bb = new Integer(20);
        int b = bb;//bb가 가리키는 메모리에 가서 int값을 가져와서 변환한다 auto-unboxing

        float f = 10.5f;
        //Float ff = new Float(10.5f);
        Float ff = 45.6f;//new Float(45.6f); => Auto-boxing진행
        System.out.println(ff.floatValue());

        Float af = 49.1f;
        System.out.println(af.floatValue());
        float aff = af;//af.floatValue() -> Auto-unboxing
        System.out.println(aff);
    }
}
