package com.example.game;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Problem2
 * @Description
 * @Author tangzhihong
 * @Date 2019/10/23 18:02
 * @Version 1.0
 **/
public class Problem2 {
    @Test
    public void test(){
//        Scanner sc = new Scanner(System.in);
        int count = 0;
        List<Integer> datas = new ArrayList<>();
//        while (sc.hasNextInt()){
//            datas.add(sc.nextInt());
//        }
        for (int i = 1;i<=9;i++){
            datas.add(i);
        }

        count = datas.size();
        int size = (int) Math.sqrt(count);
        int[][] ints = new int[size][size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ints[i][j] = datas.get(k++);
            }
        }
        ints = calc(size,ints);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calc(int x,int[][] ints){
        for (int i = 0; i < x; i++) {
            for (int j = i; j < x; j++) {
                int p = ints[i][j];
                ints[i][j] = ints[j][i];
                ints[j][i] = p;
            }
        }
        return ints;
    }
}
