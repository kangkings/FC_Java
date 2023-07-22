package com.exercise.course1.part2.ch06;

public class ArrayTest {
    public static void main(String[] args) {
        //Q 실수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하여 출력
        //{}를 이용해서 바로 초기화까지 가능
        float[] f = {10.5f, 15.5f, 50.5f, 70.5f, 88.5f};

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
        //Q 정수 5개를 배열에 초기화 하고 index 0번째와 index 3번째 값을 더하여 출력
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(a[0]+a[3]);
        System.out.println(a.length);

        //new로 생성한 배열을 바로 출력하면 초기값은 정수는 0 실수는 0.0으로 되어있음
        int[] b = new int[3];
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        

    }
}
