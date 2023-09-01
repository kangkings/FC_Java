package com.exercise.course2.part2.ch03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","김길동","이길동");
        Collections.sort(names,String::compareTo);//특정 객체의 인스턴스 메서드 참조 (클래스명::메서드명)
        System.out.println(names);
    }
}
