package com.exercise.course1.part2.ch04;

public class CharExam {
    public static void main(String[] args) {
        char d1 = '1'-'0';//아스키코드표에서 1번에 해당하는 문자
        char d2 = '2'-'0';//아스키코드표에서 2번에 해당하는 문자
        char d3 = '3'-'0';//아스키코드표에서 3번에 해당하는 문자
        char d4 = '4'-'0';//아스키코드표에서 4번에 해당하는 문자
        char d5 = '5'-'0';//아스키코드표에서 5번에 해당하는 문자
        //연산을 수행하면 정수형태로 변환되어 계산되기 때문에 출력하면 15가 나온다.
        //만약(char)로 형변환하면 아스키코드표 15에 해당하는 문자가 출력된다
        System.out.println("'1'+'2'+'3'+'4'+'5' = " + (d1+d2+d3+d4+d5));
        System.out.println("'1'+'2'+'3'+'4'+'5' = " + (char)(d1+d2+d3+d4+d5));
    }
}
