package com.goodjwon.infrun.intellj.chap6.code;

/**
 * 코드 정리 하기
 * command + option + L
 */
public class ReIndent {
    public void rename() {
        String legacy = "a";
        for (int i = 0; i < 10; i++) {
            System.out.println(legacy);
        }
        System.out.println("한번더: " + legacy);
    }
}
