package com.exercise.course1.part4.ch02.model;

public class Dog extends Animal{

    public Dog() {
        //int a = 10; => 부모 객체가 생성되기 전에 생성자에서 작업 불가
        super();//new Animal();
    }
}
