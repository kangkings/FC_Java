package com.exercise.course1.part4.ch02;

import com.exercise.course1.part4.ch02.model.*;

public class DogCatTest {
    public static void main(String[] args) {
        //Dog와 Cat객체 생성 후 eat동작 구동해보기
        Dog d = new Dog();
        Cat c = new Cat();

        //지금 당창 출력하면 Animal클래스에 정의한 공통메서드만 출력된다(호출하는 각 클래스(동물)의 특성이 사라졌다)
        d.eat();
        c.eat();
    }
}
