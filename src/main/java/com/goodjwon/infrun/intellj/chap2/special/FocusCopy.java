package com.goodjwon.infrun.intellj.chap2.special;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {

    public void copyFocus() {
        List<String> members = new ArrayList<>();
        /**
         * 멀티 포커스 option을 연속 두번 누름(두번째는 누르고 있어야 함)
         */
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
    }
}
