package com.exercise.course2.part1.ch04;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MySQL에 접속을 시도한다");
    }
}
