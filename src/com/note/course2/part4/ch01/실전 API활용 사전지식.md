# Course2 Part4 자바 리펙토링 및 미니프로젝트

### 목표
> 자바에서 Apache POI및 iText 라이브러리를 사용하여 Excel 파일 읽기/쓰기 실습 
>
---
> Excel은 row, col로 이루어진 시트로 구성되어 있기 때문에 반복문으로 핸들링한다

### Apache POI라이브러리를 사용하여 읽기
>1. 엑셀파일 오픈
>
>2. 첫 시트 읽기
>
>3. 행 읽기
>
>4. 해당 행의 각 열 읽기
>
>5. 셀의 값 출력하기

### FC_Java_Project 레포지토리에서 진행
> apache.xlsx 파일에 적어둔 정수,실수,문자열,날짜 등의 데이터를 읽어오기(23/09/22)
> 
> 각 형태에 맞게 라이브러리를 통해 읽어오는 작업 진행(23/09/23)   
> 
> 회원정보를 담을 VO설계, 복수의 정보를 담기위해 List생성, 입력 스트림을 통해 데이터를 입력받아   
> VO에 담고 workbook,sheet,row등을 활용하여 엑셀파일에 데이터 입력 후 저장(23/09/23)

### Pdf API(iText)
> iText API를 이용해서 책 정보를 Pdf파일에 생성하는 실습
```html
<dependency>
    <groupId>com.itextpdf</groupId>
    <artifactId>itext7-core</artifactId>
    <version>7.1.15</version>
</dependency>
```

> 1. PdfWriter객체를 생성하여 PDF출력을 위한 스트림을 지정
> 
> 2. PdfWriter 객체를 사용하여 PdfDocument객체 생성
> 
> 3. PdfFontFactory클래스의 createFont()메서드로 폰트생성, Document 객체의 setFont()로 폰트설정
> 
> 4. 책정보를 HashMap객체에 저장, keySet()메서드를 사용하여 모든 키 순회하면서 문단생성
> 
> 5. Document객체 닫기
