package com.exercise.course1.part4.ch05;

public class AbstractClassTest {
    public static void main(String[] args) {
        //추상클래스는 단독으로 객체를 생성할 수 없다
        // Animal ani = new Animal(); 에러발생(cannot be instantiated, 객체생성 불가 에러)
        //추상클래스의 추상메서드는 구현부가 정의되지 않았기 때문에 에러를 막기위해 위의 특성을 지님
        //추상클래스는 부모의 역할을 수행한다
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
