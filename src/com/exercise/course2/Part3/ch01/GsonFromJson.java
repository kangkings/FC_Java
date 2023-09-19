package com.exercise.course2.Part3.ch01;

import com.google.gson.Gson;

public class GsonFromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"emial\":\"kang@email.com\"}";
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println("mvo = " + mvo);
    }
}
