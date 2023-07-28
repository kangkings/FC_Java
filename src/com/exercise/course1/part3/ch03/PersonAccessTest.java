package com.exercise.course1.part3.ch03;

import com.exercise.course1.part3.ch01.Person;

public class PersonAccessTest {
    public static void main(String[] args) {
        //Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하라
        Person p = new Person();
        p.name = "홍길동";
        System.out.println("p = " + p);
        p.age = 22;
        System.out.println("p = " + p);
        p.phone = "010-1111-2222";
        System.out.println("p = " + p);
        
        //접근제한자를 이용하면 위와같은 직접적인 데이터 조작을 방지할 수 있다

    }
}
