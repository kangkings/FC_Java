package com.exercise.course2.part1.ch01;

import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30}";//JSON -> Person
        Gson g = new Gson();
        Person p = g.fromJson(json,Person.class);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}
