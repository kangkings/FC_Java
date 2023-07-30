package com.exercise.course1.part3.ch06;

import com.exercise.course1.part3.ch05.model.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        //객체의 설계도인 StudentVO는 클래스, 구체적인 대상을 가리키지 않는 변수들은 object(객체변수)
        StudentVO st1; //st1 : object
        StudentVO st2; //st2 : object
        StudentVO st3; //st3 : object

        //new 연산자를 통해 메모리에 공간이 만들어져 객체변수와 연결되면 인스턴스(실체)가 됨
        //이제부터 각 인스턴스끼리 구별이 가능하다
        //st1 : instance
        st1 = new StudentVO("홍길동","컴공",36,"bit@empas.com",2023110,"010-2222-3333");

        // st2 : instance
        st2 = new StudentVO("나길동","컴공",32,"bit1@empas.com",2023111,"010-3222-3333");

        // st3 : instance
        st3 = new StudentVO("김길동","컴공",31,"bit2@empas.com",2023112,"010-4222-3333");
    }
}
