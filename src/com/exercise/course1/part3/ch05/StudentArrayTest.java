package com.exercise.course1.part3.ch05;

import com.exercise.course1.part3.ch05.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q 객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력하시오
        StudentVO[] stdArr = new StudentVO[4];
        stdArr[0] = new StudentVO("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");
        stdArr[1] = new StudentVO("나길동","건축",31,"bit1@empas.com",2023111,"010-2111-1111");
        stdArr[2] = new StudentVO("김길동","인문",23,"bit2@empas.com",2023112,"010-3111-1111");
        stdArr[3] = new StudentVO("이길동","컴공",25,"bit3@empas.com",2023113,"010-4111-1111");

        for (int i = 0; i < stdArr.length; i++) {
            System.out.println(stdArr[i].toString());
        }

    }
}
