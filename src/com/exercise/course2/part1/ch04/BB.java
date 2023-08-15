package com.exercise.course2.part1.ch04;

//BB는 노출시키지 않는다 (.java가 아닌 .class파일을 제공한다)
public class BB implements CC {
    @Override
    public void x() {
        System.out.println("BB의 x동작 실행");
    }

    @Override
    public void y() {
        System.out.println("BB의 y동작 실행");

    }

    @Override
    public void z() {
        System.out.println("BB의 z동작 실행");

    }
}
