package com.exercise.course1.part2.ch06;

import com.exercise.course1.part2.ch05.Book;

public class ArrayMake {
    public static void main(String[] args) {
        //Q 정수 5개를 저장할 배열을 생성하시오
        int [] a; //배열의 주소를 담을 저장공간 선언
        a = new int[5]; //5칸짜리 배열의 실체를 만들고 a변수에 주소 할당(a를 통해 배열에 접근가능)
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        
        //반복문을 사용하는 것 처럼 데이터를 관리, 사용할 때 배열의 장점이 두드러짐
        for (int i = 0; i < a.length; i++) {
            a[i] = 10;
            System.out.println(a[i]);
        }
        float[] f = new float[5]; //길이가 고정

        Book b1, b2, b3;
        Book[] b = new Book[3]; //책 3권을 저장할 배열을 생성

    }
}
