package com.exercise.course1.part3.ch06;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //객체를 생성(new)하게 되면 객체가 heap메모리에 생성된다 이 영역은
        //static키워드가 붙은 메서드에서도 찾아 사용할 수 있다
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(a,b);
        System.out.println("sum = " + sum);
    }
    //아래의 메서드는 정상적인 메서드 하지만 메인에서 호출 불가능(static이 아니기 때문)
    //그럼 어떻게 접근할 수 있나?
    //객체를 생성해서 메모리에 로딩시켜야 한다
    public int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
