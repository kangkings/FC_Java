package com.exercise.course2.part1.ch04;
//자바에서 제공한다(이해를 위해 임의로 만들어 보는 것)
//구현은 각 벤더들이 본인들 제품에 맞게 진행
public interface Connection {
    //데이터베이스 연결동작
    public void getConnection(String url, String username, String password);
    
}
