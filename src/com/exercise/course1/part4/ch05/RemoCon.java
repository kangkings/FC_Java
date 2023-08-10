package com.exercise.course1.part4.ch05;

public abstract  class RemoCon {
    //chUp(), chDown(), volUp(),volDown()
    //추상메서드
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();

    //구현메서드
    //서로 공통된 동작을 가지는 클래스들을 묶을 때는 상관 없지만
    //서로 다른 동작을 가지는 클래스들을 묶어 동작시킬 때는 아래의 구현된 메서드가
    //하위 클래스의 동작이나 성격과 맞지 않을 가능성이 있어 오작동을 유발할 수 있다
    //=> 구현메서드를 가질수 있는 추상메서드가 아닌 인터페이스로 해결해야한다
    public void internet(){
        System.out.println("인터넷이 구동된다");
    }
}
