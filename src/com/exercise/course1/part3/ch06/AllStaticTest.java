package com.exercise.course1.part3.ch06;

public class AllStaticTest {
    public static void main(String[] args) {

        //static 메서드에 접근할 때 객체를 만들어서 접근하면 에러는 발생하지 않지만
        //자동완성도 뜨지 않고 뭔가 잘못된 접근임을 암시한다
        //클래스명.메서드명()으로 접근하면 올바른 접근임을 알 수 있다
        //객체를 만들어서 static 메서드를 사용하는 것은 해당 메서드를 static으로 만든 의미를 잃게 만든다
        //따라서 만약 모든 멤버가 static이라면 아예 객체 생성을 막아버릴 필요가 있다 (생성자 메서드 private처리)

        //AllStatic as = new AllStatic();
        //System.out.println(as.hap(10,20));
        //System.out.println(AllStatic.min(20,30));

        //private처리가 완료되면 더이상 객체를 생성할 수 없다 => 클래스명.메서드()로 호출
        System.out.println(AllStatic.min(10,20));
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.hap(10,20));

        //System, Math는 객체를 만들수 없다(private 생성자 가지고 있기 때문, 모든 멤버가 static으로 되어있다)

    }
}
