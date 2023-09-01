package com.exercise.course2.part2.ch03;


import com.exercise.course2.part1.ch01.Person;

public interface PersonFactory {
    public Person create(String name, int age);
}
