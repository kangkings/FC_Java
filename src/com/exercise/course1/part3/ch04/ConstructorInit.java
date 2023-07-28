package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch02.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getPhone());

        PersonVO p1 = new PersonVO();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone());
        
        //기본 생성자로 초기화를 하고 추가적인 조작이 없었기 때문에 같은 값이 나옴
        //개발자가 원하는 값으로 초기화를 하는 방법?
        //생성자 메서드를 오버로딩해서 초기화 가능
    }
}
