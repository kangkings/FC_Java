package com.exercise.course1.part4.ch01.model;
//일반사원VO
public class RempVO extends Employee{
    //사원이 공통적으로 가지고 있는 요소를 마찬가지로 가지고 있음
    //여기에 같은 요소들을 선언하고 사용해도 되지만 그럴경우 코드의 반복이 발생
    //따라서 Employee클래스를 상속받아 해당 클래스의 요소들을 재활용 하는 것이 좋음
    public RempVO(){
        super();//부모인 Employee의 생성자 호출 => Employee의 생성자에 있는 super()도 작동=> 최상위 클래스 Object도 생성됨
    }

    @Override
    public String toString() {
        return "RempVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
