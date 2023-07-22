package com.exercise.course1.part2.ch07;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        /*Scanner는 자바와 키보드장치 사이를 연결해주는 통로의 역할을 하는 클래스이다
        이는 스트림과 연결되는데 스트림에는 입력스트림, 출력스트림이 있다.
        System.in이라는 입력스트림(java.IO, 일종의 빨대역할)이 생성되고 Scanner가 이 스트림과 연결되는 형태이다
        이 파트에서는 키보드(외부)로부터 입력을 받아오는 것이기 때문에 System.in(입력스트림)을 사용했다
        JDK설치시 JVM, TOOL 등과 함께 설치된 API안에 기본적으로 설치되어 있으며
        Scanner는 java.util에 존재한다
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println("num = " + num);


        System.out.print("실수를 입력하세요: ");
        float f = sc.nextFloat();
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요: ");
        String str = sc.next();
        System.out.println("str = " + str);

        //만약 앞에서 next()로 문자열을 받았는데 공백을 포함한 문장이 입력되면
        //공백 뒤의 문자열은 스트림에 남게된다. 이후 이를 처리하지 않고 또 스캐너로 입력받게 되면
        //이전에 스트림에 남아있던 값을 먼저 내보내게 되어 문제가 발생한다
        //이를 해결하기 위해 nextLine()처리를 하여 스트림을 비워준다
        sc.nextLine();
        
        System.out.print("문자열을 입력하세요: ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);

    }
}
