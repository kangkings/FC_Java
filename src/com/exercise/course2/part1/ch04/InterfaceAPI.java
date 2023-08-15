package com.exercise.course2.part1.ch04;

//CC를 이용하여 BB의 메서드들을 동작시키기(인터페이스 기반의 프로그래밍)
public class InterfaceAPI {
    public static void main(String[] args) {
        CC cc = new BB();

        cc.x();//BB의 x()가 동작 -> 재정의 했기 때문(동적 바인딩)
        cc.y();
        cc.z();
    }
}
