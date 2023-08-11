package com.exercise.course1.part4.ch06;

public class Board extends Object{//부모인 Object는 toString()을 가지고 있다
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //Object의 toString()은 객체의 메모리 주소를 출력하는 메서드

    @Override
    public String toString() {
        return title;
    }
}
