package com.exercise.course2.part1.ch02;

public class MyBookArrayTest {
    public static void main(String[] args) {
        //책 3권의 데이터를 배열에 저장하고 출력하시오

        BookArray list = new BookArray();
        
        list.add(new Book("홍길동",30000,"FC","강저자"));
        list.add(new Book("정길동",20000,"FC2","김저자"));
        list.add(new Book("장길동",10000,"FC3","이저자"));
        list.add(new Book("김길동",50000,"FC4","박저자"));

        Book vo = new Book();
        vo = list.get(0);
        System.out.println(vo);

        vo = list. get(1);
        System.out.println(vo);

        vo = list. get(2);
        System.out.println(vo);

        vo = list. get(3);
        System.out.println(vo);

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
