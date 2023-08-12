package com.exercise.course2.part1.ch02;

public class MyIntArrayTest {
    public static void main(String[] args) {
        //정수 3개를 배열에 저장하고 출력
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.size());

        //예외에 대한 대처가 필요하다(최초 설정된 배열의 크기를 넘어갈경우 등)
    }
}
