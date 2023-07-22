package com.exercise.course1.part2.ch06;

import com.exercise.course1.part2.ch05.Movie;

public class ObjectArrayExam {
    public static void main(String[] args) {
        //영화 3편을 저장할 배열을 만들고 영화 3편의 데이터를 저장 및 출력하시오
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[1] = new Movie();
        m[2] = new Movie();

        m[0].title = "아바타";
        m[0].actor = "제이크 설리";
        m[0].opening = "7월 23일";
        m[0].genre = "액션";
        m[0].rating = "12세";
        m[0].time = 125;

        m[1].title = "범죄도시3";
        m[1].actor = "마동석";
        m[1].opening = "7월 23일";
        m[1].genre = "액션";
        m[1].rating = "18세";
        m[1].time = 135;

        m[2].title = "미션임파서블";
        m[2].actor = "톰 크루즈";
        m[2].opening = "7월 23일";
        m[2].genre = "액션";
        m[2].rating = "12세";
        m[2].time = 145;

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].title);
            System.out.println(m[i].actor);
            System.out.println(m[i].opening);
            System.out.println(m[i].genre);
            System.out.println(m[i].rating);
            System.out.println(m[i].time);
            System.out.println();
        }
    }
}
