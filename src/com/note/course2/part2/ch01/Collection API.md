# Course2 Part2 Collection Framework API이해 및 활용   

## Collection API

### 목표
> 자바 컬렉션 프레임워크(Collection Framework)API는 자바에서 자공하는 데이터 구조인   
> 컬렉션을 표현하는 인터페이스와 클래스의 모음(API)이다. 이 API를 사용하여   
> 데이터를 저장하고 관리하는 다양한 방법을 학습한다

---

### Wrapper클래스란?
##### wrapper(포장) 클래스란 어떤 클래스인가?
>기본 데이터 타입(primitive data type)을 객체로 다룰 수 있도록 만들어진 클래스
> 
> wrapper클래스를 사용하면 자동으로 박싱(boxing)과 언박싱(unboxing)이 이루어진다

##### 기본 데이터 타입별 wrapper 클래스
> byte: Byte   
> short: Short   
> int: Integer   
> long: Long   
> float: Float   
> double: Double   
> char: Character   
> boolean: Boolean

##### boxing
> 기본 데이터 타입을 해당하는 wrapper 클래스 객체로 변환하는 것   
> 
> ex) int i = 10; => Integer intObj = Integer.valueOf(i);

##### unboxing
> wrapper 클래스 객체를 해당하는 기본 데이터 타입으로 변환하는 것
---

### 숫자와 문자열의 상호 변환
##### 숫자형 문자열을 정수로 변환
> Integer.parseInt()메서드 사용
> ```java
> String str = "123";
> int num = Integer.parseInt(str);
>```

##### 정수를 문자열로 변환
> String valueOf()메서드나 ""+정수 사용
> ```java
> int num = 123;
> String str1 = String.valueOf(num);
> String str2 = ""+num;
> ```
> 
> 
>

---

### Collection Framework API란?
> 자바에서 제공하는 데이터 구조인 컬렉션을 표현하는 인터페이스와 클래스의 모음으로   
> 이 API를 사용하면 개발자가 데이터를 저장하고 관리하는 다양한 방법을 제공한다

##### 종류
> List: 순서가 있는 객체의 모음을 다루는 인터페이스   
> ArrayList: List 인터페이스를 구현하는 클래스   
> LinkedList: List인터페이스를 구현하는 클래스
> 
> 
> Set: 중복된 원소가 없는 객체의 모음을 다루는 인터페이스   
> HashSet: Set 인터페이스를 구현하는 클래스   
> TreeSet: SortedSet 인터페이스를 구현하는 클래스   
> 
> 
> Map: 키-값 쌍의 객체를 다루는 인터페이스   
> HashMap: Map 인터페이스를 구현하는 클래스   
> TreeMap: SortedMap 인터페이스를 구현하는 클래스
---

### 순서가 있고 중복 가능한 List API
> List API로 java.util 패키지에 포함된 ArrayList클래스가 있다   

---

### 순서가 없고 중복 불가능한 Set API
> Set API클래스에는 HashSet 클래스가 있다
> add(): 요소추가   
> size(): 요소 개수   
> remove(): 요소 삭제   
> contains(): 포함 여부 판단   
> clear(): set 비우기   
> isEmpty(): 비어있는지 확인

---

### Key-Value로 관리하는 Map API