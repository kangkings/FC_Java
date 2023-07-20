package com.exercise.course1.part2.ch04;

public class FindAPI {
    public static void main(String[] args) {
        int a; //변수 선언, 컴파일러가 찾을 수 있음(기본자료형)
        //만약 AAA b;로 선언하면 에러발생
        //AAA b; -> can't resolve symbol AAA 에러발생(AAA에 대한 명시 해주면 사용가능)
        // "APPLE"문자열 저장하고 출력
        String s;
        /*
        문자열은 기본자료형이 아님에도 에러가 발생하지 않음
        왜? java.lang에 있는 String 클래스로 실제 존재하는 사용자정의자료형이고 경로를 명시해줬기 때문에
        하지만 직접적으로 명시해주지 않았는데? -> 기본자료형이 아니면 JDK설치 당시 함께 설치된 default API에서 기본적으로 먼저 찾아봄
        String은 이 안에 있기 때문에 컴파일러가 찾아낼 수 있고 이 때문에 에러가 발생하지 않음
        실질적으로 java.lang이 String자료형 앞에 생략된 형태임(API목록에 있다는걸 컴파일러가 기본적으로 알기때문에)
         */
        java.lang.String ss; //에러 발생하지 않음
        s = "APPLE";
        System.out.println("s = " + s);
        ss = "APPLE";
        System.out.println("ss = " + ss);
        
        //String은 문자열과 관련된 클래스이고 문자열이 가진 여러 속성과 기능을 함께 가지고 있기 때문에
        // .으로 접근하여 해당 기능들을 이용할 수 있다
        System.out.println(ss.length());
    }
}
