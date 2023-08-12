package com.exercise.course2.part1.ch02;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY = 5;//수정불가 => 상수
    private int size = 0;
    private Book[] elements;//Object로 받는다면 모든 타입을 다 받을 수 있기 때문에 범용성있는 API가 되는것

    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];//5개 크기 배열 초기생성
    }

    //저장하는 동작
    public void add(Book element){
        //크기 체크
        if (size == elements.length){
            //최대로 찼다면 배열의 크기를 늘린다
            ensureCapacity();
        }
        elements[size++] = element;

    }
    
    //얻는 동작
    public Book get(int index){
        //인덱스 체크
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 초과");
        }
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
