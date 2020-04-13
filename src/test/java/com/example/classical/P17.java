package com.example.classical;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName P17
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/13 14:17
 * @Version 1.0
 **/
public class P17 {
    /**
     *  题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
     *  加入5个：1 2 3 4 5
     *  ①1 2 4 5
     *  ② 2 4 5
     *  ③ 2 4
     *  ④ 4
     *  ①开始，x+3%3=0 除去3，剩余四个
     *  ② 步骤1剩余个数为4，比三多了两个 5 - 3 = 2 所以第二圈只需去掉 2 + x = 3y
     *  ③ 步骤2剩余三个，所以 X+3 = 3y
     *  ④ 步骤3剩余2个，2 + x = 3y
     *
     *  n = 6
     *  1 2 3 4 5 6
     * 开始：1 2 3 4 5 6
     *  yi: 1 2 4 5 前一步是6个，6 % 3 == 0， x + 0 % 3 == 0 ,这轮去掉4
     *  er: 1 2 5 前一轮是4个，4 % 3 = 1， x + 1 % 3 == 0,这轮去掉2
     * san: 1 5 前一轮为3个，3 % 3 == 0， x + 0 % 3 == 0,这轮去掉1
     *  si：1
     */
    @Test
    public void test(){
        System.out.println(count3_(6));;
    }

    public int count3_(int n){
        List<Integer> a = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            a.add(i);
        }
        //重复次数
        int duplicate = 0;
        //剩余
        int prf, x = a.size() % 3;
        for (int i = 0; 1 < a.size(); i++) {
            prf = a.size() % 3;
//            这里应该把上一个周期结束时j的值带到下一周期的开始
            for (int j = a.size() - 1; j >= 0; j--) {
                if(((j + x + 1) + 3) % 3 == 0){
                    a.remove(j);
                }
            }
            duplicate ++ ;
            x = prf;
        }

        return a.get(0);
    }

    public int count3(int n){
        List<Integer> a = new ArrayList<>(n);
        int [] b = new int[10] ;
        for (int i = 0; i < n; i++) {
            a.add(i);
        }

        for (int i = 1; 1 < a.size(); i++) {
            if (i % 3 == 0){
                a.remove(i);
            }
            if (i > a.size()){
                i = 1;
            }
        }
        return 0;
    }
}
