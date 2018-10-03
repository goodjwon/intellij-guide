package com.goodjwon.infrun.intellj.chap6.extract;

import java.util.List;

/**
 * 섞여 있는 코드를 단일 기능으로 분리한다.
 * 1. if문을 분리: command + option + m
 */
public class Method {


    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            loopBooks(book);
        }

    }

    //for문 별도로 분리.
    private void loopBooks(Book book) {
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    //if 문 => method 로 변경됨 (as print)
    private void print(String s) {
        if("jojoldu".equals(s)){
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
