package com.exercise.course2.part2.ch02;

public class Pair <K,V>{//다른이름도 가능하지만 통상적으로 K = Key, V = Value

    //제네릭을 사용하면 코드의 유연성, 재사용성, 타입안정성을 보장한다는 장점이 있다
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


}
