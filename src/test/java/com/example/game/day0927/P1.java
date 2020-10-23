package com.example.game.day0927;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName P
 * @Description
 * @Author tangzhihong
 * @Date 2020/9/27 10:35
 * @Version 1.0
 **/
public class P1 {

    @Test
    public void test1(){
        String[] param = new String[]{"../","../"};
        int i = minOperations(param);
        System.out.println(i);
    }

    public int minOperations(String[] logs) {
        if (logs == null || logs.length == 0)
            return 0;
        int count = 0;
        for (String log : logs) {
            if ("../".equals(log)){
                count = count > 0 ? --count:count;
            }else if ("./".equals(log)){

            }else {
                count++;
            }
        }
        return count;
    }
}
