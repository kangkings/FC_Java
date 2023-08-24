package com.exercise.course2.part2.ch02;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        //실제로 제네릭으로 뭔가 설계하고 만든다기 보다는 기존의 코드들중 제네릭을 사용하는 코드들이 많다

        //int와 Integer는 다르지만 auto-boxing이 발생하기 때문에 혼용가능하다
        Pair<String,Integer> pair = new Pair<>("Hello",1);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        //검색을 빠르게 할 수 있는 자료구조(HashMap, HashTable)
        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor",60);
        maps.put("eng",40);
        maps.put("math",70);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("math"));

    }
    
}
