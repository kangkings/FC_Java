package com.exercise.course2.part2.ch02;


import com.exercise.course2.part2.ch01.MovieVO;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArr<String> array = new ObjectArr<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");

        for (int i = 0; i < array.size();i++){
            System.out.println(array.get(i));
        }

        ObjectArr<MovieVO> bList = new ObjectArr<>(5);
        bList.set(0,new MovieVO("괴물","봉준호","2006","한국"));
        bList.set(1,new MovieVO("설국열차","봉준호","2013","한국"));
        bList.set(2,new MovieVO("기생충","봉준호","2020","한국"));
        bList.set(3,new MovieVO("미나리","봉준호","2016","한국"));

        for (int i = 0; i < bList.size(); i++) {
            System.out.println(bList.get(i).toString());
        }
    }
}
