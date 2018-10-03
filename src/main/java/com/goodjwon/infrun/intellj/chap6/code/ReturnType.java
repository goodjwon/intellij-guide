package com.goodjwon.infrun.intellj.chap6.code;


/**
 * 타입을 바꾼다. command + shift + F6
 */
public class ReturnType {

    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }

    public Integer calculate() {
        return 1;
    }
}
