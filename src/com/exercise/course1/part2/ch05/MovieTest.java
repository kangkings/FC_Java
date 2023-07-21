package com.exercise.course1.part2.ch05;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.opening = "2022.12.14";
        m.actor = "제이크 설리";
        m.genre = "액션";
        m.time = 192;
        m.rating = "12세";
        System.out.println(m.title+"\t"+m.opening+"\t"+m.actor+"\t"+m.genre+"\t"+m.time+"\t"+m.rating);
    }
}
