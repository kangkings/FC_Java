package com.exercise.course1.part4.ch05;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모컨으로 TV와 라디오를 동작시켜보자
        //업캐스팅 필요
        //인터페이스를 사용하면 다형성이 100% 보장된다
        //자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        //객체생성 불가능
        RemoteControler remo = new Radio();
        remo.chDown();
        remo.chUp();
        remo.volDown();
        remo.volUp();
        remo.internet();//인터넷이 동작하지 않는 라디오의 특성이 사라지고 부모의 특성이 반영됨 (오작동, 추상클래스이기 때문에 발생)

        remo = new TV();
        remo.chDown();
        remo.chUp();
        remo.volDown();
        remo.volUp();
        remo.internet();
    }
}
