package com.exercise.course1.part4.ch03;

import com.exercise.course1.part4.ch02.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        //업캐스팅
        Animal a = new Dog();
        a.eat();

        Animal b = new Cat();
        b.eat();

        //다운캐스팅
        Cat c = (Cat)b;
        c.eat();
        c.night();
        //(Cat)b.night(); 이 코드는 에러발생 => 연산자 우선순위가 .이 빠름(캐스팅 되기 전에 참조가 이루어짐)
    }
}
