package com.goodjwon.infrun.intellj.chap6.code;

/**
 * 변수명 바꾸기
 */
public class Rename {

    /*
        1. shift + F6 => filed, method, class 모두 적용 가능 함.
        2. legacy => name 으로 변경
     */
    public void rename() {
        String legacy = "a";

        for (int i = 0; i < 10; i++) {
            System.out.println(legacy);
        }

        System.out.println("변수값: "+legacy);
    }
}
