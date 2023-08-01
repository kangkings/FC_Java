package com.exercise.course1.part4.ch01.model;

public class EmployeeInitTest {
    public static void main(String[] args) {
        //자식을 통해 부모의 상태정보를 맘대로 바꾸는 방법은 올바르지 않음
        //잘못된 데이터가 들어갈 가능성이 높음(부모의 정보를 보호해야함)
        //따라서 클래스를 설계하는 원칙상 protected로 하지 않는 것이 바람직(private으로 설계)
        //초기화는 각 클래스별로 하는게 바람직(부모는 부모클래스에서, 자식은 자식클래스에서)
        //자식클래스가 부모클래스에 초기화 하려는 데이터를 넘겨주고 해당 데이터를 바탕으로 부모클래스에서 초기화
        RempVO vo = new RempVO("홍길동",33,"010-1111-1111","2022-10-10","홍보부",true);
        System.out.println(vo.toString());
    }
}
