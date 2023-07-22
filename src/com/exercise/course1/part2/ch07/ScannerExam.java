package com.exercise.course1.part2.ch07;

import com.exercise.course1.part2.ch05.Book;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.print("제목: ");
        b.title = sc.nextLine();
        System.out.println("title = " + b.title);

        System.out.print("가격: ");
        b.price = sc.nextInt();//nextInt()는 공백을 만나면 멈추기 때문에 스트림에 남을 수 있음
        System.out.println("price = " + b.price);

        sc.nextLine();//스트림 비우기

        System.out.print("출판사: ");
        b.company = sc.nextLine();
        System.out.println("company = " + b.company);

        System.out.print("저자: ");
        b.author = sc.nextLine();
        System.out.println("author = " + b.author);

        System.out.print("페이지수: ");
        b.page = sc.nextInt();//스트림 비워줘야 함
        System.out.println("page = " + b.page);

        sc.nextLine();//스트림 비우기

        System.out.print("isbn: ");
        b.isbn = sc.nextLine();
        System.out.println("isbn= " + b.isbn);

    }
}
