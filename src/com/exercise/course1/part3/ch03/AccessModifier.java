package com.exercise.course1.part3.ch03;

import com.exercise.course1.part3.ch01.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO m = new MemberDTO();
        m.name = "홍길동";
        m.age = 10;
        //...
        //m.height -> private이기 때문에 정보가 은닉되어 접근할 수 없음
        //그럼에도 불구하고 수정이나 사용을 하고싶다? => 메서드로 만든다(getter,setter)

    }
}
