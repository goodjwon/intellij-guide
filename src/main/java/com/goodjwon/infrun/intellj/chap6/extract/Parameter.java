package com.goodjwon.infrun.intellj.chap6.extract;

/**
 * 동일한 인자 값을 파리티머 변수롤 뽑자.
 */
public class Parameter {
    public void extractParameterBefore(){
        System.out.println(10);
        System.out.println(10);
    }

    /*
        1. 변경하고자 하는 곳에 커서 포인트
        2. command + option + p
        3, 원하는 변수 명 입력
     */
    public void extractParameterAfter(int num){
        System.out.println(num);
        System.out.println(num);
    }
}
