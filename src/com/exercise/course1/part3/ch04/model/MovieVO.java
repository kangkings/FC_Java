package com.exercise.course1.part3.ch04.model;

public class MovieVO {
    //상태정보 은닉
    private String title;
    private String opening;
    private String actor;
    private String genre;
    private int time;
    private String level;
    //기본생성자
    public MovieVO(){
    }
    //오버로딩 생성자
    public MovieVO(String title, String opening, String actor, String genre, int time, String level){
        this.title = title;
        this.opening = opening;
        this.actor = actor;
        this.genre = genre;
        this.time = time;
        this.level = level;
    }
    //getter

    public String getTitle() {
        return title;
    }

    public String getOpening() {
        return opening;
    }

    public String getActor() {
        return actor;
    }

    public String getGenre() {
        return genre;
    }

    public int getTime() {
        return time;
    }

    public String getLevel() {
        return level;
    }
    //setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    //toString
    public String toString() {
        return this.title+"\t"+this.opening+"\t"+this.actor+"\t"+this.genre+"\t"+this.time+"\t"+this.level;
    }
}
