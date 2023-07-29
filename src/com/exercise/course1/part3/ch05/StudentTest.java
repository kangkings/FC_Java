package com.exercise.course1.part3.ch05;

import com.exercise.course1.part3.ch05.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        //Q 정수 6개를 저장할 배열을 생성하시오
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        //Q 잘설계된 학생 객체를 설계하고 출력하시오
        StudentVO s1 = new StudentVO("홍길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1111-1122");
        System.out.println(s1.toString());
    }
}
