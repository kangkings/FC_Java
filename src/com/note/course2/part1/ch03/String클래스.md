# Course2 Part1 자바 API활용 및 API만들기   

## String클래스

### 목표
> 문자열은 자바에서 객체로 취급하며 String 타입으로 객체를 생성하고 처리를 한다   
> 이번에는 문자열을 생성하는 방법과 다양한 문자열 처리방법에 대해 학습한다
---

### 문자열 생성방법 2가지
> 1. 객체 생성(new 활용, 생성자에 원하는 문자열을 인자로 넘겨준다)
>    -  Stack영역에 인스턴스의 주소를 담을 변수 생성, Heap에 String 클래스 인스턴스 생성
> 2. 변수처럼 생성
>    - Literal Pool 메모리 영역에 String 인스턴스 생성, 이후 같은 문자열을 가리킬 경우 해당 인스턴스를 재활용

---

### String클래스에서 제공하는 Method 활용하기

> chatAt(index): index번째 문자하나를 가져온다   
> 
> replaceAll("before", "after"): before에 해당하는 문자를 after로 변환 -> 원본은 그대로
> 
> indexOf("char"): char과 같은 문자가 있는 곳의 인덱스를 반환, 없으면 -1반환
> 
> length(): 문자열의 길이 반환    
> 
> toUpperCase(): 해당 문자열을 대문자로 변환   
> 
> toLowerCase(): 해당 문자열을 소문자로 변환   
> 
> subString(start,end): start~end사이의 문자열을 추출(이때 start는 포함, end는 미포함)

---

### 자바에서 문자열을 비교하는 방법
> 1. equals(): 두 문자열이 같으면 true, 다르면 false반환
> 
> 2. compareTo(): 문자열을 사전순으로 비교하여 두 분자열이 같으면 0, 대상문자열이 기준보다 작으면 음수, 크면 양수 반환 

---

### 자바에서 문자열을 분리하는 방법

