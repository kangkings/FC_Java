package com.exercise.course1.part3.ch03;

import java.util.Scanner;
import com.exercise.course1.part3.ch02.model.*;

public class PackageNameTest {
    public static void main(String[] args) {
        //Q 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        String str; //java.lang(생략)
        Scanner sc; //import처리
        System.out.println();//java.lang(생략)

        //풀네임
        java.lang.String str2;
        java.util.Scanner sc2;
        java.lang.System.out.println();

        //Q 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        com.exercise.course1.part3.ch02.model.CarDTO car;//풀네임
        CarDTO dto;//model 패키지 전부를 import처리 해주었기 때문에 바로 사용가능
    }
}
