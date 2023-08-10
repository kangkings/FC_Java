package com.exercise.course1.part4.ch05;

public class Radio extends RemoCon{
    //chUp(), chDown(), volUp(), volDown()
    //추상클래스를 상속받았기 때문에 구현부가 정의되지 않은 추상 메서드를 반드시 오버라이딩 해야함

    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("Radio의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 소리가 내려간다");
    }
}
