package com.exercise.course2.part2.ch02;

import com.exercise.course2.part2.ch01.MovieVO;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();//Object[]
        list.add(new MovieVO("괴물","봉준호","2006","한국"));
        list.add("Hello");

        //서로다른 타입의 객체를 하나의 ArrayList안에 넣을경우 타입 안정성이 보장되지 않음 => 제네릭의 필요성
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
