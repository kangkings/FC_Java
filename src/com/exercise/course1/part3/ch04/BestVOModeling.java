package com.exercise.course1.part3.ch04;

import com.exercise.course1.part3.ch04.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO m1 = new MovieVO();
        MovieVO m2 = new MovieVO("아바타","2022.12.14","제이크 설리","액션",192,"12세");
        System.out.println(m1);
        System.out.println(m2);
    }
}
