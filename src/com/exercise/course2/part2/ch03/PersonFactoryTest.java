package com.exercise.course2.part2.ch03;

import com.exercise.course2.part1.ch01.Person;

public class PersonFactoryTest {
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("홍길동",40);
        System.out.println("person = " + person);

        PersonFactory personFactory2 = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name,age);
            }
        };
        Person person2 = personFactory.create("나길동",50);
        System.out.println("person2 = " + person2);

    }

}
