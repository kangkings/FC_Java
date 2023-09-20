package com.exercise.course2.Part3.ch01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";

        try {
            Document docs = Jsoup.connect(url).get();
            Element bibleTest = docs.getElementById("bible_text");
            Element bibleInfoBox = docs.getElementById("bibleinfo_box");

            System.out.println("bibleTest = " + bibleTest);
            System.out.println("bibleInfoBox = " + bibleInfoBox);

            Elements num = docs.select(".num");
            Elements info = docs.select(".info");

            for (int i = 0; i < num.size(); i++){
                System.out.println(num.get(i).text()+":"+info.get(i).text());
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
