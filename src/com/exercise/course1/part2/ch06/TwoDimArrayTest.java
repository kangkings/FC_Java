package com.exercise.course1.part2.ch06;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        //행,열로 데이터 저장하기 (2차원 배열, 테이블구조, 행렬)
        int[][] a = new int[2][4];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;

        a[1][0] = 50;
        a[1][1] = 60;
        a[1][2] = 70;
        a[1][3] = 80;
        System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]+"\t"+a[0][3]);
        System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]+"\t"+a[1][3]);

        System.out.println();
        
        //반복문 사용, 2차원 배열이기 때문에 이중 for문 사용(행i 열j)
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 10;
                System.out.printf(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
