package com.exercise.course1.part4.ch05;

//추상클래스(불완전한 클래스)
//추상클래스는 부모의 역할만 수행하도록 사용하여야 한다 => 직접 객체생성 불가 (Y? 구현부가 생략된 메서드가 있기 때문에 사용시 오류발생)
public abstract class Animal {
    public Animal() {
        super();//new Object();
    }

    //추상클래스의 추상메서드에는 abstract 키워드를 붙여야 한다
    public abstract void eat();//추상메서드(불완전한 메서드): 메서드의 구현부가 없다 => 반드시 재정의 해줘야한다
    
    public void move(){//구현메서드 => 필요에 따라 자식에서 재정의 가능
        System.out.println("무리를 지어 이동한다");
    }
}
