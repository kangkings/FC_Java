package com.exercise.course2.part1.ch02;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력하시오
        //Book[], Object[]
        //자바에서 제공해주는 ArrayList API사용 가능
        //List가 ArrayList의 부모이기 때문에 List로 사용해도 가능 하지만 일반적으로 ArrayList사용
        ArrayList list = new ArrayList();//기본크기 10 공식문서에 나와있음
        list.add(new Book("홍길동",30000,"FC","강저자"));
        list.add(new Book("정길동",20000,"FC2","김저자"));
        list.add(new Book("장길동",10000,"FC3","이저자"));
        list.add(new Book("김길동",50000,"FC4","박저자"));

        Book vo = (Book)list.get(0);//get으로 가져오면 Object타입이기 때문에 다운캐스팅 해줘야함

        for (int i = 0; i < list.size(); i++) {
            //특정 타입으로 객체를 받는 경우가 아니라 단순 출력의 경우 자동으로 JVM이 재정의된 toString을 실행
            System.out.println(list.get(i));
        }
    }
}
