package com.exercise.course1.part4.ch06;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다");
        System.out.println(b.getTitle());

        System.out.println(b.toString());//기본적으로 메모리주소를 문자열로 바꿔서 출력
        System.out.println(b);//객체를 출력할경우 toString()이 생략되어 메모리주소를 동일하게 출력
        
        //출력내용을 바꾸고 싶다면 toString()을 오버라이딩 해야한다
        //일반적으로 Object의 toString()을 쓰지않고 재정의하여 사용한다
    }
}
