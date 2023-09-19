package com.exercise.course2.Part3.ch01;

import com.google.gson.Gson;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동",30,"kang@email.com");
        //JSON -> {"name":"홍길동","age":30, "email" : "kang@email.com"}
        Gson gson = new Gson();
        String json = gson.toJson(mvo);
        System.out.println("json = " + json);
    }
}
