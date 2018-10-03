package com.goodjwon.infrun.intellj.chap6.extract;

/**
 * InnerClass 밖으로 빼기.
 */
public class InnerClass {

    public void moveInnerClass() {
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }


    /*
        F6을 누르면 별도 클래스롤 뺄 수 있다.
        1. class 명에 point를 둔다.
        2. F6을 누른다.

     */
    public static class Team {
        private String name;
        private String code;

        public Team(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }
    }
}
