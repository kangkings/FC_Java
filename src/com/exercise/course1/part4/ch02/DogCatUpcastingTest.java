package com.exercise.course1.part4.ch02;

import com.exercise.course1.part4.ch02.model.*;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        //업캐스팅으로 Dog,Cat 객체를 생성해 사용해보자
        Animal d = new Dog();
        Animal c = new Cat();

        //부모가 자식을 가리킨다
        d.eat();//개처럼 먹어야 하는데 동물처럼 먹는다가 출력 => 원하는 결과를 얻지 못함
        c.eat();//고양이처럼 먹어야 하는데 동물처럼 먹는다가 출력 => 원하는 결과를 얻지 못함
    }
}
