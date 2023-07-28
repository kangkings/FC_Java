package com.exercise.course1.part3.ch02;

import com.exercise.course1.part3.ch02.model.CarDTO;

public class CarUtilityTest {
    public static void main(String[] args) {
        //Q car 정보를 출력하는 동작을 가지고 있는 Utility클래스를 설계하시오
        CarDTO car = new CarDTO();
        CarUtility util = new CarUtility();
        car.carSn = 1110;
        car.carName = "벤츠";
        car.carPrice = 9000000;
        car.carOwner = "홍길동";
        car.carYear = 2015;
        car.carType = "S";

        util.carPrint(car);


    }
}
