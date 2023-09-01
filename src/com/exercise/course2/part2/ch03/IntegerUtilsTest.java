package com.exercise.course2.part2.ch03;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //함수형 인터페이스Converter는 IntegerUtils클래스의 stringToInt메서드를 참조하여 가지고있는 메서드를 재정의한다
        //정적메서드 참조
        Converter<String,Integer> conv = IntegerUtils::stringToInt;
        int res = conv.convert("123");//convert()함수를 재정의하지 않았지만 위의 코드처럼 참조해서 재정의한것처럼 사용가능하다
        System.out.println("res = " + res);
    }
}
