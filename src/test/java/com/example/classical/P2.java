package com.example.classical;

import org.junit.Test;

/**
 * @ClassName P2
 * @Description
 * @Author tangzhihong
 * @Date 2020/4/11 16:27
 * @Version 1.0
 **/
public class P2 {
    /**
     * 题目：判断101-200之间有多少个素数，并输出所有素数。
     * 素数：n>2,只能被1和本身整除
     */
    @Test
    public void test(){
        System.out.println(calcZiShu(101, 200));
    }

    public int[] calcZiShu(int prf, int trf){
        int[] res = new int[trf - prf];
        for (int a = prf; a < trf; a++){
            boolean f = true;
            for (int i = 2; i < Math.sqrt(Double.valueOf(a)); i++) {
                if (a % i == 0){
                    f = false;
                    break;
                }
            }
            if (f){
                System.out.print(" " + a);
                res[a - prf] = a;
            }
        }
        return res;
    }
}
