package com.exercise.course1.part3.ch02;

import com.exercise.course1.part3.ch02.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //Q 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동시키는 경우를 생각해보자
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 일련번호: ");
        int carSn = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 이름: ");
        String carName = sc.nextLine();

        System.out.print("자동자 가격: ");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 소유자: ");
        String carOwner = sc.nextLine();

        System.out.print("자동차 연식: ");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 타입: ");
        String carType = sc.nextLine();

        //System.out.println(carSn+"\t"+carName+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        //넘겨줄 정보가 많으면 계속 이렇게 늘려야하나? => X, VO,DTO의 필요성
        //VO,DTO가 있으면 해당 데이터를 모델에 담아서 매개변수로 모델만 넘겨주면 됨
        carInfoPrint(carSn,carName,carPrice,carOwner,carYear,carType);

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

    }
    //Q 매개변수로 자동차의 정보를 받아서 출력하는 메서드 정의
    //이러한 데이터의 이동을 관리하기 위해 VO와 DTO 모델이 필요함
    public static void carInfoPrint(int carSn, String carName, int carPrice,String carOwner, int carYear, String carType){
        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
    }
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
