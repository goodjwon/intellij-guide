package com.goodjwon.infrun.intellj.chap1.view;

public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "goodjwon", "goodjwon@gmail.com");

        emailSender.send("test@gmail.com");
    }
}
