# Course1 Part4 객체지향 프로그래밍 설계하기   

## 추상클래스와 인터페이스

### 목표
> java API중에서 가장 처음 만들어진 Object 클래스를 이해하고   
> 모든 클래스의 최상위 클래스인 Object클래스의 역할을 학습한다
---

### Object 클래스를 이용하여 객체 생성하기
##### 클래스를 만들면 기본적으로 생략된 코드 3가지는 다음과 같다
> import java.lang*;
> 
> extends Object
> 
> default생성자

##### 하나의 클래스를 사용하기 위해 객체를 생성하는 방법
```java
A a = new A();

Object obj = new A();//업캐스팅
//A가 가진 display()를 obj로 실행시키기
        
((A)obj).display();
```

---

### Object클래스를 활용한 다형성 적용
##### 다형성 인수로 Object 활용
```java
//A와 B클래스를 동시에 받을 수 있는 타입? => 모든 클래스의 최상위인 Object
//Object로 업캐스팅하면 반드시 다운캐스팅이 다시 이루어진다
public void display(Object obj){
    if(obj instanceof A){
        ((A)obj).printGo();//다운캐스팅
    }else{
        ((B)obj).printGo();//다운캐스팅
    }
}
```
##### 다형성 배열로 Objcet 활용
```java
public void display(Object[] obj){
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else{
                ((B)obj[i]).printGo();
            }
        }
    }
```
---

### Object클래스의 toString()메서드
최상위 클래스인 Object의 toString()메서드는 기본적으로 메모리의 주소값을 문자열로 출력한다   
하지만 이와같은 용도로는 잘 사용하지 않고 대부분 재정의하여 사용한다

