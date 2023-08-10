package com.exercise.course1.part4.ch05;

public class InterfaceTest {
    public static void main(String[] args) {
        //리모컨으로 TV와 라디오를 동작시켜보자
        //업캐스팅 필요
        RemoCon remo = new Radio();
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
