package com.example.game.huawei;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName Problem2
 * @Description
 * @Author tangzhihong
 * @Date 2019/11/28 17:33
 * @Version 1.0
 **/
public class Problem2 {
    /*
        "水仙花数"判断中级限制语言C、C++、Java、Python
        题目介绍
        输入一个三位数判断是否为"水仙花数"，水仙花数指该三位数每个位上的数字立方和等于它本身，即A³+B³+C³=ABC
        示例
        输入：153
        输出：True
     */
    @Test
    public void test(){
        int index = 153;
        boolean res = calcFlower(index);
        Assert.assertTrue(res);
    }

    private boolean calcFlower(int index) {
        int process = 0;
        int input = index;
        while (input > 0){
            int a = input % 10;
            input /= 10;
            process += a * a * a;
        }
        return process == index ? true:false;
    }
}
