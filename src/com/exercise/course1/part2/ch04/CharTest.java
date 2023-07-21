package com.exercise.course1.part2.ch04;

import java.sql.SQLOutput;

public class CharTest {
    public static void main(String[] args) {
        //'가'라는 한글 한 문자를 변수에 저장하고 출력
        char c = 'A';
        System.out.println("c = " + c);
        int a = 'A';//'A'는 아스키코드 65이기 때문에 자료형에 맞게 출력됨
        System.out.println("a = " + a);
        int b = 'B'+1;//연산도 가능
        System.out.println("b = " + b);
        System.out.println("(char)b = " + (char)b);//65라는 같은 값을 갖지만 자료형의 형태를 char로 강제로 변환
        char han ='가';
        System.out.println("han = " + han);
        int hanD='가';
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';// \\u는 유니코드 한글
        System.out.println("hanU = " + hanU);
        System.out.println("hanU = " + (char)hanU);
        //Q. 대문자'A'를 문자'a'로 변환하여 출력(아스키코드 참고)
        char upper = 'A';
        System.out.println("upper = " + upper);
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower);
        //그냥 upper+32로하면 65+32 = 97이라는 정수형태(4바이트)가 되기 때문에 다시 char로 형변환 해줘야함

        char lower1 = 'u';
        System.out.println("lower1 = " + lower1);
        int upper1 = lower1-32;
        System.out.println("upper1 = " + upper1);
        System.out.println("upper1 = " + (char)upper1);
        //이경우 아까 처럼lower1-32가 정수로 계산되기 때문에 int형 upper1에 적합한 값이 된다
        //출력할때 char로 형변환하면 문자로 출력가능
        
        //Q. '1'+'2'=3이 나오도록 프로그래밍 하시오 '0'이 48임을 인지
        char data = '1'+'2'; //아스키코드가 더해지기 때문에 99가 나옴
        System.out.println("data = " + data);//99

        char i = '1';
        char j = '2';
        System.out.println("sum = " + (i+j));
        //각 값에서 48을 뺀 값(숫자 그대로의 값)으로 연산한다
        i = '1'-48;
        j = '2'-48;
        System.out.println("'1'+'2' = " + (i+j));
    }

}
