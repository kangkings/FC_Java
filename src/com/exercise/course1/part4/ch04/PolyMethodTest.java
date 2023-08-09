package com.exercise.course1.part4.ch04;

import com.exercise.course1.part4.ch02.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
    }

    //자신 타입으로 객체를 생성하여 사용하면 종류에 따라 오버로딩된 메서드를 수도없이 만들어야 할 수도 있다
    //하지만 부모 타입으로 인자를 받으면 하나의 타입으로 여러가지 타입을 받을 수 있다(상속관계이기 때문, 다형성 인수)

    /*
        private static  void display(Cat c){
            c.eat();
        }
     */

    /*
        private static void display(Dog d){
            d.eat();
        }
     */

    private static void display(Animal ani){
        ani.eat();
        //ani.night();에러 발생 Y? 어떻게 해결? => instance of로 해결
        if(ani instanceof Cat){//특정 타입일 시
            ((Cat) ani).night();
        }
    }

}
