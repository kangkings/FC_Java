package com.exercise.course1.part4.ch05;

public class Dog extends Animal {

    //재정의를 하지 않는다면? -> 부모의 메서드가 그대로 실행되어 다형성을 보장하지 못함
    //이경우 재정의를 하지 않았다고 경고를 띄우는 방법은 없을까?
    //추상클래스와 인터페이스의 도입 => 부모의 구현부가 정의되어있지 않기 때문에 반드시 자식이 재정의 해야함
    //안할시 오류발생


    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
