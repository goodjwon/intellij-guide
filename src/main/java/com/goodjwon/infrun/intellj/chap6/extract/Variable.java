package com.goodjwon.infrun.intellj.chap6.extract;

/**
 * 동일한 코드를 변수로 뽑자.
 */
public class Variable {

    public void extractVariablebefore() {
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));
    }

    public void extractVariableAfter() {
        /*
            1. point on format option + 화살표 위
            2. option + command + v
            3. select all
         */
        String x = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(x);
        System.out.println(x);
    }
}
