package com.exercise.course1.part4.ch05;

public class TV implements RemoteControler{
    //chUp(), chDown(), volUp(),volDown()
    @Override
    public void chUp() {
        System.out.println("TV의 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("TV의 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("TV의 소리가 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 실행된다");
    }
}
