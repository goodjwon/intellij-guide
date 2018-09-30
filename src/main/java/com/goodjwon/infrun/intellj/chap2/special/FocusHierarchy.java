package com.goodjwon.infrun.intellj.chap2.special;

import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {

    public void increaseFocus() {

        /**
         * 포커스 확장: option + up, down 방향키
         * 이전포커스로 이동: command + [ or ] 여러 클래스가 동일 하게 작업 된다.
         */
        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2018,5,14));

    }
}
