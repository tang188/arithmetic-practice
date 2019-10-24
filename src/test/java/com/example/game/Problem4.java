package com.example.game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Problem4
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 19:23
 * @Version 1.0
 **/
public class Problem4 {

    @Test
    public void test(){
        long m = 9;
        long n = 11;
        System.out.println(calc(m,n));
    }

    public long calc(long m,long n){
        if (m >= n){
            return 0;
        }
        long huo = m;
        long qie = m;
        for (long i = 1; i <= n - m; i++) {
            huo = huo|m+i;
            qie = qie&m+i;

        }
        return huo^qie;
    }

    @Test
    public void test2(){
        long m = 40;
        long n = 41;
        System.out.println(calc2(m,n));
    }
    public long calc2(long m, long n){
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (; 0 < n;) {
            int a = n%2 == 0?0:1;
            list.add(a);
            n = n >> 1;
        }
        for (;0<m;){
            int a = m%2 == 0?0:1;
            list1.add(a);
            m = m >> 1;
        }
        int index = 0;
        if (list.size() == list1.size()){
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i) > list1.get(i)){
                    index = i + 1;
                    break;
                }
            }
        }else {
            index = list.size();
        }

        long rs = 0;
        for (int i = 0; i < index; i++) {
            rs = (rs<<1) + 1;
        }
        return rs;
    }
}
