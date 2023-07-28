package com.exercise.course1.part3.ch02.model;

public class CarDAO {
    //DAO가 붙어있으면 데이터베이스관련 작업을 하는 모델이다
    //C, R, U, D
    //Create = insert(저장)
    public void carInsert(CarDTO car){
        //CarDTO에 저장된 데이터를 가지고 DB작업
        System.out.println("car정보가 DB에 저장되었습니다");
    }

    public void carSelect(CarDTO car){
        System.out.println("car정보가 출력되었습니다");
    }

}
