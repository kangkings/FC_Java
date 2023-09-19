package com.exercise.course2.Part3.ch01;

import com.google.gson.Gson;

public class GsonMemAddfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"kang@email.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";
        Gson gson = new Gson();
        Person member = gson.fromJson(json,Person.class);
        System.out.println("member = " + member);

    }
}
