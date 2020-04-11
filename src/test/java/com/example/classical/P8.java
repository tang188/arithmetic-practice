package com.example.classical;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ProjectName: arithmetic-practice
 * @Package: com.example.classical
 * @ClassName: P8
 * @Author: Handsome
 * @Description: 题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
 * @Date: 2020/4/11 23:14
 * @Version: 1.0
 */
public class P8 {
    /**
     * 题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
     * 例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
     */

    @Test
    public void test(){
        calcSum();
    }

    public static void main(String[] args) {
        calcSum();
    }

    public static void calcSum(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = in.nextInt();
        System.out.println("请输入n个数");
        int n = in.nextInt();
//        8 + 88 + 888
//        int a = 8;
//        int n = 3;
        int sum = 0;
        for (; 0 < n; n--) {
            sum += n*a;
            a = a * 10;
        }
        System.out.println(sum);
    }
}
