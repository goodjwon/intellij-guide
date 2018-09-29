package com.goodjwon.infrun.intellj.chap1.lineedit;

public class LineJoin {

    public String lineJoin(){
        String proilfe ="안녕하세요~!"
                +"Line Join "
                +"Test 입니다.";

        //control + shift + J => + 기호와 엔터가 삭제 된다.
        String proilfe2 ="안녕하세요~!Line Join Test 입니다.";

        return proilfe;
    }

    public String createQuery(){
        String sql = "select * from member where mem_id = 'asdf' and mem_name='goodjwon'";

        return sql;
    }
}
