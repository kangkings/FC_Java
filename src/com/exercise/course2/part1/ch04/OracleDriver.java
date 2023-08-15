package com.exercise.course2.part1.ch04;
//Oracle회사에서(벤더에서) 만들어 제공하면 된다(Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 Oracle DB에 접속을 시도한다");
    }
}
