package com.exercise.course1.part3.ch02;

import com.exercise.course1.part3.ch02.model.CarDAO;
import com.exercise.course1.part3.ch02.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로 부터 입력 받아서 DB에 저장하시오
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

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);

    }
}
