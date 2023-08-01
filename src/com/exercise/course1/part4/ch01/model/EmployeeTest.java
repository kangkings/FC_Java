package com.exercise.course1.part4.ch01.model;

import com.exercise.course1.part4.ch01.model.RempVO;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한명의 객체를 생성하고 데이터를 저장후 출력
        RempVO vo = new RempVO("홍길동", 15, "010-1111-1111","2022-1010","홍보부",true);
        //출력
        System.out.println(vo.toString());
    }
}
