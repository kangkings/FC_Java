package com.exercise.course2.part2.ch02;

//제네릭을 사용하여 만드는 배열처럼 동작하는 클래스
public class ObjectArr<T> {
    private T[] array;
    private int size;
    public ObjectArr(int size) {
        array = (T[]) new Object[size];//어떤 타입이 올지 모르기 때문에 T로 캐스팅
    }

    public void set(int index, T value){
        array[index] = value;
        size++;
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }
}
