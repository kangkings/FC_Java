package com.exercise.course1.part3.ch02.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    private int weight;

    //기본 생성자
    public PersonVO(){
        //객체 생성시 최초값으로 초기화
        this.name = "홍길동 기본생성자";
        this.age = 0;
        this.phone = "010-0000-0000";
        this.weight = 50;
    }
    //생성자 오버로딩(Overloading)해서 생성자에 값을 넘겨주어 해당 값으로 초기화
    public PersonVO(String name, int age, String phone, int weight){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.weight = weight;
    }
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public int getWeight() {
        return weight;
    }

    //setter


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //변수를 한번에 출력
    public String toString(){
        return this.name+"\t"+this.age+"\t"+this.phone+"\t"+this.weight;
    }

}
