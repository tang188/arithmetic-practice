package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P1
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 16:12
 * @Version 1.0
 **/
public class P1 {
    /*
        兔子繁殖问题
        古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
        1.  2   1
        2.  2   1
        3.  4   2
        4.  6   3
        5.  10  5
        6.  16  8
        7.  26  13
        f(n) = f(n - 1) + f(n - 2)
     */
    @Test
    public void test(){
        System.out.println(rabbit(7));
    }

    public long rabbit(int month){
        if (month == 1 || month == 2) return 2;
        return rabbit(month - 1) + rabbit(month - 2);
    }
}
