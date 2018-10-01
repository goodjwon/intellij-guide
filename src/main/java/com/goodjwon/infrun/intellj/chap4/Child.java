package com.goodjwon.infrun.intellj.chap4;

public class Child implements Parent{

    //auto overwrite: control + i


    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        return false;
    }
}