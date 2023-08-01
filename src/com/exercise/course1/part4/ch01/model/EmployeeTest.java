package com.exercise.course1.part4.ch01.model;

import com.exercise.course1.part4.ch01.model.RempVO;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한명의 객체를 생성하고 데이터를 저장후 출력
        RempVO vo = new RempVO();
        vo.name = "홍길동";
        vo.age = 15;
        vo.phone = "010-1111-1111";
        vo.empDate="2022-10-10";
        vo.dept = "홍보부";
        vo.marriage = true;
        //출력
        System.out.println(vo.toString());
    }
}
