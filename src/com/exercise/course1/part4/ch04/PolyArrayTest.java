package com.exercise.course1.part4.ch04;

import com.exercise.course1.part4.ch02.model.*;

public class PolyArrayTest {
    public static void main(String[] args) {
        Animal[] ani = new Animal[2];
        Dog d = new Dog();
        Cat c = new Cat();
        ani[0] = d;
        ani[1] = c;
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if (ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
