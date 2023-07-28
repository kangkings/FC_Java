package com.exercise.course1.part3.ch02;

import com.exercise.course1.part3.ch02.model.CarDTO;

public class CarUtility {
    
    //매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하시오
    public void carPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }

}
