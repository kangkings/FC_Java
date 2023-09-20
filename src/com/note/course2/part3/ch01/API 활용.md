# Course2 Part3 API 활용하기

### 목표
> JSON(Java Script Object Notation)과 XML(eXtensible Markup Language)은   
> 둘 다 구조화된 데이터를 표현하고 전송하기 위한 데이터 형식이다. JSON과 XML은 각각의 장단점이 있고   
> 사용 목적과 상황에 따라 적절한 데이터 형식을 선택하여 사용하는 것이 좋다. 최근 웹 및 모바일 앱에서는   
> JSON과 XML을 더 많이 사용하고 있기 때문에 이 두가지를 다루는 방법을 학습한다
>
---

### JSON, XML Data Format 이해하기
##### JSON
> 구조화된 데이터를 표현하고 전송하기 위한 데이터 형식(객체를 문자열로 나타낸 것)
>
> JSON은 경량의 데이터 교환 형식이다

##### JSON의 구성요소
> 1. 객체: JSON 객체는 중괄호로 {} 묶인 키-값 쌍의 집합이다   
>    키는 문자열, 값은 JSON데이터 형식 중 하나가 될 수 있으며 키와 값은 콜론(:)으로 구분되며 여러개의 키-값 쌍은 쉼표로 구분된다
> 
> 
> 2. 배열: JSON배열은 대괄호로 묶인 값들의 순서있는 리스트이다   
>    배열의 요소는 JSON데이터 형식 중 하나가 될 수 있으며 여러 요소는 쉼표로 구분한다

##### XML
> XML은 데이터를 저장하고 전송하기 위한 마크업 언어이다
> 
> XML 데이터는 트리 구조로 이루어져 있으며, 다음과 같은 요소, 속성, 텍스트, 주석 등으로 구성된다

##### XML 예시
```html
<member>
    <name>홍길동</name>
    <age>30</age>
    <email>kang@gmail.com</email>
</member>

```

##### JSON과 XML의 차이점
> 둘 다 구조화된 데이터를 표현하는 데 효과적이지만, 가독성과 데이터 크기에서 차이가 있다
> 
> JSON은 간결한 구조로 인해 가독성이 높고 데이터 크기가 작은 반면,   
> XML은 태그를 사용하여 데이터를 표현하기 때문에 가독성이 상대적으로 낮고 데이터 크기가 크다
> 
> 따라서 상황에 따라 적절한 형식을 선택해 사용해야 한다


---

### Gson API 활용하기
> 자바에서 JSON 데이터를 다루는 방법은 여러가지가 있지만 일반적으로 GSON, Jackson 라이브러리를 사용해서 쉽게 할 수 있다

##### 중첩된 JSON구조 핸들링하기
```java
{
    "name":"홍길동",
    "age" : 30,
    "email" : "kang@email.com",
    "address" : {
    "city" : "서울",
    "country" : "대한민국"    
    }    
}

```
---

### Jsoup API 활용하기
> Jsoup은 자바 라이브러리로 HTML 문서를 읽고 원하는 데이터를 파싱하여   
> 웹 크롤링, 웹 스크래핑, 데이터 추출 등의 작업을 수행할 수 있다

>다운로드는 JSON과 마찬가지로 http://mvnrepository.com/ 에서 한다
---

### URL Connection 네트워킹 하기
##### HttpURLConnection
>HTTP프로토콜을 사용하여 특정 웹 서버와 통신하기 위한 클래스이다
> GET,POST,PUT,DELETE 등의 HTTP 메서드를 지원하며 HTTP 요청과 응답을 처리할 수 있는 메서드도 제공한다

##### 웹 서버에서 정보를 가져오는 절차
> 1. URL 생성
> : 웹 리소스에 대한 URL을 생성한다
>
> 
> 2. HttpURLConnection 초기화
>: URL 객체의 openConnection()메서드를 호출하여 객체를 얻는다
> 
> 
> 3. HTTP 메서드 설정(예: GET)
>: HttpURLConnection 객체의 setRequestMethod()를 사용하며 원하는 HTTP메서드(GET 등)을 설정한다
> 
> 
> 4. 요청 헤더 설정(선택)
>: 필요한 경우, setRequestProperty() 메서드를 사용하여 요청 헤더를 설정한다
> 
> 
> 5. 요청 본문 작성(선택)
>: POST, PUT과 같은 메서드를 사용할 때, 출력 스트림을 사용하여 요청 본문을 작성한다
> 
> 
> 6. 응답 코드 확인
> : getResponseCode() 메서드를 호출하여 서버에서 반환한 HTTP 응답 코드를 확인한다
> 
> 
> 7. 응답 헤더 읽기(선택)
> : 필요한 경우 getHeaderField() 또는 관련 메서드를 사용하여 응답 헤더를 읽는다
> 
> 
> 8. 응답 본문 읽기
> : InputStream을 사용하여 응답 본문을 읽고 처리한다
> 
> 
> 9. 연결 종료
>: 연결을 끊고 리소스를 해제한다

---

### Open API활용 날씨 정보 가져오기