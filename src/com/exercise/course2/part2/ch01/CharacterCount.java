package com.exercise.course2.part2.ch01;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello, World";
        Map<Character,Integer> charCountMap = new HashMap<>();
        char[] strArray = str.toCharArray();
        for (char c : strArray){
            if (charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        System.out.println("Character Counts");

        for (char c : charCountMap.keySet()){//key들의 set을 가져오기
            System.out.println(c + " : " + charCountMap.get(c));
        }
    }
}
