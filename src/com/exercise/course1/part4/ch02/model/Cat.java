package com.exercise.course1.part4.ch02.model;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹는다");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이난다");
    }
}
