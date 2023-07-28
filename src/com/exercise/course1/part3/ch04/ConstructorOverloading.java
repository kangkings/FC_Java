package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch02.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        //기본생성자로 초기화
        PersonVO p = new PersonVO();
        //오버로딩된 생성자에 값 넘겨주어 해당 값으로 초기화
        PersonVO p2 = new PersonVO("나길동", 40, "010-2321-2312", 50);

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getPhone());
        System.out.println(p.getWeight());

        System.out.println();

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getPhone());
        System.out.println(p2.getWeight());
        
        //이렇게 하면 출력 값이 달라지는 것을 확인할 수 있다
        //주의할 점은 오버로딩된 생성자가 있을 경우 컴파일러는 자동으로 기본생성자를 만들지 않는다
        //따라서 기본생성자가 필요하다면 명시적으로 만들어 주어야 한다
        
    }
}
