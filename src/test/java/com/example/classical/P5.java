package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P5
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 17:04
 * @Version 1.0
 **/
public class P5 {
    /**
     *  题目：利用条件运算符的嵌套来完成此题：学习成绩=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
     */
    @Test
    public void test(){
        System.out.println(calcScore(80));
    }

    public String calcScore(int score){
        return score >= 90 ? "A":score >= 60? "B":"C";
    }
}
