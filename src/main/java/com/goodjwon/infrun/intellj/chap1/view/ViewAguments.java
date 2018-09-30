package com.goodjwon.infrun.intellj.chap1.view;

public class ViewAguments {

    public void viewArguments() {

        /**
         * 커서 위치 후에 실행
         * 인자값 바로 보기: command + p
         * 구현부 바로 보기: option+space
         * class 도움말 바로 보기: F1
         */
        EmailSender emailSender =
                new EmailSender(1L, "goodjwon", "goodjwon@gmail.com");

        EmailSender.receive("goodjwon@gmail.com", "jwon76@naver.com");

    }


}
