package com.exercise.course2.Part3.ch01;

import com.google.gson.Gson;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("서울","대한민국");
        Person member = new Person("홍길동",30,"kang@email.com",address);

        //Person -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println("json = " + json);
    }
}
