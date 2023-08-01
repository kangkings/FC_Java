package com.exercise.course1.part4.ch01.model;
//사원(VO,DTO)
public class Employee {//기본적으로 최상위 클래스인 Object클래스를 상속받는 중(생략가능)
    //일반적인 사원의 속성이 정의되어 있기 때문에 재사용될 가능성이 높음
    //따라서 상속받은 클래스가 사용할 수 있도록 private이 아닌 protected 제한자를 사용해야함
    protected String name;
    protected int age;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;
    public Employee(){
        super();// 상위클래스의 생성자를 호출, 이경우 Object
    }
}
