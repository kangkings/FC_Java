package com.exercise.course1.part4.ch05;

public class Cat extends Animal {
    //재정의 하지 않음 => 부모가 추상클래스이기 때문에 에러발생
    //반드시 재정의

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이난다");
    }
}
