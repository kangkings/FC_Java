package com.exercise.course2.part2.ch03;
//함수형 인터페이스의 구현체를 외부에 만들어놓고 사용하는 방법
public class MathOperationImpl implements MathOperation{
    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
