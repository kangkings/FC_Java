package com.exercise.course2.Part3.ch01;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "100c37d04f6795309bbab2c4e95c469d";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey+"&units=-metric";

        try{
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            int responseCode = connection.getResponseCode();
            if(responseCode == 200){
                System.out.println("정상 연결");
                //스트림(Stream = 입력,출력)의 연결
                //URLconnection으로 서버와 클라이언트 연결은 해두었지만 읽어 들이기 위해 스트림을 연결해야함(일종의 다리, 빨대)
                //읽어올때 1바이트로 쪼개서 읽어오기 때문에 한글깨짐을 방지하기 위해서 스트림에 Reader계열 스트림을 열어준다
                //열린 스트림을 하나로 연결해주는 BufferedReader
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine = in.readLine())!=null){
                    content.append(inputLine);
                }
                in.close();
                System.out.println("content = " + content.toString());//서울의 날씨 정보 불러오기 성공
                //Gson라이브러리를 사용하여 온도값 추출
                
                //JsonObject형태로 Json을 그대로 가져오기
                JsonObject weather = JsonParser.parseString(content.toString()).getAsJsonObject();
                //JsonObject형태로 가져온 Object에서 main데이터 추출하기
                JsonObject mainData = weather.getAsJsonObject("main");
                //최종적으로 JsonObject에서 temp값 추출(double 타입으로 가져오기)
                double temp = mainData.get("temp").getAsDouble();
                System.out.println("temp = " + temp);
                //연결종료
                connection.disconnect();

            }else{
                System.out.println("잘못된 연결");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
