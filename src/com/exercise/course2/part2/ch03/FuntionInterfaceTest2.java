package com.exercise.course2.part2.ch03;

public class FuntionInterfaceTest2 {
    public static void main(String[] args) {
        //MathOperation 인터페이스를 내부 익명클래스로 구현해보자
        //해당 인터페이스를 외부클래스로 따로 만들어 재정의해 구현해두고 사용할 수도 있지만 이는 안전한 방법이 아니다
        //차라리 클래스 내부에 내부클래스로 만들어 이용하는게 훨씬 안전하다
        //이때 객체를 생성함과 동시에 재정의
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        //위의 선언과 인스턴스 생성을 하면서 이름이 없는 익명클래스(내부클래스)로 재정의 및 구현을 동시에 진행

        int result = mo.operation(1,2);
        System.out.println(result);
    }
}
