package com.exercise.course1.part4.ch06;

public class ObjectTest {
    public static void main(String[] args) {
        //A를 업캐스팅으로 생성
        A a = new A(); //코드를 감추기 어려움
        Object obj = new A();//업캐스팅
        ((A)obj).display();//부모는 없고 자식에게만 있는 메서드이기 때문에 다시 다운캐스팅 해주어 사용해야함
    }
}
