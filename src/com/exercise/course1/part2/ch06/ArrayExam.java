package com.exercise.course1.part2.ch06;

public class ArrayExam {
    public static void main(String[] args) {
        //다음 배열을 소문자 apple로 출력해라
        //아스키코드상 대문자와 소문자의 차이값은 32, 대문자 A=65
        char[] c = {'A','P','P','L','E'};
        for (int i = 0; i < c.length; i++) {
            c[i] = (char)(c[i]+32);//char값을 정수형과 연산하면 정수형으로 형변환 되기 때문에 다시 강제형변환 해줘야한다
            System.out.printf("%c",c[i]);
        }

    }
}
