package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch02.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //Q 한사람의 회원정보를 저장할 객체를 생성하시오
        PersonVO p = new PersonVO();
        //다음 3개의 데이터는 정보은닉이 되어있지 않음(public 접근 제한자 사용시)
        //p.name = "홍길동";
        //p.age = 20;
        //p.phone = "010-2222-3333";
        //p.weight는 접근 불가(private으로 정보를 은닉했기 때문에)

        //그렇다면 private으로 선언된 변수는 사용불가? 어떻게 써야하나?
        //=> getter,setter메서드 활용
    }
}
