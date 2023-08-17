package com.exercise.course2.part2.ch01;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> stdScores = new HashMap<>();
        stdScores.put("Kim",95);
        stdScores.put("Lee",91);
        stdScores.put("Park",92);
        stdScores.put("Choi",93);

        System.out.println("Kim's score: "+ stdScores.get("Kim"));
        System.out.println("Lee's score: "+ stdScores.get("Lee"));

        stdScores.put("Park",92);//수정 key값을 기준으로 value가 바뀌기 때문에 해당 key에 새로운 값을 put하는게 수정이다
        System.out.println("Park's score: "+ stdScores.get("Park"));

        stdScores.remove("Choi");
        System.out.println("Choi's score removal: "+ stdScores.get("Choi"));

        for (Map.Entry<String,Integer> entry : stdScores.entrySet()){//Map의 데이터를 key value로 받아오는 Entry<k,v>
            System.out.println(entry.getKey() + "'s score: "+entry.getValue());
        }


    }
}
