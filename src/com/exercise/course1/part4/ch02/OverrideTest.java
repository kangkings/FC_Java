package com.exercise.course1.part4.ch02;

import com.exercise.course1.part4.ch02.model.*;


public class OverrideTest {
    public static void main(String[] args) {
        //업캐스팅
        //Dog와 Cat의 .java파일을 받은게 아니라 .class파일만 받으면 어떤 소스코드인지 알 수가 없다
        //이 경우에도 해당 클래스들을 사용할 순 있는데 그 방법이 부모를 이용햔 방법이다
        Animal dog = new Dog();
        Animal cat = new Cat();

        //두 하위클래스 모두 각각 부모의 eat()메서드를 오버라이딩 했기 때문에
        //실행시점에서 재정의된 메서드로 바인딩되는 동적 바인딩이 일어난다
        dog.eat();
        cat.eat();
    }
}
