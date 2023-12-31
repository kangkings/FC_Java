# Course2 Part1 자바 API활용 및 API만들기   

## 우리가 사용하게 될 클래스들(APIs)

### 목표
> 1. 직접만들어서 사용하는 클래스들
> 2. Java에서 제공해주는 클래스들
> 3. 다운받아서 사용하는 클래스들   
>
>위와 같은 다양한 클래스들을 사용하는 방법을 학습한다
---

### 직접만들어서 사용하는 클래스들
##### 자바로 배열에 저장된 수 중에서 최대값, 최소값을 구하는 클래스
> 필요에 의해서 직접 만들어 사용하는 클래스로 예제로 다룰 내용은 min,max구하는 클래스   
> 둘 모두 동일한 방식으로 동작하며 배열의 첫인덱스 값을 최대, 최소로 초기화 한 후   
> 남은 배열의 인덱스를 전부 돌면서 최소, 최대보다 작은지 큰지를 비교하여 값을 교체하고   
> 순회가 끝나면 결정된 값을 리턴한다   
> 
> 또한 직접 객체생성을 하지 못하도록 private생성자 처리한다

---

### Java에서 제공해주는 클래스들
##### Random 클래스(java.util)
> 주어진 범위 안에서 임의의 난수를 발생시키는 클래스   
> Random.nextInt(45) => 0~44사이의 난수 반환   
> Random.nextInt(45)+1 => 1~45사이의 난수 반환   

##### Random 클래스를 이용해 6개 난수를 생성하여 중복을 제거한 뒤 배열에 담는 클래스
> 랜덤으로 난수를 뽑고   
> 배열에 담기전 중복이 되는지 반복문을 통해 검사   
> 문제가 없다면 배열에 저장


---

### 다운 받아서 사용하는 클래스들
##### 자바 API는 https://mvnrepository.com에서 다운받아 사용하는것이 일반적
##### Maven이라는 관리 시스템으로 관리하는게 보편적이다
##### 다운방식은 3가지가 있는데
>1. jar파일 직접 다운로드
>2. Maven에 의해 관리되는 프로젝트라면 pom.xml에 dependency 태그를 추가하여 자동다운로드
>3. gradle에 의해 관리되는 프로젝트라면 build.gradle에 다운로드 코드추가

##### jar란?
> 여러개의 클래스들을 묶어서 API로 배포할 때 사용하는 파일확장자

##### Gson API
> 자바 객체를 JSON형식으로 변환시켜주는 API   
> 
> Gson객체를 생성한 후 toJson()메서드를 사용하여 JSON형식의 문자열로 변환한다
> 
> JSON형식의 문자열을 자바 객체로 변환하는 것도 가능함 fromJson()메서드 사용
> 
> JSON을 객체로 변환할 때는 변환하고자 하는 클래스의 타입을 메서드의 인자로 전달한다

##### JSON이란?
> JavaScript Object Notation의 약자로 경량의 데이터 교환 형식   
> 
> 프로그래밍 언어나 플랫폼 관계없이 데이터 교환가능하도록 설계됨
> 
> {"name":"John", "age":30}과 같이 key-value형태로 이루어진 문자열
