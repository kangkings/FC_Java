package com.exercise.course1.part2.ch05;

public class BookTest {
    public static void main(String[] args) {
        //Q. 정수 한 개를 저장할 변수를 선언하시오
        int a;
        
        //Q. 한 권의 책 데이터를 저장하고 출력하시오 -> 6개의 변수로
        //이 경우 책 데이터를 전부 개별로 만든 것(사실상 책이라고 보기 어려움)
        //이 데이터를 다른 함수나 클래스로 전달하기엔 어려움이 있음
        //해당 데이터를 한번에 담아둘 구조가 필요함(class)
        String title = "자바";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbn = "ISBN-111990011";
        System.out.println(title+"\t"+price+"\t"+company+"\t"+author+"\t"+page+"\t"+isbn);// \t는 공백

        //Q. 책 한 권을 저장할 변수를 선언하시오
        
    }
}
