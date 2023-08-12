package com.exercise.course2.part1.ch01;

import com.google.gson.Gson;

public class GsonToAPI {
    public static void main(String[] args) {
        Person p = new Person("John", 20);
        Gson g = new Gson();
        String json = g.toJson(p);
        System.out.println(json);

    }
}
