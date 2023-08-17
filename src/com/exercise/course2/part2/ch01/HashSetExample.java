package com.exercise.course2.part2.ch01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple");//중복

        System.out.println(set.size());//중복이 제거되어 3

        for (String s : set){
            System.out.println(s);
        }

        set.remove("banana");

        boolean contains = set.contains("cherry");
        System.out.println("Does Set contain Cherry?" + contains);

        set.clear();

        boolean empty = set.isEmpty();
        System.out.println("Is set empty?"+empty);
    }
}
