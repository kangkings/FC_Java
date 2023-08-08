package com.exercise.course1.part4.ch03;

import com.exercise.course1.part4.ch02.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        //업캐스팅
        Animal a = new Dog();
        a.eat();

        Animal b = new Cat();
        b.eat();
    }
}
