package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch02.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q setter, getter 메서드를 통해 PersonVO객체에 이름, 나이, 번호를 저장하고 출력
        PersonVO p = new PersonVO();
        p.setName("홍길동");
        p.setAge(30);
        p.setPhone("010-2222-3333");
        p.setWeight(64);

        String name = p.getName();
        int age = p.getAge();
        String phone = p.getPhone();
        int weight = p.getWeight();

        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(weight);
    }
}
