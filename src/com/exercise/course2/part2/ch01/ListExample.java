package com.exercise.course2.part2.ch01;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        //ArrayList는 순서가 있고 중복이 가능한 List이다
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");// 내부적으로 new String("apple")객체가 만들어진다
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

        list.remove(0);//삭제하면 해당 인덱스 뒤의 값들이 한칸씩 당겨진다
        list.set(1,"orange");
        
        for (String str : list){
            System.out.println(str);
        }
    }
}
