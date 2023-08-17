package com.exercise.course2.part2.ch01;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<MovieVO> list = new ArrayList<>();//Movie배열이 만들어짐(제네릭 사용)
        list.add(new MovieVO("괴물","봉준호","2006","한국"));
        list.add(new MovieVO("기생충","봉준호","2020","한국"));
        list.add(new MovieVO("설국열차","봉준호","2013","한국"));

        for (MovieVO movie: list){
            System.out.println(movie.getTitle());
            System.out.println(movie.getDirector());
            System.out.println(movie.getYear());
            System.out.println(movie.getCountry());
            System.out.println("-------------------");
        }

        String searchTitle = "기생충";
        for (MovieVO m : list){
            if (m.getTitle().equals(searchTitle)){
                System.out.println(m.getTitle());
                System.out.println(m.getDirector());
                System.out.println(m.getYear());
                System.out.println(m.getCountry());
            }
        }
    }
}
