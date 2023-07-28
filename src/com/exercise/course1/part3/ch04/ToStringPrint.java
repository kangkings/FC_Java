package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch02.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO p = new PersonVO();
        System.out.println(p.toString());
        System.out.println(p);//객체명을 출력할 경우 자동으로 toString 메서드를 찾아서 출력한다
    }
}
