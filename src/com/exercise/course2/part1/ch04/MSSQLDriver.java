package com.exercise.course2.part1.ch04;

public class MSSQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MSSQL DB에 접속을 시도한다");
    }
}
