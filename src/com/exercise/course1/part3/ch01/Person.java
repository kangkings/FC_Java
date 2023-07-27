package com.exercise.course1.part3.ch01;

public class Person {
    // Q 이름,나이,전화번호 상태정보와 운동,먹다,걷다 행위정보를 가지고 있는 Person 클래스를 모델링하시오
    public String name;
    public int age;
    public String phone;
    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷다");
    }
}
