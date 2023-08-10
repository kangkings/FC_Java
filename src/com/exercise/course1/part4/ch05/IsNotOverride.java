package com.exercise.course1.part4.ch05;

public class IsNotOverride {
    public static void main(String[] args) {
        //재정의 하지 않았기 때문에 하위 클래스가 부모의 명령에 부모 메서드를 실행해버리는 오작동을 한다
        //이는 다형성을 보장하지 않는 것
        //그럼 다형성을 보장하려면 어떻게 해야 하나? -> 재정의를 강제시키면 된다
        //==> 추상클래스와 인터페이스 개념의 등장
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
