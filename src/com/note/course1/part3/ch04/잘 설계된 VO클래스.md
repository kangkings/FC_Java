# Course1 Part3 객체지향 프로그래밍 시작   

## 잘 설계된 VO클래스(객체)

### 목표
> 객체지향프로그래밍에서 클래스는 객체를 모델링(설계)하는 도구이다.   
> 이는 설계를 하는 것이고 설계는 잘해야 할 필요성이 있다.   
> 따라서 VO클래스를 잘 설계하는 방법에 대해 학습한다.
---
### 정보 은닉이란?
> 다른 객체에게 자신의 정보를 숨기고 자신의 동작, 기능, 연산만을 통해   
> 접근을 허용하는 것으로, 클래스 외부에서 특정 정보에 접근을 막는 것이다
> ```java
> public class PersonVO{
>   //public으로 상태정보를 전부 접근가능하게 하면 쉽게 조작이 됨
>   public String name;
>   public int age;
>   public String phone;
> }
> ```
> ```java
> public class PersonVO{
>   //private으로 상태정보를 전부 접근 불가능하게 막아 은닉시킨다
>   //this는 접근 가능
>   private String name;
>   private int age;
>   private String phone;
> }
> ```

---

### setter, getter 메서드
> 상태정보는 private으로 숨기고 해당 클래스에서 this로 접근은 가능하다는 점을 이용하여   
> get,set 메서드를 public으로 제어하여 메서드를 통해 상태정보에 접근, 수정하도록 한다   
> - 이름은 get or set + 변수명(대문자로 시작)
> ```java
>public class PersonVO{
>   private String name;
>   private int age;
>   private String phone;
>   pulbic void setName(String name){
>       this.name = name;//외부에서 받은 name을 VO에 있는 name에 저장
>   }
>   pulbic void setAge(int age){
>       this.age = age;
>   }
>   pulbic void setPhone(String phone){
>       this.phone = phone;//외부에서 받은 name을 VO에 있는 name에 저장
>   }
>   public String getName(){
>       return this.name;//호출시 VO에 있는 name을 리턴
>   }
>   public int getage(){
>       return this.age;
>   } 
>   public String getPhone(){
>       return this.phone;
>   }  
> }
>```

##### getter와 setter의 사용
> ```java
> public static void main(String[] args){
>   PersonVO p = new PersonVO();
>   p.setName("홍길동");
>   p.setAge(40);
>   p.setPhone("010-1111-1111");
>   
>   String name = p.getName();
>   int age = p.getAge();
>   String phone = p.getPhone();
>}
> ```

---


### 생성자를 이용한 객체 초기화
> 생성자 메서드를 활용하면 객체가 생성될 때 상태변수들을 초기화 시킬 수 있음
> ```java
> public PersonVO(){
>   //new로 객체 생성시 기본생성자로 초기화 해버림
>   this.name = "홍길동";
>   this.age = 50;
>   this.phone = "010-1111-1111";
> }
> ```
>생성자 메서드 오버로딩을 통해 원하는 값으로 초기화
> ```java
> public PersonVO(String name, int age, String phone, int weight){
>   this.name = name;
>   this.age = age;
>   this.phone = phone;
>   this.weight = weight;
> }
> ```
> 오버로딩된 생성자메서드가 있을경우 기본생성자는 만들어지지 않는다   
> 따라서 기본생성자가 필요하다면 추가적으로 직접 만들어야 한다

---


### toString()메서드로 객체 값 출력하기
> 객체가 가지고 잇는 값 전체를 문자열 형태로 넘겨주는 메서드
> ```java
>public String toString(){
>   return this.name+"\t"+this.age+"\t"+this.phone+"\t"+this.weight;
> }
> ```

---
### 잘 설계된 VO클래스의 특징
>1. 모든 상태정보를 정보은닉 하기(private)
>
>
>2. 디폴트 생성자를 반드시 만들기
>
>
>3. 생성자 메서드를 오버로딩하여 객체 초기화 하기
>
>
>4. setter 메서드를 만들기(데이터 저장용도)
>
>
>5. getter 메서드를 만들기(데이터 얻는용도)
>
>
>6. toString()메서드 만들기(객체가 가진 전체 값 출력용도)
>
>



