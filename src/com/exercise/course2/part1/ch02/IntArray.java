package com.exercise.course2.part1.ch02;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY = 5;//수정불가 => 상수
    private int size = 0;
    private int[] elements;

    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];//5개 크기 배열 초기생성
    }

    //저장하는 동작
    public void add(int element){
        //크기 체크
        if (size == elements.length){
            //최대로 찼다면 배열의 크기를 늘린다
            ensureCapacity();
        }
        elements[size++] = element;

    }
    
    //얻는 동작
    public int get(int index){
        //인덱스 체크

        return elements[index];
    }
    
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements,newCapacity);//newCapacity만큼의 배열을 생성하고 elements배열을 복사해온다
    }

}
