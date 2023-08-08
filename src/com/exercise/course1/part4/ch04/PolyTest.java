package com.exercise.course1.part4.ch04;

import com.exercise.course1.part4.ch02.model.*;

public class PolyTest {
    public static void main(String[] args) {
        //업캐스팅으로 객체 생성
        //다형성 이론은 다음이 3가지 조건이 필요로함
        //상속관계, 재정의(Override), 동적바인딩
        //상위클래스가 동일한 메시지로 하위클래스를 서로 다르게 동작시킨다 = 다형성
        Animal a = new Dog();
        a.eat();//부모 타입의 변수로 메시지를 보내고 각각 재정의된 메서드로 실행됨(동적바인딩 됨)

        a = new Cat();
        a.eat();//부모 타입의 변수로 메시지를 보내고 각각 재정의된 메서드로 실행됨(동적바인딩 됨)

        Cat c = (Cat) a;
        ((Cat) a).night();//다운캐스팅 할 경우 자식의 요소에도 접근가능

        //Overloading(오버로딩): 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        //매개변수나 반환타입이 다른 등 같은 이름이기 때문에 컴파일 시점에서 그 중 어떤 메서드가 사용될지 하나로 특정된다(컴파일 시점)
        //=> 프로그램의 실행 속도와는 무관

        //하지만 Override(재정의)는 프로그램의 실행 속도와 관계가 있다
        //=> 프로그램의 속도를 떨어트리는 원인이 될 수도 있다
    }
}
