package com.exercise.course2.part2.ch01;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //ArrayList에 10, 20, 30, 40, 50 5개의 정수를 저장하고 출력하시오
        //ArrayList -> Object[] <--X-- int
        //ArrayList -> Object[] <--X--Integer(Wrapper)
        //ArrayList -> Object[] <--(Auto-boxing:Integer)--int
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);//정확한 방식은 arr.add(new Integer(10))이지만 auto-boxing을 이용하여 편하게 쓴다
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        //ArrayList에는 Integer 타입이 들어있는데 int로 바로 받을수 있나? => 가능(auto-unboxing)
        for(int data : arr){
            System.out.println(data);
        }
    }
}
