package com.goodjwon.infrun.intellj.chap4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class StaticTest {

    @Test   //자동완성 control + shift + space
    public void name() {
        Calendar c = new GregorianCalendar(Locale.KOREA);
    }

    @Test   //static 메소드 호출 control + space * 2
    public void name2(){
        Assert.assertThat();
    }
}
